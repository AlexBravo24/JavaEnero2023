package com;

public class Celular {
	
	private String marca;
	private String modelo;
	private int a�o;
	private String procesador;
	
	public Celular() {
		
	}

	public Celular(String marca, String modelo, int a�o, String procesador) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", a�o=" + a�o + ", procesador=" + procesador + "]";
	}
	
	
	
	
	
	
}
