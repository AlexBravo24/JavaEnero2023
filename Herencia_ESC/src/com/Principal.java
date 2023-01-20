package com;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciando un nuevo objeto de la clase Persona
		
		Persona p1 = new Persona("Ana", "Femenino",27);
		p1.comer();
		p1.comer("Pizza");
		System.out.println(p1);
		
		//***************************************
		//Al heredar la plase padre Persona, la clase hija Empleado
		//debe contar con los atributos de la clase padre
		Vendedor v1=new Vendedor();
		
		v1.trabajar();
		
		

	}

}
