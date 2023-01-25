package com;

import java.util.Scanner;

//Implements sirve para traer los comportamientos de una interface
public class Calculadora extends Objeto implements Imedicina{

	private boolean celdaSolar;
	
	public Calculadora() {}
	

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

	
	

//	@Override
//	public void sumar() {
//		double a ;
//		double b ;
//		
//		Scanner entrada = new Scanner(System.in); 
//		System.out.println("Seleccionaste la suma.\n\nIngresa a:");
//		a=entrada.nextDouble();
//		
//		System.out.println("Ingresa b:");
//		b=entrada.nextDouble();
//		
//		System.out.println("Resultado a+b= " + (a+b));
//	}
//
//	@Override
//	public void restar() {
//		double a ;
//		double b ;
//		
//		Scanner entrada = new Scanner(System.in); 
//		System.out.println("Seleccionaste la resta.\n\nIngresa a:");
//		a=entrada.nextDouble();
//		
//		System.out.println("Ingresa b:");
//		b=entrada.nextDouble();
//		
//		System.out.println("Resultado a-b= " + (a-b));
//	}
//
//	@Override
//	public void multiplicar() {
//		double a ;
//		double b ;
//		
//		Scanner entrada = new Scanner(System.in); 
//		System.out.println("Seleccionaste la multiplicacion.\n\nIngresa a:");
//		a=entrada.nextDouble();
//		
//		System.out.println("Ingresa b:");
//		b=entrada.nextDouble();
//		
//		System.out.println("Resultado a*b= " +(a*b));
//	}
//
//	@Override
//	public void dividir() {
//		double a ;
//		double b ;
//		
//		Scanner entrada = new Scanner(System.in); 
//		System.out.println("Seleccionaste la division.\n\nIngresa a:");
//		a=entrada.nextDouble();
//		
//		System.out.println("Ingresa b:");
//		b=entrada.nextDouble();
//		
//		System.out.println("Resultado a/b= " + (a/b));
//	}


	@Override
	public void tomarTemperatura() {
		System.out.println("Tas caliente papito");
		
	}


	@Override
	public void tomarPresion() {
		System.out.println("Exceso de presion bb");
		
	}
	
	
}
