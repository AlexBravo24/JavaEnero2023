package com;

public class Llantas {
	
	private String marca;
	private int pulgadas;
	private String medida;
	private String materialRin;
	
	public Llantas() {}

	public Llantas(String marca, int pulgadas, String medida, String materialRin) {
		super();
		this.marca = marca;
		this.pulgadas = pulgadas;
		this.medida = medida;
		this.materialRin = materialRin;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public String getMaterialRin() {
		return materialRin;
	}

	public void setMaterialRin(String materialRin) {
		this.materialRin = materialRin;
	}

	@Override
	public String toString() {
		return "Llantas [marca=" + marca + ", pulgadas=" + pulgadas + ", medida=" + medida + ", materialRin="
				+ materialRin + "]";
	}
	
	
	

}
