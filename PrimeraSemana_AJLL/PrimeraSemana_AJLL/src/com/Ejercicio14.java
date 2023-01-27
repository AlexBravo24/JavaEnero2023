package com;

import java.util.Scanner;

/*
* ALEX JAIR LOZA LOPEZ
* 10/01/2023
*/


//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
//horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
//primeras 40 horas y $20 por cada hora extra
public class Ejercicio14 {

	public static void main(String[] args) {
		

		int horas;
		int salario;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Programa que calcula el salario en funcion de las horas enteras trabajadas. \n\nPor favor ingresa las horas que trabajaste esta semana:");
		horas = entrada.nextInt();
		
		if(horas > 40) {
			horas = horas - 40;
			salario = 40 * 16 + horas * 20;
			System.out.println("Tu salario es: $" + salario);
		}else if(horas <= 40 && horas > 0) {
			salario = horas * 16;
			System.out.println("Tu salario es: $" + salario);
		}else {
			System.out.println("++ ERROR: INGRESA UN NUMERO VALIDO DE HORAS ++");
		}

	}

}
