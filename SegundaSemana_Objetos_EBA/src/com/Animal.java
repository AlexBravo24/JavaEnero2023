package com;

public class Animal {
	
	private String clase;
	private String orden;
	private String alimento;
	private String sonidoCaracteristico;
	
	public Animal() {
		
		
	}

	public Animal(String clase, String orden, String alimento, String sonidoCaracteristico) {
		super();
		this.clase = clase;
		this.orden = orden;
		this.alimento = alimento;
		this.sonidoCaracteristico = sonidoCaracteristico;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String getSonidoCaracteristico() {
		return sonidoCaracteristico;
	}

	public void setSonidoCaracteristico(String sonidoCaracteristico) {
		this.sonidoCaracteristico = sonidoCaracteristico;
	}

	@Override
	public String toString() {
		return "Animal [clase=" + clase + ", orden=" + orden + ", alimento=" + alimento + ", sonidoCaracteristico="
				+ sonidoCaracteristico + "]";
	}

}
