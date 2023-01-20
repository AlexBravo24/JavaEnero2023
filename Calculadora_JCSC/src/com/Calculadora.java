package com;

public class Calculadora extends Objeto implements IMedicina {
	
	private boolean celdaSolar;
	
	
	public Calculadora () {}
	
	public Calculadora(String marca, String modelo, boolean celdaSolar) {
		super(marca, modelo);
		this.celdaSolar = celdaSolar;
	}

	public boolean isCeldaSolar() {
		return celdaSolar;
	}

	public void setCeldaSolar(boolean celdaSolar) {
		this.celdaSolar = celdaSolar;
	}
	
	

	@Override
	public String toString() {
		return "Calculadora [celdaSolar=" + celdaSolar + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ "]";
	}

	@Override
	public void checarTemperatura() {
		System.out.println("Tomando temperatura... 36°C");
		
	}

	@Override
	public void tomarPresion() {
		// TODO Auto-generated method stub
		
	}

	

}
