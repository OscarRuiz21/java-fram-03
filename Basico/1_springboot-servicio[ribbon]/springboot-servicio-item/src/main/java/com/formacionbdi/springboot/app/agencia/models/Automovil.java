package com.formacionbdi.springboot.app.agencia.models;
import java.util.Date;

public class Automovil {
	private Long id;
	private String modelo;
	private String marca;
	private String color;
	private String versionAuto;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVersionAuto() {
		return versionAuto;
	}
	public void setVersionAuto(String versionAuto) {
		this.versionAuto = versionAuto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	private double precio;
	private Date createAt;
}
