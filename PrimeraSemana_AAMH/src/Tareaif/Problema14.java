package Tareaif;

import java.util.Scanner;

public class Problema14 {

	public static void main(String[] args) {
		
		int horas,sueldo;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingresa horas trabajadas: ");
		horas = scanner.nextInt();
		
		if(horas <= 40) {
			sueldo = horas*16;
			System.out.println("Tu sueldo es "+ sueldo);
		}else if(horas > 40) {
			sueldo = horas*20;
			System.out.println("Tu sueldo es "+ sueldo);
		}
	}

}
