package com;

public class Coche {
	
	private String marca;
	private String color;
	private int pasajeros;
	private int a�o;
	
	
	public Coche() {
		
	}
	



	public Coche(String marca, String color, int pasajeros, int a�o) {
		super();
		this.marca = marca;
		this.color = color;
		this.pasajeros = pasajeros;
		this.a�o = a�o;
	}







	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public int getPasajeros() {
		return pasajeros;
	}




	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}




	public int getA�o() {
		return a�o;
	}




	public void setA�o(int a�o) {
		this.a�o = a�o;
	}




	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", color=" + color + ", pasajeros=" + pasajeros + ", a�o="
				+ a�o + "]";
	}


	

	
	
	
	
	
	
	
}
