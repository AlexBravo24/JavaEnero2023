package com;

import java.util.Scanner;

public class Array5_AAB {

	public static void main(String[] args) {
		
		String [] producto = new String[5];
		double [] precio = new double[5];
		
		for (int i = 0; i < producto.length; i++) {
			
			System.out.println("Agregue un producto: ");
			Scanner entrada1 = new Scanner(System.in);
			producto[i] = entrada1.next();
			
			System.out.println("Escriba su precio: ");
			Scanner entrada2 = new Scanner(System.in);
			precio[i] = entrada2.nextDouble();
			
		}
		System.out.println("Los productos y sus respectivos precios son: ");
		
		for (int i = 0; i < producto.length; i++) {
			System.out.print("El producto: " + producto[i]);
			System.out.println(", tiene un precio de: $" + precio[i]);
		}
	}

}
