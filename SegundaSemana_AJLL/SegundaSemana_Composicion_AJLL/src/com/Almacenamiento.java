package com;

public class Almacenamiento {
	
	private String marca;
	private String tipo;
	private String tamañoFisico;
	private double capacidad;
	private String tecnologia;
	
	public Almacenamiento(){}
	
	

	public Almacenamiento(String marca, String tipo, String tamañoFisico, double capacidad, String tecnologia) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.tamañoFisico = tamañoFisico;
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

	public String getTamañoFisico() {
		return tamañoFisico;
	}

	public void setTamañoFisico(String tamañoFisico) {
		this.tamañoFisico = tamañoFisico;
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
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", tamañoFisico=" + tamañoFisico + ", capacidad="
				+ capacidad + ", tecnologia=" + tecnologia + "]";
	}
	
	
}
