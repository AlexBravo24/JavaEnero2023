package Problemario;

import java.util.Scanner;

public class Condicionales4_ESC {

	public static void main(String[] args) {
		
		String cadena;
		//char cadena;
		//cadena = (char)System.in.read();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una letra: ");  
		cadena = entrada.nextLine();

		if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
		      System.out.println("La letra ingresada es una letra mayúscula.");
		 }else {
		      System.out.println("La letra ingresada no es una letra mayúscula.");
		    }
		
		
//		if(cadena >= 'A' && cadena <='Z') {
//			   System.out.println("Es una letra mayúscula");  
//	    }else {
//			   System.out.println("No es una letra mayúscula");
//	    }

	}

}
