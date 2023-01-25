package com;

import java.util.Scanner;

/*
* ALEX JAIR LOZA LOPEZ
* 10/01/2023
*/

//13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
//centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
//y el resto se invierte en la bolsa.
//Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//ni�os y el resto se invierte en la bolsa.
//La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente
public class Ejercicio13 {

	public static void main(String[] args) {
		
		int donacion;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Programa que devuelve cuanto del monto donado, es destinado a los diferentes fines \n\nIngrese el valor de la donacion:");
		donacion = entrada.nextInt();
		
		if(donacion >= 10000) {
			System.out.println("Centro de salud:" + donacion * 0.3);
			System.out.println("Comedor de ni�os: " + donacion * 0.5);
			System.out.println("Inversiones en Bolsa:" + donacion * 0.2);
		}else if(donacion < 10000 && donacion > 0) {
			System.out.println("Centro de salud:" + donacion * 0.25);
			System.out.println("Comedor de ni�os: " + donacion * 0.6);
			System.out.println("Inversiones en Bolsa:" + donacion * 0.15);
		}
		
		
	}

}
