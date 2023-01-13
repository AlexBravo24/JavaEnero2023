package com;

public class Array_AAB {

	public static void main(String[] args) {
		
	//Los arrays o arreglos son una estructura de datos
		//almacenan un tipo de datos en comun yy una veza declatado su tamaño 
		//o longitud este no puede crecer o cambiar
		
	//Declarando un array con su tamaño
		
		int [] numeros = new int [10]; //Un array de numeros enteros con su tamaño declarado
		
	//Introducir datos en cada posicion del array
		
		numeros[0] = 1; //Indicamos en los corchetes la posicion en la que se va a almacenar un valor
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		numeros[5] = 6;
		numeros[6] = 7;
		numeros[7] = 8;
		numeros[8] = 9;
		numeros[9] = 10;
		
	//Darle salida en consola a determinada posicion del array/determinado valor
		
//		System.out.println(numeros[9]);
		
	//Otra manera de declarar e iniciar un array ya con sus valores desde un inicio
		
		int [] numeros2 = {1,2,3,4,5,6,7,8,9,10}; //Ya tendriamos el array con su longitud y
												  //los valores en cada posicion
		
		//Imprimir en pantalla todos los valores del array
		
//		for (int i = 0; i < numeros2.length; i++) {
//			System.out.println(numeros2[i]);
//		}
			
		//Imprimir en pantalla los valores del array con un ciclo for each
		
		for (int i:numeros2) {
			System.out.println(i);
		}

		String [] nombres = {"Alex", "Aylin", "Tavo", "Marcos", "German", "Cesar"};
		
		System.out.println(nombres[1]);
		
	}

}
