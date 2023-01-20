package com;

public class Pantalla {
	
	private double tamaño;
	private String resolucion;
	private int densidadpix;
	
	public Pantalla() {
		
	}

	public Pantalla(double tamaño, String resolucion, int densidadpix) {
		super();
		this.tamaño = tamaño;
		this.resolucion = resolucion;
		this.densidadpix = densidadpix;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public int getDensidadpix() {
		return densidadpix;
	}

	public void setDensidadpix(int densidadpix) {
		this.densidadpix = densidadpix;
	}

	@Override
	public String toString() {
		return "Pantalla [tamaño=" + tamaño + ", resolucion=" + resolucion + ", densidadpix=" + densidadpix + "]";
	}
	
	

}
