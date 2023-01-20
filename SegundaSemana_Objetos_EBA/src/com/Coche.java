package com;

public class Coche {
	
	private String marca;
	private String modelo;
	private int capasidaCombustible;
	private int velocidadMaxima;
	
	public Coche () {
		
	}

	public Coche(String marca, String modelo, int capasidaCombustible, int velocidadMaxima) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capasidaCombustible = capasidaCombustible;
		this.velocidadMaxima = velocidadMaxima;
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

	public int getCapasidaCombustible() {
		return capasidaCombustible;
	}

	public void setCapasidaCombustible(int capasidaCombustible) {
		this.capasidaCombustible = capasidaCombustible;
	}

	public int getVelocidad() {
		return velocidadMaxima;
	}

	public void setVelocidad(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", capasidaCombustible=" + capasidaCombustible
				+ ", velocidad=" + velocidadMaxima + "]";
	}

}
