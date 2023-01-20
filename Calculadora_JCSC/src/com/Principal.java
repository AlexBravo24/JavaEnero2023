package com;

public class Principal {

	public static void main(String[] args) {
		
		
		Calculadora c1 = new Calculadora("Casio","UX800",true);
		System.out.println(c1);
		
		
		//Las clases toman comportamiento de 3 lugares:
		/* Métodos propios
		 * Clases abstractas (Clase padre y herencia)
		 * Interfaces
		 */
		c1.checarTemperatura();
	}

}
