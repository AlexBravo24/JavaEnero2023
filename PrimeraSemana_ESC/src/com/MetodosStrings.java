package com;

public class MetodosStrings {

	public static void main(String[] args) {
	
		
		//***Métodos de la clase String***
		
		
		String cadena ="Emmanuel";
		
		//.length() --> Nos devuelve el tamaño de nuestra cadena o su longitud
		System.out.println(cadena.length());
		
		//charAt (Nos devuelve el caracter que se encuentra en el indice especificado)
		System.out.println(cadena.charAt(0));
		//System.out.println(cadena.charAt(5));
		
		//substring(int index) (Nos devuelve una subcadena a partir del indice especificado)
		System.out.println(cadena.substring(5));
		//System.out.println(cadena.substring(3));
		
		//substring(int beginindex, int endindex)(Devuelve la cadena hasta donde indiquemos)
		System.out.println(cadena.substring(2, 7));
		
		//toLowerCase (Nos convierte la cadena de texto a minusculas)
		System.out.println(cadena.toLowerCase());
		
		//toUpperCase (Nos convierte la cadena de texto a mayusculas)
		System.out.println(cadena.toUpperCase());
		
		//equals (Object ob) (Compara Strings y nos devuelve true o false)
		System.out.println(cadena.equals("Emmanuel"));
		
		//equalsIgnoreCase (Compara los Strings e ingnora si es mayuscula o minuscula y devuelve true o false)
		System.out.println(cadena.equalsIgnoreCase("EMmaNUEL"));
		
		//compareTo
		System.out.println(cadena.compareTo("Emmanuel"));

	}

}
