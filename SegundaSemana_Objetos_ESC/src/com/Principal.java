package com;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciando a un objeto de la clase o "platilla" Persona
		Persona persona1 = new Persona();
		
		persona1.setNombre("María");
		persona1.getEdad();
		
		Persona persona2 = new Persona("Alejandro","Masculino",80,2);
		
		
		System.out.println(persona1);
		System.out.println(persona2);
		
		//Modelar 5 objetos
		//Crear clase para cada objeto 
		//Cada objeto debe llevar atributos, sus constructores, metodo toString
		//Instanciarlos en la clase principal
		//1 Con atributos a elegir
		//1 Con todos los atributos (Constructor de todos los parametros)

	}

}
