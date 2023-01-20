package com;

public class Producto {
	
	private int nip;
	private double costo;
	private int inventario;
	private String tipodeProducto;
	
	public Producto() {
		
	}

	public Producto(int nip, double costo, int inventario, String tipodeProducto) {
		super();
		this.nip = nip;
		this.costo = costo;
		this.inventario = inventario;
		this.tipodeProducto = tipodeProducto;
	}

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getInventario() {
		return inventario;
	}

	public void setInventario(int inventario) {
		this.inventario = inventario;
	}

	public String getTipodeProducto() {
		return tipodeProducto;
	}

	public void setTipodeProducto(String tipodeProducto) {
		this.tipodeProducto = tipodeProducto;
	}

	@Override
	public String toString() {
		return "Producto [nip=" + nip + ", costo=" + costo + ", inventario=" + inventario + ", tipodeProducto="
				+ tipodeProducto + "]";
	}
	
	
	

}
