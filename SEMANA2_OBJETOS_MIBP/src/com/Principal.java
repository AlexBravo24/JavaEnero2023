package com;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciando a un objeto de la clase o "Plantilla" Persona 
		
//		Persona persona1 = new Persona();
//		
//		persona1.setNombre("Jessica");
//		persona1.setEdad(25);
//		
//		System.out.println(persona1);
//		
//		Persona persona2 = new Persona("Marcos","Maculino", 27,80,1.75);
//		 System.out.println(persona2);
//	
		 // Modelar 5 objetos
		 
		 // Crear clase para cada objeto
		 //Cada objeto debe llevar sus atributos, sus constuctores
		 //Getters y Setters
		 // Su método toString
		 //Instaciarlos en la clase principal 
		 // 1 con atributos que ustedes eligen
		 // 1 con todos los atributos
		 
		 
		 // Automovil
		 Automovil coche = new Automovil("Nissan", "Tsuru",2008,"Rojo", 15000,"Standar");
		 
		 
		 System.out.println(coche);
		 
		
				 
				 
				 
		// Celular
				 
		Celular celu1 = new Celular("Apple",2019,"iPhone 11PO",3,"32GB","AT&T");
		
		System.out.println(celu1);
		
		
		//Computadora
		
		Computadora compu =new Computadora("RX570",16,"Ryzen 3400G","3.5TB");
				System.out.println(compu);
		
		 
		 //Musica
				
		Musica music = new Musica("Rap","Xavibo","Todo se va",2019);
		System.out.println(music);
		 
		 
	}

}
