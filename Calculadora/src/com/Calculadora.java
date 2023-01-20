package com;

import java.util.Scanner;

public class Calculadora extends Objeto implements IMedicina{
	
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
		System.out.println("Ingrese el primer número a sumar: ");
		Scanner entrada1 = new Scanner(System.in);
		a = entrada1.nextDouble();
		System.out.println("Ingrese el segundo número a sumar: ");
		Scanner entrada2 = new Scanner(System.in);
		b = entrada2.nextDouble();
		System.out.println(a+b);
		
	}

	@Override
	public void restar() {
		double a;
		double b;
		System.out.println("Ingrese el primer número: ");
		Scanner entrada = new Scanner(System.in);
		a = entrada.nextDouble();
		
		System.out.println("Ingrese el segundo número a restar: ");
		b = entrada.nextDouble();
		System.out.println(a-b);
		
	}

	@Override
	public void multiplicar() {
		double a;
		double b;
		System.out.println("Ingrese el primer número: ");
		Scanner entrada1 = new Scanner(System.in);
		a = entrada1.nextDouble();
		System.out.println("Ingrese el segundo número a restar: ");
		Scanner entrada2 = new Scanner(System.in);
		b = entrada2.nextDouble();
		System.out.println(a*b);
		
	}

	@Override
	public void dividir() {
		double a;
		double b;
		System.out.println("Ingrese el primer número: ");
		Scanner entrada1 = new Scanner(System.in);
		a = entrada1.nextDouble();
		System.out.println("Ingrese el segundo número a restar: ");
		Scanner entrada2 = new Scanner(System.in);
		b = entrada2.nextDouble();
		System.out.println(a/b);
		
	}

	@Override
	public void checarTemperatura() {
		System.out.println("Tomando temperatura 36°");
		
	}

	@Override
	public void tomarPresion() {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
}
