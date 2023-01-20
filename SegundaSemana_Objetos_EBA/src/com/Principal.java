package com;

public class Principal {

	public static void main(String[] args) {
		
		// instancia a un objeto de la clase o "plantilla" Persona
		Persona person1 = new Persona(); 
		
		person1.setNombre("Luis");

		
		Persona person2 = new Persona(" Carlos","Masculino", 64, 2);
		
		System.out.println(person1);
		System.out.println(person2);
		
		//Modelar 5 objetos 
		
		//Crear una clase para cada objeto
		// cada objeto debe lloevar sus atributos, contructores,
		// setter y geters
		// su método toString
		// instancial en la clase principal
		// 1 atributo con los atributos que queramos 
		// 1 con todos los atributos (contructor de todos los parametros)
		
		
		Animal animal1 = new Animal();
		animal1.setClase("omnivoro");
		animal1.setAlimento("Roedores");
		Animal animal2 = new Animal("Mamifero","carnivoro","Roedores", "Maulla");
			
		Coche coche1 = new Coche();
		coche1.setMarca("Nisan");
		coche1.setModelo("NP-300");
		Coche coche2 = new Coche(" Chevrolet","chevy",50, 120);
		
		Electrodomestico elect1 = new Electrodomestico();
		elect1.setUso("Lavar");
		Electrodomestico elect2 = new Electrodomestico(" Calentar","Samsung",1);
		
		Pizza pizza1 = new Pizza();
		pizza1.setTypo("Italiana");
		pizza1.setAcompañamiento("Ranch");
		Pizza pizza2 = new Pizza("peperoni" ,"Catsup", 2 ,  "no");
		
		Vivienda viv1 = new Vivienda();
		viv1.setTypo("Casa");
		viv1.setUbicacion("Pueblo");
		viv1.setNumabitaciones(5);
		Vivienda viv2 = new Vivienda("Departamento","Ciudad",2, 1);
		
		System.out.println();
		
		System.out.println(animal1);
		System.out.println(animal2);
		System.out.println();
		
		System.out.println(coche1);
		System.out.println(coche2);
		System.out.println();
		
		System.out.println(elect1);
		System.out.println(elect2);
		System.out.println();
		
		System.out.println(pizza1);
		System.out.println(pizza2);
		System.out.println();
		
		System.out.println(viv1);
		System.out.println(viv2);
		
		
	}

}
