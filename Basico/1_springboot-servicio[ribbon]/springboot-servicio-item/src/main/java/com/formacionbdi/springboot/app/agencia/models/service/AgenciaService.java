package com.formacionbdi.springboot.app.agencia.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.agencia.models.Auto;
import com.formacionbdi.springboot.app.agencia.models.Automovil;

public interface AgenciaService {

	public List<Auto> findAll();
	public Auto findById(Long id, Integer cantidad);
	public Auto agregar(Automovil automovil);
	public Auto modificar(Long id, Automovil automovil);
	public Auto borrar(Long id);
	
}
