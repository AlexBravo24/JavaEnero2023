package com;

import java.util.Scanner;

public class Calculadora extends Objeto implements Imedicina{

	
	private boolean celdaSolar;
	
	public Calculadora() {	
	}
	
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
	public void sumar() {
		double a;
		double b;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Suma: ingresa número 1: ");
		a = entrada.nextDouble();
		
		System.out.print("ingresa número 2: ");
		b = entrada.nextDouble();
		
		System.out.println(a+b);	
	}

	@Override
	public void restar() {
		double a;
		double b;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Resta: ingresa número 1: ");
		a = entrada.nextDouble();
		
		System.out.print("ingresa número 2: ");
		b = entrada.nextDouble();
		
		System.out.println("Resultado de la suma: "+(a-b));
		
	}

	@Override
	public void multiplicar(double a, double b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dividir(double a, double b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checarTemperatura() {
		System.out.println("Tomando temperatura 36°C");
		
	}

	@Override
	public void tomarPresion() {
		System.out.println("tomando presion... ");
		
	}
	
	
	
	

}
