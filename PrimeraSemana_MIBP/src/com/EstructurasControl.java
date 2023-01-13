package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		//ESTRUCTURAS DE DECISIÓN IF (VALORES BOOLEANOS)
		
		int x = 8 ;
		
//		if (x<10) { //condición dependiendo del valor de x
//		System.out.println("Es menor");
//		} else {
//			System.out.println("Es mayor");
//		}
		
//		String nombre = "Constantino";
//		System.out.println(nombre.length()); // El metodo length me devuelve el valor de la longitud del String
		
//		if (nombre.length()<10) {  //Operador menor que, mayor que o igual
//			System.out.println("Sí");
//		} else {
//			System.out.println("No");
//		}
//		
		// CONDICIONES COMPUESTAS CON OPERADORES LÓGICOS AND, OR, NOT DIFERENTE DE E IGUALDAD+
		
		//AND - &&
		
//		if (nombre.length()<20 && nombre.length()>10 && nombre.equalsIgnoreCase("constantino")) { //Equals sirve para comparar entre dos objetos (Sensible a Mayúsculas y minúsculas)
//			System.out.println("Sí");															  //EqualsIgnoreCase Ignora las mayúsculas y minúsculas 
//		} else {
//			System.out.println("No");
//		}
//		
		// OR - || Te devuelve TRUE
		
//		if (nombre.length()<6 || nombre.equalsIgnoreCase("constantinos")) {
//		System.out.println("si");
//		} else {
//			System.out.println("no");
//		}
		
		//NOT - !
		
//		if (!(nombre.length()>9 || nombre.equalsIgnoreCase("constantino")) {
//		System.out.println("Sí");
//		} else { 
//			System.out.println("No");
//		}
		
		// IGUALDAD O COMPARACIÓN  -----> Revisar o comparar el valor, si es igual manda TRUE
		
//		if (x==9) { // Un solo signo significa asignación de un valor 
//			System.out.println("Sí");
//			} else {
//				System.out.println("no");
//			}
		
		
		// DIFERENTE DE - != ------> Compara el valor y si es diferente nos va a dar un TRUE en caso contrario nos dará FALSE
		
//		if (x != 8) {
//			System.out.println("Sí");
//		} else {
//			System.out.println("No");
//		}
		
		// ESTRUCTURA IF - ELSE CONCATENADO O IF ANIDADO
		
		int d = 7;
//		if (d==1) {
//			System.out.println("Lunes");
//		} else if (d==2) {
//			System.out.println("Martes");
//		} else if (d==3) {
//			System.out.println("Miércoles");
//		} else if (d==4) {
//			System.out.println("Jueves");
//		} else if (d==5) {
//			System.out.println("Viernes");
//		} else {
//			System.out.println("No sé que pedo");
//		}
		
		// ESTRUCTURA DE DESICIÓN SWITCH CASE (Puede ser con tipos de datos int, String, char, etc.) 
		
		char dia = 'b';
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
			System.out.println("La base de Datos de virus ha sido actualizada");
		}
		
		
		
}
}
