package Problemario;

import java.util.Scanner;

public class Condicionales10_ESC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	    int mes;
	    
	
	    System.out.println("Introduce el numero que corresponde al dia deseado (1 -12): ");
	    mes = entrada.nextInt();
	    

	    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
	      System.out.println("\nEl Mes elegido tiene 31 días");
	    } else if (mes ==2){
	      System.out.println("\nEl Mes elegido tiene 28 días");
	    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
	      System.out.println("\nEl mes elegido tiene 30 días");
	    } else {
	      System.out.println("\n ****ERROR, el mes debe ser 1-12.**** ");
	    } 

	}

}
