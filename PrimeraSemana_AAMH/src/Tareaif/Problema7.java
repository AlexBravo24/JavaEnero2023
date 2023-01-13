package Tareaif;

import java.util.Scanner;

public class Problema7 {

	public static void main(String[] args) {
		
       int alumnos;
		
		Scanner scanner = new Scanner (System.in);

		System.out.println("Introduce cuantos alumnnos van de viaje: ");
		alumnos = scanner.nextInt();
		
		if (alumnos >= 100) {
		System.out.println("Son 65 euros por alumno");
		}else if(alumnos >= 50 && alumnos<=99 ) {
			System.out.println("Son 70 euros por alumno");
		}else if(alumnos >= 30 && alumnos<=49 ) {
			System.out.println("Son 95 euros por alumno");
		}else if(alumnos < 30 ) {
			System.out.println("Son 4000 euros del camion");
		}
	}

}
