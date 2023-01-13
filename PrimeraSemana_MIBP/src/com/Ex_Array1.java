package com;

import java.util.Scanner;

public class Ex_Array1 {
//	Crea un array de 10 posiciones de números con valores pedidos por teclado.
//	Muestra por consola el índice y el valor al que corresponde.

	public static void main(String[] args)
	{
		int i;
        int[] numeros = new int[10];

        Scanner teclado = new Scanner(System.in);

        for(i=0; i<numeros.length; i++)
        {
            System.out.printf("Introduzca número %d: ", i+1);
            numeros[i] = teclado.nextInt();
        }

        for(i=0; i<numeros.length; i++)
        {
            System.out.println("Sus numeros son\t" + i + numeros[i]);
        }
		
		
	
	
	
	
	
	}

}
