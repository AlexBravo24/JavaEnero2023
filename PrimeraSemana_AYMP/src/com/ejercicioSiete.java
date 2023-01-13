package com;

import java.util.Scanner;

public class ejercicioSiete {

	public static void main(String[] args) {
		float alumnos;
		float autobus;
		System.out.print("Ingrese el número de alumnos que viajaran: ");
		Scanner entrada= new Scanner(System.in);
		alumnos = entrada.nextFloat();
		if(alumnos >= 100) {
			System.out.print("costo por alumno $65 euros");
		}else if(alumnos>= 50 && alumnos<=99) {
			System.out.print("costo por alumno $70 euros");
		}else if(alumnos>= 30 && alumnos<=49) {
			System.out.print("costo por alumno $95 euros");
		}else if(alumnos<30) {
			autobus = 4000 / alumnos;
			System.out.printf("costo por alumno = %.2f",autobus);
		}


	}

}
