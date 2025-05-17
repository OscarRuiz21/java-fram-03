package com.formacionbdi.springboot.app.provedor.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "automovil")
public class Automovil implements Serializable{
	
	public static String[] VERSIONES= {"Ambiente", "Trend", "Luxury", "DarkEdition"};

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String modelo;
	private String marca;
	private String color;
	private String versionAuto;
	private double precio;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreateAt() {
		return new Date();
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
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
	
	

	private static final long serialVersionUID = 1285454306356845809L;

}
