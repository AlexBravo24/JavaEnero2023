package com;

public class Ejercicio6_Ciclos {

	public static void main(String[] args) {
		
			
			float dinero = 1000;
			int mes = 1;
			
				while (mes<=12) {
			dinero = dinero*1.02f;
			mes++;
			}
			
			System.out.println("El dinero total es: " + dinero);
			
	}

}
