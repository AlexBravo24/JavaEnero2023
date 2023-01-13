package Problemario;

import java.util.Scanner;

public class Condicionales6_ESC {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		 int kilos,
		 	 tamano;
		 double precioInicial;
		 String tipo;

		   
		    System.out.println(" Cuantos Kilos de Uva son: ");
		    kilos = scanner.nextInt();
		    
		    System.out.println(" Precio Inicial por Kilo: ");
		    precioInicial = scanner.nextDouble();
		    
		    System.out.println(" Valor de Uva \"A\" ó \"B\": ");
		    tipo = scanner.next(); scanner.nextLine();
		    
		    System.out.println(" Tipo de Uva \"1\" ó \"2\": ");
		    tamano = scanner.nextInt();
		    

		    if (!((tipo.equalsIgnoreCase("A") || tipo.equalsIgnoreCase("B")) &&
		        (tamano == 1 || tamano == 2))) {
		      System.out.println("El valor de tipo de Uva o el tamaño de Uva es incorrecto, Verifica los valores introducidoss.");
		    } else {
		      if (tipo.equalsIgnoreCase("A") && tamano == 1) {
		        System.out.println("Recibira una ganancia de: " + ((kilos * precioInicial)+(kilos*0.20)));
		      } else if (tipo.equalsIgnoreCase("A") && tamano == 2) {
		        System.out.println("Recibira una ganancia de: " + ((kilos*precioInicial)+(kilos*0.30)));
		      } else if (tipo.equalsIgnoreCase("B") && tamano == 1) {
		        System.out.println("Recibira una ganancia de: " + ((kilos * precioInicial)-(kilos*0.30)));
		      } else if (tipo.equalsIgnoreCase("B") && tamano == 2) {
		        System.out.println("Recibira una ganancia de: " + ((kilos*precioInicial)-(kilos*0.50)));
		      }
		    }

	}

}
