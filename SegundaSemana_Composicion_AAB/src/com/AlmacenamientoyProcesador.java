package com;

public class AlmacenamientoyProcesador {
	
	private String procesador;
	private int nucleos;
	private double frecuencia;
	private int capRam;
	private int capAlmacenamiento;
	
	public AlmacenamientoyProcesador() {
		
	}

	public AlmacenamientoyProcesador(String procesador, int nucleos, double frecuencia, int capRam,
			int capAlmacenamiento) {
		super();
		this.procesador = procesador;
		this.nucleos = nucleos;
		this.frecuencia = frecuencia;
		this.capRam = capRam;
		this.capAlmacenamiento = capAlmacenamiento;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public int getCapRam() {
		return capRam;
	}

	public void setCapRam(int capRam) {
		this.capRam = capRam;
	}

	public int getCapAlmacenamiento() {
		return capAlmacenamiento;
	}

	public void setCapAlmacenamiento(int capAlmacenamiento) {
		this.capAlmacenamiento = capAlmacenamiento;
	}

	@Override
	public String toString() {
		return "AlmacenamientoyProcesador [procesador=" + procesador + ", nucleos=" + nucleos + ", frecuencia="
				+ frecuencia + ", capRam=" + capRam + ", capAlmacenamiento=" + capAlmacenamiento + "]";
	}
	
	
	
}
