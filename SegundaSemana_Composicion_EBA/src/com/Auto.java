package com;

public class Auto {
	
	private String marca;
	private String modelo;
	private int capacidadCombustible;
	
	private Llanta llant;
	private Motor mot;
	
	public Auto() {
		
	}

	public Auto(String marca, String modelo, int capacidadCombustible, Llanta llantas, Motor motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.capacidadCombustible = capacidadCombustible;
		this.llant = llantas;
		this.mot = motor;
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

	public int getCapacidadCombustible() {
		return capacidadCombustible;
	}

	public void setCapacidadCombustible(int capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}

	public Llanta getLlantas() {
		return llant;
	}

	public void setLlantas(Llanta llantas) {
		this.llant = llantas;
	}

	public Motor getMotor() {
		return mot;
	}

	public void setMotor(Motor motor) {
		this.mot = motor;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", capacidadCombustible=" + capacidadCombustible
				+ ", llantas=" + llant + ", motor=" + mot + "]";
	}

	
	
	
	
	

}
