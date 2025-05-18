package com.formacionbdi.springboot.app.agencia.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.agencia.models.Auto;
import com.formacionbdi.springboot.app.agencia.models.Automovil;
import com.formacionbdi.springboot.app.agencia.models.AutomovilListadoResponse;
import com.formacionbdi.springboot.app.agencia.models.AutomovilResponse;

public interface AgenciaService {

	public AutomovilListadoResponse findAll();
	public Auto findById(Long id, Integer cantidad);
	public Auto agregar(Automovil automovil);
	public Auto modificar(Long id, Automovil automovil);
	public Auto borrar(Long id);
	
}
