package com;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) throws IOException {
	int edad;
	int nota;
	char sexo;
	
	Scanner entrada1 = new Scanner (System.in);
	System.out.println("Escribe tu nota");
	nota = entrada1.nextInt();
	
	Scanner entrada2 = new Scanner (System.in);
	System.out.println("Escribe tu edad");
	edad = entrada2.nextInt();
	
	System.out.println("Escribe tu sexo (M/F)");
	sexo = (char) System.in.read();
	
		if (edad<=18 && nota<=5 && sexo=='F') {
		System.out.println("ACEPTADA");
		} else if (edad<=18 && nota<=5 && sexo=='M') {
		System.out.println("POSIBLE");
		} else {
			System.out.println("NO ACEPTADA");
		}
	}


	

}
