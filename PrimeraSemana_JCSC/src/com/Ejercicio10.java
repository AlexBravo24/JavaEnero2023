package com;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	
		int numero;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escribe un número del 1 al 12");
		numero = entrada.nextInt();
	
		if (numero<=0 || numero>=13) {
			System.out.println("Error");
		}else if (numero==1) {
			System.out.println("Enero tiene 31 días");
		}else if (numero==2) {
			System.out.println("Febrero tiene 28 o 29 días");
		}else if (numero==3) {
			System.out.println("Marzo tiene 31 días");
		}else if (numero==4) {
			System.out.println("Abril tiene 30 días");
		}else if (numero==5) {
			System.out.println("Mayo tiene 31 días");
		}else if (numero==6) {
			System.out.println("Junio tiene 30 días");
		}else if (numero==7) {
			System.out.println("Julio tiene 31 días");
		}else if (numero==8) {
			System.out.println("Agosto tiene 31 días");
		}else if (numero==9) {
			System.out.println("Septiembre tiene 30 días");
		}else if (numero==10) {
			System.out.println("Octubre tiene 31 días");
		}else if (numero==11) {
			System.out.println("Noviembre tiene 30 días");
		}else if (numero==12) {
			System.out.println("Diciembre tiene 31 días");
		}

	}

}
