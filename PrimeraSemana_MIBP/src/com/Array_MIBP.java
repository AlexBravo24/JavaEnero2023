package com;

public class Array_MIBP {

	public static void main(String[] args)
	{
		/* Los arrays o arreglos son una estructura de datos
		 * almacena un tipo de datos en común y una vez declarado su tamaño
		 * o logitud este no puede crecer o cambiar
		 */
		
		//Declarando un array con su tamaño
		
		int [] numeros = new int [10]; // Un array de numeros enteros con su tamaño declarado
		
		// Introducir datos en cada posición del array
		
//		numeros [0]=1; // Indicamos en los corchetes la posición en la que se va a almacenar un valor
//		numeros [1]=2;
//		numeros [2]=3;
//		numeros [3]=4;
//		numeros [4]=5;
//		numeros [5]=6;
//		numeros [6]=7;
//		numeros [7]=8;
//		numeros [8]=9;
//		numeros [9]=10;
//		numeros[10]= 1000;
				
		
		//Darle salida en consola a determinada posición del array/determinado valor
		
//		System.out.println(numeros[0]);
		 
		// otra manera de declarar e iniciar un array desde un principio
		int [] numeros2 = {1,2,3,4,5,6,7,8,9,10}; //Ya tendriamos el array con su longitud y los valores en cada posición
//		
//		//imprimir en pantalla todos los valores del array
//		
//		for (int i=0; i<numeros2.length; i++)
//		{
//			System.out.println(numeros2[i]);
//		}
		
		//Imprimir en pantalla los valores del array con un ciclo for each
		
		for (int i: numeros2) 
		{
		System.out.println(i);
		}
		
		String [] nombres = {"Alex", "Aylin","Tavo","Eduardo","German","César"};
		
		System.out.println(nombres[0]);
		
		
		
	}

}
