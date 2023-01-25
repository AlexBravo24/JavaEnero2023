package com;

public class Exterior {
	
	private String color;
	private int puertas;
	private String carroceria;
	private double largo;
	private double ancho;
	
	public Exterior() {}

	public Exterior(String color, int puertas, String carroceria, double largo, double ancho) {
		super();
		this.color = color;
		this.puertas = puertas;
		this.carroceria = carroceria;
		this.largo = largo;
		this.ancho = ancho;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	@Override
	public String toString() {
		return "Exterior [color=" + color + ", puertas=" + puertas + ", carroceria=" + carroceria + ", largo=" + largo
				+ ", ancho=" + ancho + "]";
	}
	
	

}
