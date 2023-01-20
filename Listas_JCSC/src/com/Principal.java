package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {


		//Lista - son una estructura de datos que respeta el orden en el cual fueron
		//			agregados los elementos, también permiten registros repetidos
		
		//Como se declara una lista
		
			//Creando el Array nombres
		String [] nombres = {"Cesar","Marco","Alex"};
		
			//Mediante Arrays creamos una nueva lista
		List <String> listNombres = Arrays.asList(nombres);
		System.out.println(listNombres);
		
			//creamos una lista de tipo string
		List <String> nombres2 = new ArrayList<>();
		
		//Como se agregan elementos
		
			//.add() Añade valores a una lista y el parametro de lo que se quiera añador
		nombres2.add("Jorge");
		nombres2.add("Marisol");
		nombres2.add("Rebeca");
		System.out.println(nombres2);
		
			//Si se dsea añadir en un lugar especifico primero se indica la posicion y luego el dato
		nombres2.add(1,"Norma");
		
			//Para mostrar los elementos de una lista
		System.out.println(nombres2);		
		
		//Ejemplos de los metodos de la lista
		
		//.get() para acceder a los elementos de una lista
		System.out.println(nombres2.get(2));
		
		//.set() para cambiar elementos de una lista, se pone la posicion y el nuevov valor a asignar
		nombres2.set(2, "Juan");

		
		
	}

}
