package com;

public class Computadora {
	
	private int precio;
	private String proveedor;
	private String garantia;
	
	Computadora(){}

	public Computadora(int precio, String proveedor, String garantia) {
		super();
		this.precio = precio;
		this.proveedor = proveedor;
		this.garantia = garantia;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	@Override
	public String toString() {
		return "Computadora [precio=" + precio + ", proveedor=" + proveedor + ", garantia=" + garantia + "]";
	}
	
	public void jugando() {
		
		System.out.println("EL usuario está jugando...");
	}
	
	public void jugando (String juego) {
		
		System.out.println("EL usuario está juagando " + juego);	
		}

}
