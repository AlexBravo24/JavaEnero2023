package com;

public class Principal {

	public static void main(String[] args) {
		
		//Instaciando o creando un nuevo objeto de la clase persona
		
//		Persona p1 = new Persona ("Ana","Femenino",27);
//		p1.comer("Pizza");
//		System.out.println(p1);
		
		
		//Al heredar la clase padre Persona, la clase hija Empleado 
		//debe contar con los atributos de la clase padre
//		Vendedor v1 = new Vendedor();
//		v1.trabajar();
		
		Gripa p1 = new Gripa ("Juan","Masculino",22,"Gripa",10,"Luis D","Paracetamol");
		p1.statusA();
		System.out.println(p1);
		

	}

}
