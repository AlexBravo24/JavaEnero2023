package com;

import java.util.Scanner;

public class ejercicioSeis {

	public static void main(String[] args) {
		
		float precio, precioF;
		String A;
		int tamano;
		System.out.print("Ingrese el precio inicial: ");
		Scanner entradaPrecio= new Scanner(System.in);
		precio = entradaPrecio.nextFloat();
		System.out.print("Ingrese el tipo de uva (A o B): ");
		Scanner entradauva= new Scanner(System.in);
		A = entradauva.next();
		
		if(A.equalsIgnoreCase("a")) {
			precioF = precio + 20;
			System.out.println("Precio para tamaño 1: "+precioF);
			System.out.println("Precio para tamaño 2: "+(precio+30));
		}else if(A.equalsIgnoreCase("b")) {
			System.out.println("Precio para tamaño 1: "+(precio-30));
			System.out.println("Precio para tamaño 2: "+(precio-50));
		}else {
			System.out.print("No ingresó el tipo de uva correcto");
		}
	}

}
