package com.formacionbdi.springboot.app.provedor.models.dao;

import com.formacionbdi.springboot.app.provedor.models.entity.Automovil;

public class AutomovilResponse {
	private Automovil automovil;
	private String port;
	public AutomovilResponse(Automovil automovil, String port) {
		this.automovil = automovil;
		this.port = port;
	}
	public Automovil getAutomovil() {
		return automovil;
	}
	public void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
}
