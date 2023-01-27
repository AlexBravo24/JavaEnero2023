package com;

import java.util.Scanner;

/*
 * Alex Jair Loza Lopez
 * 12/01/2023
 */
//1. Crea un programa que pida por pantalla cuatro pa�ses y a continuaci�n tres 
//ciudades de cada uno de estos pa�ses. Los nombres de ciudades deben 
//almacenarse en un array multidimensional cuyo primer �ndice sea el 
//n�mero asignado a cada pa�s y el segundo �ndice el n�mero asignado a 
//cada ciudad.


public class ArraysBidimensionales_AJLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] paises = new String [4][4];
		
		
		System.out.println("Programa que lee que almacena en un array bidimensional 4 paises, seguidos de 3 ciudades de cada uno de estos paises");
		Scanner entrada = new Scanner(System.in); 
		
		for (int i = 0; i<4 ; i++)
		{
			System.out.println("Ingrese el Pais " + (i+1) + ": ");
			paises[i][0]=entrada.nextLine();
			for(int j=1 ; j<4 ; j++)
			{
				System.out.println("Ingrese la ciudad " + j + " de " + paises[i][0] );
				paises[i][j]=entrada.nextLine();
			}
		}
	
	for (int i = 0; i<4 ; i++)
	{
		System.out.print("Pais: " + paises[i][0]);
		System.out.print("   Ciudades: ");
		for(int j=1 ; j<4 ; j++)
		{
			System.out.print("  " + paises[i][j] );
		}
		System.out.println();
	}
}

}
