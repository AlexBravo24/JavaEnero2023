package com;

public class escuela {

	private String nombre;
	private String maxgrado;
	private int numsalones;
	private String bilingue;
	
	public escuela() {
		
	}

	public escuela(String nombre, String maxgrado, int numsalones, String bilingue) {
		super();
		this.nombre = nombre;
		this.maxgrado = maxgrado;
		this.numsalones = numsalones;
		this.bilingue = bilingue;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMaxgrado() {
		return maxgrado;
	}

	public void setMaxgrado(String maxgrado) {
		this.maxgrado = maxgrado;
	}

	public int getNumsalones() {
		return numsalones;
	}

	public void setNumsalones(int numsalones) {
		this.numsalones = numsalones;
	}

	public String getBilingue() {
		return bilingue;
	}

	public void setBilingue(String bilingue) {
		this.bilingue = bilingue;
	}

	@Override
	public String toString() {
		return "escuela [nombre=" + nombre + ", maxgrado=" + maxgrado + ", numsalones=" + numsalones + ", bilingue="
				+ bilingue + "]";
	}
	
	
}
