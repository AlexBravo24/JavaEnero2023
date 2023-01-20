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
		
		lista.add(new Persona("Antonio", 20, "Masculino"));
		lista.add(new Persona("Aylin", 27, "Femenino"));
		lista.add(new Persona("César", 25, "Masculino"));
		lista.add(new Persona("Tavo", 24, "Masculino"));
		lista.add(new Persona("Ana", 18, "Femenino"));
		lista.add(new Persona("Cecilia", 23, "Femenino"));
		lista.add(new Persona("Emmanuel", 29, "Masculino"));
		lista.add(new Persona("Alejandro", 25, "Masculino"));
		lista.add(new Persona("Laura", 22, "Femenino"));
		lista.add(new Persona("Marisol", 20, "Femenino"));
		
		//Mostrando en pantalla
		//System.out.println(lista);
		
		//Iterando sobre los elementos de la lista
		//Forma declarativa (especificamos a todos los elementos que formaran parte de la expresion)
		
		//Ciclo for
		
		//for(int i = 0; i < lista.size(); i++) {
			//System.out.println(lista.get(i));
		//}
		
		//for each
		
//		for(Persona i: lista) {
//			System.out.println(i);
//		}
		
		//for each en una sola linea
		
		//lista.forEach(System.out::println);
		
		//for each genero agregandolo a la lista filtrada
		
//		for(Persona i: lista) {
//			if (i.getGenero().equals("Masculino")) {
//				listaFiltrada.add(i);
				//System.out.println(i);
//			}
//		}
		
		//Forma imperativa
		//Solamente vamos preguntando o solicitando
		//API Stream
		
		//Filtrando solo a las personas de genero femenino
		
//		listaFiltrada = lista.stream().filter(i -> i.getGenero().equals("Femenino")).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Ordenando por edad ascendente
		
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Ordenando por edad descendente
		
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed()).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Todos cumplen una condicion determinada
		
//		boolean todos = lista.stream().allMatch(i -> i.getEdad() < 30);
//		System.out.println(todos);
		
		//Alguno cumple con una condicion
		
//		boolean alguno = lista.stream().anyMatch(i -> i.getEdad() < 20);
//		System.out.println(alguno);
		
		
		//Condicionamos si ninguno cumple la condicion
		
//		boolean alguno = lista.stream().anyMatch(i -> i.getNombre().equals("Eduardo"));
//		System.out.println(alguno);
		
		//Retornando un opcional
//		Optional<Persona> menorEdad = lista.stream().min(Comparator.comparing(Persona::getEdad));
//		System.out.println(menorEdad);
		
		
		//Buscando un valor que cumpla varias condiciones
		
		Optional<Persona> mujerMayor = lista.stream().filter(i -> i.getGenero().equals("Femenino")).max(Comparator.comparing(Persona::getEdad));
		mujerMayor.ifPresent(System.out::println);
		
		
	}

}
