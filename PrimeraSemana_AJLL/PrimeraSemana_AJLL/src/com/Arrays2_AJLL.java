package com;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 12/01/2023
 */
//2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
//1 al 100. Obt�n la suma de todos ellos y la media

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
