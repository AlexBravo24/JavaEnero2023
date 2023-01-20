package com;

public class Xiaomi extends Celular{
	
	private double costo;
	private String memoria;
	private String resolucion;
	private String audio;
	
	public Xiaomi() {
	}

	public Xiaomi(int id, String color, String marca, String tamaño, String numCamaras, double costo, String memoria,
			String resolucion, String audio) {
		super(id, color, marca, tamaño, numCamaras);
		this.costo = costo;
		this.memoria = memoria;
		this.resolucion = resolucion;
		this.audio = audio;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	@Override
	public String toString() {
		return "Xiaomi [costo=" + costo + ", memoria=" + memoria + ", resolucion=" + resolucion + ", audio=" + audio
				+ ", getId()=" + getId() + ", getColor()=" + getColor() + ", getMarca()=" + getMarca()
				+ ", getTamaño()=" + getTamaño() + ", getNumCamaras()=" + getNumCamaras() + "]";
	}
	
	

	

}
