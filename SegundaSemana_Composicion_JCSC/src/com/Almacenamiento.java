package com;

public class Almacenamiento {
	
	private String marca;
	private String tipo;
	private double tamañofisico;
	private double capacidad;
	private String tecno;
	
	
	public Almacenamiento () {
	}

	public Almacenamiento(String marca, String tipo, double tamañofisico, double capacidad, String tecno) {
		this.marca = marca;
		this.tipo = tipo;
		this.tamañofisico = tamañofisico;
		this.capacidad = capacidad;
		this.tecno = tecno;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTamañofisico() {
		return tamañofisico;
	}

	public void setTamañofisico(double tamañofisico) {
		this.tamañofisico = tamañofisico;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getTecno() {
		return tecno;
	}

	public void setTecno(String tecno) {
		this.tecno = tecno;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", tamañofisico=" + tamañofisico + ", capacidad="
				+ capacidad + ", tecno=" + tecno + "]";
	}
	
	
	
	
	

}
