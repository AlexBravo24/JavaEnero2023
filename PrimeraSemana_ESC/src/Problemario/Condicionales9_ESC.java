package Problemario;

import java.util.Scanner;

public class Condicionales9_ESC {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		    int dia;
		    
	
		    System.out.println("Introduce el numero que corresponde al dia deseado: ");
		    dia = entrada.nextInt();
		    
		// Realizamos comparaciones y mostramos el resultado
		    switch (dia) {
		    case 1:
		      System.out.println("\n--> Lunes");
		      break;
		    case 2:
		      System.out.println("\n--> Martes");
		      break;
		    case 3:
		      System.out.println("\n-->Miercoles");
		      break;
		    case 4:
		      System.out.println("\n-->Jueves");
		      break;
		    case 5:
		      System.out.println("\n-->Viernes");
		      break;
		    case 6:
		      System.out.println("\n-->Sabado");
		      break;
		    case 7:
		      System.out.println("\n-->Domingo");
		      break;
		    default:
		      System.out.println("\n ****ERROR: El número ingresado es incorrecto.**** ");
		    }

	}

}
