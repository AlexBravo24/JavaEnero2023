package com;

public class Principal2 {

	public static void main(String[] args) {
		
		
		//Instanciar Objeto torta
		
		Torta torta1 = new Torta();
		
		torta1.setBase("Pan");
		torta1.setIngrediente("Milanesa");
		
		System.out.println(torta1);
		
		Torta torta2 = new Torta("Pan","Jamon","Mayoneza", "Aguacate");
		
		System.out.println(torta2);
		System.out.println("\n*******************");
		
		//Instanciar Objeto Quesadilla
		Quesadilla quesadilla1 = new Quesadilla();
		quesadilla1.setVerdura("Lechuga");
		quesadilla1.setSalsa(true);
		
		Quesadilla quesadilla2 = new Quesadilla("Pan",false,"Lechuga",false);
		System.out.println(quesadilla1);
		System.out.println(quesadilla2);
		
		//Instanciar Objeto Television
		Television television1 = new Television();
		television1.setPulgadas(70);
		television1.setSmartv(false);
		
		Television television2 = new Television(80,"4k",true);
		
		System.out.println("\n ************************");
		System.out.println(television1);
		System.out.println(television2);
		
		//Instanciar Objeto Computadora
		Computadora compu1 = new Computadora();
		compu1.setCdd(1024);
		compu1.setDd("Mecanico");
		
		Computadora compu2 = new Computadora("SSD", 480, 8, "i7");
		
		System.out.println("\n ************************");
		System.out.println(compu1);
		System.out.println(compu2);
		
		//Instanciar Objeto Auto
		Auto auto1 = new Auto();
		auto1.setMarca("Ford");
		auto1.setPrecio(250965.99);
		auto1.setModelo("Mustang");
		
		Auto auto2 = new Auto("Chevrolet","Cavalier",427900,"Azul");
		
		System.out.println("\n ************************");
		System.out.println(auto1);
		System.out.println(auto2);
		

	}

}
