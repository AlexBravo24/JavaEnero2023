package com;

public abstract class Objeto {
	
	private String modelo;
	private String marca;
	private int año;
	
	
	public Objeto () {}


	public Objeto(String modelo, String marca, int año) {
		this.modelo = modelo;
		this.marca = marca;
		this.año = año;
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


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}


	@Override
	public String toString() {
		return "Objeto [modelo=" + modelo + ", marca=" + marca + ", año=" + año + "]";
	}
	
	

}
