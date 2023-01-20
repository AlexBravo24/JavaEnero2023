package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList <Persona> ();
		
		List<Persona> listafiltrada = new ArrayList <Persona> ();
		
		lista.add(new Persona("Antonio",20,"Masculino"));
		lista.add(new Persona("Aylin",20,"Femenino"));
		lista.add(new Persona ("Cesar",25,"Masculino"));
		lista.add(new Persona("Tavo", 24,"Masculino"));
		lista.add(new Persona("Ana",18,"Femenino"));
		lista.add(new Persona("Cecilia",23,"Femenino"));
		lista.add(new Persona("Emmanuel ",18,"Masculino"));
		lista.add(new Persona("Alejandro",25,"Masculino"));
		lista.add(new Persona("Laura",22,"Femenino"));
		lista.add(new Persona("Marcos",27,"Masculino"));
		
		//Mostrando en pantalla
//		System.out.println(lista);
		
		
		
		//ciclo for
		
//		
//		for(int i=0;i<lista.size();i++)
//		{System.out.println(lista.get(i));
	
		//for each
//		for(Persona i: lista) {
//			System.out.println(i);
//		}
//		//for each en una sola linea
//		
//		lista.forEach(System.out::println); 
//		
//		//for each genero agregandolo a la lista filtrada
//		
//		for (Persona i: lista){ 
//		
//			if(i.getSexo().equals("Masculino")) {
//				listafiltrada.add(i);
//				System.out.println(i);}
//	
//
//		listafiltrada.forEach(System.out::println);
//		
		
		
		
		
//		
//		listafiltrada=lista.stream().filter(i -> i.getSexo().equals("Femenino")).collect(Collectors.toList());
//		
//		
//		
//		listafiltrada=lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed() ).collect(Collectors.toList());
//		listafiltrada.forEach(System.out::println);
//		
		//Todos cumplen una condición determinada
		
//		boolean todos = lista.stream().allMatch(i ->i.getEdad()<30);
//		System.out.println(todos);
//		
//		//Alguno cumple una condicion
//		
//		boolean alguno = lista.stream().anyMatch(i-> i.getEdad()<20);
//		System.out.println(alguno);
//		
//		//Si ninguno cumple la condicion
//		
//		boolean nadie = lista.stream().anyMatch(i -> i.getNombre().equals("Eduardo"));
//		System.out.println(nadie);
		
		//Retornando opcional
		Optional<Persona> menoredad = lista.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menoredad);
		
		//Buscando un valor que cumpla varias condiciones
		
		Optional<Persona> mujermayor = lista.stream().filter(i->i.getSexo().equals("Femenino")).max(Comparator.comparing(Persona::getEdad));
		System.out.println(mujermayor);
	}
	}

