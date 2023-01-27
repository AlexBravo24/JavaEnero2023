package com;  //Nombre del paquete

public class TiposDeDatos {  //Nombre de la clase y llave de apertura
	
	public static void main(String[] args) { //Metodo main
		
		/*Comentario
		 * de
		 * multiples
		 * lineas
		 */
		
		//Salvar cambios ctrl + s

		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS ENTEROS
		 */
		
		//variables declaradas pero no inicializadas
		byte b;
		short s;
		int i;
		long l;
		
		//Variable inicializadas
		byte by=-128; //	–128 to 127   1 byte
		short sh=-32768;//	–32,768 to 32,767  2 bytes
		int in=-2147483648;  //	–2,147,483,648 a 2,147,483,647   4 bytes
		long lo=9223372036854775807l;// 	–9,223,372,036,854,775,808 a 9,223,372,036,854,775,807  8 bytes
		/*Se necesit agregar el sufijo "l" para poder guardar
		 * los datos de tipo long
		 */
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTO O COMA FLOTANTE
		 */
		
		float f = 300.1234567f; // 4 bytes acepta 6 a 7 decimales
		double d = 300.123456789;// 8 bytes 15 digitos en decimal ACPTAN CHINGOS DE DECIMALES

		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean boo = true; //dos opciones true or false
		char c = 'a'; // 2 bytes 1 caracter
		
		/*TIPOS DE DATOS NO PRIMITIVOS O 
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * clases o tipo objeto
		 * 
		 */
		
		//cadena de texto
		String cadena = "Esto es una varible de tipo string";
		
		String nombre;
		
		nombre ="Alex Loza";

		/*TIPOS DE DATOS NO PRIMITIVOS U 
		 * OBJETO
		 * envoltorio o wrapper
		 */
		
		Integer x=9000000;
		Byte b1 = 123;
		Short s1 = 30000;
		Long l1 = 99999999999999l;
		Double d1 = 3.1415;
		Boolean bool = true;
		Character c1 = 115;
		
		Double x3=x.doubleValue(); // usamos las opciones de los wrapper para 
		//convertir uno a otro.
		
		
		//salida de datos
		
		System.out.println("Hola mundo");
		System.out.println(cadena);
		System.out.println(x3);
		
		
	}//Cierre de metodo main


}//Cierre de la clase
