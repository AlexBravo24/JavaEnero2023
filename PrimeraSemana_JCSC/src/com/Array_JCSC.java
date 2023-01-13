package com;

public class Array_JCSC {

	public static void main(String[] args) {
		
		/* Los Arrays o arreglos son una estructura de datos
		 * 	almacenan un tipo de datos en común y una vez declarado su tamaño
		 * o longitud este no puede crecer o cambiar
		 */
		
		//Declarando un array
		
		int [] numeros = new int [10]; //Un array de números enteros con tamaño declarado 
		
		//Introducir datos en cada posición del array
		
		numeros[0]=1;//Se indica en los corchetes la posición en la que se almacena el valor
		numeros[1]=2;
		numeros[2]=3;
		numeros[3]=4;
		numeros[4]=5;
		numeros[5]=6;
		numeros[6]=7;
		numeros[7]=8;
		numeros[8]=9;
		numeros[9]=10;
		
		//Dar salida en consola a determinada posición del array
		
		System.out.println(numeros[9]);
		
		
		//Otra manera de declarar un array e iniciarlo ya con sus valores
		
		int [] numeros2  =  {1,2,3,4,5,6,7,8,9,10}; //Ya está indicado el array, con su longitud y los valores en cada posición
		
		//Imprimir en pantalla todos los valores del array
		
//		for (int i=0; i<numeros2.length; i++) {
//			System.out.println(numeros[i]);
//		}
		
		
		//Imprimir en pantalla los valores del array con un ciclo for each
		
//		for (int i:numeros2) {
//			System.out.println(i);
//		}
		
		//Array con nombres
		
		String [] nombres = {"Alex", "Aylin", "Tavo", "Eduardo", "German", "César"};
		
		System.out.println(nombres[1]);
		
		
		
		
		

	
}
}
