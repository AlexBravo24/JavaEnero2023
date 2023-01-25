package com;

public class Celular {
	
	private String marca;
	private String modelo;
	private int año;
	private String procesador;
	
	public Celular() {
		
	}

	public Celular(String marca, String modelo, int año, String procesador) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.procesador = procesador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", procesador=" + procesador + "]";
	}
	
	
	
	
	
	
}
