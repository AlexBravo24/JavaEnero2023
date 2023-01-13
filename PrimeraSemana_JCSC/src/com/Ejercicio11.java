package com;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		
		double kg = 0;
		int zona;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Indica el peso de tu paquete en KG");
		kg = kg + entrada.nextDouble();
	
		if (kg<=0 || kg>5) {
			System.out.println("RECHAZADO");
		}
		{
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Indica la zona ubicación");
		zona = entrada2.nextInt();
		
		if (zona<=0 || zona>5) {
			System.out.println("ZONA NO EXISTENTE");
		}
		{
		
			if (zona==1) {
				System.out.println("El costo del paquete hacia América del Norte es de " + kg*24 + " euros.");
			}else if (zona==2) {
				System.out.println("El costo del paquete hacia América Central es de " + kg*20 + " euros.");
			}else if (zona==3) {
				System.out.println("El costo del paquete hacia América del Sur es de " + kg*21 + " euros.");
			}else if (zona==4) {
				System.out.println("El costo del paquete hacia Europa es de " + kg*10 + " euros.");
			}else if (zona==5) {
				System.out.println("El costo del paquete hacia Asia es de " + kg*18 + " euros.");
			}
			
		
			
		}
		}
	}

}
