package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		//*****************************************************************************
		//Listas -->  PERMITE CONTENER UNA SERIE DE ELEMENTOS DE FORMA LINEAL.
					//RESPETA EL ORDEN EN QUE FUERON AGREGADOS, PERMITE REGISTROS REPETIDOS
					//SE PUEDE DECIDIR EN QUE POSICION INSERTAR O ELIMINAR UN ELEMENTO.
					//SE ACCEDE ACCEDER A SUS ELEMENTOS A TRAVES DE UN INDICE.
		
		//Declarandola de forma generica --> No se sabe que tipo de dato almacenara en la coleccion
		List coleccion = new ArrayList();
		//Agregando datos a la coleccion generica
		coleccion.add("Apendiendo colecciones");//String
		coleccion.add(10);
		coleccion.add(15,5);
		coleccion.add(true);
		coleccion.add('k');
		
		
		//Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
	
		ArrayList<String> Lista = new ArrayList<String>();
		
		
		
		// Añade  elementos al ArrayList
		Lista.add(0,"Emmanuel");
		Lista.add(1,"Pedro");
		Lista.add(2, "Juan");
		Lista.add(3, "Paco");
		Lista.add(4, "Juan");

		System.out.println(Lista);
		
		// Devuelve el numero de elementos del ArrayList
		System.out.println(Lista.size());
		
		//Ordenar Lsita
		Collections.sort(Lista);
		System.out.println(Lista);
		
		// Devuelve el elemento que esta en la posición '2' del ArrayList
		System.out.println(Lista.get(2));
		
		// Comprueba se existe el elemento 
		System.out.println(Lista.contains("Emmanuel"));
		
		// Devuelve la posición de la primera ocurrencia  
		System.out.println(Lista.indexOf("Juan"));
		
		// Devuelve la posición de la última ocurrencia    
		System.out.println(Lista.lastIndexOf("Juan"));
		
		// Copiar un ArrayList 
		ArrayList ListaCopia = (ArrayList) Lista.clone();
		System.out.println(ListaCopia);
				
		// Borra el elemento de la posición    
		Lista.remove(3); 
		System.out.println(Lista);
		
		// Borra la primera ocurrencia de lo que pasa como parametro.  
		Lista.remove("Juan");
		System.out.println(Lista);
		
		//Borra todos los elementos de ArrayList   
		Lista.clear();
		System.out.println(Lista);
		
		// Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
		System.out.println(Lista.isEmpty());
		


	}

}
