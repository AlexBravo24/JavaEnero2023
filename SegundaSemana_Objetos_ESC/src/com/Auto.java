package com;

public class Auto {

	private String marca;
	private String modelo;
	private double precio;
	private String color;
	
	//Constructor Vacio
	public Auto() {
		
	}
	
	//Constructor con todos los aributos
	public Auto(String marca, String modelo, double precio, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
	}

	//Getters y Setters
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color + "]";
	}
	
	
	
	
	
}
