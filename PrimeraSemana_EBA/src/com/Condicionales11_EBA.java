package com;

import java.util.Scanner;

public class Condicionales11_EBA {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el peso del paquete");
		int peso = leer.nextInt();
		System.out.println("Introduce destino del paquete");
		String destino = leer.nextLine().toString();
		leer.nextLine();
		
		String americaN =  "america del norte";
		String americaC =  "america central";
		String americaS =  "america del sur";
		String europa   =  "europa";
		String asia     =  "asi";
		
		if (destino.equalsIgnoreCase(americaN) ){
			System.out.println("El total a pagar es: " + (peso * 24));			
		} 
		else if (destino.equalsIgnoreCase(americaC) && peso <5 ){
			System.out.println("El total a pagar es: " + (peso * 20));			
		}
		else if (destino.equalsIgnoreCase(americaS) && peso <5 ){
			System.out.println("El total a pagar es: " + (peso * 21));			
		}
		else if (destino.equalsIgnoreCase(europa)&& peso <=5){
			System.out.println("El total a pagar es: " + (peso * 10));			
		}
		if (destino.equalsIgnoreCase(asia) && peso <=5){
			System.out.println("El total a pagar es: " + (peso * 18));			
		}
		

	}

}
