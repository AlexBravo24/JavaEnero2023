package com;

import java.util.Scanner;

/*
* ALEX JAIR LOZA LOPEZ
* 10/01/2023
*/
public class Ejercicio12 {

	public static void main(String[] args) {
		
		
		double altura;
		double peso;
		double IMC;
		
		System.out.println("Bienvenido, este es un programa que calcula tu IMC");
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Por favor ingresa tu altura en M:");
		altura = entrada.nextDouble();
		
		System.out.println("Por favor ingresa tu peso en Kg:");
		peso = entrada.nextDouble();
		
		IMC= peso / (Math.pow(altura,2));
		System.out.println(IMC);
		if(IMC < 16.00) {
			System.out.printf("IMC: " + "%.2f",IMC);
			System.out.println("- CRITERIO DE INGRESO AL HOSPITAL." );
		}else if(IMC >= 16.00 && IMC < 17.00) {
			System.out.printf("IMC: " + "%.2f",IMC);
			System.out.println("- INFRAPESO.");
		}else if(IMC >= 17.00 && IMC < 18.00) {
			System.out.printf("IMC: " + "%.2f",IMC);
			System.out.println( "- Bajo peso.");
		}else if(IMC >= 18.00 && IMC < 25.00) {
			System.out.printf("IMC: " + "%.2f",IMC);
			System.out.println( "- Peso Normal (SALUDABLE).");
		}else if(IMC >= 25 && IMC < 30) {
			System.out.printf("IMC: " + "%.2f",IMC);
			System.out.println("- SOBREPESO, OBESIDAD GRADO 1.");
		}else if(IMC >= 30 && IMC < 35) {
			System.out.printf("IMC: " + "%.2f",IMC);
			System.out.println("- SOBREPESO CRONICO, OBESIDAD GRADO 2.");
		}else if(IMC >= 35 && IMC < 40) {
			System.out.printf("IMC: " + "%.2f",IMC);
			System.out.println("- OBESIDAD PREMORBIDA, OBESIDAD GRADO 3.");
		}else if(IMC >= 40) {
			System.out.printf("IMC: " + "%.2f",IMC);
			System.out.println("- OBESIDAD MORBIDA, OBESIDAD DE GRADO 4.");
		}else {
			System.out.println("** ERROR ** ");
		}

	}

}
