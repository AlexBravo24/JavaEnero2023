package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		
//*** Estructuras de decision IF - Valores booleanos
		
		int x = 9;
		
//		if (x<10) { //Condicion dependiendo del valor de x
//			System.out.println("Es Menor");
//		}else {
//			System.out.println("Es Mayor");
//		}
		
		
		String nombre ="Murcielago";
		//System.out.println(nombre.length()); //El metodo length devuelve el valor de la longitud del string
		
		
//		if (nombre.length()<=10) { //Operador menor que, mayor que, menor o igual/ mayor o igual
//			System.out.println("Tu nombre tiene menos de 10 caracteres");
//		}else {
//			System.out.println("Tu Nombre tiene mas de 10 caracteres");
//		}
		
		//System.out.println(nombre.length()+x); //Se puede sumar el valor de la longitud con otro numero entero o valor numerico
		
		
		
//******* Condiciones compuestas con operadores lógicos AND, OR, NOT DIFERENTE E IGUALDAD
		
		//*** AND -> && --> Te devuelve true cuando se cumplan todas las condiciones
		
//		if(nombre.length()<20 && nombre.length()>9 && nombre.equals("Murcielago")) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
											//metodo nombre.equals es sensible a mayusculas y minusculas
											//metodo nombre.equalsIgnoreCase no importa si son mayusculas o minusculas
		
		//*** OR -> || --> El resultado es TRUE si alguna expresión se cumplr
				
//		if(nombre.length()>9 || nombre.equalsIgnoreCase("murcielago")) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
			
		//***NOT -> ! --> Niega una condicion o cambia el valor de true a flase y viceversa
		
//		if(!(nombre.length()>9 || nombre.equals("murcielago"))) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}

		//***IGUALDAD O COMPARACION -> == --> Revisar o comparar el valor, si es igual manda TRUE
		//Un solo igual significa asignación
		
		
//		if (x == 10) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		
		//***DIFERENTE DE -> != --> Compara el valor y si es diferente manda TRUE
		
//		if (x != 10) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
//***** Estructura if-else concatenado o if anidado
		
		int d = 2;
		
//		if (d == 1) {
//			System.out.println("Lunes");
//		}else if (d == 1) {
//			System.out.println("Martes");
//		}else if (d == 2) {
//			System.out.println("Miercoles");
//		}else if (d == 3) {
//			System.out.println("Jueves");
//		}else if (d == 4) {
//			System.out.println("Viernes");
//		}else {
//			System.out.println("Desconocido");
//		}
		
		
//***** Estructura de decision SWITCH-CASE
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
		
		char dia = 'c';
		
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
			System.out.println("Desconocido");
		}
	}

}
