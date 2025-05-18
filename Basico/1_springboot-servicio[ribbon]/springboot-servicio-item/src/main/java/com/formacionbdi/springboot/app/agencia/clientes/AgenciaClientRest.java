package com.formacionbdi.springboot.app.agencia.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.formacionbdi.springboot.app.agencia.models.Automovil;

// Para Feing:
//@FeignClient(name = "servicio-productos", url="localhost:8001")
// Para Feing con Ribbon:
@FeignClient(name = "servicio-productos")

public interface AgenciaClientRest {
	
	@GetMapping("/listarAuto")
	public List<Automovil> findAll();
	
	@GetMapping("/verAuto/{id}") 
	public Automovil findById(@PathVariable Long id);
	
	@PostMapping("/insertar")
	public Automovil insertar(@RequestBody Automovil automovil);
	
	@PutMapping("/editar/{id}")
	public Automovil modify(@PathVariable Long id, @RequestBody Automovil automovil);
	
	@DeleteMapping("/remover/{id}")
	public Automovil eliminar(@PathVariable Long id);
	
	

}
