package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		//Lista - son una estructura de datos que respeta el orden en el cual fueron agregados los elementos, 
		//también permiten registros repetidos
		
		
	//Formas de declarar una Lista
		
		// Creamos el Array nombres
		String [] names = {"Marco","Marisol","Roberto"};
		// Mediante Arrays creamos una nueva lista
		List<String> listNames = Arrays.asList(names);
		//System.out.println(listNames);
		
		
		//creamos una listaa de tipo estring
		List<String> nombres = new ArrayList<>();
	
		
				
	// .add() - Añadiendo valores a una Lista se utiliza add y como parametro lo que se quiera añadir 
		nombres.add("Raul");
		nombres.add("Gerardo");
		nombres.add("Fernando");
		nombres.add("Eduardo");
		nombres.add("Raul");
		System.out.println(nombres);
		
	// si se desea añadir en un lugar especifico primero se indica la posision y el dato.	
		
		nombres.add(1, "Luis");
		
	// para mostras los elementos de una lista.
		
		System.out.println(nombres);
		
		//Ejemplos breves de métodos de las listas											
				
	// .get() - para acceder a los elementos de una Lista se usa get y como parametro la posision del valor a obtener	
		System.out.println(nombres.get(2));
				
		
	// .set() - Para cambiar elementos de una lista se usa set  + la posiscion y el nuevo valor a asignar.	
		
		nombres.set(2 , "Maria");
		System.out.println(nombres);
				
	// .size() - Devuelve el número de elementosen una lista.	
				
		System.out.println(nombres.size());
				
	// .isEmpty() - Devuelvetrue si no hay elementos en una Lista.
				
		System.out.println(nombres.isEmpty());
							
	// .remove() - para borrar elementos de un has map se utiliza remove + la posision del elemento a eliminar o el valor a eliminar
	// 			
		nombres.remove(4);
		nombres.remove("Fernando");
		System.out.println(nombres);
				
	// .clear() - para eliminar todo los elementos de una lista se utiliza clear()
		
		//nombres.clear();
		//System.out.println(nombres);
	
	// contains() - Para saber si una lista un valor forma parte de una lista se usa contains y como parametro el valor a buscar
	// es sensible a mayusculas y minusculas
		
		System.out.println( nombres.contains("Maria"));
		
		
	// sublist() - Si queremos extraer una lista que contenga los nombres entre un índice y otro podemos utilizar
	// sublist mas el rango en tre los valores que queremos obtener
		
		System.out.println(nombres.subList(1, 2)); 
		
		
	}

}
