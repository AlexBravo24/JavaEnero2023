package com;

public class Marca extends Celular {
	
	private String marca;
	private String modelo;
	private String sO;
	
	public Marca() {
		
	}

	public Marca(int noCamaras, int precio, String resolucion, String marca, String modelo, String sO) {
		super(noCamaras, precio, resolucion);
		this.marca = marca;
		this.modelo = modelo;
		this.sO = sO;
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

	public String getsO() {
		return sO;
	}

	public void setsO(String sO) {
		this.sO = sO;
	}

	@Override
	public String toString() {
		return "Marca [marca=" + marca + ", modelo=" + modelo + ", sO=" + sO + ", getNoCamaras()=" + getNoCamaras()
				+ ", getPrecio()=" + getPrecio() + ", getResolucion()=" + getResolucion() + "]";
	}
	
	
	
}
