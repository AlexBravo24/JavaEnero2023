package com;

import javax.jws.soap.SOAPBinding;

public class Array_AJLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Los arrays o arreglos son una estructura de datos 
		 * almacenan un tipo de dato en comun 
		 * no puede ser modificado su tamaño
		 */
		
		
		//Declarando un array con su tamaño
		
		//int[] numeros = new int[10];//Un array de numeros enteros con su tamaño declarado
		
		//Introducir datos en cada posicion de array
		
//		numeros [0] = 1; //Indicamos en los corchetes la posicion en la que se almacena el valor;
//		numeros [1] = 2;
//		numeros [2] = 3;
//		numeros [3] = 4;
//		numeros [4] = 5;
//		numeros [5] = 6;
//		numeros [6] = 7;
//		numeros [7] = 8;
//		numeros [8] = 9;
//		numeros [9] = 10;
//		
		//Imprimir en la consola a determinadas posicion del Array
//		 System.out.println(numeros[1]);
		 
		 
		 //Otra manera de declarara un array ya con sus valores
		 
		 int [] numeros2 = {10,9,8,7,6,5,4,3,2,1};
		 
//		 System.out.println(numeros2[3]);
		
//		for(int i : numeros) {
//			System.out.println(numeros[i]);
//		}
		
		//Para  imprimir todos los datos de un array
		 
//		 for (int i=0 ; i<numeros2.length ; i++) {
//			 System.out.print(numeros2[i] + ", "  );
//		 }
		 
		 //Imprimir en pantalla los valores con un ciclo for each
		 
//		 for (int i:numeros2) {
//			 System.out.print(i + ", ");
//		 }
		 
		 String [] nombres = {"Alex","Aylin","Tavo","Eduardo","German","Cesar"};
		 
		 System.out.println(nombres[1]);
		 
		

	}

}
