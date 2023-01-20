package com;

public class Tacos {

	private String contenido;
	private String salsa;
	private String verdura;
	private String cebolla;
	private int cantidad;
	
	
	
	
	public Tacos(String contenido, String salsa, int cantidad) {
		super();
		this.contenido = contenido;
		this.salsa = salsa;
		this.cantidad = cantidad;
	}

	public Tacos(String contenido, String salsa, String verdura, String cebolla, int cantidad) {
		super();
		this.contenido = contenido;
		this.salsa = salsa;
		this.verdura = verdura;
		this.cebolla = cebolla;
		this.cantidad = cantidad;
	}


	public String getContenido() {
		return contenido;
	}




	public void setContenido(String contenido) {
		this.contenido = contenido;
	}




	public String getSalsa() {
		return salsa;
	}




	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}




	public String getVerdura() {
		return verdura;
	}




	public void setVerdura(String verdura) {
		this.verdura = verdura;
	}




	public String getCebolla() {
		return cebolla;
	}




	public void setCebolla(String cebolla) {
		this.cebolla = cebolla;
	}




	public int getCantidad() {
		return cantidad;
	}




	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Tacos [contenido=" + contenido + ", salsa=" + salsa + ", verdura=" + verdura + ", cebolla=" + cebolla
				+ ", cantidad=" + cantidad + "]";
	}
	
	
	
	
	
	
	
	
	

	

}
