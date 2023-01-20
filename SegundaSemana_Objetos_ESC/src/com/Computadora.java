package com;

public class Computadora {
	private String dd;
	private int cdd;
	private int ram;
	private String procesador;
	
	public Computadora() {

	}

	public Computadora(String dd, int cdd, int ram, String procesador) {
		super();
		this.dd = dd;
		this.cdd = cdd;
		this.ram = ram;
		this.procesador = procesador;
	}

	public String getDd() {
		return dd;
	}

	public void setDd(String dd) {
		this.dd = dd;
	}

	public int getCdd() {
		return cdd;
	}

	public void setCdd(int cdd) {
		this.cdd = cdd;
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

	@Override
	public String toString() {
		return "Computadora [dd=" + dd + ", cdd=" + cdd + ", ram=" + ram + ", procesador=" + procesador + "]";
	}
	
	

	

}
