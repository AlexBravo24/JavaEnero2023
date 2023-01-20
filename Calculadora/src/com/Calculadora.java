package com;

import java.util.Scanner;

public class Calculadora extends Objeto implements IMedicina{
	
	private boolean celdasolar;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String modelo, boolean celdasolar) {
		super(marca, modelo);
		this.celdasolar = celdasolar;
	}
	
	

	/**
	 * @return the celdasolar
	 */
	public boolean isCeldasolar() {
		return celdasolar;
	}

	/**
	 * @param celdasolar the celdasolar to set
	 */
	public void setCeldasolar(boolean celdasolar) {
		this.celdasolar = celdasolar;
	}

	
	
	@Override
	public String toString() {
		return "Calculadora [celdasolar=" + celdasolar + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ "]";
	}

	
	public void sumar(double a, double b) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");  
		a = entrada.nextDouble();
		System.out.println("Introduce un numero: ");  
		b = entrada.nextDouble();
		
		
		System.out.println(a+b);
		
	}


	public void restar(double a, double b) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");  
		a = entrada.nextDouble();
		System.out.println("Introduce un numero: ");  
		b = entrada.nextDouble();
		
		
		System.out.println(a-b);
		
	}

	public void multiplicar(double a, double b) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");  
		a = entrada.nextDouble();
		System.out.println("Introduce un numero: ");  
		b = entrada.nextDouble();
		
		
		System.out.println(a*b);
		
	}

	public void dividir(double a, double b) {

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");  
		a = entrada.nextDouble();
		System.out.println("Introduce un numero: ");  
		b = entrada.nextDouble();
		
		
		System.out.println(a-b);
		
	}

	@Override
	public void checarTemperatura() {
		
		System.out.println("Tomando Temperaura 36°C");
		
	}

	@Override
	public void tomarPresion() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}
