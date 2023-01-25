package com;

import java.util.HashMap;

public class Principal {
	
	public static void main(String[] args) {
		
		//HashMap - Definicion
		//Es un arreglo doble, de tamaño variable, se almacenan datos en pares
		//determinados por "Key,Valor"
		//Solo admite tipos de datos no primitivos
		
		
		//Declarando un HashMap
		HashMap<String,String> capitalCities =new HashMap<String,String>();
		
		//Añadir valores a un Hashmap KEYS,VALUES
		
		capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    //Imprimir el HashMap
	    System.out.println(capitalCities);
	    
	    //Acceder a un elemento
	    System.out.println(capitalCities.get("England"));
		
	    //Remover elementos
	    capitalCities.remove("England");
	    System.out.println(capitalCities);
	    
//	    Limpiar el HashMap
//	    capitalCities.clear();
//	    System.out.println(capitalCities);
	    
	    //Tamaño del HashMap
	    System.out.println(capitalCities.size());
	    
	    //Recorrer los valores del HashMap, usando foreach
	    for (String i : capitalCities.keySet()) {
	    	  System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    	}
	    
	    //Source: https://www.w3schools.com/java/java_hashmap.asp
	}

}
