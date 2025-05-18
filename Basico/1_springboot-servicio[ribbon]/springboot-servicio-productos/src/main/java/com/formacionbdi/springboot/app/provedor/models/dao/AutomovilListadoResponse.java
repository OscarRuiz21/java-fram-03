package com.formacionbdi.springboot.app.provedor.models.dao;

import java.util.List;

import com.formacionbdi.springboot.app.provedor.models.entity.Automovil;

public class AutomovilListadoResponse {
    private List<Automovil> automoviles;
    private String port;

    public AutomovilListadoResponse(List<Automovil> automoviles, String port) {
        this.automoviles = automoviles;
        this.port = port;
    }

    public List<Automovil> getAutomoviles() {
        return automoviles;
    }

    public String getPort() {
        return port;
    }
}

