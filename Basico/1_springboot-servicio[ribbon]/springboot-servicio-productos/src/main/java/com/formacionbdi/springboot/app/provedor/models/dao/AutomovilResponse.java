package com.formacionbdi.springboot.app.provedor.models.dao;

import com.formacionbdi.springboot.app.provedor.models.entity.Automovil;

public class AutomovilResponse {
	private Automovil automovil;
	private int port;
	public AutomovilResponse(Automovil automovil, int port) {
		this.automovil = automovil;
		this.port = port;
	}
	public Automovil getAutomovil() {
		return automovil;
	}
	public void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
}
