package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		
		// creamos una lista con el objeto persona
		List <Persona> lista = new ArrayList<Persona>();
		
		//lista pa mostrar elementos filtrados
		List <Persona> listaF = new ArrayList<Persona>();
		
		//añadimos elementos a la lista original
		
		lista.add(new Persona("Antonio"   , 20 , "MASCULINO" ));
		lista.add(new Persona("Aylin"     , 20 , "FEMENINO" ));
		lista.add(new Persona("César"     , 25 , "MASCULINO" ));
		lista.add(new Persona("Tavo"      , 24 , "MASCULINO" ));
		lista.add(new Persona("Ana"       , 18 , "FEMENINO" ));
		lista.add(new Persona("Cecilia"   , 23 , "FEMENINO" ));
		lista.add(new Persona("Emmanuel"  , 29 , "MASCULINO" ));
		lista.add(new Persona("Alejandro" , 25 , "MASCULINO" ));
		lista.add(new Persona("César"     , 25 , "MASCULINO" ));
		lista.add(new Persona("Laura"     , 22 , "FEMENINO" ));
		lista.add(new Persona("Marisol"   , 27 , "FEMENINO" ));
		
		//mostrando la lista
		//System.out.println(lista);
		
		
		//Ciclo for
		
//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
		
		// for each
//		for(Persona i : lista) { // Para cada elemento que esta contenido en la lista
//			System.out.println(i);
//		}
		
		 //for each
		//lista.forEach(System.out::println  );
		
		//for each genero y agregandolo a lista filtrada
//		
//		for (Persona i: lista ) {
//			if (i.getGenero().equals("MASCULINO")) {
//				listaFiltrada.add(i);
//				System.out.println(i);
//			}
//		}
//		listaF.forEach(System.out::println);
		
//		listaF = lista.stream().filter(i->i.getGenero().equals("FEMENINO")).collect(Collectors.toList());
//		listaF.forEach(System.out::println);
		
//		listaF = lista.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//		listaF
		
		//todos cumplen una condicion determinada
//		boolean todos = lista.stream().allMatch(i ->i.getEdad() <=29);
//		System.out.println(todos);
		
//		boolean alguno = lista.stream().anyMatch(i -> i.getEdad() < 20);
//		System.out.println(alguno);
		
		//Retornando si nunguno da coincidencia
//		boolean alguno = lista.stream().anyMatch(i -> i.getNombre().equals("Eduardo"));
//		System.out.println(alguno);
		
		//Retornando un opcional
		
//		Optional<Persona> mayorEdad = lista.stream().max(Comparator.comparing(Persona::getEdad));
//		Optional<Persona> menorEdad = lista.stream().min(Comparator.comparing(Persona::getEdad));
//		System.out.println(mayorEdad);
//		System.out.println(menorEdad);
		
		
		// Buscando un valor que cumpla varias condiciones
		
		Optional<Persona> mujerMayor = lista.stream().filter(i -> i.getGenero().equals("FEMENINO")).max(Comparator.comparing(Persona::getEdad));
		mujerMayor.ifPresent(System.out::println);
		
		
	}

}
