package com;

public class Closed {
	private double altura;
	private double ancho;
	private int numPrendas;
	private String color;
	private String material;
	
	public Closed() {
		
	}

	public Closed(float altura, float ancho, int numPrendas, String color, String material) {
		super();
		this.altura = altura;
		this.ancho = ancho;
		this.numPrendas = numPrendas;
		this.color = color;
		this.material = material;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public int getNumPrendas() {
		return numPrendas;
	}

	public void setNumPrendas(int numPrendas) {
		this.numPrendas = numPrendas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Closed [altura=" + altura + ", ancho=" + ancho + ", numPrendas=" + numPrendas + ", color=" + color
				+ ", material=" + material + "]";
	}

	
	
}
