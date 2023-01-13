package Tareaif;

import java.util.Scanner;

public class Problema5 {

	public static void main(String[] args) {
        
		int edad,nota;
		String sexo;
		
		Scanner entrada = new Scanner (System.in);

		System.out.println("Introduce Edad: ");
		edad = entrada.nextInt();
		
		System.out.println("Introduce Nota: ");
		nota = entrada.nextInt(); entrada.nextLine();
		
		System.out.println("Introduce Sexo (M/F): ");
		sexo = entrada.nextLine();
		
		if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
		      System.out.println("El valor de sexo introducido es incorrecto.\n"
		          + "por favor, reenvíe el formulario.");
		}else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
		      System.out.println("POSIBLE");
		}else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
		       System.out.println("ACEPTADA");
		}else {
		        System.out.println("NO ACEPTADA");
		}

	}

}
