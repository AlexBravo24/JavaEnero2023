package com;

public class Computadora {
	
	String grafica;
	int ram;
	String procesador;
	String hdd;
	
	public Computadora(String grafica, int ram, String procesador, String hdd) {
		super();
		this.grafica = grafica;
		this.ram = ram;
		this.procesador = procesador;
		this.hdd = hdd;
		
		
		
	}

	public String getGrafica() {
		return grafica;
	}

	public void setGrafica(String grafica) {
		this.grafica = grafica;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
		
		
	}

	@Override
	public String toString() {
		return "Computadora [grafica=" + grafica + ", ram=" + ram + ", procesador=" + procesador + ", hdd=" + hdd + "]";
	}
	
	

}
