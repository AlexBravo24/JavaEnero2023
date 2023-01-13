package Tareaif;

import java.util.Scanner;

public class Problema10 {

	public static void main(String[] args) {
       
		int mes; 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un numero correspondiente al a un mes del año: ");
        mes = scanner.nextInt();
        
        switch (mes) {
        case 1:
        	System.out.println("Tiene 31 dias");
        	break;
        case 2:
        	System.out.println("Tiene 28 dias");
        	break;
        case 3:
        	System.out.println("Tiene 31 dias");
        	break;
        case 4:
        	System.out.println("Tiene 30 dias");
        	break;
        case 5:
        	System.out.println("Tiene 31 dias");
        	break;
        case 6:
        	System.out.println("Tiene 30 dias");
        	break;
        case 7:
        	System.out.println("Tiene 31 dias");
        	break;
        case 8:
        	System.out.println("Tiene 31 dias");
        	break;
        case 9:
        	System.out.println("Tiene 30 dias");
        	break;
        case 10:
        	System.out.println("Tiene 31 dias");
        	break;
        case 11:
        	System.out.println("Tiene 30 dias");
        	break;
        case 12:
        	System.out.println("Tiene 31 dias");
        	break;
        default:
        	System.out.println("ERROR: Este dia no corresponde a un mes");
        }
	}

}
