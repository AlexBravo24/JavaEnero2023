package com;  //Nombre del paquete

public class TiposdeDatos {  //Nombre de la clase y su llave de apertura
	
	public static void main(String[] args) {  //Método main y su llave de apertura
		
		//Comentario de una sola línea	
		
		/*Comentarios 
		 * de
		 * múltiples 
		 * líneas
		 */
		
		//Guardar cambios en las clases Ctrl + s
		
		/*Tipos de datos primitivos
		 * NUMERICOS ENTEROS
		 */
		//Variables estan declaradas pero no iniciadas, es decir, no tienen ningun valor.
		byte b;
		short s;
		int i;
		long l;
		
		//Variables con valor o inicializadas
		
		byte by = -128; //Va desde el valor -128 a 127 y emplea 1 byte de almacenamiento
		short sh = -32768; //Va desde - 32768 a 32767 y emplea 2 bytes de almacenamiento
		int i1 = -2147483648; // Va desde -2,147,483,648 a -2,147,483,647 y emplea 4 bytes de almacenamiento
		long l1 = -9223372036854775808l; //Va desde -9223372036854775808 a 9223372036854775807 
		//y emplea 8 bytes de almacenamiento, despues de abarcar el rango de los int se necesita 
		//el sufijo "l" al final del valor
		
		//La variable comodín a utilizar es el int
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NÚMEROS EN PUNTO O COMA FLOTANTE
		 */
		
		float f = 300.6767767f; //Ocupa un almacenamiento de 4 bytes y acepta de 6 a 7 dígitos en decimal
		double d = 783847387.0945729734957; //Sigue un esquema parecido al de float pero con 8 bytes y mas decimales
		
		//La variable comodin a utilizar es el double
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean boo = true; //Facilitan el trabajo al evaluar expresiones o condiciones
							// Solo admiten valores verdadero (true) o falso (false)
		
		char caracter = 'a'; //Solo admiten un caracter, ocupan una memoria de 2 bytes
							 // y se define su vlaor abriendo comillas simples
		
		
		/*TIPOS DE DATOS NO PRIMITIVOS O
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * Tambien se les conoce como clases o tipo objeto
		 */
		
		//Cadena de Texto
		
		String cadena = "Esto es una cadena de texto"; 
		
		String nombre;
		
		nombre = "Abdiel Aguilar";
		
		//La cadena de texto admite caracteres, enunciados, números
		
		
		/*TIPOS DE DATOS NO PRIMITIVOS U OBJETOS
		 * DATOS TIPO ENVOLTORIO O WRAPPER
		 */
		
		Integer x = 900000;
		Byte b1 = 123;
		Short s1 = 300;
		Long l2 = 92457l;
		Double d1 = 3.1416;
		Boolean bu = true;
		Character c = 'a';
		
		x.doubleValue(); //Se les pueden agregar métodos a este tipo de variables
		
		
		//SALIDA DE DATOS O MOSTRARLOS EN CONSOLA
		
		System.out.println("Hola mundo"); //Imprime en consola el valor dentro del parentesis
		
		System.out.println(nombre); //Con el sufijo "ln" imprime en consola con un salto de linea
		
		System.out.println(cadena);
		
		// Las propiedades de los tipos de dato envoltorio se reflejan hasta que se les da una salida de datos
		System.out.println(d1.intValue()); 
		
		
		
		
		
	}//Cierre del método main
	

}  //Cierre de la clase




