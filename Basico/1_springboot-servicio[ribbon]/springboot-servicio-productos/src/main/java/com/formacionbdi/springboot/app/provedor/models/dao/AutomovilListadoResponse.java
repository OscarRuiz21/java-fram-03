package com.formacionbdi.springboot.app.provedor.models.dao;

import java.util.List;

import com.formacionbdi.springboot.app.provedor.models.entity.Automovil;

public class AutomovilListadoResponse {
    private List<Automovil> automoviles;
    private int port;

    public AutomovilListadoResponse(List<Automovil> automoviles, int port) {
        this.automoviles = automoviles;
        this.port = port;
    }

    public List<Automovil> getAutomoviles() {
        return automoviles;
    }

    public int getPort() {
        return port;
    }

	public void setAutomoviles(List<Automovil> automoviles) {
		this.automoviles = automoviles;
	}

	public void setPort(int port) {
		this.port = port;
	}
    
    
}

