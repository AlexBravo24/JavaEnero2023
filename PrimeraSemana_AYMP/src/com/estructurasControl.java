package com;

public class estructurasControl {

	public static void main(String[] args) {
		int x = 12;
//		if(x<10) {
//			System.out.println("Es menor");
//		}else {
//			System.out.print("Es mayor");
//		}
		String nombre = "Murcielago";
		System.out.println(nombre.length());
		System.out.println(nombre.length()+x);
//		
//		if(nombre.length()<10) {
//			System.out.print("si es menor");
//		}else {
//			System.out.print("no es mayor a ");
//		}
		//Operadores lógicos AND, OR, NOT 
		
//		if(nombre.length()<20 && nombre.length()>9 && nombre.equalsIgnoreCase("Murcielago")) {
//			System.out.println("Si se cumple la condición AND");
//		}else {
//			System.out.print("No se cumple la AND");
//		}
		
//		if(nombre.length()<20 && nombre.length()>9 && nombre.equals("Murcielago")) {
//			System.out.println("Si se cumple la condición AND");
//		}else {
//			System.out.println("No se cumple la AND");
//		}
		
		//OR
//		
//		if(nombre.length()>20 || nombre.equalsIgnoreCase("murcielago")) {
//			System.out.print("Si se comple la OR");
//		}else {
//			System.out.print("No se cumple la OR");
//       NEGACION:
//		
//		if(!(nombre.length()>9 || nombre.equals("murcielago"))) {
//			System.out.print("Si se comple la OR");
//		}else {
//			System.out.print("No se cumple la OR");
//		}
		
		//IGUALDAD O COMPARACION (==)
//		if(x ==9) {
//			System.out.print("Si es igual");
//		}else {
//			System.out.print("No es igual");
//		}
		//DIFERENTE DE
//		if(x != 10) {
//			System.out.print("Si es diferente");
//		}else {
//			System.out.print("No es diferente de 10");
//		}
		
		//Estructura if-else anidado
		int d = 9;
//		if(d==1) {
//			System.out.println("Es lunes");
//		}else if(d==2) {
//			System.out.println("Es martes");
//		}else if(d==3) {
//			System.out.println("Es miercoles");
//		}else {
//			System.out.print("Desconocido");
//		}
		//ESTRUCTURA DE DECISION SWITCH CASE
		char dia= 'b';
		switch (dia) { 
		case 'a':
			System.out.print("Lunes");
			break;
		case 'b':
			System.out.print("Martes");
			break;
		case 'c':
			System.out.print("Miercoles");
			break;
		case 'd':
			System.out.print("Jueves");
			break;
		case 'e':
			System.out.print("Viernes");
			break;
		default:
			System.out.print("Desconocido");
		}
		
	}
}
