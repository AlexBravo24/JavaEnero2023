package com;

import java.util.Scanner;

public class Calculadora implements MetodosCalculadora{
	
	private String marca;
	private String modelo;
	private String color;
	private boolean celdaSolar;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String modelo, String color, boolean celdaSolar) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.celdaSolar = celdaSolar;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isCeldaSolar() {
		return celdaSolar;
	}

	public void setCeldaSolar(boolean celdaSolar) {
		this.celdaSolar = celdaSolar;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", celdaSolar=" + celdaSolar
				+ "]";
	}

	@Override
	public void sumar() {
		double a;
		double b;
		System.out.println("Escriba el primer número a sumar: ");
		Scanner entrada = new Scanner(System.in);
		a = entrada.nextDouble();
		System.out.println("Escriba el segundo número a sumar:");
		b = entrada.nextDouble();
		System.out.println("El resultado de la suma es: " + (a + b) + "\n");
		
	}

	@Override
	public void restar() {
		double a;
		double b;
		System.out.println("Escriba el primer número: ");
		Scanner entrada = new Scanner(System.in);
		a = entrada.nextDouble();
		System.out.println("Escriba el segundo número a restar:");
		b = entrada.nextDouble();
		System.out.println("El resultado de la resta es: " + (a - b) + "\n");
		
	}

	@Override
	public void multiplicar() {
		double a;
		double b;
		System.out.println("Escriba el primer número a multiplicar: ");
		Scanner entrada = new Scanner(System.in);
		a = entrada.nextDouble();
		System.out.println("Escriba el segundo número a multiplicar");
		b = entrada.nextDouble();
		System.out.println("El resultado de la multiplicación es: " + (a * b) + "\n");
		
	}

	@Override
	public void dividir() {
		double a;
		double b;
		System.out.println("Escriba el primer número dividendo: ");
		Scanner entrada = new Scanner(System.in);
		a = entrada.nextDouble();
		System.out.println("Escriba el segundo número divisor:");
		b = entrada.nextDouble();
		System.out.println("El resultado de la suma es: " + (a / b) + "\n");
		
	}

	
	
}
