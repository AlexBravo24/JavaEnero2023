package com;

public class Electrodomestico {
	
	private String uso;
	private String marca ;
	private int numeroPuertas;
	
	
	public Electrodomestico () {
		
	}


	public Electrodomestico(String uso, String marca, int numeroPuertas) {
		super();
		this.uso = uso;
		this.marca = marca;
		this.numeroPuertas = numeroPuertas;
	}


	public String getUso() {
		return uso;
	}


	public void setUso(String uso) {
		this.uso = uso;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getNumeroPuertas() {
		return numeroPuertas;
	}


	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}


	@Override
	public String toString() {
		return "Electrodomestico [uso=" + uso + ", marca=" + marca + ", numeroPuertas=" + numeroPuertas + "]";
	}
	
	
	
}
