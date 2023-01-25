package com;

public class Combustible {
	
	private String tipo;
	private String octanaje;
	private int capacidad;
	
	public Combustible () {}

	public Combustible(String tipo, String octanaje, int capacidad) {
		super();
		this.tipo = tipo;
		this.octanaje = octanaje;
		this.capacidad = capacidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOctanaje() {
		return octanaje;
	}

	public void setOctanaje(String octanaje) {
		this.octanaje = octanaje;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Combustible [tipo=" + tipo + ", octanaje=" + octanaje + ", capacidad=" + capacidad + "]";
	}
	
	

}
