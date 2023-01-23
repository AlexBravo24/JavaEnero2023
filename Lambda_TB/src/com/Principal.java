package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	List<Persona> lista = new ArrayList<Persona>();
	
	lista.add(new Persona("Antonio",20,"MASCULINO"));
	lista.add(new Persona("Aylin",20,"FEMENINO")); 
	lista.add(new Persona("Cesar",25,"MASCULINO"));
	lista.add(new Persona("Tavo",24,"MASCULINO"));
	lista.add(new Persona("Ana",18,"FEMENINO")); 
	lista.add(new Persona("Cecilia",23,"FEMENINO")); 
	lista.add(new Persona("Emmanuel",29,"MASCULINO")); 
	lista.add(new Persona("Alejandro",25,"MASCULINO"));
	lista.add(new Persona("Laura",22,"FEMENINO")); 
	lista.add(new Persona("Marisol",27,"FEMENINO"));
	
	List<Persona> listaF = new ArrayList<Persona>();
	
	
	//for(int i=0;i<lista.size();i++) {System.out.println(lista.get(i));}
	
	//for(Persona i: lista) { System.out.println(i); }
	
	//lista.forEach(System.out::println); 
	
	//lista.forEach(contador -> System.out.println(contador));
	
	//for each genero agregandolo a la lista filtrada 
//	for(Persona i: lista) 
//	{ 
//	    if (i.getGenero().equals("MASCULINO")) 
//	    { 
//		listaF.add(i); System.out.println(i); 
//	    }	    
//	}
//	listaF.forEach(System.out::println);
//
//	//Filtrando solo a las personas de genero femenino 
//	listaF=lista.stream().filter(i->i.getGenero().equals("FEMENINO")).collect(Collectors.toList());
//	listaF.forEach(System.out::println);
	
	
//	//ascendente
//	listaF = lista.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//	listaF.forEach(System.out::println); 
	//descendente 
	listaF = lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed()).collect(Collectors.toList());
	listaF.forEach(System.out::println); 
	
	//Todos cumplen una condicion determinada  
	boolean todos = lista.stream().allMatch(i->i.getEdad()<30); System.out.println(todos); 
	//Alquno cumple con una condicion  
	boolean alguno = lista.stream().anyMatch(i->i.getEdad()<20); System.out.println(alguno);
	//Condicionamos si niquno cumple la condicion
	boolean alguno1 = lista.stream().anyMatch(i->i.getNombre().equals("Aylin")); 
	System.out.println(alguno1); 
	
	//Retornando un opcional  
	Optional<Persona> menorEdad=lista.stream().min(Comparator.comparing(Persona::getEdad)); 
	System.out.println(menorEdad);
	
	//Buscando un valor que cumpla varias condiciones 
	Optional<Persona> mujerMayor = lista.stream().filter(i->i.getGenero().equals("FEMENINO")).max(Comparator.comparing(Persona::getEdad));
	mujerMayor.ifPresent(System.out::println);
	//Optional<Persona, mujerMayor = lista. stream 0 . filter getMenero () .equals ("FEMENINO") ) .max (Comparator. mujerMayor .ifPresent (System.out: :println) ;I 
		

    }
}
