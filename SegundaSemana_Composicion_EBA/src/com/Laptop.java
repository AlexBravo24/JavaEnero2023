package com;

public class Laptop {
	
	private String marca;
	private String modelo;
	private String color;
	private double precio;
	
	private RAM ram;
	private Almacenamiento disco;
	private Procesador cpu;
	
	public Laptop () {
		
	}

	public Laptop(String marca, String modelo, String color, double precio, RAM ram, Almacenamiento disco,
			Procesador cpu) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.ram = ram;
		this.disco = disco;
		this.cpu = cpu;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public Almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + ", ram="
				+ ram + ", disco=" + disco + ", cpu=" + cpu + "]";
	}
	
	
	
	
	
}
