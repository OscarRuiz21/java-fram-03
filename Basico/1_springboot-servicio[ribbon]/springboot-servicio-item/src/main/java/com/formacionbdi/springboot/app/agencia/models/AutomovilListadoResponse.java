package com.formacionbdi.springboot.app.agencia.models;

import java.util.List;



public class AutomovilListadoResponse {
    private List<Automovil> automoviles;
    private int port;
    private List<Auto> autos;

    public AutomovilListadoResponse(List<Automovil> automoviles, int port) {
        this.automoviles = automoviles;
        this.port = port;
    }

    public AutomovilListadoResponse() {
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