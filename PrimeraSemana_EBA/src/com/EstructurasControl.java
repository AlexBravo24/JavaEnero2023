package com;

public class EstructurasControl {


	public static void main(String[] args) {
		
		
		// Estructuras de decicion if - Valores booleanos
		
		String nombre = "Eduardo Bernabe";
		System.out.println(nombre.length());
		
//		if (nombre.length()< 20) {
//			System.out.println("si");
//		}
//		else {
//			System.out.println("no");
//		}
		
		
	    //CONDICIONALES COMPUESTAS CON OPERDORES LOGICOS AND, OR, NOT
		
		//AND = && - Devielve True cuando se cumplen todas las condicones.
//		
//		if (nombre.length() < 20 && nombre.length() > 10 && nombre.equalsIgnoreCase("eduardo bernabe")){
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
		
		
		//OR - || 
		//NOT - !
		
//		if (nombre.length() > 20 || nombre.equals("Eduado Bernabe")) {
//			
//		}
		
		// ESTRUCTURA DE IF ELSE CONCATENADO O IF ANIDADO
		
		int d = 6;
		
		if (d == 1) {
//			System.out.println("Lunes");
//		}else if (d ==2) {
//			System.out.println("martes");
//		}else if (d ==3) {
//			System.out.println("Miercoles");
//		}else if (d ==4) {
//			System.out.println("jueves");
//		}else if (d ==5) {
//			System.out.println("viernes");
//		}else {
//			System.out.println("Desconocido");
		}
		
		// ESTRUCTURA DE DESICION SWITCH-CASE 
		// PUEDE SER CON TIPO DE VALOR INT, STRING, CHAR, ETC.
		
		
		
		
//		switch(d) {
//		case 1:
//			System.out.println("Lunes");
//			break;
//		case 2:
//			System.out.println("Martes");
//			break;
//		case 3:
//			System.out.println("Miercoles");
//			break;
//		case 4:
//			System.out.println("Jueves");
//			break;
//		case 5:
//			System.out.println("Viernes");
//			break;
//		case 6:
//			System.out.println("Desconocido");
//			break;	
//		}
		
		char dia = 'b';
		switch(dia) {
		case 'a':
			System.out.println("Lunes");
			break;
		case 'b':
			System.out.println("Martes");
			break;
		case 'c':
			System.out.println("Miercoles");
			break;
		case 'd':
			System.out.println("Jueves");
			break;
		case 'e':
			System.out.println("Viernes");
			break;
		case 'f':
			System.out.println("Desconocido");
			break;	
		}
		
	}

}
