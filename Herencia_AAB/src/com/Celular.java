package com;

public class Celular {
	
	private int noCamaras;
	private int precio; 
	private String resolucion;
	
	public Celular() {
		
	}

	public Celular(int noCamaras, int precio, String resolucion) {
		super();
		this.noCamaras = noCamaras;
		this.precio = precio;
		this.resolucion = resolucion;
	}

	public int getNoCamaras() {
		return noCamaras;
	}

	public void setNoCamaras(int noCamaras) {
		this.noCamaras = noCamaras;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	@Override
	public String toString() {
		return "Celular [noCamaras=" + noCamaras + ", precio=" + precio + ", resolucion=" + resolucion + "]";
	}
	
	
}
