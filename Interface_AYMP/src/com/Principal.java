package com;

public class Principal {

	public static void main(String[] args) {
		
		Calculadora c1= new Calculadora("Casio","SDJF-100","gris",true);
		System.out.println(c1);
		c1.division();
		c1.multiplicacion();
		c1.Resta();
		c1.Suma();
		
//		Reloj r1= new Reloj("casio","CSV-Shak","digital",700);
//		System.out.println(r1);
//		r1.changeDate();
//		r1.changeHour();
//		r1.alarma();
//		r1.changeDay();
		

	}

}
