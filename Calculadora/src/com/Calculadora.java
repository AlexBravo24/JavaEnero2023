package com;

import java.util.Scanner;

public  class Calculadora  extends Objeto implements IMedicina{

	private boolean celdaSolar;
	
	
	public Calculadora() {
		super();
		
	}

	public Calculadora(String marca, String modelo ,boolean celdaSolar) {
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
		return "Calculadora [celdaSolar=" + celdaSolar + ", Marca()=" + getMarca() + ", Modelo()=" + getModelo()
				+ "]";
	}
	
	
	@Override
	public void sumar() {
		
		double a ;
		double b ;
		
		Scanner intro = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		a = intro.nextDouble();
		System.out.println("Introduce un numero: ");
		b = intro.nextDouble();
		System.out.println(a + b);
		
	}

	
	public void restar() {
		
		double a ;
		double b ;
		
		Scanner intro = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		a = intro.nextDouble();
		System.out.println("Introduce un numero: ");
		b = intro.nextDouble();
		System.out.println(a + b);
		
		
	}

	
	public void dividir() {
		double a ;
		double b ;
		
		Scanner intro = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		a = intro.nextDouble();
		System.out.println("Introduce un numero: ");
		b = intro.nextDouble();
		System.out.println(a + b);
		
		
	}

	
	public void multiplicar() {
		double a ;
		double b ;
		
		Scanner intro = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		a = intro.nextDouble();
		System.out.println("Introduce un numero: ");
		b = intro.nextDouble();
		System.out.println(a + b);
		
	}

	@Override
	public void checarTemperatura() {
		System.out.println("Tomando tempertatura 36 C");
	
	}

	@Override
	public void tomarPresion() {
		
	}
	

}
