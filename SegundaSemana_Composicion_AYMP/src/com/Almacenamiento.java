package com;

public class Almacenamiento {
	
	private String marca;
	private String tipo;
	private double tamañoFisico;
	private double capacidad;
	private String tecnología;
	
	public Almacenamiento() {
		
	}

	public Almacenamiento(String marca, String tipo, double tamañoFisico, double capacidad, String tecnología) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.tamañoFisico = tamañoFisico;
		this.capacidad = capacidad;
		this.tecnología = tecnología;
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

	public double getTamañoFisico() {
		return tamañoFisico;
	}

	public void setTamañoFisico(double tamañoFisico) {
		this.tamañoFisico = tamañoFisico;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getTecnología() {
		return tecnología;
	}

	public void setTecnología(String tecnología) {
		this.tecnología = tecnología;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", tamañoFisico=" + tamañoFisico + ", capacidad="
				+ capacidad + ", tecnología=" + tecnología + "]";
	}
	
	
	

}
