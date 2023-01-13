package com;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int dia;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escribe un número del 1 al 7");
		dia = entrada.nextInt();
	
		if (dia<=0 || dia>=8) {
			System.out.println("Error");
		}else if (dia==1) {
			System.out.println("El día 1 de la semana es Lunes");
		}else if (dia==2) {
			System.out.println("El día 2 de la semana es Martes");
		}else if (dia==3) {
			System.out.println("El día 3 de la semana es Miércoles");
		}else if (dia==4) {
			System.out.println("El día 4 de la semana es Jueves");
		}else if (dia==5) {
			System.out.println("El día 5 de la semana es Viernes");
		}else if (dia==6) {
			System.out.println("El día 6 de la semana es Sábado");
		}else if (dia==7) {
			System.out.println("El día 7 de la semana es Domingo");
		}

	}

}
