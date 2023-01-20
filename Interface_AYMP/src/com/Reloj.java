package com;

import java.util.Scanner;

public class Reloj implements InterfaceReloj{
	
	private String marca;
	private String modelo;
	private String tipo;
	private double precio;
	
	public Reloj() {
		
	}

	public Reloj(String marca, String modelo, String tipo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.precio = precio;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Reloj [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", precio=" + precio + "]";
	}

	@Override
	public void alarma() {
		String a;
		System.out.println("Ingrese a qué hora quiere programar su alarma: ");
		Scanner entrada=new Scanner(System.in);
		a = entrada.next();
		System.out.println("Su alarma sonará a las: "+a);
		
	}

	public void changeHour() {
		String a;
		System.out.println("Ingrese la hora actual para configurar su reloj: ");
		Scanner entrada=new Scanner(System.in);
		a = entrada.next();
		System.out.println("La hora actual es: "+a);
		
	}

	@Override
	public void changeDate() {
		String a;
		System.out.println("Ingrese la fecha actual para configurar su reloj: ");
		Scanner entrada=new Scanner(System.in);
		a = entrada.next();
		System.out.println("La fecha actual es: "+a);
		
	}

	@Override
	public void changeDay() {
		String a;
		System.out.println("Ingrese el día actual para configurar su reloj: ");
		Scanner entrada=new Scanner(System.in);
		a = entrada.next();
		System.out.println("El día de hoy es: "+a);
		
	}
	
	
	

}
