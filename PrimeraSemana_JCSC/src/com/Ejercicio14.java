package com;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
	
		int horas;
		int pagohora =  16;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa las horas trabajadas");
		horas = entrada.nextInt();
		
		if (horas<=40) {
			System.out.println("Tu salario semanal es de $" + pagohora*horas);
		}else if (horas>=41) {
		int horase  = horas-40;
		int pago = pagohora*horas;
		int pagohorase = horase*20;
		int pagot = pago+pagohorase;
		System.out.println("Horas extras trabajadas: " + horase);
		System.out.println("Tu salario semanal es de $" + pagot);
		}
		
		
	}

}
