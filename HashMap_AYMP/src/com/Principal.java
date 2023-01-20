package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		//HashMap =>almacenar elementos en pares clave/valor y puedes acceder a estos elementos almacenados
		//utilizando la clave del elemento, que es única para cada elemento.
		
		//cómo declarar un hashmap
		//HashMap<KeyData, ValueData> miHashMap = new HashMap<>();
		
		//Cómo añadir valores al hashMap
		
		int a = 15;
		int b = 20;
		int c = 32;
		
		HashMap<String, Integer> uno = new HashMap<>();
		uno.put("a", 15);
		uno.put("b", 20);
		uno.put("c", 32);
		
		System.out.println(uno); //imprime todo el HashMap
		System.out.println(uno.get("a"));//imprime el valor de la clave a
		
		uno.replace("b", 28);
		System.out.println(uno);//reemplaza el valor de la clave b por 28
		
		uno.remove("c");
		System.out.println(uno);//elimina la clave c y su valor
		
		System.out.println(uno.containsValue(15));//imprime true si existe un valor especificada
		
		System.out.println(uno.containsKey("a"));//imprime true si existe una clave especificada
		
		System.out.println(uno.size());//imprime el tamaño del HashMap uno
		
		System.out.println(uno.replace("b", 28, 29));//reemplaza el valor antiguo de b (28) por el actual (29)
		System.out.println(uno);
		
		System.out.println(uno.keySet());//imprime las claves
		System.out.println(uno.values()); //imprime los valores
		

		
		

	}

}
