package com;

public class TiposdeDatos {

	public static void main(String[] args) {
	   
		//Comentario una linea
		
		/*Comentario
		 * de
		 * multiples 
		 * lineas
		 */
		
		//Variables declaradas pero no iniciadas
		byte b; 
		short s;
		int i;
		long l;
		
		//Variables con valor o inicializadas
		byte by = -128; //Va desde el valor -120 y emplea 1 byte de almacenamiento.
		short sh = -32768; //Va desde -32768 a 32767 y emplea 2 bytes de almacenamiento.
		int i1 = -2147483648; //Va desde -2147483648 a 2147483647 y emplea 4 bytes de almacenamiento.
		long l1 = 2147483649l; /* Va despues de abarcar  el rango de los int, se nececita el sufijo "l" 
		                         -9223372036854775808 a 9223372036854775807 son 8 bytes de almacenamiento*/
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMEROS EN PUNTO O COMA Y FLOTANTE
		 */
		
		float f = 1.1f; //Ocupa almacenamiento de 4 bytes y son 6 a 7 digitos en decimal.
		double d = 21312312321.12312312; 
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOLEANOS Y CARACTER
		 */
		boolean boo = true;
		char caracter = 'a';
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * Tambien es el se conoce como clases o tipo de objeto
		 */
		
		//Cadena de texto
		
		String cadena = "Esto es una cadena de texto";
		
		String nombre;
		
		nombre = "Aaron Azael Morales Hernandez";
		
		/*TIPOS DE DATOS NO PRIMITIVOS U OBJETOS
		 * TIPOS DE DATOS ENVOLOTORIO O WRAPPER
		 */
		
		Integer x = 9000000;
		Byte b1 = 123;
		Short s1 = 3000;
		Long l2 = 999999999999999999l;
		Double d1 = 3.14;
		Boolean bu = false;
		Character c = 'b';
		
		x.doubleValue();
		
		//Salidad de datos o muestro en consola
		
		System.out.println("Hola mundo");
		
		System.out.println(nombre);
		
		System.out.println(cadena);
		
		//Las propiedades de los tipos de datos envoltorio se reflejan hasta que se les da salidad de datos.
		System.out.println(d1.intValue());
		
	}
}
