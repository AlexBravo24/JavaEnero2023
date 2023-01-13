package com;

public class Array_EBA {

	public static void main(String[] args) {
		
		/*los arrayso arreglos son una estructura de datos 
		 * almacenados un tipo de datos en común y una vez declarado su tamaño 
		 * o longitud este no puede crecer o cmabiar
		 */

		//declarando un array con su tamaño 
		
		int [] numeros = new int [10]; // array numeros enteros con su tamaño declarado.
		
		numeros [0] = 1; // indicamos en los corchetes la posicion en la que se va a lmacenar un valor
		numeros [1] = 2;
		numeros [2] = 3;
		numeros [3] = 4;
		numeros [4] = 5;
		numeros [5] = 6;
		numeros [6] = 7;
		numeros [7] = 8;
		numeros [8] = 9;
		numeros [9] = 10;
    //	numeros [9] = 10;  nos dara error por que el tamaño de array ya esta declarado.
		
	// Darle salida en consola a determinada posicion del arrar/determinado valor 
		
		//System.out.println(9);
		
		
	// Otra manera de ceclarar e iniciar un array ya con sus valores 
		
		int [] numeros2 = {1,2,3,4,5,6,7,8,9,10}; // ya tendriamos el array longitud y los valores de cada posicion
		
	// Imprimir en pantalla todos los valores del array 
		
		for (int i = 0; i < numeros2.length; i++) {
			//System.out.print(numeros2[i]);
		}
		
	// Imprimir en pantalla los valores del array pero con un ciclo for each	
		
		for (int i:numeros2) {
			//System.out.print(i);
		}
		
		String [] nombre = {"Alex", "Aylin", "Tavo", "Eduardo", "German"}; 
		System.out.println(nombre[1]);
		
		
		
		
		
		
	}

}
