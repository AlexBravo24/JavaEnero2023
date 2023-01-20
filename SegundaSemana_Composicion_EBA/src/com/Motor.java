package com;

public class Motor {
	
	private String marca;
	private String modelo;
	private String typo;
	private int cilindros;
	private int caballos;
	private String Consumo;
	
	public Motor() {
		
		
	}

	public Motor(String marca, String modelo, String typo, int cilindros, int caballos, String consumo) {
		this.marca = marca;
		this.modelo = modelo;
		this.typo = typo;
		this.cilindros = cilindros;
		this.caballos = caballos;
		Consumo = consumo;
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

	public String getTypo() {
		return typo;
	}

	public void setTypo(String typo) {
		this.typo = typo;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public String getConsumo() {
		return Consumo;
	}

	public void setConsumo(String consumo) {
		Consumo = consumo;
	}

	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", modelo=" + modelo + ", typo=" + typo + ", cilindros=" + cilindros
				+ ", caballos=" + caballos + ", Consumo=" + Consumo + "]";
	}
			

}
