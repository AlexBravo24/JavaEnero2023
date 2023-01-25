package com;

public class Almacenamiento {
	
	private String marca;
	private String tipo;
	private String tama�oFisico;
	private double capacidad;
	private String tecnologia;
	
	public Almacenamiento(){}
	
	

	public Almacenamiento(String marca, String tipo, String tama�oFisico, double capacidad, String tecnologia) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.tama�oFisico = tama�oFisico;
		this.capacidad = capacidad;
		this.tecnologia = tecnologia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTama�oFisico() {
		return tama�oFisico;
	}

	public void setTama�oFisico(String tama�oFisico) {
		this.tama�oFisico = tama�oFisico;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", tama�oFisico=" + tama�oFisico + ", capacidad="
				+ capacidad + ", tecnologia=" + tecnologia + "]";
	}
	
	
}
