package com;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) throws IOException {
		float precioi;
		char tipo;
		int tamaño;
		float precioA1;
		float precioA2;
		float precioB1;
		float precioB2;
		
		Scanner entrada1 = new Scanner (System.in);
		System.out.println("Escribe el precio inicial con números");
		precioi = entrada1.nextFloat();
		
		Scanner entrada2 =  new Scanner (System.in);
		System.out.println("¿Qué tipo de uva es? (A/B)");
		tipo = (char) System.in.read();
		
		Scanner entrada3 = new Scanner (System.in);
		System.out.println("¿Qué tamaño es? (1/2)");
		tamaño  = entrada2.nextInt();
		
		precioA1 = (precioi+.20f);
		precioA2 = (precioi+.30f);
		
		precioB1 = (precioi-.30f);
		precioB2 = (precioi-.50f);
		
		
			if (tipo=='A' && tamaño==1) {
			System.out.println("El productor de uva recibirá " + precioA1);
		}else if (tipo=='A' && tamaño==2){
			System.out.println("El productor de uva recibirá " + precioA2);
		}else if (tipo=='B' && tamaño==1) {
			System.out.println("El productor de uva recibirá " + precioB1);
		}else if (tipo=='B' && tamaño==2) {
			System.out.println("El productor de uva recibirá " + precioB2);
		}
		
		

	}

}
