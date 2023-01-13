package Tareaif;

import java.util.Scanner;

public class Problema4 {

	public static void main(String[] args) {
		
		String cadena;
		
		Scanner entrada = new Scanner (System.in);

		System.out.println("Introduce texto: ");
		cadena = entrada.nextLine();
		
		if(cadena.equals(cadena.toUpperCase())) {
			System.out.println("Si tiene una mayusculas : " + cadena);
		}else if(cadena.equals(cadena.toLowerCase())){
			System.out.println("No tiene mayusculas");
		}else {
			System.out.println("Tiene mayusculas y minusculas");
		}
		

	}

}
