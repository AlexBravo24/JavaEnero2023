package com;

public class Principal {

	public static void main(String[] args) {
		
		
		//Instanciando a un objeto de la clase o plantilla Persona
		Persona persona1 = new Persona ();
		
		persona1.setNombre("Maria");
		persona1.setEdad(30);
		
		Persona persona2 = new Persona("Alejandro","Masculino",37,80,2);
		
//		System.out.println(persona1);
//		System.out.println(persona2);
		
		//Modelar 5 objetos
		//Crear una clase para cada objeto
		//Cada objeto debe llevar sus atributos, constructores
		//sus getters y setters 
		//Su método toString
		//Instanciarlos en la clase principal.
		//1 con atributos que eligen
		//1 con todos los atributos
		
		Tacos tacos1 = new Tacos ("Carne","Sin salsa",5);
		Tacos tacos2 = new Tacos ("Pollo","Con salsa","Con verdura","Sin cebolla",7);
		System.out.println(tacos1);
		System.out.println(tacos2);
		
		Galletas galleta1 = new Galletas ("Chocolate","Marinela",15);
		Galletas galleta2 = new Galletas ("Limón",10,"Sin chispas","Gamesa",20);
		System.out.println();
		System.out.println(galleta1);
		System.out.println(galleta2);
		
		Celular cel1 = new Celular ("iPhone 14","Apple",20999,"Azul");
		Celular cel2 = new Celular ("Samsung Galaxy Z Flip 4","Samsung",15989,"Snapdragon 8 Gen1","8 GB","12 MegaPixeles","166 x 72,2 x 6,9 mm.","Android","Dorado");
		System.out.println();
		System.out.println(cel1);
		System.out.println(cel2);
		
		Carro carro1 = new Carro ("Mazda CX-3","Mazda",374900);
		Carro carro2 = new Carro ("EQB Suv","Mercedes Benz",1341900,"4 neumáticos",5);
		System.out.println();
		System.out.println(carro1);
		System.out.println(carro2);
		
		Pelicula peli1 = new Pelicula ("Titanic", "3h 4min",1997);
		Pelicula peli2 = new Pelicula ("Avatar","2h 42min",2009,"James Cameron","20th Century Fox",237000000,2137696265);
		System.out.println();
		System.out.println(peli1);
		System.out.println(peli2);
		

	}

}
