package com;

import java.util.Scanner;

public class ejercicioOnce {

	public static void main(String[] args) {
		float kilos, resultado;
		int zona;
		System.out.print("Ingrese el peso en kilos de su paquete: ");
		Scanner entrada1= new Scanner(System.in);
		kilos= entrada1.nextFloat();
		System.out.println("Ingrese la zona a la que va dirigido el paquete: ");
		System.out.println("1: América del Norte");
		System.out.println("2: América Central");
		System.out.println("3: América del Sur");
		System.out.println("4: Europa");
		System.out.println("5: Asia");
		Scanner entrada2= new Scanner(System.in);
		zona= entrada2.nextInt();
		
		if(zona == 1) {
			resultado = kilos * 24;
			System.out.println("El costo es: $"+resultado+" euros");
		}else if(zona == 2) {
			resultado = kilos * 20;
			System.out.println("El costo es: $"+resultado+" euros");
		}if(zona == 3) {
			resultado = kilos * 21;
			System.out.println("El costo es: $"+resultado+" euros");
		}if(zona == 4) {
			resultado = kilos * 10;
			System.out.println("El costo es: $"+resultado+" euros");
		}else if(zona == 5) {
			resultado = kilos * 18;
			System.out.println("El costo es: $"+resultado+" euros");
		}else {
			System.out.println("Ingrese un número correcto del 1 al 5");
		}

	}
}
