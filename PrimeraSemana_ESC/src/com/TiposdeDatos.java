package com;  //Nombre del paquete

public class TiposdeDatos {  //Nombre de la clase y llave de apertura
	
	public static void main(String[] args) {  //Método main y llave de apertura
		
		//Comentario de una sola línea
		/*Comentarios 
		 * de 
		 * multiples 
		 * líneas
		 */
		
		
		//Guardar cambios en las clases Ctrl + s
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NÚMERICOS ENTEROS
		 */
		
		//Variables estan declaradas pero no iniciadas. No tienen valor
		byte b;
		short s;
		int i;
		long l;
		
		//Variables con valor o inicializadas
		
		byte by = -128;  //Va desde el valor -128 a 127 y emplea 1 byte de almacenamiento
		short sh = -32768; // Va desde -32768 a 32767 y emplea 2 bytes de almacenamiento
		int i1 = -2147483648; //Va desde -2147483648 a 2147483647 y emplea 4 bytes de almacenamiento
		long l1 = -9223372036854775808l; // Va desde -9223372036854775808 a 9223372036854775807 y emplea 8 byes de almacenamiento
		// despues de abarcar el rango de los int, se necesita el sufijo "l"
		// al final del valor 
		
		//La variable comodín a utilizar es el int, es la que más se usa 
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NÚMERICOSS EN PUNTO O COMA FLOTANTE		 
		 */
		
		float f = 3000.6767679f; // Ocupa almacenamiento de 4 bytes y acepta de 6 a 7 posiciones en decimal, se necesita el sufijo "f"
		double d = 89000000000000.9090909099090090; //Sigue un esquema parecido al anterior pero con8 bytes, admite 15 digitos en decimal 
		
		// La variable comodin a utilizar es el double
		
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean boo = true; //Facilitan el trabajo al evaluar expresiones o condiciones	
							// Solo admiten valores verdadero (true) o falso (false)
		
		char caracter = 'a'; // Solo admiten un caracter, ocupan una memoria de 2 bytes
							 // y se define su valor abriendo comilla simple
		
		
		
		/*TIPOS DE DATOS NO PRIMITIVOS U OBJETO 
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * Tambien se les conoce como clases o tipo objeto
		 */
		
		//Cadena de Texto
		
		String cadena = "Esto es una cadena de texto";
		
		String nombre;
		
		nombre = "Emmanuel Sandoval";
		
		//La cadena de texto, caraacteres, enunciado, numeros
		
		
		/* TIPOS DE DATOS NO PRIMITIVOS U OBJETO
		 * TIPOS DE DATO ENVOLTORIO O WRAPPER
		 */
		
		Integer x = 9000000;
		Byte b1 = 123;
		Short s1 = 3000;
		//Long l2 = 99991;
		Double d1 = 3.14;
		Boolean bu = true;
		Character c = 'c';
		
		x.doubleValue();
		c.charValue();
		
		System.out.println("HOLA MUNDO"); //Imprime en consola el valor que indiquemos adentro
		
		System.out.println(nombre); //Con el sufijo "ln" indicamos un salto de linea, imprime variable
		
		System.out.println(cadena);
		
		//Las propiedades de lostipos de dato envoltorio se reflejan hasta que se les da una salida de datos
		
		System.out.println(x.doubleValue());
		
		System.out.println(d1.intValue());
		
		Integer x1 = 9000000;
		Double  x3 = x1.doubleValue();
		
		System.out.println(x3);
 
		
	
		
		
		
	} //Llave de cierre del método main

} //Llave de cierre de la clase
