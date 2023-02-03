package com;

public class Componentes extends Computadora{
	 
	private String procesador;
	private int ram;
	private String grafica;
	private String almacenamiento;
	
	Componentes (){}

	

	public Componentes(int precio, String proveedor, String garantia, String procesador, int ram, String grafica,
			String almacenamiento) {
		super(precio, proveedor, garantia);
		this.procesador = procesador;
		this.ram = ram;
		this.grafica = grafica;
		this.almacenamiento = almacenamiento;
	}



	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getGrafica() {
		return grafica;
	}

	public void setGrafica(String grafica) {
		this.grafica = grafica;
	}

	public String getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	@Override
	public String toString() {
		return "Componentes [procesador=" + procesador + ", ram=" + ram + ", grafica=" + grafica + ", almacenamiento="
				+ almacenamiento + ", getPrecio()=" + getPrecio() + ", getProveedor()=" + getProveedor()
				+ ", getGarantia()=" + getGarantia() + "]";
	}


	public void comp() {
		System.out.println("Sus componentes están completos");
	}
	
	
	

}
