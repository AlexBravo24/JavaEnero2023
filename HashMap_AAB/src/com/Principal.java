package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Principal {

	public static void main(String[] args) {
		
		//HashMap - La clase HashMap implementa la interfaz Map que nos permite almacenar pares clave y valor, 
		//donde las claves deben ser únicas. Si se intenta insertar una clave duplicada, 
		//se reemplazará el elemento de la clave correspondiente.
		
		//Formas de declarar un HashMap -
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		//Añadiendo valores al HashMap -
		
		map.put(1, "Rojo");
		map.put(2, "Verde");
		map.put(3, "Morado");
		map.put(4, "Azul");
		map.put(5, "Amarillo");
		
		//Imprimiendo valores
		
		System.out.println("Imprimiendo HashMap");
		for(Entry m:map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		
		}
	}

}
