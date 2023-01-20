package com;

public class Almacenamiento {
	
	private String typo;
	private String marca;
	private String tecnologia;
	private double tamañoFisico;
	private double capacidad;
	
	public Almacenamiento() {
		
	}

	public Almacenamiento(String typo, String marca, String tecnologia, double tamañoFisico, double capacidad) {
		this.typo = typo;
		this.marca = marca;
		this.tecnologia = tecnologia;
		this.tamañoFisico = tamañoFisico;
		this.capacidad = capacidad;
	}

	public String getTypo() {
		return typo;
	}

	public void setTypo(String typo) {
		this.typo = typo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public double getTamañoFisico() {
		return tamañoFisico;
	}

	public void setTamañoFisico(double tamañoFisico) {
		this.tamañoFisico = tamañoFisico;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Almacenamiento [typo=" + typo + ", marca=" + marca + ", tecnologia=" + tecnologia + ", tamañoFisico="
				+ tamañoFisico + ", capacidad=" + capacidad + "]";
	}
	
	
	
	
	

}
