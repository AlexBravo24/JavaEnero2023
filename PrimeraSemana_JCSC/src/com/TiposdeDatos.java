package com; //Nombre del Paquete

public class TiposdeDatos {  //Nombre de la Clase y llave de apertura
	
	public static void main(String[] args) {  //Método main y llave de apertura
		
		// Comentario de una sola línea
		
		/* Comentarios
		 * de
		 * múltiples
		 * líneas
		 */
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * NÚMERICOS ENTEROS
		 */
		
		//Variables están declaradas pero no iniciadas, no tienen algún valor
		byte b;
		short s;
		int i;
		long l;
		
		//Variables con valor o inicializadas
		
		byte by = -128; //Valor de -128 a 127 y emplea 1 byte de almacenamiento
		short sh = -32768; //Valor desde -32768 a 32767 y emplea 2 bytes de almacenamiento
		int i1 = -2147483648; //Valor desde -2,147,483,648 a 2,147,483,647 y emplea 4 bytes de almacenamiento
		long l1 = -9223372036854775808l; //Valor desde -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 y emplea 8 bytes 
		//Después de abarcar el rango de int, se necesita el sufijo "l" al final del valor
		
		//La variable comodín a utilizar (por ahorro de memoria) es int
		
		
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS EN PUNTO O COMA FLOTANTE
		 */
		
		float f = 300.676767f; //Ocupa almacenamiento de 4 bytes y acepta 6 a 7 digitos en decimal
		double d = 8900000000000.90909909090909099; //Sigue un esquema como el anterior con 8bytes de almacenamiento
		// Admite 15 digitos en decimal
		
		//La variable comodín a utilizar es el double
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean boo = true;	//Facilitan el trabajo al evaluar expresiones o condiciones
							//Solo admiten valores true or false
		
		char caracter = 'a'; 	//Solo admite 1 caracter, ocupa 2 bytes de almacenamiento
								//y se define su valor abriendo comilla simple '
		
		
		/* TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * También conocidos como clases o tipo objeto
		 */
		
		//Cadena de texto
		
		String cadena = "Esto es una cadena de texto";
		
		String nombre;
		
		nombre = "Cesar Soberanis";
		
		//La cadena de texto admite caracteres, enunciados, números
		
		/* TIPOS DE DATOS NO PRIMITIVOS U OBJETO
		 * TIPOS DE DATOS ENVOLTORIO O WRAPPER
		 */
		
		Integer x = 9000000;
		Byte b1 = 123;
		Short s1 = 3000;
		Long l2 = 99999999999999l;
		Double d1 = 3.14;
		Boolean bu = true;
		Character c = 'c';
		
		x.doubleValue();
		
		//Salida de datos o mostrarlos en consola
		
		System.out.println("Hola mundo"); //Imprime en consola el valor que indiquemos adentro

		System.out.println(nombre); //Con el sufijo ln indicamos un salto de línea
		
		System.out.println(cadena);
		
		//Las propiedades de los tipos de datos envoltorio se reflejan hasta
		// que se les da una salida de datos
		System.out.println(d1.intValue());
		
		Integer x1 = 9000000;
		Double x3 = x1.doubleValue();
		System.out.println(x3);
		
		
		
		
		
		
	} //Cierre de metodo main
	
	

} //Cierre de la clase
