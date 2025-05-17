package com.formacionbdi.springboot.app.provedor.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.provedor.models.entity.Automovil;

public interface IAutomovilService {

	public List<Automovil> findAll();
	public Automovil findById(Long id);
	public Automovil insertar(Automovil automovil);
	public Automovil modify(Automovil automovil);
	public Automovil eliminar(Long id, Automovil automovil);
}
