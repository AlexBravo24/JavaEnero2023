package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 12/01/2023
 */

//1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
//Muestra por consola el índice y el valor al que corresponde.

public class Arrays1_AJLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=2;
		int [] numeros = new int [n];
		
		
		System.out.println("Para llenar un array de 10 datos.");
		
		Scanner entrada = new Scanner(System.in); 
		for (int i = 0 ; i<n ; i++)
		{
			System.out.print("Introduce el " + (i+1) + " numero:" + "\n");
			numeros[i] = entrada.nextInt();
	
		}
		for (int i = 0 ; i<n ; i++)
		{

			System.out.print("La posicion " + (i+1) + " es: " + numeros[i] + "\n");
		}
		
		
	}

}
