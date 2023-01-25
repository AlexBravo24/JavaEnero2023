package com;

import java.util.Scanner;

public  class Cientifica extends Objeto implements IMetodos1 {

	
	
	public Cientifica() {}
	
	
	public Cientifica(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}

	//Como no hay objetos en esta clase no es necesario generar los getters & setters

	@Override
	public String toString() {
		return "Cientifica [getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + "]";
	}


	@Override
	public int menu() {
		int menu=0 ;

		Scanner entrada = new Scanner(System.in); 
		System.out.println("Buenvenid@ a la CALCULADORA CIENTIFICA, SELECCIONA LA Operacion que desees realizar ");
		System.out.println("1. SUMAR a + b\n2.RESTAR a - b\n3.Multiplicar a * b\n4.Dividir a / b\n5.Elevar a ^ b \n6.Raiz cuadrada de a");
		menu=entrada.nextInt();
		entrada.close();
		return menu;
		
	}

	@Override
	public void sumar() {
		double a ;
		double b ;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Seleccionaste la suma.\n\nIngresa a:");
		a=entrada.nextDouble();
		
		System.out.println("Ingresa b:");
		b=entrada.nextDouble();
		entrada.close();
		
		System.out.println("Resultado a + b= " + (a+b));
		
	}

	@Override
	public void restar() {
		double a ;
		double b ;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Seleccionaste la resta.\n\nIngresa a:");
		a=entrada.nextDouble();
		
		System.out.println("Ingresa b:");
		b=entrada.nextDouble();
		entrada.close();
		
		System.out.println("Resultado a - b= " + (a-b));
	
		
	}

	@Override
	public void multiplicar() {
		double a ;
		double b ;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Seleccionaste la multiplicacion.\n\nIngresa a:");
		a=entrada.nextDouble();
		
		System.out.println("Ingresa b:");
		b=entrada.nextDouble();
		entrada.close();
		
		System.out.println("Resultado a * b= " +(a*b));
		
	}

	@Override
	public void dividir() {
		double a ;
		double b ;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Seleccionaste la division.\n\nIngresa a:");
		a=entrada.nextDouble();
		
		System.out.println("Ingresa b:");
		b=entrada.nextDouble();
		entrada.close();
		
		System.out.println("Resultado a / b= " + (a/b));
		
	}

	@Override
	public void potencia() {
		double a ;
		double b ;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Seleccionaste la Potencia.\n\nIngresa a:");
		a=entrada.nextDouble();
		
		System.out.println("Ingresa b:");
		b=entrada.nextDouble();
		entrada.close();
		
		System.out.println("Resultado a ^ b= " + (Math.pow(a, b)));
		
	}

	@Override
	public void raizCuadrada() {
		double a ;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Seleccionaste la Raiz cuadrada.\n\nIngresa a:");
		a=entrada.nextDouble();
		entrada.close();
		
		System.out.println("Resultado Raiz de a= " + (Math.sqrt(a)));
		
	}

	

}
