package com.formacionbdi.springboot.app.agencia.models;

public class Auto {
	private Automovil automovil;
	private double cantidad;
	private int port;
	public Automovil getAutomovil() {
		return automovil;
	}
	public void setAutomovil(AutomovilResponse automovil) {
		this.automovil = automovil.getAutomovil();
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double getTotal() {
		return cantidad*automovil.getPrecio();
	}
	public Auto(AutomovilResponse automovil, double cantidad) {
		this.automovil = automovil.getAutomovil();
		this.cantidad = cantidad;
		this.port = automovil.getPort();
	}
	public Auto(Automovil eliminar, int cantidad2) {
		this.automovil = eliminar;
		this.cantidad = cantidad2;
	}
	
	
}
