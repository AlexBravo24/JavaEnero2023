package com;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private int a�o;
	private double kilometraje;
	
	private Combustible gas;
	private Exterior carroceria;
	private Llantas neumaticos;
	
	
	public Vehiculo () {}


	public Vehiculo(String marca, String modelo, int a�o, double kilometraje, Combustible gas, Exterior carroceria,
			Llantas neumaticos) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
		this.kilometraje = kilometraje;
		this.gas = gas;
		this.carroceria = carroceria;
		this.neumaticos = neumaticos;
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


	public int getA�o() {
		return a�o;
	}


	public void setA�o(int a�o) {
		this.a�o = a�o;
	}


	public double getKilometraje() {
		return kilometraje;
	}


	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}


	public Combustible getGas() {
		return gas;
	}


	public void setGas(Combustible gas) {
		this.gas = gas;
	}


	public Exterior getCarroceria() {
		return carroceria;
	}


	public void setCarroceria(Exterior carroceria) {
		this.carroceria = carroceria;
	}


	public Llantas getNeumaticos() {
		return neumaticos;
	}


	public void setNeumaticos(Llantas neumaticos) {
		this.neumaticos = neumaticos;
	}


	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", a�o=" + a�o + ", kilometraje=" + kilometraje
				+ ", \ngas=" + gas + ", \ncarroceria=" + carroceria + ", \nneumaticos=" + neumaticos + "]";
	}
	
	
	
	
}

