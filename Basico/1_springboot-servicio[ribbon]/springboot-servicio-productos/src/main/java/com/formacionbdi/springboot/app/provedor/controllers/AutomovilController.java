package com.formacionbdi.springboot.app.provedor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.provedor.models.entity.Automovil;
import com.formacionbdi.springboot.app.provedor.models.service.IAutomovilService;

@RestController
public class AutomovilController {
	
	@Autowired
	private IAutomovilService automovilService;
	
	@GetMapping("/listarAuto")
	public List<Automovil> listar(){
		return automovilService.findAll();
	}
	
	@GetMapping("/verAuto/{id}")
	public Automovil detalle(@PathVariable Long id) {
		return automovilService.findById(id);
	}
	
	@PostMapping("/insertar")
	public Automovil insertar(@RequestBody Automovil automovil) {
		return automovilService.insertar(automovil);
	}
	
	@PutMapping("/editar/{id}")
	public Automovil editar(@PathVariable Long id,@RequestBody Automovil automovil) {
		Automovil actual = automovilService.findById(id);
		if(actual != null) {
			automovil.setId(id);
		}
		return automovilService.modify(automovil);
	}
	
	@DeleteMapping("/remover/{id}")
	public Automovil eliminar(@PathVariable Long id) {
		Automovil actual = automovilService.findById(id);
		if(actual != null) {
			return automovilService.eliminar(id,actual);
		}
		return null;
	}
}
