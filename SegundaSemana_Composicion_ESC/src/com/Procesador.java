package com;

public class Procesador {
	
	private String fabricante;
	private String modelo;
	private int nucleos;
	private int hilos;
	private double frecuencia;
	
	public Procesador() {
		
	}

	public Procesador(String fabricante, String modelo, int nucleos, int hilos, double frecuencia) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.nucleos = nucleos;
		this.hilos = hilos;
		this.frecuencia = frecuencia;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public int getHilos() {
		return hilos;
	}

	public void setHilos(int hilos) {
		this.hilos = hilos;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Procesador [fabricante=" + fabricante + ", modelo=" + modelo + ", nucleos=" + nucleos + ", hilos="
				+ hilos + ", frecuencia=" + frecuencia + "]";
	}
	
	
	

}
