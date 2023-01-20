package com;

public class Coche {

	private String marca;
	private String color;
	private String tipo;
	private int ano;
	
	public Coche() {
		
	}

	public Coche(String marca, String color, String tipo, int ano) {
		super();
		this.marca = marca;
		this.color = color;
		this.tipo = tipo;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", color=" + color + ", tipo=" + tipo + ", ano=" + ano + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	
	
	
	
}
