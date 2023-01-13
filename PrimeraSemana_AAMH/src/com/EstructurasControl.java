package com;

public class EstructurasControl {

	public static void main(String[] args) {
	
		//Estructuras de condicion IF - valores booleanos
		
		int x = 9;
		
//		if(x<10){
//			System.out.println(x+" es menor que 10");
//		}else {
//			System.out.println(x+" es mayor que 10");
//		}
		
		String nombre = "Aaron Azael";
		//System.out.println(nombre.length()); //El metodo lenght devuelve el valor en numero
		
//		if(nombre.length()<10) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//Condiciones compuestas con operadores lógicos AND,OR,NOT, DIFERENTES DE E IGUALDAD
		
		// AND = &&
		
//		if (nombre.length()<20 && nombre.length()>10 && nombre.equalsIgnoreCase("Aaron Azael")) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//OR = ||
//		
//		if (nombre.length()<20 || nombre.equalsIgnoreCase("Aaron Azael")) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		// NOT = !       Niega una condicion o cambia el valor true a false
		
//		if (!(nombre.length()>5 || nombre.equals("Aaron Azael"))) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//IGUALDAD O COMPARACION
		// un = es de asignacion y == de comparacion
		
		
//		if (x == 10) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//DIFERENTE DE !=   Compara si es diferente y manda un TRUE
		
//		if (x != 10) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//ESTRUCTURA if-else concatenado o if anidado
		
	int d = 5;
//		
//		if (d == 1) {
//			System.out.println("Lunes");
//		}else if(d == 2) {
//			System.out.println("Martes");
//		}else if(d == 3) {
//			System.out.println("Miercoles");
//		}else if(d == 4) {
//			System.out.println("Jueves");
//		}else if(d == 5) {
//			System.out.println("Viernes");
//		}else {
//			System.out.println("Es fin de semana");
//		}
		
		//ESTRUCTURA DE DECISION SWITCH-CASE
		
	   char dia = 'x';
	
		switch (dia) {
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
		default:
			System.out.println("Es fin de semana");
		}
	}

}
