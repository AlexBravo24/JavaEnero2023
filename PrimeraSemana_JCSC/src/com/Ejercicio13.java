package com;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		float donacion;
		float salud;
		float niños;
		float bolsa;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa el monto de donación");
		donacion = entrada.nextFloat();
		
		if (donacion>=10000) {
			salud = donacion*.30f;
			niños = donacion*.50f;
			bolsa = donacion*.20f;
			System.out.println("$" + salud + " se donará al centro de salud, " + "$" +  niños + " se donará al comedor de niños y " + "$" +  bolsa + " se invertirá en la bolsa");
		}else if (donacion<=9999) {
			salud = donacion*.25f;
			niños = donacion*.60f;
			bolsa = donacion*.15f;
			System.out.println("$" + salud + " se donará al centro de salud, " + "$" + niños + " se donará al comedor de niños y " + "$" + bolsa + " se invertirá en la bolsa");
		}

	}

}
