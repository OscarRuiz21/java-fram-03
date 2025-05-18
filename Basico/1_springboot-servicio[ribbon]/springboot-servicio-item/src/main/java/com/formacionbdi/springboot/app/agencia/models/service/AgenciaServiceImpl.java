package com.formacionbdi.springboot.app.agencia.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.formacionbdi.springboot.app.agencia.models.Auto;
import com.formacionbdi.springboot.app.agencia.models.Automovil;

@Service("serviceRestTemplate")
public class AgenciaServiceImpl implements AgenciaService {

	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Auto> findAll() {
		List<Automovil> productos = Arrays.asList(clienteRest.getForObject("http://localhost:8001/listarAuto", Automovil[].class));
		
		return productos.stream().map(p -> new Auto(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Auto findById(Long id, Integer cantidad) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		Automovil producto = clienteRest.getForObject("http://localhost:8001/verAuto/{id}", Automovil.class, pathVariables);
		return new Auto(producto, cantidad);
	}

}
