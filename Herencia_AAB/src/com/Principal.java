package com;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciando o creando un nuevo objeto de la clase Persona
		
//		Persona p1 = new Persona("Ana", "Femenino", 27);
//		p1.comer("Pizza");
//		System.out.println(p1);
		
		//Al heredar la clase padre Persona, la clase hija Empleado debe contar
		//con los argumentos (atributos) de la clase padre.
		//Empleado e1 = new Vendedor("Juanito", "Masculino", 27, 30000, "JHDO896734OUHLJ","8:00 - 17:00", "Pedro");
		
//		Vendedor v1 = new Vendedor();
//		v1.checarEntrada();
//		v1.trabajar();
		
		Marca m1 = new Marca(2, 15000, "2500 x 1700", "Apple", "Iphone 11", "iOs 15");
		System.out.println(m1);
	}

}
