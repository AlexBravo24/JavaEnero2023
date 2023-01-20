package com;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciando o creando un nuevo objeto de la clase persona
		Persona p1 = new Persona("Alan " , "masculino" , 22);
		
//		p1.Comer("pizza");
//		System.out.println(p1);
		
		//Al eredar la clase padre Persona, la clase hija Empleado
		//debe contar con los atributos de la clase padre
		Vendedor v1 = new Vendedor();
		v1.Trabajar();
		
	}

}
