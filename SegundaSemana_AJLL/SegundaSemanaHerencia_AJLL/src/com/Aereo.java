package com;

public class Aereo extends Transporte{
	
	private String modelo;
	private double pesoMaximo;
	private String salida;
	private String llegada;
	
	public Aereo() {}

	public Aereo(String tipo, int tiempo, int tarifa, String modelo, double pesoMaximo, String salida, String llegada) {
		super(tipo, tiempo, tarifa);
		this.modelo = modelo;
		this.pesoMaximo = pesoMaximo;
		this.salida = salida;
		this.llegada = llegada;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public String getSalida() {
		return salida;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}

	public String getLlegada() {
		return llegada;
	}

	public void setLlegada(String llegada) {
		this.llegada = llegada;
	}

	@Override
	public String toString() {
		return "Aereo [modelo=" + modelo + ", pesoMaximo=" + pesoMaximo + ", salida=" + salida + ", llegada=" + llegada
				+ ", getTipo()=" + getTipo() + ", getTiempo()=" + getTiempo() + ", getTarifa()=" + getTarifa() + "]";
	}
	
	
	

}
