package com;

public class Celular {
	
	private int id;
	private String color;
	private String marca;
	private String tamaño;
	private String numCamaras;
	
	public Celular() {
		
	}
	
	public Celular(int id, String color, String marca, String tamaño, String numCamaras) {
		super();
		this.id = id;
		this.color = color;
		this.marca = marca;
		this.tamaño = tamaño;
		this.numCamaras = numCamaras;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getTamaño() {
		return tamaño;
	}


	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}


	public String getNumCamaras() {
		return numCamaras;
	}


	public void setNumCamaras(String numCamaras) {
		this.numCamaras = numCamaras;
	}


	@Override
	public String toString() {
		return "Celular [id=" + id + ", color=" + color + ", marca=" + marca + ", tamaño=" + tamaño + ", numCamaras="
				+ numCamaras + "]";
	}
	
	

}
