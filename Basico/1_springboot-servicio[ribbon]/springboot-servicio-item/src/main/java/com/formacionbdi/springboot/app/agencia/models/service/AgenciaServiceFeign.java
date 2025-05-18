package com.formacionbdi.springboot.app.agencia.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.agencia.clientes.AgenciaClientRest;
import com.formacionbdi.springboot.app.agencia.models.Auto;

@Service("serviceFeign")
public class AgenciaServiceFeign implements AgenciaService {
	
	@Autowired
	private AgenciaClientRest clienteFeign;

	@Override
	public List<Auto> findAll() {
		return clienteFeign.findAll().stream().map(p -> new Auto(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Auto findById(Long id, Integer cantidad) {
		return new Auto(clienteFeign.findById(id), cantidad);
	}

}
