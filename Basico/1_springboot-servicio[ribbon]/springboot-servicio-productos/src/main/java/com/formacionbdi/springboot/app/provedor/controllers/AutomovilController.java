package com.formacionbdi.springboot.app.provedor.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.provedor.models.dao.AutomovilListadoResponse;
import com.formacionbdi.springboot.app.provedor.models.dao.AutomovilResponse;
import com.formacionbdi.springboot.app.provedor.models.entity.Automovil;
import com.formacionbdi.springboot.app.provedor.models.service.IAutomovilService;

@RestController
public class AutomovilController {
	
	@Autowired
	private IAutomovilService automovilService;
	
	@Autowired
	private HttpServletRequest request;

	@GetMapping("/listarAuto")
	public AutomovilListadoResponse listar(){
		return new AutomovilListadoResponse(automovilService.findAll(), request.getLocalPort());
	}
	
	@GetMapping("/verAuto/{id}")
	public AutomovilResponse detalle(@PathVariable Long id) {
		Automovil automovil = automovilService.findById(id);
		int puerto = request.getLocalPort();
		return new AutomovilResponse(automovil, puerto);
	}
	
	@PostMapping("/insertar")
	public AutomovilResponse insertar(@RequestBody Automovil automovil) {
		int puerto = request.getLocalPort();
		return new AutomovilResponse(automovilService.insertar(automovil), puerto);
	}
	
	@PutMapping("/editar/{id}")
	public AutomovilResponse editar(@PathVariable Long id,@RequestBody Automovil automovil) {
		Automovil actual = automovilService.findById(id);
		int puerto = request.getLocalPort();
		if(actual != null) {
			automovil.setId(id);
		}
		return new AutomovilResponse(automovilService.modify(automovil), puerto);
	}
	
	@DeleteMapping("/remover/{id}")
	public Automovil eliminar(@PathVariable Long id) {
		Automovil actual = automovilService.findById(id);
		int puerto = request.getLocalPort();
		if(actual != null) {
			return automovilService.eliminar(id,actual);
		}
		return null;
	}
}
