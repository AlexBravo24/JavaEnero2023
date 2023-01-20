package com;

public class Array {

	public static void main(String[] args) {
		
		/*
		 * Los arrays o arreglos son una estructura de datos
		 * almacena un tipo de datos en comun y una vez declarada su tamaño 
		 * o longitud este no puede crecer o cambiar
		 */
		
		//Declaracion de un array con su tamaño
		
		int [] numeros = new int [10];
		
		numeros [0] = 1; //Indicamos en los corchetes la posicion en la que se va a almacenar un valor
		numeros [1] = 2;
		numeros [2] = 3;
		numeros [3] = 4;
		numeros [4] = 5;
		numeros [5] = 6;
		numeros [6] = 7;
		numeros [7] = 8;
		numeros [8] = 9;
		numeros [9] = 10;
	  //numeros [10] = 100; ¡ERROR! por que se declara el inicio que son 10 numeros empezando por el 0
		
		
		// Darle salida de consola de posicion del array/ determinar un valor
		
		//System.out.println(numeros[5]);
		
		//Otra manera de declarar un array con sus valores
		
		int [] numero2 = {1,2,3,4,5,6,7,8,9,10}; 
		
		//Imprimir todos los valores
		
		//for(int i=0;i<numero2.length;i++){
			
			//System.out.print(numero2[i]);
		//}
		//Otra manera de imprimir todos los elementos
		
//		for (int i:numero2) {
//			System.out.print(i);
//		}
		
		String [] nombres = {"Maria","Argelia","Azael","Manuel","Rafael","Aaron"};
		
		System.out.println(nombres[1]);
		
		//syso + ctrl + espacio
		
		System.out.println();
		

	}

}
