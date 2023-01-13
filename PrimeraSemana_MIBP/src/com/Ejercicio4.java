package com;

import java.util.Scanner;

public class Ejercicio4 {
	
	//Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
	//parámetros: edad, nota y sexo.
	//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
	//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
	//* Otros casos -> NO ACEPTADA

	public static void main(String[] args) {
		
		int edad;
		int nota;
		String sexo;
		
		System.out.println("Ingrese su edad");
		Scanner ed = new Scanner(System.in);
		edad= ed.nextInt();
		
		System.out.println("Ingrese su nota");
		Scanner not = new Scanner(System.in);
		nota = not.nextInt();
		
		System.out.println("Ingrese su sexo M o F");
		Scanner sex = new Scanner (System.in);
		sexo = sex.nextLine();
		
		if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
		 System.out.println("El valor de sexo introducido es incorrecto.\n"
		          + "por favor, reenvíe el formulario.");
		} else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
		      System.out.println("POSIBLE");
		    }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
		       System.out.println("ACEPTADA");
		    }else {
		        System.out.println("NO ACEPTADA");
		
		      
		      

	}

}
}
