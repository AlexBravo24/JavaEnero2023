package com;

import java.util.Scanner; //Imports o paquetes de otras clases

public class EntradaDatos {
	
	public static void main(String[] args) {
		
		
		//Introducir números por teclado
		
		int numero2 = 8;
		int numero; //Declarando la variable en la que se guarda lo que se introduzca por teclado
		Scanner entrada = new Scanner (System.in); //Inicia un objeto scanner que permite introducir datos por teclado
		System.out.println("Introduce un número"); //Envía mensaje de instrucción a la consola para saber que hacer
		numero = entrada.nextInt(); //Guarda el valor introducido por teclado en la variable declarada al inicio
		
		System.out.println("La raíz de " + numero + " es ");
		//System.out.println(Math.sqrt(numero));
		System.out.printf("%.4f", Math.sqrt(numero)); //Dandole formato a los decimales que muestra en consola
		
		//Comentario de varias líneas al mismo tiempo Ctrl + 7
		
		/*
		 * Operador módulo
		 */
		
		int n = 10;
		int resultado = n%3;
		System.out.println(resultado);
		
		
		
		
		
	}

}
