package com;

import java.util.Scanner;

public class EjercicioCatorceAYMP {

	public static void main(String[] args) {
		float horas;
		float sueldo=0,extras=0;
		System.out.print("¿Cuántas horas trabajó esta semana? ");
		Scanner entrada= new Scanner(System.in);
		horas= entrada.nextFloat();
		if(horas<=40) {
			sueldo=horas * 16;
		}else if(horas>40) {
			extras= horas-40;
			sueldo=(40*16)+extras*20;
		}System.out.println("Su salario es: $"+sueldo);

		
		
		
		
	}

}
