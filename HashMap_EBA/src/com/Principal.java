package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//HashMap - La clase HashMap implementa la interfaz Map. 
		//que nos permite almacenar pares clave y valor, donde las claves deben ser únicas
		// los HashMap almacenan los datos de forma desordenada.
		// En caso de aver claves duplicadas la ultima añadida, remplazara a la existente.
		
	//Formas de declarar un HashMap
		
		HashMap <Integer,String> coleccion  = new HashMap<Integer,String>();
		
		
	// .put() - Añadiendo valores a un HashMap para añadir un valor se utiliza put y como parametros la clave y el valor
		coleccion.put(1,"Raul");
		coleccion.put(2,"Luis");
		coleccion.put(3,"Julio");
		
	// .get() - para acceder a los elementos de un hash map se usa get y como parametro la clave del valor a obtenr
		String uno = coleccion.get(1);
		System.out.println(uno); 
		
	// .replace() - Para REmplazar elementos de un HashMap se utuliza replace + la clave y el nuevo valor a asignar.
		System.out.println(coleccion.get(2));
		coleccion.replace(2 , "Maria");
		System.out.println(coleccion.get(2));
		
	// .size() - Devuelveelnúmero de elementosen un HashMap.	
		
		System.out.println(coleccion.size());
		
	// .isEmpty() - Devuelvetrue si no hay elementos en un  HashMap.
		
		System.out.println(coleccion.isEmpty());
		
		
	// .remove() - para borrar elementos de un has map se utiliza remove + la clave del elemento a eliminar
		
		coleccion.remove(3);
		System.out.println(coleccion.size());
		
	// .clear() - para eliminar todo los elementos de un HashMap se utiliza clear()
		
		coleccion.clear();
		System.out.println(coleccion.isEmpty());
	
	// .ContainsKey() - Devuelve true si existe una clave especificadaen un archivo HashMap	
		coleccion.containsKey(2);
	
	//Devuelve true si existe un valor especificado en un archivo HashMap.
			
		coleccion.containsValue("Raul");
		

	}

}
