package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 12/01/2023
 */
//4. Dado un array de números de 5 posiciones con los siguientes valores:
//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
//los valores invertidos, es decir, que el segundo array deberá tener los valores 
//{5,4,3,2,1}.

public class Arrays4_AJLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int m = n - 1;
		int [] numeros = new int [n];
		int [] invertidos = new int [n];
		
		
		System.out.println("Programa que lee 5 caracteres, invierte sus valores y los guarda en otro arreglo");
		Scanner entrada = new Scanner(System.in); 
		
		for(int i=0 ; i<n ; i++)
		{
			System.out.print("\nIntroduce el " + (i+1) + " numero:");
			numeros[i] = entrada.nextInt();
			invertidos[m] = numeros[i];
			m--;
		}
		
		System.out.println("El arreglo invertido es:");
		for(int i:invertidos)
		{
			System.out.print(i);
		}
		
		
	}

}
