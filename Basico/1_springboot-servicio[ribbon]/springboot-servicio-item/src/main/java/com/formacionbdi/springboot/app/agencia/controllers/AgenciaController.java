package com.formacionbdi.springboot.app.agencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.agencia.models.Auto;
import com.formacionbdi.springboot.app.agencia.models.service.AgenciaService;

@RestController
public class AgenciaController {
	
	@Autowired
//	@Qualifier("serviceRestTemplate")
	@Qualifier("serviceFeign")
	private AgenciaService agenciaService;
	
	@GetMapping("/agencia-listar")
	public List<Auto> listar(){
		return agenciaService.findAll();
	}
	
	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Auto detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return agenciaService.findById(id, cantidad);
	}

}
