package com;

public class Principal {
	
	
	public static void main(String[] args) {
		
		//Instanciando o creando un nuevo objeto de la clase persona
		
//		Persona p1 = new Persona("Ana", "Femenino", 27);
//		p1.comer();
//		p1.comer("Hamburguesa");
//		
		// Cuando se instancia una clase heredada se deben de instanciar los datos
		//requeridos en la clase padre
		//ESTA PARTE JALA SI SE LE QUITA LO ABSTRACATO A LA CLASE EMPLEADO
//		Empleado e1 = new Empleado("Alex","Masculino",24,30000,"LOLA9890508FQ0","8:00-16:00","Peter");
//		
//		System.out.println(e1);
//		
//		Vendedor v1=new Vendedor();
//		v1.trabajar();
		
		Aereo avion = new Aereo("Aereo",2,1,"Airbus modelo 00 B4",280000,"China Airport","AIFA AIRPORT");
		Terrestre camion = new Terrestre("Terrestre",10,2,"kenworth","t800",15000,"Almacenes CDMX","Almacenes cordoba");
		
		System.out.println(avion);
		System.out.println();
		System.out.println(camion);
		
		
		
		}
}
