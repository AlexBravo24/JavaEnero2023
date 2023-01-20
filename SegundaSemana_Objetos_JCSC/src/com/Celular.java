package com;

public class Celular {
	
	private String modelo;
	private String marca;
	private int precio;
	private String procesador;
	private String ram;
	private String camara;
	private String dimensiones;
	private String so;
	private String color;
	
	public Celular(String modelo, String marca, int precio, String color) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.color = color;
	}

	public Celular(String modelo, String marca, int precio, String procesador, String ram, String camara,
			String dimensiones, String so, String color) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.procesador = procesador;
		this.ram = ram;
		this.camara = camara;
		this.dimensiones = dimensiones;
		this.so = so;
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Celular [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", procesador=" + procesador
				+ ", ram=" + ram + ", camara=" + camara + ", dimensiones=" + dimensiones + ", so=" + so + ", color="
				+ color + "]";
	}
	
	
	

}
