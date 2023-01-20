package com;

import java.util.HashMap;

public class Principal {
	public static void main(String[] args) {
		
		/*HashMap  - permite almacenar pares de clave y valor,
		 * las claves deben ser únicas, si se repiten, la última anulará a las otras
		 */
		
		//DECLARACION DE HASHMAP
		
		HashMap <String,String> Principal = new HashMap <String,String>();
		
		// Añadir elementos HashMap .put();
		
		Principal.put("Llave1","Valor1");
		Principal.put("Llave2","Valor2");
		Principal.put("Llave3","Valor3");
		Principal.put("Llave4","Valor4");
		
		//Imprimir llaves
		
		for (String i: Principal.keySet()) {
			System.out.println(i);
		}
		
		//Imprimir valores
		
		for (String i: Principal.values()) {
			System.out.println(i);
		}
		
		//Imprimir llaves y valores
		
		for (String i: Principal.keySet()) {
			System.out.println("Llaves : " + i + " valores: " + Principal.get(i));
		}
		
		//Acceder a un elemento
		Principal.get("Valor3");
		
		//Eliminar valores 
		Principal.remove("Valor1");
		
		//Limpiar el HashMap de llaves y valores
		Principal.clear();
		
		
	}

}
