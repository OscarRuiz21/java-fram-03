package com.formacionbdi.springboot.app.agencia.models;

public class Auto {
	private Automovil automovil;
	private double cantidad;
	public Automovil getAutomovil() {
		return automovil;
	}
	public void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
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
	public Auto(Automovil automovil, double cantidad) {
		this.automovil = automovil;
		this.cantidad = cantidad;
	}
	
	
}
