package com;

public class Almacenamiento {
	
	private String marca;
	private String tipo;
	private double tamañofis;
	private String tecnologia;
	private double capacidad;
	
	public Almacenamiento( ) {}

	public Almacenamiento(String marca, String tipo, double tamañofis, String tecnologia, double capacidad) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.tamañofis = tamañofis;
		this.tecnologia = tecnologia;
		this.capacidad = capacidad;
		
		
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

	public double getTamañofis() {
		return tamañofis;
	}

	public void setTamañofis(double tamañofis) {
		this.tamañofis = tamañofis;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	
		
		
		
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", tamañofis=" + tamañofis + ", tecnologia="
				+ tecnologia + ", capacidad=" + capacidad + "]";
	};
	
	
	
}
