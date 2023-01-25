package com;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 12/01/2023
 */
//2. Crea un array de números de 100 posiciones, que contendrá los números del 
//1 al 100. Obtén la suma de todos ellos y la media

public class Arrays2_AJLL {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 
		int numeros [] = new int[100];
		int suma = 0;
		double media;
		
		for(int i = 0 ; i<100 ; i++) 
		{
			numeros [i] = (i+1);
			suma = suma + numeros[i];
		}
		 media = suma/100f;
		
		 System.out.println("Sumatoria numeros 1-100: " + suma + "\nMedia: " + media );
	}
}
