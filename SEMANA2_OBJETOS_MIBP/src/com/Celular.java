package com;

public class Celular {

	String marca;
	int año;
	String modelo;
	int cam;
	String memoria;
	String Compañia;
	
	
	
		
	public Celular(String marca, int año, String modelo, int cam, String memoria, String compañia) {
		super();
		this.marca = marca;
		this.año = año;
		this.modelo = modelo;
		this.cam = cam;
		this.memoria = memoria;
		Compañia = compañia;
	
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
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCam() {
		return cam;
	}
	public void setCam(int cam) {
		this.cam = cam;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getCompañia() {
		return Compañia;
	}
	public void setCompañia(String compañia) {
		Compañia = compañia;
	
	
	
	
	}
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", año=" + año + ", modelo=" + modelo + ", cam=" + cam + ", memoria="
				+ memoria + ", Compañia=" + Compañia + "]";
	}
	
	
	
	
}
