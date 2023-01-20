package com;

import java.util.Scanner;

public class Calculadora extends Objeto implements Metodos {

	public Calculadora() {	}

	public Calculadora(String modelo, String marca, int año) {
		super(modelo, marca, año);
	}

	@Override
	public String toString() {
		return "Calculadora [getModelo()=" + getModelo() + ", getMarca()=" + getMarca() + ", getAño()=" + getAño()
				+ "]";
	}

	@Override
	public void suma() {
		double a;
		double b;
		Scanner cs = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		a = cs.nextDouble();
		System.out.println("Ingresa otro número");
		b = cs.nextDouble();
		System.out.println(a+b);
		
	}

	@Override
	public void resta() {
		double a;
		double b;
		Scanner cs = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		a = cs.nextDouble();
		System.out.println("Ingresa otro número");
		b = cs.nextDouble();
		System.out.println(a-b);
		
	}

	@Override
	public void multiplicacion() {
		double a;
		double b;
		Scanner cs = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		a = cs.nextDouble();
		System.out.println("Ingresa otro número");
		b = cs.nextDouble();
		System.out.println(a*b);
		
	}

	@Override
	public void division() {
		double a;
		double b;
		Scanner cs = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		a = cs.nextDouble();
		System.out.println("Ingresa otro número");
		b = cs.nextDouble();
		System.out.println(a/b);
		
	}

	@Override
	public void grabaVoz() {
		System.out.println("¡Esta calculadora no cuenta con grabadorade voz!");
		
	}

	@Override
	public void reproduceMusica() {
		System.out.println("¡Esta calculadora no cuenta con reproductor de música!");
		
	}

	@Override
	public void tomaFoto() {
		System.out.println("¡Esta calculadora no cuenta con cámara!");
		
	}
	
	
	
	
	
	

}
