package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		
		//Estructuras de decision IF - valores booleanos
		
		int x = 9;
		
//		if (x<10) { //Condición dependiendo del valor de x
//			System.out.println("Es menor");
//		} else {
//			System.out.println("Es mayor");
//		}

		
//		String name = "Murcielago";
//		System.out.println(name.length());//El método lenght devuelve el valor de la longitud del String
		
//		if (name.length()<=10) { //Operador menor que, mayor que, menor o igual/mayor o igual
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
		//Condiciones compuestas con operadores lógicos AND, OR, NOT, DIFERENTE DE E IGUALDAD
		
		//AND - && - Devuelve true si se cumplen TODAS las condiciones, sino, devuelve false
//		if (name.length()<20 &&  name.length()>9  && name.equals("Murcielago")) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
		// OR - || - Te devuelve TRUE cuando se cumple AL MENOS una condición
//		if (name.length()>9 || name.equals("murcielago")) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
//		// NOT - ! - Niega una condición/cambia el valor de TRUE a FALSE y viceversa
//		if (!(name.length()>9 || name.equals("murcielago"))) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
		//IGUALDAD O COMPARACION == - Compara el valor, si es igual manda TRUE, sino, FALSE
		
//		if (x == 9) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
		//DIFERENTE DE - != - Compara el valor y si es diferente manda un TRUE, sino, FALSE
//		if (x != 9) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
		//Estructura if-else concatenado o if anidado
		int d = 7;
//		if (d==1) {
//			System.out.println("Lunes");
//		} else if (d==2) {
//			System.out.println("Martes");
//		} else if (d==3) {
//			System.out.println("Miércoles");
//		} else if (d==4) {
//			System.out.println("Jueves");
//		} else if  (d==5) {
//			System.out.println("Viernes");
//		} else {
//			System.out.println("Fin de Semana");
//		}
			
		
		//Estrutura de decisión SWITCH-CASE
		//Puede ser con tipos de datos: int, String, char, etc.
		char dia ='b';
		switch (dia) {
		case 'a':
			System.out.println("Lunes");
			break;
		case 'b':
			System.out.println("Martes");
			break;
		case 'c':
			System.out.println("Miércoles");
			break;
		case 'd':
			System.out.println("Jueves");
			break;
		case 'e':
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Fin de Semana");
		}
		
		
		
		
	}

}
