package com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Principal {

	public static void main(String[] args) {
		
	//Lista - breve definicion de que es una lista y como almacena los datos
		//Las listas son un tipo de colección que hereda de la interface collection, 
		//son una estructura de datos que respeta el orden en el cual fueron agregados los elementos, 
		//también permiten registros repetidos.
		
	//Como se declara una lista
		// Creamos el ArrayList
		 List<String> listaColores = new ArrayList<>();
		 
	// Agregamos un elemento a la lista
		 listaColores.add("Morado");
		
	//Como se agregan elementos a una lista
		 listaColores.add("Rojo");
		 listaColores.add("Amarillo");
		 listaColores.add("Verde");
		 listaColores.add("Azul");
		
	//Ejemplos breves de los metodos de las listas
		// Creamos una lista a la cual le pasamos una lista de autos
		 List <String> elementos = new ArrayList<>(listaColores);

		 // A la lista elementos ahora le agregamos la listaNombres
		 // De esta forma estamos combinando dos listas
		 List<String> listaNombres = new ArrayList<>();
		 listaNombres.add("Abdiel");
		 listaNombres.add("Juan");
		 listaNombres.add("Alvaro");
		 listaNombres.add("Roberto");
		 elementos.addAll(listaNombres);
		 System.out.println(elementos);
		 System.out.println("\n");
		 
		// Recorrer la lista elementos con un foreach
		 for (String str : elementos) {
		 	System.out.println(str);
		 }
		 System.out.println("\n");
		 
		 	// Creamos el iterador
		 ListIterator<String> iterador = elementos.listIterator();

		 	// Mediante el ciclo while lo recorremos
		 while (iterador.hasNext()){
		 	System.out.println(iterador.next());
		 }
		 System.out.println("\n");
		
		 //Eliminar elementos de una lista
		 	// El parametro 0 representa el indice que queremos eliminar
		 listaNombres.remove(2);
		 System.out.println(listaNombres);

		 	// Eliminar elemento mediante su nombre
		 listaNombres.remove("Roberto");
		 System.out.println(listaNombres);

		 	// Para eliminar todos los elmentos de la lista usamos clear
		 listaNombres.clear();
		 System.out.println(listaNombres);

	}

}
