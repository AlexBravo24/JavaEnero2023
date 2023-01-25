package com;

public class Principal {
	
	public static void main(String[] args) {
		
//		Calculadora c1 = new Calculadora("Casio","UX800",true);
//		System.out.println(c1);
		
//		c1.sumar();
		
		/*
		 * Las clases toman comportamiento de 3 lugares
		 * Metodos propios
		 * Clases abstractas(Una clase padre o Herencia)
		 * Interfaces
		 */
//		
//		c1.tomarTemperatura();
		
		Cientifica c1 = new Cientifica("Casio","UX800");
		c1.sumar();
		c1.potencia();
		c1.raizCuadrada();
		
//		Celular ip = new Celular("Apple","iPhone 14");
//		
//		ip.getModelo();
//		ip.camara();
//		ip.llamar();
//		ip.mensaje();
//		ip.llamada();

		
		
	}
	
}
