package com;

public class Array_AYMP {

	public static void main(String[] args) {
		//Los arrays o arreglos son una estructura de datos
		//Almacena un tipo de datos en común y una vez declrado su tamaña o longitud
		//este no puede crecer o cambiar
		
		//Declarando array con su tamaño
		int [] numeros = new int[10]; //un array de números enteros con su tamaño declarado
		
		//introducir datos en cada posición del array
		
		numeros[0]=1; //Indicamos en los corchetes en la que se almacenará un valor
		numeros[1]=2;
		numeros[2]=3;
		numeros[3]=4;
		numeros[4]=5;
		numeros[5]=6;
		numeros[6]=7;
		numeros[7]=8;
		numeros[8]=9;
		numeros[9]=1000;
//		numeros[10]=10;	//si ponemos otro valor dará error, porque el tamaño del array ya está declarado.	
		//Darle salida en consola a determinada posición del array / determnado valor
		
		//System.out.print(numeros[9]);
		
		//otra manera de declarar e iniciar un array ya con sus valores
		
		int [] numeros2 = {1,2,3,4,5,6,7,8,9,10}; //array con longitud y valor en cada posición
		
		//imprimir en pantalla todos los valores del array
		
		for (int i = 0; i<numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		String [] nombres = {"Alex","Aylin","Tavo","Eduerdo","German","César"}; 
		System.out.println(nombres[1]);
		
		
		
	}

}
