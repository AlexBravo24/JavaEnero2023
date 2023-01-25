package com;

public class Coche {
	
	private String marca;
	private String color;
	private int pasajeros;
	private int año;
	
	
	public Coche() {
		
	}
	



	public Coche(String marca, String color, int pasajeros, int año) {
		super();
		this.marca = marca;
		this.color = color;
		this.pasajeros = pasajeros;
		this.año = año;
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




	public int getAño() {
		return año;
	}




	public void setAño(int año) {
		this.año = año;
	}




	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", color=" + color + ", pasajeros=" + pasajeros + ", año="
				+ año + "]";
	}


	

	
	
	
	
	
	
	
}
