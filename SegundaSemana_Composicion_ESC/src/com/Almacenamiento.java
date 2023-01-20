package com;

public class Almacenamiento {
	
	private String marca;
	private String tipo;
	private double tamañoFisco;
	private double capacidad;
	private String tecnologia;
	
	public Almacenamiento() {
	
	}

	public Almacenamiento(String marca, String tipo, double tamañoFisco, double capacidad, String tecnologia) {
		this.marca = marca;
		this.tipo = tipo;
		this.tamañoFisco = tamañoFisco;
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

	public double getTamañoFisco() {
		return tamañoFisco;
	}

	public void setTamañoFisco(double tamañoFisco) {
		this.tamañoFisco = tamañoFisco;
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
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", tamañoFisco=" + tamañoFisco + ", capacidad="
				+ capacidad + ", tecnologia=" + tecnologia + "]";
	}
	
	
	
	
}
