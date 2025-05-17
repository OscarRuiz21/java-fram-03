package com.formacionbdi.springboot.app.provedor.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.provedor.models.dao.AutomovilDao;
import com.formacionbdi.springboot.app.provedor.models.entity.Automovil;

@Service
public class AutomovilService implements IAutomovilService{

	@Autowired
	private AutomovilDao automovilDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Automovil> findAll() {
		return (List<Automovil>) automovilDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Automovil findById(Long id) {
		return automovilDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Automovil insertar(Automovil automovil) {
		return automovilDao.save(automovil);
	}

	@Override
	@Transactional
	public Automovil modify(Automovil automovil) {
		return automovilDao.save(automovil);
	}

	@Override
	@Transactional
	public Automovil eliminar(Long id, Automovil automovil) {
		automovilDao.deleteById(id);
		return automovil;
	}

}
