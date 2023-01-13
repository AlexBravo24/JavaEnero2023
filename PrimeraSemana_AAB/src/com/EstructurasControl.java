package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		
	//Estructuras de decision IF - valores booleanos
		
		int x = 9;
		
//		if (x < 10) {  //Condicion dependiendo del valor de x
//			System.out.println("Es menor");
//		} else {
//			System.out.println("Es mayor");
//		}
		
		String nombre = "Murcielago";
		
		//System.out.println(nombre.length()); //El metodo .length devuelve el valor numerico de 
											 //la longitud del String
		
//		if (nombre.length() <= 10) { //Operador menor que, mayor que, menor o igual/mayor o igual
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		//System.out.println(nombre.length() + x); //Se pueden realizar operaciones numericas usando ese metodo
		
	//Condiciones compuestas con operadores logicos AND, OR, NOT, DIFERENTE DE E IGUALDAD
		
		//AND - && - Te devuelve True cuando se cumplen todas las condiciones, de lo contrario devuelve False
		
//		if (nombre.length() < 20 && nombre.length() > 9 && nombre.equals("Murcielago")) { // el metodo .equals compara con otro objeto y es sensible a mayusculas
//																					      // .equalsIgnoreCase no es sensible a mayusculas
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
		//OR - || - Te devuelve True cuando se cumple al menos una de las condiciones
		
//		if (nombre.length() > 20 || nombre.equalsIgnoreCase("murcielago")) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
		//NOT - ! - Niega una condicion/Cambia el valor de True a False y viceversa
		
//		if (!(nombre.length() > 9 || nombre.equals("murcielago"))) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
		//IGUALDAD O COMPARACION (==) - Revisar o comparar el valor, si es igual manda True
		//Un solo igual significa asignacion
		
//		if (x == 9) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
		//DIFERENTE DE - != - Compara el valor y si es diferente manda True
		
		
//		if (x != 10){
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
	//Estructura if-else concatenado o if anidado
		
		
		int d = 2;
//		
//		if (d == 1) {
//			System.out.println("Lunes");
//		} else if (d == 2) {
//			System.out.println("Martes");
//		} else if (d == 3) {
//			 System.out.println("Miercoles");
//		} else if (d == 4) {
//			System.out.println("Jueves");
//		} else if (d == 5) {
//			 System.out.println("Viernes");
//		} else {
//			System.out.println("Error");
//		}
		
		
	//Estructura de decision SWITCH-CASE
		//Puede ser con tipo de dato int, String, char, etc.
		
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
			System.out.println("Desconocido");
		}
		
		
		
		
		
	}

}
