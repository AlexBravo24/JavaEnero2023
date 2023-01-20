package com;

import java.util.Scanner;

public abstract class Objeto {
	
	private String marca;
	private String modelo;
	
	public Objeto () {}

	public Objeto(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Objeto [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	public  void sumar() {
		double a;
		double b;
		Scanner cs = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		a = cs.nextDouble();
		System.out.println("Ingresa otro número");
		b = cs.nextDouble();
		System.out.println(a+b);
	}
	
	public void restar(){
		double a;
		double b;
		Scanner cs = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		a = cs.nextDouble();
		System.out.println("Ingresa otro número");
		b = cs.nextDouble();
		System.out.println(a-b);
	}
	
	public void multiplicar(){
		double a;
		double b;
		Scanner cs = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		a = cs.nextDouble();
		System.out.println("Ingresa otro número");
		b = cs.nextDouble();
		System.out.println(a*b);
	}
	
	public void dividir() {
		double a;
		double b;
		Scanner cs = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		a = cs.nextDouble();
		System.out.println("Ingresa otro número");
		b = cs.nextDouble();
		System.out.println(a/b);
		
	}
	
	
	
	

}
