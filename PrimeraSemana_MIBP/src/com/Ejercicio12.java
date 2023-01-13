package com;

import java.util.Scanner;

public class Ejercicio12 {
//	12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
//			[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:

	public static void main(String[] args) {
		
		double peso;
		double altura;
		double IMC;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese su peso en KG");
		peso = scanner.nextDouble();
		
		System.out.println("Ingrese su altura en M");
		Scanner scanner2 = new Scanner(System.in);
		altura = scanner2.nextDouble();
		
		IMC = peso/(altura*2);
		
		System.out.println("Su IMC es de \t" + IMC);
		
		if (IMC<16) {
			System.out.println("Usted debe de ingresar a un hospital urgentemente");
			}
		
		
		

	}

}
