package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipalListas {

	public static void main(String[] args) {
		//Qué es una lista
		//permite contener una serie de elementos en forma linea.
		
		//Cómo almacena los datos
		//son un tipo de colección, estructura de datos que respeta el orden en el cual fueron agregados los elementos
		//también permiten registros repetidos.
		
		
		//Cómo se declara una lista
		List<String> lista1 = new ArrayList<>();
		
		List<String> lista2 = new ArrayList<String>();
		List<String> lista2_1 = new ArrayList<>(Arrays.asList("Sonia","Alejandro","Dana","Sara"));
		
		List<Integer> lista3 = new ArrayList<Integer>();
		
		List<Integer> lista4 = Arrays.asList(3,2,1,8,7,6,5); //construye una lista de tamaño fijo, no se puede ampliar
		
		List<Integer> lista5 = new ArrayList<>(Arrays.asList(3,7,9,45)); //lista que se puede ampliar
		
		List coleccion = new ArrayList();//Es una lista que permite entrada de datos de tipo objeto, osea datos de todo tipo: int, double, string, boolean
		
		
		//Cómo se agregan elementos a una lista
		lista2.add("Naranja");
		lista2.add("Platano");
		lista2.add("Manzana");
		lista2.add("Uva");
		lista2.add("Fresas");
		lista2.add("Kiwi");
		
		
		//Ejemplos breves de los métodos de las listas
		System.out.println(lista2);
		System.out.println("Elementos de la lista: "+lista2.size());
		
		System.out.println(lista2.get(5));//imprime el elemento 5 de la lista2
		
		lista2.remove("Uva");//Elimina el elemento Uva
		System.out.println(lista2);
		
		lista2.remove(0);//Elimina el elemento que se encuentra en el indice 0
		System.out.println(lista2);
		
		//imprimir todos los elementos de la lista de forma individual 
		for(int i=0; i<=lista2.size()-1;i++) {
			System.out.println(lista2.get(i));
		}
		
		System.out.println(lista5.size());
		for(int n : lista5) {
			System.out.println("Número: "+ n);
		}
		
		for(String f : lista2_1) {
			System.out.println("Nombre: "+f);
		}
		
		
		

	}

}
