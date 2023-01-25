package com;

public class Transporte {
	
	private String tipo;
	private int tiempo;
	private int tarifa;
	
	public Transporte() {}
	
	

	public Transporte(String tipo, int tiempo, int tarifa) {
		super();
		this.tipo = tipo;
		this.tiempo = tiempo;
		this.tarifa = tarifa;
	}



	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getTarifa() {
		return tarifa;
	}

	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}



	@Override
	public String toString() {
		return "Transporte [tipo=" + tipo + ", tiempo=" + tiempo + ", tarifa=" + tarifa + "]";
	}
	
	

}
