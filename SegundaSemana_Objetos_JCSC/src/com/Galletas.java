package com;

public class Galletas {
	
	private String sabor;
	private int cantidad;
	private String chispas;
	private String marca;
	private int precio;
	
	public Galletas(String sabor, String marca, int precio) {
		super();
		this.sabor = sabor;
		this.marca = marca;
		this.precio = precio;
	}
	public Galletas(String sabor, int cantidad, String chispas, String marca, int precio) {
		super();
		this.sabor = sabor;
		this.cantidad = cantidad;
		this.chispas = chispas;
		this.marca = marca;
		this.precio = precio;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getChispas() {
		return chispas;
	}
	public void setChispas(String chispas) {
		this.chispas = chispas;
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
	@Override
	public String toString() {
		return "Galletas [sabor=" + sabor + ", cantidad=" + cantidad + ", chispas=" + chispas + ", marca=" + marca
				+ ", precio=" + precio + "]";
	}
	
	
	

}
