package com;

public class Principal {

	public static void main(String[] args) {
		
		//instanciar a una persona, creando un nuevo objeto de la clase persona
		
		Persona persona1 = new Persona("Ana","femenino", 27);
		persona1.comer("pizza");
		System.out.println(persona1);
		
		//Al heredar de la superclase Persona, la subclase empleado debe contar con los argumentos o atributos de la
		//super clase
		Empleado e1 = new Vendedor("Pablo","masculino",28,30000,"JKHG22343PV","8:00-17:00","Pedro");
		//Vendedor v1 = new Vendedor();
		
		//v1.trabajar();
		
		System.out.println(e1);
		
		
		

	}

}
