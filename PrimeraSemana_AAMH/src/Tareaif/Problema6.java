package Tareaif;

import java.util.Scanner;

public class Problema6 {

	public static void main(String[] args) {
        
		int tamaño,centimos,total;
		String tipo;
		
		Scanner entrada = new Scanner (System.in);

		System.out.println("Introduce los centimos: ");
		centimos = entrada.nextInt(); entrada.nextLine();
		
		System.out.println("Introduce el tipo de uva  (A/B): ");
		tipo = entrada.nextLine(); 
		
		System.out.println("Introduce el tamaño de uva (1/2): ");
		tamaño = entrada.nextInt();
		
		
		if (!tipo.toUpperCase().equals("A") && !tipo.toUpperCase().equals("B")) {
		      System.out.println("No existe ese tipo de uva, favor de volver a intentar");
		}else if(!(tamaño == 1) &&  !(tamaño == 2)) {
	    	System.out.println("Ese tamaño no existe, favor de volver a intentar");
	    }else if(tipo.equals("A") && tamaño == 1) {
			total = centimos+20;
			System.out.println("El total de centimos es: "+total);
		}else if(tipo.equals("A") && tamaño == 2) {
			total = centimos+30;
			System.out.println("El total de centimos es: "+total);
		}else if(tipo.equals("B") && tamaño == 1) {
			total = centimos-30;
			System.out.println("El total de centimos es: "+total);
		}else if(tipo.equals("B") && tamaño == 2) {
			total = centimos-50;
			System.out.println("El total de centimos es: "+total);
		}
		

	}

}
