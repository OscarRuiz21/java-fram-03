package com.formacionbdi.springboot.app.agencia.models.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.formacionbdi.springboot.app.agencia.models.Auto;
import com.formacionbdi.springboot.app.agencia.models.Automovil;
import com.formacionbdi.springboot.app.agencia.models.AutomovilListadoResponse;
import com.formacionbdi.springboot.app.agencia.models.AutomovilResponse;

@Service("serviceRestTemplate")
public class AgenciaServiceImpl implements AgenciaService {

    @Autowired
    private RestTemplate clienteRest;

    @Override
    public AutomovilListadoResponse findAll() {
        return clienteRest.getForObject(
            "http://localhost:8001/listarAuto",
            AutomovilListadoResponse.class
        );
    }

    @Override
    public Auto findById(Long id, Integer cantidad) {
        Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put("id", id.toString());

        AutomovilResponse response = clienteRest.getForObject(
            "http://localhost:8001/verAuto/{id}",
            AutomovilResponse.class,
            pathVariables
        );

        return new Auto(response, cantidad);
    }

    @Override
    public Auto agregar(Automovil automovil) {
        AutomovilResponse response = clienteRest.postForObject(
            "http://localhost:8001/insertar",
            automovil,
            AutomovilResponse.class
        );

        return new Auto(response, 1);
    }

    @Override
    public Auto modificar(Long id, Automovil automovil) {
        Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put("id", id.toString());

        clienteRest.put("http://localhost:8001/editar/{id}", automovil, pathVariables);
        return findById(id, 1);
    }

    @Override
    public Auto borrar(Long id) {
        Auto borrado = findById(id, 1);

        Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put("id", id.toString());

        clienteRest.delete("http://localhost:8001/remover/{id}", pathVariables);
        return borrado;
    }
}

