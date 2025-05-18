package com.formacionbdi.springboot.app.agencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.agencia.models.Auto;
import com.formacionbdi.springboot.app.agencia.models.Automovil;
import com.formacionbdi.springboot.app.agencia.models.AutomovilListadoResponse;
import com.formacionbdi.springboot.app.agencia.models.AutomovilResponse;
import com.formacionbdi.springboot.app.agencia.models.service.AgenciaService;

@RestController
public class AgenciaController {
	
	@Autowired
//	@Qualifier("serviceRestTemplate")
	@Qualifier("serviceFeign")
	private AgenciaService agenciaService;
	
	@GetMapping("/agencia-listar")
	public AutomovilListadoResponse listar(){
		return agenciaService.findAll();
	}
	
	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Auto detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return agenciaService.findById(id, cantidad);
	}
	
	@PutMapping("/modificar/{id}")
	public Auto modificar(@PathVariable Long id, @RequestBody Automovil automovil) {
		return agenciaService.modificar(id,automovil);
	}
	
	@PostMapping("/agregar")
	public Auto agregar(@RequestBody Automovil automovil) {
		return agenciaService.agregar(automovil);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public Auto eliminar(@PathVariable Long id) {
		return agenciaService.borrar(id);
	}

}
