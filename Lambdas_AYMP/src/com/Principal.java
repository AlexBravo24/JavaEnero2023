package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos unalista de nuestro objeto persona
		
		List<Persona> lista = new ArrayList<Persona>();
		
		//Creamos otra lista para que nos muestre elementos filtrados
		
		List<Persona> listafiltrada = new ArrayList<Persona>();
		
		//Añadiendo elementos a la lista original
		
		lista.add(new Persona("Antonio", 20,"Masculino"));
		lista.add(new Persona("Aylin",20,"Femenino"));
		lista.add(new Persona("César",25,"Masculino"));
		lista.add(new Persona("Tavo",24,"Masculino"));
		lista.add(new Persona("Ana",20,"Femenino"));
		lista.add(new Persona("Cecilia",23,"Femenino"));
		lista.add(new Persona("Emmanuel",29,"Masculino"));
		lista.add(new Persona("Alejandro",25,"Masculino"));
		lista.add(new Persona("Laura",22,"Femenino"));
		lista.add(new Persona("Marisol",27,"Femenino"));
		
		//Mostrando en pantalla
		
//		System.out.println(lista);
		
		//Iterando sobre los elementos
		//Forma declarativa (especificamos a todos los elementos que formaran parte
		
		//Ciclo for
		
//		for(int i =0;i<lista.size();i++) {
//			System.out.println(lista.get(i));
//		}
		
		//for each
		//cada objeto u elemento persona que está en la lista, manda la impresión
//		for(Persona i: lista) {
//			System.out.println(i);
//		}
		
		//for each en una sola linea
		
//		lista.forEach(System.out::println);
		
		//for each genero agregandolo a la lista filtrada
		for(Persona i: lista) {
			if(i.getGenero().equals("Masculino")) {
				listafiltrada.add(i);
				//System.out.println(i);
			}
		}
//		listafiltrada.forEach(System.out::println);
		
		//Forma imperativa
		//Solamente vamos preguntando o solicitando lo que necesitamos
		//API Stream
		
		//Filtrando solo a las personas de genero femenino
//		
//		listafiltrada = lista.stream().filter(i->i.getGenero().equals("Femenino")).collect(Collectors.toList());
//		listafiltrada.forEach(System.out::println);
		
		
		//Ordenando por edad ascendente
		
//		listafiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//		listafiltrada.forEach(System.out::println);
//		
//		listafiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed()).collect(Collectors.toList());
//		listafiltrada.forEach(System.out::println);
//		
		//Todos cumplen una función determinada
		
//		boolean todos =lista.stream().allMatch(i->i.getEdad()<29);
//		boolean todos =lista.stream().allMatch(i->i.getEdad()<=29);
//		System.out.println(todos);
		
		//alguno comple cierta condicion
//		
//		boolean alguno = lista.stream().anyMatch(i->i.getEdad()<20);
//		System.out.println(alguno);
		
		//Condicionamos si alguno cumple la condicion
		
//		boolean alguno = lista.stream().anyMatch(i->i.getNombre().equals("Aylin"));
//		System.out.println(alguno);
		
//		boolean alguno = lista.stream().anyMatch(i->i.getNombre().equals("Marcos"));
//		System.out.println(alguno);
		
		//retornando un opcional
		
		Optional<Persona> mayorEdad =lista.stream().max(Comparator.comparing(Persona::getEdad))	;	
		System.out.println(mayorEdad);
		
		Optional<Persona> menorEdad =lista.stream().min(Comparator.comparing(Persona::getEdad))	;	
		System.out.println(menorEdad);
		
		Optional<Persona> mujerMayor = lista.stream().filter(i->i.getGenero().equals("Femenino")).max(Comparator.comparing(Persona::getEdad));
		mujerMayor.ifPresent(System.out::println);
		
	}

}
