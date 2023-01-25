package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 12/01/2023
 */
//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
//respectivos precios. Muestra en consola la lista de productos y sus precios. 
//Por lo menos 5 productos o artículos.

public class Arrays5_AJLL 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n;
		
		System.out.println("Programa que lee n cantidad de productos y sus respectivos precios. \nIngresa la cantidad de productos deseados:");
		Scanner entrada = new Scanner(System.in); 
		n = entrada.nextInt();
		
		String [] productos = new String[n];
		double [] precios = new double[n];
		Scanner entrada2 = new Scanner(System.in);
		
		for(int i=0; i<n ; i++)
		{
			System.out.print("\nIngrese el " + (i+1) + " producto: ");
			productos [i] = entrada2.next();
			System.out.print("Ingrese su precio: ");
			precios [i] = entrada.nextDouble();
		}
		 System.out.println("\nLa relacion de precios y productos es la siguiente: ");
		 
		 for(int i=0; i<n ; i++)
		 {
			 System.out.println(productos[i] + " -- $" + precios[i] );
		 }
		
	}

}
