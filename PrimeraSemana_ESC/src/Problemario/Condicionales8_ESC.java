package Problemario;

import java.util.Scanner;

public class Condicionales8_ESC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    int dado;

	    System.out.print("Lanza el dato e introduce el numero de la cara obtenida (1-6): ");
	    dado = entrada.nextInt();
	
	    
	    switch (dado) {
	    case 1:
	      System.out.println("\nEn la cara opuesta de 1 es la cara \"seis\".");
	      break;
	    case 2:
	      System.out.println("\nEn la cara opuesta de 2 es la cara \"cinco\".");
	      break;
	    case 3:
	      System.out.println("\nEn la cara opuesta de 3 es la cara \"cuatro\".");
	      break;
	    case 4:
	      System.out.println("\nEn la cara opuesta de 4 es la cara \"tres\".");
	      break;
	    case 5:
	      System.out.println("\nEn la cara opuesta de 5 es la cara \"dos\".");
	      break;
	    case 6:
	      System.out.println("\nEn la cara opuesta de 6 es la cara \"uno\".");
	      break;
	    default:
	      System.out.println("ERROR: número incorrecto.");
	    }

	}

}
