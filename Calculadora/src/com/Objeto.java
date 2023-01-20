package com;

public abstract class Objeto {
	private String marca;
	private String modelo;
	
	public Objeto() {
		
	}

	public Objeto(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

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


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Objeto [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
//	public abstract void sumar(double a, double b);
//	
//	public abstract void restar(double a, double b);
//	
//	public abstract void multiplicar(double a, double b);
//	
//	public abstract void dividir(double a, double b);

	

}
