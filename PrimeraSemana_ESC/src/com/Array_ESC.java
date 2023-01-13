package com;

public class Array_ESC {

	public static void main(String[] args) {
		
		/*Los arrays o arreglos son una estructura de datos
		 * alamcenan un tipo de datos en comun y una vez declarado su tamaño
		 * o longitud esto no puede crecer o cambiar.
		 * Los datos empiza a almacenarlos desde la posicion 0
		 */
		
		//Declarando un array con su tamaño
		
		int [] numeros = new int [10]; //Un Array de numero enteros con su tamaño declarado
		
		//Inroducir datos en cada posición del Array
		
		numeros[0]=1; //Indicamos en los corchetes la posicion en la que se va a almacenar un valor
		numeros[1]=2;
		numeros[2]=3;
		numeros[3]=4;
		numeros[4]=5;
		numeros[5]=6;
		numeros[6]=7;
		numeros[7]=8;
		numeros[8]=9;
		numeros[9]=10;
		// numeros[10]=12; //Si introducimos otro valor, nos da error porque el tamaño del array
		//ya esta declarado al inicio
		
	//Darle salida en consola a determinada posicion del array y/o determinado valor
		
		System.out.println(numeros[9]);
		
	//Otra manera de Declarar e iniciar un array ya con sus valores
		
		int [] numeros2= {1,2,3,4,5,6,7,8,9,10}; //Ya tendriamos el array con su longitud y
												 //los valores en cada posicion. 
		
		//Imprimir en pantalla todos los valores del array con ciclo for 
		
		for(int i=0; i<numeros2.length;i++) {
			System.out.print(numeros2[i]); //System.out.println(numeros2[i]);
		}
		
		//Imprimmir en pantalla los valores del array con un for each
		
		for (int i:numeros2) {
			System.out.println(+i);
		}
		
		String [] nombres = {"Alex", "Aylin", "Tavo", "Eduardo", "German", "Cesar"};
		
		//System.out.println(nombres[1]);
		for (String i:nombres) {
			System.out.println(i);
		}
		
		System.out.println();//syso ctrl + barra espaciadora
		
	}

}
