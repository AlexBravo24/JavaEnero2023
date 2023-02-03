package com;

public class Automovil {
	
	
	private String marca;
	private String modelo;
	private int año;
	private String color;
	private int kilometros;
	private String tras;
	
	public Automovil(String marca, String modelo, int año, String color, int kilometros, String tras) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.color = color;
		this.kilometros = kilometros;
		this.tras = tras;
		
		
		
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public String getTras() {
		return tras;
	}

	public void setTras(String tras) {
		this.tras = tras;
		
		
		
		
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", color=" + color
				+ ", kilometros=" + kilometros + ", tras=" + tras + "]";
		
		
		
	}
	
	
	
	

}
