package com;

import java.util.Scanner;

public class Calculadora implements InterfaceCalculadora{
	
	private String marca;
	private String color;
	private String modelo;
	private boolean celdaSolar;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String color, String modelo, boolean celdaSolar) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.celdaSolar = celdaSolar;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isCeldaSolar() {
		return celdaSolar;
	}

	public void setCeldaSolar(boolean celdaSolar) {
		this.celdaSolar = celdaSolar;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", celdaSolar=" + celdaSolar
				+ "]";
	}

	@Override
	public void Suma() {
		double a, b;
		System.out.println("Ingrese un número a sumar: ");
		Scanner entrada=new Scanner(System.in);
		a = entrada.nextDouble();
		
		System.out.println("Ingrese un segundo número a sumar: ");
		b= entrada.nextDouble();
		System.out.println("Resultado de la suma: "+(a+b));
		
	}

	@Override
	public void Resta() {
		double a, b;
		System.out.println("Ingrese un número a restar: ");
		Scanner entrada=new Scanner(System.in);
		a = entrada.nextDouble();
		
		System.out.println("Ingrese un segundo número a restar: ");
		b= entrada.nextDouble();
		System.out.println("Resultado de la resta: "+(a-b));
		
	}

	@Override
	public void division() {
		double a, b;
		System.out.println("Ingrese un número a dividendo: ");
		Scanner entrada=new Scanner(System.in);
		a = entrada.nextDouble();
		
		System.out.println("Ingrese un segundo número divisor: ");
		b= entrada.nextDouble();
		System.out.println("Resultado de la división: "+(a/b));
		
	}

	@Override
	public void multiplicacion() {
		double a, b;
		System.out.println("Ingrese un número a multiplicar: ");
		Scanner entrada=new Scanner(System.in);
		a = entrada.nextDouble();
		
		System.out.println("Ingrese un segundo número a multiplicar: ");
		b= entrada.nextDouble();
		System.out.println("Resultado de la multiplicación: "+(a*b));
		
	}
	
	

}
