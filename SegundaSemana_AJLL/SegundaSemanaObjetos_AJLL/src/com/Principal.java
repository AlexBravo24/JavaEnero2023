package com;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciando a un objeto de la clase o plantilla persona
		Persona persona1 = new Persona ();
		String nombre;
		
		persona1.setNombre("Maria");
		persona1.setEdad(30);
		nombre=persona1.getNombre(); //Asignamos el Nombre a una nueva String por separado con el metodo Get
		
		Persona persona2 = new Persona("Alex","Masculino",24,85,2);
		
		
		System.out.println(persona1);
		System.out.println(persona2);
		
		
		//Clse PIZZA
		Pizza hawaiana = new Pizza("Jamon","Queso","Mozarella","Grande");
		Pizza peperoni = new Pizza();
		peperoni.setIngrediente1("Peperoni");
		peperoni.setQueso("Manchego");
		
		System.out.println(hawaiana);
		System.out.println(peperoni);
		
		
		//Clase COCHE
		Coche chevy = new Coche("cHEVROLET","Blanco",5,2016);
		Coche spark = new Coche();
		spark.setMarca("Chevrolet");
		spark.setAño(2016);
		
		System.out.println(chevy);
		System.out.println(spark);
		
		//Clase Celular
		Celular iphone = new Celular("Apple","Iphone 13 pro",2021,"A14");
		Celular android = new Celular();
		android.setMarca("Samsung");
		android.setModelo("Galaxy S22");
		
		System.out.println(iphone);
		System.out.println(android);
		
		
		//Clase computadora
		Computadora laptop = new Computadora ("Ryzen 5","SSD",16,512);
		Computadora escritorio = new Computadora ();
		escritorio.setDisco_duro("SSD");
		escritorio.setGb_discoduro(1024);
		
		System.out.println(laptop);
		System.out.println(escritorio);
		
		
		
		
		//Modelar 5 objetos
		//Crear una clase para cada objeto
		//Cada objeto debe llevar sus atributos, sus constructores,
		//sus getters & setters 
		// Su metodo toString
		//Instanciarse en la clase principal
		//1 con atributos que ustedes eligen
		//1 con todos los atributos (constructos de todos los parametros)
		
		
		
		
	}

}
