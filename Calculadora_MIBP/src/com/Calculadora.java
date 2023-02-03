package com;

import java.util.Scanner;

public class Calculadora extends Objeto {

	private boolean celdaSolar;
	
	public Calculadora() {};
	
	
	
	
	
	public Calculadora(String marca, String modelo, boolean celdaSolar) {
		super(marca, modelo);
		this.celdaSolar = celdaSolar;
	}

	




	public boolean isCeldaSolar() {
		return celdaSolar;
	}


	


	@Override
	public String toString() {
		return "Calculadora [celdaSolar=" + celdaSolar + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ "]";
	}





	public void setCeldaSolar(boolean celdaSolar) {
		this.celdaSolar = celdaSolar;
	}


	


	@Override
	public void sumar() {
		double a;
		double b;
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Ingresa el primer dígito");
		a=entrada.nextDouble();
		 System.out.println("Ingresa el segundo número");
		b=entrada.nextDouble();
		
		System.out.println("El resultado es " +(a+b));
	}

	@Override
	public void restar() {
		double a;
		double b;
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Ingresa el primer dígito");
		a=entrada.nextDouble();
		 System.out.println("Ingresa el segundo número");
		b=entrada.nextDouble();
		
		System.out.println("El resultado es " +(a-b));
		
		
	}

	@Override
	public void multiplicar() {
		double a;
		double b;
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Ingresa el primer dígito");
		a=entrada.nextDouble();
		 System.out.println("Ingresa el segundo número");
		b=entrada.nextDouble();
		
		System.out.println("El resultado es " +(a*b));
		
	}

	@Override
	public void dividir() {
		double a;
		double b;
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Ingresa el primer dígito");
		a=entrada.nextDouble();
		 System.out.println("Ingresa el segundo número");
		b=entrada.nextDouble();
		
		System.out.println("El resultado es " +(a/b));
		
	}






	





	


	}
	

	

	
	
	


