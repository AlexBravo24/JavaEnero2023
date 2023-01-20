package com;

public class baño {
	
//Atributos
	private double area;
	private String color;
	private String ducha;
	private String lavamanos;
	
	
//constructor vacío
	public baño() {
		
	}
	
//constructor con todos los métodos
	public baño(double area, String color, String ducha, String lavamanos) {
		super();
		this.area = area;
		this.color = color;
		this.ducha = ducha;
		this.lavamanos = lavamanos;
	}

//Setters&Getters
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDucha() {
		return ducha;
	}

	public void setDucha(String ducha) {
		this.ducha = ducha;
	}

	public String getLavamanos() {
		return lavamanos;
	}

	public void setLavamanos(String lavamanos) {
		this.lavamanos = lavamanos;
	}

	
//toString
	@Override
	public String toString() {
		return "baño [area=" + area + ", color=" + color + ", ducha=" + ducha + ", lavamanos=" + lavamanos + "]";
	}
	
	
}
