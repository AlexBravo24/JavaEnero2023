package com;

import java.util.Scanner;

public class RelojInteligente extends Objeto implements Metodos {

	public RelojInteligente() {
		super();
	}

	public RelojInteligente(String modelo, String marca, int año) {
		super(modelo, marca, año);
	}

	@Override
	public String toString() {
		return "RelojInteligente [getModelo()=" + getModelo() + ", getMarca()=" + getMarca() + ", getAño()=" + getAño()
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
		int a;
		int b;
		int c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Presiona 1 para iniciar a grabar la voz");
		a = sc.nextInt();
		
		if (a==1) {
			do {			
			System.out.println("Iniciando grabación...");
			Scanner sc2 = new Scanner (System.in);
			System.out.println("Presiona 0 para terminar...");
			b = sc2.nextInt();
			Scanner sc3 = new Scanner (System.in);
			System.out.println("¿Te gusta la grabación? Si te agrada presiona 1, sino, presiona 0 para repetir");
			c = sc3.nextInt();
			} while (c==0);
			
			System.out.println("¡Ahora puedes compartir tu grabación de voz!");
		
		} else {
			System.out.println("No se inició la grabación de voz.");
		}		
	}

	@Override
	public void reproduceMusica() {
		int a;
		int b;
		int c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Presiona 1 para iniciar a reproducir música");
		a = sc.nextInt();
		
		if (a==1) {
			do {			
			System.out.println("Reproduciendo canción...");
			Scanner sc2 = new Scanner (System.in);
			System.out.println("Presiona 0 para la siguiente canción...");
			b = sc2.nextInt();
			Scanner sc3 = new Scanner (System.in);
			System.out.println("¿Te gusta esta canción? Si te agrada presiona 1, sino, presiona 0 para la siguiente");
			c = sc3.nextInt();
			} while (c==0);
			
			System.out.println("¡Ahora puedes disfrutar de la canción!");
		
		} else {
			System.out.println("No se inició la reproducción de la música.");
		}		
		
	}

	@Override
	public void tomaFoto() {
		int a;
		int b;
		int c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Presiona 1 para tomar la foto");
		a = sc.nextInt();
		
		if (a==1) {
			do {			
			System.out.println("¡Cámara lista!");
			Scanner sc2 = new Scanner (System.in);
			System.out.println("Presiona 1 para tomar la foto...");
			b = sc2.nextInt();
			Scanner sc3 = new Scanner (System.in);
			System.out.println("¿Te gusta la foto? Si te agrada presiona 1, sino, presiona 0 para repetir");
			c = sc3.nextInt();
			} while (c==0);
			
			System.out.println("¡Ahora puedes compartir tu foto!");
		
		} else {
			System.out.println("No se tomó ninguna foto.");
		}		
		
	}
	
	
	
	
	
	
	
	
	
	

}
