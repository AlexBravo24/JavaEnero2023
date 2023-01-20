package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos una lista de nuestro objeto persona
		List<Persona> lista = new ArrayList<Persona>();
		
		//Creamos otra lista para que nos muestre elementos filtrados
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		//Añadiendo elementos a la lista original
		
		lista.add(new Persona("Antonio",20,"Masculino"));
		lista.add(new Persona("Aylin",20,"Femenino"));
		lista.add(new Persona("César",25,"Masculino"));
		lista.add(new Persona("Tavo",24,"Masculino"));
		lista.add(new Persona("Ana",18,"Femenino"));
		lista.add(new Persona("Cecilia",23,"Femenino"));
		lista.add(new Persona("Emmanuel",29,"Masculino"));
		lista.add(new Persona("Alejandro",20,"Masculino"));
		lista.add(new Persona("Laura",22,"Femenino"));
		lista.add(new Persona("Marisol",27,"Femenino"));
		
		//Mostrando en pantalla en una sola línea
		System.out.println(lista);
		
		//Iterando sobre los elementos
		//Forma declarativa (especificamos a todos los elementos que forman parte de la lista)
		
		//Ciclo for
		
		for (int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
			
		}
		
		//for each
		
//		for(Persona i:lista) { //Para cada elemento del objeto que está contenido en la lista
//			System.out.println(i);
//		}
		
		//for each en una sola linea
		
		lista.forEach(System.out::println);
		
		
		
		//for each genero agregandolo a la lsita filtrada
		
//		for (Persona i: lista) {
//			if (i.getGenero().equals("Masculino")) {
//				listaFiltrada.add(i);
////				System.out.println(i);
//			}	
//	}
//		listaFiltrada.forEach(System.out::println);
		
		
		//Forma imperativa
		//Solamente vamos preguntando o solicitando lo que necesitamos
		//API Stream
		
		
		//Filtrando por las personas de genero femenino con expresion lambda
		
//		listaFiltrada = lista.stream().filter(i->i.getGenero().equals("Femenino")).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		
		//Ordenar edad de manera ascendente
		
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Ordenar edad de manera descendente
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed()).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		
		//Todos cumplen una condición determinada
				
		boolean todos = lista.stream().allMatch(i->i.getEdad()<=29);
		System.out.println(todos);
		
		//Alguno cumple con una condición
		
		boolean alguno  = lista.stream().anyMatch(i->i.getEdad()<20);
		System.out.println(alguno);
		
		//Si ninguno cumple la condición
		
		boolean ninguno = lista.stream().anyMatch(i->i.getNombre().equals("Roberto"));
		System.out.println(ninguno);
	
		
		//Retornando un opcional
		Optional<Persona> mayorEdad = lista.stream().max(Comparator.comparing(Persona::getEdad));
		System.out.println(mayorEdad);
		
		//Buscando un valor que cumpla varias condiciones
		
		Optional<Persona> mujerMayor = lista.stream().filter(i->i.getGenero().equals("Femenino")).max(Comparator.comparing(Persona::getEdad));
		mujerMayor.ifPresent(System.out::println);
		
		
			
				
		
		
		
		
	}
}
