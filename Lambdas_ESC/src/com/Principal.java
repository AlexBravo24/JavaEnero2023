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
	
	//Añadiendo elemento a la lista original
	lista.add(new Persona("Antonio", 20, "MASCULINO"));
	lista.add(new Persona("Aylin", 20, "FEMENINO"));
	lista.add(new Persona("Cesar", 25, "MASCULINO"));
	lista.add(new Persona("Tavo", 24, "MASCULINO"));
	lista.add(new Persona("Ana", 18, "FEMENINO"));
	lista.add(new Persona("Cecilia", 23, "FEMENINO"));
	lista.add(new Persona("Emmanuel", 29, "MASCULINO"));
	lista.add(new Persona("Alejandro", 25, "MASCULINO"));
	lista.add(new Persona("Laura", 22, "FEMENINO"));
	lista.add(new Persona("Marisol", 27, "FEMENINO"));
	
	//Mostando en pantalla
	//System.out.println(lista);
	
	//Iterando sobre los elementos
	//Forma declarativa (especificamos a todos los elementos que formaran parte de la expresion)
	
	//Ciclo for
//	for(int i=0; i<lista.size(); i++ ) {
//		System.out.println(lista.get(i));
//	}
	
	//for each
//	for(Persona i: lista) { //Para cada elemento del objeto que esta contenido en la lista
//		System.out.println(i);
//	}
	
	//for each en una sola linea
	//lista.forEach(System.out::println);
	
	//for each genero y agregandolo a la lista filtrada
//	for(Persona i:lista) {
//		if(i.getGenero().equals("MASCULINO")){
//			listaFiltrada.add(i);
//			//System.out.println(i);
//			
//		}
//	}
//	listaFiltrada.forEach(System.out::println);
	
	//Forma imperativa
	/*Solamente vamos preguntando o solicitando lo que necesitamos
	 * API Stream
	 */
	
	//Filtrando solo a las personas de genero femenino y expresion lambda i -> i...
		//listaFiltrada=lista.stream().filter(i->i.getGenero().equals("FEMENINO")).collect(Collectors.toList());
		//listaFiltrada.forEach(System.out::println);
	
	//Ordenando por edad ascendente
		//listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		//listaFiltrada.forEach(System.out::println);
	
	//Ordenando por edad descendente
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed()).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
	//Todos cumplen una condicion determinada
//		boolean todos = lista.stream().allMatch(i->i.getEdad()<29);
//		System.out.println(todos);
	
	//Alguno cumple con una sola condicion
//		boolean alguno = lista.stream().anyMatch(i->i.getEdad()<20);
//		System.out.println(alguno);
	
	//Condicionamos si ninguno cumple la condicion
//		boolean alguno = lista.stream().anyMatch(i->i.getNombre().equals("Eduardo"));
//		System.out.println(alguno);
	
	//Retornando un opcional
//		Optional<Persona> mayorEdad = lista.stream().max(Comparator.comparing(Persona::getEdad));
//		System.out.println(mayorEdad);
	
	//Retornando un opcional
//		Optional<Persona> menorEdad = lista.stream().min(Comparator.comparing(Persona::getEdad));
//		System.out.println(menorEdad);
	
	//Buscando un valor que cumpla varias condiciones
	
		Optional<Persona> mujerMayor = lista.stream().filter(i->i.getGenero().equals("FEMENINO")).max(Comparator.comparing(Persona::getEdad));
		System.out.println(mujerMayor);
		
		
	
	
	}
	
	

}
