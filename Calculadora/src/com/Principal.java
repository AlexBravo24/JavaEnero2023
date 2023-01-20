package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double a=0;
		double b=0;
		
		
		Calculadora c1 = new Calculadora ("Casio", "UX800", true);
		System.out.println(c1);
		
		//Las clases toman comportamiento de 3 lugares:
			//Metodos Propios
			//Clases abstractas (Una clase padre o herencia)
			//Interfaces
		
		c1.sumar(a,b);
		//c1.restar();
		//c1.multiplicar();
		//c1.dividir();
		c1.checarTemperatura();

	}

}
