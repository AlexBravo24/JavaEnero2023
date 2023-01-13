package Problemario;

import java.util.Scanner;

public class Condicionales5_ESC {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
	    int nota;
	    int edad;
	    String sexo;
	    
	    System.out.println("Edad: ");
	    edad = scanner.nextInt();
	    System.out.println("Nota: ");
	    nota = scanner.nextInt(); scanner.nextLine();
	    System.out.println("Sexo (M o F): ");
	    sexo = scanner.nextLine();
	    

	    if ((nota == 5) && (edad == 18) && (sexo.equalsIgnoreCase("M"))) {
	      System.out.println(" \n POSIBLE ");
	    }else if ((nota == 5) && (edad == 18) && (sexo.equalsIgnoreCase("F"))) {
	       System.out.println(" \n ACEPTADA ");
	    }else {
	       System.out.println(" \n NO ACEPTADA ");
	    }

	}

}
