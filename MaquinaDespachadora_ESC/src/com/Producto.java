package com;

public class Producto {
	
	//Atribuos que tiene el producto
	
	private String numProducto;
	private String nombreProducto;
	private double precio;
	
	public Producto () {
		
	}

	public Producto(String numProducto, String nombreProducto, double precio) {
		this.numProducto = numProducto;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
	}

	/**
	 * @return the numProducto
	 */
	public String getNumProducto() {
		return numProducto;
	}

	/**
	 * @param numProducto the numProducto to set
	 */
	public void setNumProducto(String numProducto) {
		this.numProducto = numProducto;
	}

	/**
	 * @return the nombreProducto
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}

	/**
	 * @param nombreProducto the nombreProducto to set
	 */
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [numProducto=" + numProducto + ", nombreProducto=" + nombreProducto + ", precio=" + precio
				+ "]";
	}
	
	
	

}
