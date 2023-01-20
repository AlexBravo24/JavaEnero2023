package com;

public class Llanta {

	private String marca;
	private String modelo;
	private int tamañoRin;
	private int cargaMaxima;
	
	public Llanta () {
		
	}

	public Llanta(String marca, String modelo, int tamañoRin, int cargaMaxima) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamañoRin = tamañoRin;
		this.cargaMaxima = cargaMaxima;
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

	public int getTamañoRin() {
		return tamañoRin;
	}

	public void setTamañoRin(int tamañoRin) {
		this.tamañoRin = tamañoRin;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public String toString() {
		return "Llanta [marca=" + marca + ", modelo=" + modelo + ", tamañoRin=" + tamañoRin + ", cargaMaxima="
				+ cargaMaxima + "]";
	}
	
	
		
}
