package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		//Listas breve definición de que es una lista y como almacena los datos
//		Las listas son un tipo de colección que hereda de la interface collection, son una estructura de datos que
//		respeta el orden en el cual fueron agregados los elementos, también permiten registros repetidos.
		
		
		//Como se declara una lista 
		
		List<String> lista = new ArrayList<>();
		
		//Como se agregan elementos a una lista
		
		 // Creamos el ArrayList
		 List<String> listaAutos = new ArrayList<>();
		 
		 // Agregamos un elemento a la lista
		 listaAutos.add("Mercedes Benz");
		 
		 // * Agregar elementos de otra colección*
		 
		// Creamos una lista a la cual le pasamos una lista de autos
		 List <String> elementos = new ArrayList<>(listaAutos);

		 // A la lista elementos ahora le agregamos la listaNombres
		 // De esta forma estamos combinando dos listas
		 elementos.addAll(listaNombres);
		
		//Ejemplos breves de los métodos de las listas
		 
		 
		 
		 
	}

}
