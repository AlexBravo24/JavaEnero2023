package com;

import java.util.Scanner;

public class EstructurasControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estructuras de decision IF -  valores booleanos
		
		int x = 9;
		
//		Scanner entrada = new Scanner(System.in); 
//		System.out.println("Introduce un numero");
//		int numero = entrada.nextInt();
//		
//		
//		if(numero<10) {
//			
//			System.out.println("El numero ingresado es menor que 10");
//			
//		} 
//			else {
//			
//			System.out.println("El numero ingresado es mayor que 10");
//			
//			}
		
		
		
		/*
		 * Metodo para saber la longitud de de un string
		 */
		
		String nombre = "Murcielago";
		//System.out.println(nombre.length());
		
//		if (nombre.length()<10) {
//			System.out.println("SI");
//		} else {
//			System.out.println("NO");
//		}
//		
			/*
			 * CONDICIONES COMPUESTAS
			 * AND, OR, NOT, DIFERENTE E IGUALDAD
			 */
		
		
		
		//AND - &&
//		
//		if(nombre.length()<20 && nombre.length()>10 && nombre.equals("Alex Loza")) {
//			System.out.println("si");
//			
//		} else {
//			System.out.println("no");
//		}
		
		
		
		//OR - || positivo en caso de que cualquiera de las condiciones sea verdad
		
//		if (nombre.length()>20 || nombre.equalsIgnoreCase("murcielago")) {
//			System.out.println("si");
//		} else {
//			System.out.println("no");
//		}
		
		
		
		//NOT - !
		
//		if (!(nombre.length()>15 || nombre.equalsIgnoreCase("murcielago"))) {
//			System.out.println("si");
//		} else {
//			System.out.println("no");
//		}
		
		
		
		//IGUALDAD O COMPARACION - ==
		
//		if (nombre.length()==10) {
//		System.out.println("si");
//	} else {
//		System.out.println("no");
//	}
		
		//DIFERENTE DE - !=
		
//		if (nombre.length()!=10) {
//		System.out.println("si");
//	} else {
//		System.out.println("no");
//	}
		
		
		//eSTRUCTURA IF-ELSE CONCATENADO O IF ANIDADO
		
		int d = 2;
		
//		if(d==1) {
//			System.out.println("Lunes");
//		} else if (d==2) {
//			System.out.println("Martes");
//		}else if (d==3) {
//			System.out.println("Miercoles");
//		}else if (d==4) {
//			System.out.println("Jueves");
//		}else if (d==5) {
//			System.out.println("Viernes");
//		} else {
//			System.out.println("Desconocido");
//		}
		
		
		//Estructura Switch - Case
		//int, String, Char, etc.
		
		switch (d) {
		
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Unknown");
			break;
		
		}
		
		
	}

}

