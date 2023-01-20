package com;

public class Celular {

	private String marca;
	private String modelo;
	private String SO;
	private int capBateria;
	
	private Pantalla pantalla;
	private Camara camara;
	private AlmacenamientoyProcesador specs;
	
	public Celular() {
		
	}

	public Celular(String marca, String modelo, String sO, int capBateria, Pantalla pantalla, Camara camara,
			AlmacenamientoyProcesador specs) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		SO = sO;
		this.capBateria = capBateria;
		this.pantalla = pantalla;
		this.camara = camara;
		this.specs = specs;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSO() {
		return SO;
	}

	public void setSO(String sO) {
		SO = sO;
	}

	public int getCapBateria() {
		return capBateria;
	}

	public void setCapBateria(int capBateria) {
		this.capBateria = capBateria;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public AlmacenamientoyProcesador getSpecs() {
		return specs;
	}

	public void setSpecs(AlmacenamientoyProcesador specs) {
		this.specs = specs;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", SO=" + SO + ", capBateria=" + capBateria
				+ ", pantalla=" + pantalla + ", camara=" + camara + ", specs=" + specs + "]";
	}
	
	
}
