package com;  //Nombre del paquete

public class TiposDeDatos {   //Nombre de la clase, con su llave de apertura
	
	public static void main(String[] args) {  //Método main, con su llave de apertura
		
		byte b;    //Declaración de variables
		short s = 110;  //Declaración e inicialización de variables
		int i;
		long l;
		b = 120;  //Inicialización de variables
		byte by=-128;
		short sh = -32768;
		int it= -2147483648; //int es la variable que más se usa
		long l1= -9223372036854775808l;  
		float f= 300.6767677f;
		double d = 89000000000000000.948759873485837485798347874;
		
		//tipos de datos primitivos: caracteres y booleanos
		boolean boo = true; //true o false
		char caracter= 'a'; //solo admite un caracter
		
		
		//tipos de datos NO primitivos o estructurados
		String cadena = "Es una cadena de texto"; //usa comillas dobles
		String nombre;  //declaración
		nombre = "AYMP"; //inicialización
		
		//tipos de datos no primitivos y objeto
		//tipos de datos envoltorios o wrapper
		//envuelve un valor primitivo pero les puedo realizar métodos
		
		Integer x= 9000000;
		Byte b1 =123;
		Short s1=3000;
		Long l2=9999999999999991l;
		Double d1=3.141683794837823748;
		Float f2=3.4757587854f;
		Boolean bu= true;
		Character ca= 'c';
		
		Integer a= 6000;
		double ab=a.doubleValue();
		
		
		x.doubleValue();//si hay necesidad de ver la variable x con decimales, el método
		                //doubleValue lo hace
		
		//Salida de datos en consola
		
		System.out.println("Hola mundo");
		System.out.println(nombre);
		System.out.println(x);
		System.out.print(d1.intValue());
		
		
		
		
		
	}
	
	/*
	 * comentario multiples lineas /*+Enter
	 */

} //Cierre de la clase
