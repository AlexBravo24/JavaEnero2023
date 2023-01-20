package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora c1= new Calculadora("Casio","UX800",true);
		System.out.println(c1);
		
		//Las clases toman comportamiento de 3 lugares:
		//métodos propios
		//clases abstractas (una clase padre o herencia9
		//interfaces
		c1.checarTemperatura();

	}

}
