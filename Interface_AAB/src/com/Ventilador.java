package com;

import java.util.Scanner;

public class Ventilador implements MetodosVentilador{
	
	private String marca;
	private String modelo;
	private String color;
	private int numeroAspas;
	
	public Ventilador() {
		
	}

	public Ventilador(String marca, String modelo, String color, int numeroAspas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.numeroAspas = numeroAspas;
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

	public int getNumeroAspas() {
		return numeroAspas;
	}

	public void setNumeroAspas(int numeroAspas) {
		this.numeroAspas = numeroAspas;
	}

	@Override
	public String toString() {
		return "Ventilador [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", numeroAspas=" + numeroAspas
				+ "]";
	}

	@Override
	public void encendido() {
		int estado;
		System.out.println("¿Qué desea hacer con el ventilador?\nEstado 1: Encender\nEstado 0: Apagar");
		Scanner entrada = new Scanner(System.in);
		estado = entrada.nextInt();
		if (estado == 1) {
			System.out.println("Ventilador Encendido");
		} else if (estado == 0){
			System.out.println("Ventilador Apagado");
		} else {
			System.out.println("Función Incorrecta");
		}
		
	}

	@Override
	public void velocidad() {
		int velocidad;
		System.out.println("Seleccione la velocidad a la que quiere ajustar el ventilador: 1 / 2 / 3:");
		Scanner entrada = new Scanner(System.in);
		velocidad = entrada.nextInt();
		switch (velocidad) {
		
		case 1:
			System.out.println("Ventilador al 1\n brrrrr");
			break;
		case 2:
			System.out.println("Ventilador al 2\n Brrrrr");
			break;
		case 3:
			System.out.println("Ventilador al 3\n BRRRRRR");
			break;
		default:
			System.out.println("Función Incorrecta");
		}
		
	}

	@Override
	public void programar() {
		String hora;
		System.out.println("¿A qué hora desea que su ventilador se apague?");
		Scanner entrada = new Scanner(System.in);
		hora = entrada.next();
		System.out.println("Su ventilador se apagará a las: " + hora);
		
	}

	@Override
	public void darVueltas() {
		boolean vueltas;
		System.out.println("¿Desea que su ventilador gire? (true/false)");
		Scanner entrada = new Scanner(System.in);
		vueltas = entrada.nextBoolean();
		if (vueltas == true) {
			System.out.println("Ventilador girando...");
		} else {
			System.out.println("Ventilador estático");
		}
			
	}

	
	
}
