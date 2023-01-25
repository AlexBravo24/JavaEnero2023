package com;

import java.util.Scanner;

/*
* ALEX JAIR LOZA LOPEZ
* 10/01/2023
*/

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int zona;
		double peso;
		int c1 = 24;
		int c2 = 20;
		int c3 = 21;
		int c4 = 10;
		int c5 = 18;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Bienvenido al programa que calcula el costo por envio internacional de su paquete \n\nPor favor ingrese el numero de zona al que desea enviar:");
		zona=entrada.nextInt();
		
		System.out.println("Por favor ingrese el peso Kg del paquete a ser enviado");
		peso=entrada.nextDouble();
		
		if(peso <= 5 && peso > 0) {
			
			switch (zona){
			case 1:
				System.out.println("El paquete sera enviado a america del norte por: " + peso * c1);
				break;
			case 2:
				System.out.println("El paquete sera enviado a America Central por: " + peso * c2);
				break;
			case 3:
				System.out.println("El paquete sera enviado a America del Sur por: " + peso * c3);
				break;
			case 4:
				System.out.println("El paquete sera enviado a Europa por: " + peso * c4);
				break;
			case 5:
				System.out.println("El paquete sera enviado a Asia por: " + peso * c5);
				break;
			default:
				System.out.println("*** ERROR: area no identificada ***");
				break;
			}
			
		}else {
			System.out.println("** No se puede enviar su paquete por exceso de peso **");
		}
		

	}

}
