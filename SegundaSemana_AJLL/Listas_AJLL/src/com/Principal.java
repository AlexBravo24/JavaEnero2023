package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		//Lista - Definicion
		//ara trabajar con listas en Java debes saber que son una estructura de datos que 
		//permite almacenar diversos elementos ordenados, duplicarlos, acceder a un índice específico y 
		//recorrer el contenido según sea necesario
		//Funciona con tipos de datos no primitivos
		//No es necesario definir su tamaño cuando se declaran
		
		
		
		//Declarando una lista
		List<String> mercado = new ArrayList <String> ();
		
		
		//LOS ARRAYLIST o LIST DEJA METER CUALQUIER TIPO DE DATO
		List coleccion = new ArrayList();
		
		
		coleccion.add("Aprendiendo colecciones");
		coleccion.add(true);
		coleccion.add(45);
		coleccion.add(24.5);
		
		System.out.println(coleccion);
		System.out.println();
		//Agregando elementos .add
		mercado.add("Cono de Huevos");
		mercado.add("10l Leche");
		mercado.add("2k Carne");
		mercado.add("1k Manzanas");
		mercado.add("200g Jamon");
		mercado.add("1 Paquete de pan");
		
		//Imprimir lista
		System.out.println(mercado);
		
		//Ejemplos breves de los metodos de las listas
		//Para acceder a un elemento
		System.out.println(mercado.get(0));
		
		//Modificar elementos de la list
		mercado.set(0, "Ya compramos huevo");
		
		//Quitar elementos 
		mercado.remove(0);
		System.out.println(mercado);
		
		//Eliminar todos los elementos de las lista
//		mercado.clear();
//		System.out.println(mercado);
		
		//Tamaño
		System.out.println(mercado.size());
		
		//Recorrer los elementos con foreach
		for(String i : mercado) {
			System.out.println(i);
		}
		
		//Ordenar una Lista, Alfabeticamente o numericamente
		Collections.sort(mercado);
		System.out.println();
		for(String i : mercado) {
			System.out.println(i);
		}
		
		//Source: https://www.w3schools.com/java/java_arraylist.asp
	}

}
