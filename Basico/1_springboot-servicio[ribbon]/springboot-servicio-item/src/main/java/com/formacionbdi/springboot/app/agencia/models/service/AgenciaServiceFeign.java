package com.formacionbdi.springboot.app.agencia.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.agencia.clientes.AgenciaClientRest;
import com.formacionbdi.springboot.app.agencia.models.Auto;
import com.formacionbdi.springboot.app.agencia.models.Automovil;
import com.formacionbdi.springboot.app.agencia.models.AutomovilListadoResponse;

@Service("serviceFeign")
public class AgenciaServiceFeign implements AgenciaService {
	
	@Autowired
	private AgenciaClientRest clienteFeign;

	@Override
	public AutomovilListadoResponse findAll() {
		return clienteFeign.findAll();
	}

	@Override
	public Auto findById(Long id, Integer cantidad) {
		return new Auto(clienteFeign.findById(id), cantidad);
	}

	@Override
	public Auto agregar(Automovil automovil) {
		return new Auto(clienteFeign.insertar(automovil),1);
	}

	@Override
	public Auto modificar(Long id, Automovil automovil) {
		return new Auto(clienteFeign.modify(id,automovil),1);
	}

	@Override
	public Auto borrar(Long id) {
		return new Auto(clienteFeign.eliminar(id),1);
	}

}
