package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 10/01/2023
 */

//7. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
//clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
//es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
//entrega en un embarque considerando lo siguiente:
//* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
//es de tama�o 2.
//* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
//tama�o 2.
//Precio inicial se recibe desde teclado

public class Ejercicio6 {

	public static void main(String[] args) {
		
		String uva;
		int tama�o;
		double precio_final = 0;
		double precio_inicial;
		
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el precio inicial de la uva:");
		precio_inicial = entrada.nextDouble();
		
		Scanner tipo_uva = new Scanner(System.in);
		System.out.println("Introduce el tipo de uva (A, B):");
		uva = tipo_uva.nextLine();
		
		System.out.println("Introduce el tama�o de uva (1, 2):");
		tama�o = entrada.nextInt();
		
		
		
		if(uva.compareTo("A")==0) {
			if(tama�o==1) {
				precio_final=precio_inicial+.2;
			}else if(tama�o==2) {
				precio_final = precio_inicial + .3;
			}
		}else if(uva.compareTo("B")==0) {
			if(tama�o==1) {
				precio_final=precio_inicial -.3;
			}else if(tama�o==2) {
				precio_final = precio_inicial - .5;
			}	
		}else {
			System.out.println("ERROR Ingresa parametros reales");
		}
		if(precio_final != 0) {
			System.out.println("El precio final de la uva es: " + precio_final);
		}
		
	}

}
