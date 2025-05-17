package com.formacionbdi.springboot.app.provedor.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.springboot.app.provedor.models.entity.Automovil;

public interface AutomovilDao extends CrudRepository<Automovil, Long>{

}
