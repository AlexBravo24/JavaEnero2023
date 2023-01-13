package com; //Nombre del paquete

public class TiposDeDatos { //Nombre de la clase y llave de apertura
	
	public static void main(String[] args) {//Método main y llave de apertura
		
		/* Comentarios
		 * Múltiples
		 * Líneas
		 */
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS ENTEROS
		 */
		
		// Variables declaradas pero no iniciadas
		
		byte b = 120; // Valor iniciado desde que se declara
		short s;
		int i;
		long l;
		
		// Variables con valor o inicializadas
		
		byte by = -128; // Va desde el valor de -128 a 127 y emplea 1 byte de almacenamiento
		short sh =  -32768; // Va desde -32768 a 32767 y emplea 2 bytes de almacenamiento
		int i1 = -2147483648;  // Va desde -2,147,483,648 a 2,147,483,647 y emplea 4 bytes de almacenamiento
		long l1 = -9223372036854775808l; // Va desde -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 y emplea  8 bytes (después de pasar el límite de los int se debe de poner el subfijo "l")
		
		// La variable comodín a utilizar es el int (El que mayor uso tiene)
		
		/* TIPOS DE DATOS PRIMITIVOS
		 *  NUMÉRICOS DE PUNTO O COMA FLOTANTE
		 */
		
		float f = 300.6767677f; // Ocupa almacenamiento de 4 bytes y acepta de 6 a 7 dígitos en decimal y necesita el subfijo "f"
		double d = 7898997979797.9789698696969696; // Ocupa 8 bytes y acepta 15 dígitos en decimal 
		
		// La variable que se utiliza más es double
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean boo = false; // Facilitan el trabajo al evaluar expresiones o condiciones 
							// Solo admiten valores verdaderos (true) o falso (false)
		
		char caracter = 'a';  // Solo admiten 1 caracter, tienen un memoria de 2 bytes y se define su valor abriendo comilla simple 
	
		
		
		/* TIPOS DE DATOS NO PRIMITIVOS O ESTRUCTURADOS
		 * TAMBIÉN SE LES CONOCE COMO CLASES O TIPO OBJETO
		 */
		
		// Cadena de texto
		
		String cadena = "El Abysmalito"; 
		
		//La cadena de texto admite de todo.
		
		/* TIPOS DE DATOS NO PRIMITIVOS U OBJETO
		 * TIPO DE DATO ENVOLTORIO O WRAPPER
		 */
		
		Integer x = 900000;
		Byte b1 = 123;
		Short s1 = 3000;
		Long l2 = 99999999999999l; 
		Double d1 = 3.14;
		Float f1 = 33.15f;
		Character c = 'c';
		
		x.doubleValue();
		
		// Salida de datos o mostrarlos en consola
		
		System.out.println ("First day baibe"); // Imprime en consola el valor que pongamos adentro
		System.out.println(cadena); // Con subfijo ln indica un salto de línea 
		 
		// Las propiedades de los tipos de dato envoltorio se reflejan hasta que se les da una salida de datos
		
		System.out.println(d1.intValue());
		
		
		
		
		
		
		
		
		
	} //Cierre método main
	
	

}// Cierre de la clase
