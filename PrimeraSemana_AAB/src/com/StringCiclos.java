package com;

public class StringCiclos {

	public static void main(String[] args) {
		
	
		//Métodos de la clase String
		
//		String cadena = "Hoy es 11 de enero de 2023";
//		
//		
//		//.length() Nos devuelve el tamaño de nuestra cadena o su longitud
//		System.out.println(cadena.length());
//		
//		//.charAt() Te devuelve el caracter que se encuentre en la posicion indicada en el paréntesis
//		System.out.println(cadena.charAt(10));
//		
//		//.substring(int index) Nos devuelve una subcadena a partir del indice especificado
//		System.out.println(cadena.substring(10));
//		
//		//.substring(int beginindex, endindex) Nos devuelve una subcadena a partir del indice especificado, hasta donde indiquemos
//		System.out.println(cadena.substring(10,15));
//		
//		//.toLoweCase() Convierte la cadena de texto a minusculas
//		System.out.println(cadena.toLowerCase());
//		
//		//.toUpperCase() Convierte la cadena de texto a mayusculas
//		System.out.println(cadena.toUpperCase());
//		
//		//.equals() Compara el objeto contra otro objeto y devuelve true o false
//		System.out.println(cadena.equals("Hola"));
//		
//		//.equalsIgnoreCase() Compara un objeto contra otro ignorando si hay mayusculas o minusculas
//		System.out.println(cadena.equalsIgnoreCase("hoy es 11 de enero de 2023"));
//		
//		//.compareTo Hace una comparacion entre los valores ASCII de las cadenas y devuelve la diferencia
//		System.out.println(cadena.compareTo("esternocleidomastoideo"));
		
		
		
		//CICLOS o BUCLES
		//Estructuras que nos van a permitir repetir sentencias o procesos
		
		//while (Mientras se cumpla una condicion)
		
//		int x = 1;
//		
//		while (x<=5) {
//			System.out.println(x);
//			x++;  //incrementa en 1 el valor de x
//		}
		
		
		//DO WHILE (Ejecuta el codigo al menos una vez y despues pregunta si se sigue realizando
		//Aseguramos que el codigo se ejecute por lo menos una vez, se cumpla o no una condicion
		
//		int y = 5;
//		
//		do { //Realiza o ejecuta
//			System.out.println("Hola al menos una vez");
//			y++;
//		} while (y<10);
//		
//		
		
		//FOR (para)
		
		for (int i = 10; i >= 0; i--) {
			System.out.println("Hola " + i);
		}
		
		
	}

}
