package com;

public abstract class ObjetoCar {
	
	private String Marca;
	private String Modelo;
	private int año;
	
	public ObjetoCar() {
	}

	public ObjetoCar(String marca, String modelo, int año) {
		super();
		Marca = marca;
		Modelo = modelo;
		this.año = año;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return Marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		Marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return Modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	/**
	 * @return the año
	 */
	public int getAño() {
		return año;
	}

	/**
	 * @param año the año to set
	 */
	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "ObjetoCar [Marca=" + Marca + ", Modelo=" + Modelo + ", año=" + año + "]";
	}
	
	
}
