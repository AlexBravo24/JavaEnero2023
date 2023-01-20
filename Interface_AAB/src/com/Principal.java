package com;

public class Principal {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora ("Casio", "BTX800", "Gris", true);
		System.out.println(c1);
		c1.sumar();
		c1.restar();
		c1.multiplicar();
		c1.dividir();
		
//		Ventilador v1 = new Ventilador ("Whirlpool", "BSx-500", "Blanco", 4);
//		System.out.println(v1);
//		v1.encendido();
//		v1.velocidad();
//		v1.programar();
//		v1.darVueltas();

	}

}
 