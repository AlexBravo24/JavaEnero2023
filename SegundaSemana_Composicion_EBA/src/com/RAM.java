package com;

public class RAM {
	
	private String marca;
	private String generacion;
	private int capacidad;
	private double frecuencia;
	
	public RAM() {
		
	}

	public RAM(String marca, String generacion, int capacidad, double frecuencia) {
		this.marca = marca;
		this.generacion = generacion;
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "RAM [marca=" + marca + ", generacion=" + generacion + ", capacidad=" + capacidad + ", frecuencia="
				+ frecuencia + "]";
	}
	
	

}
