package Tareaif;

import java.util.Scanner;

public class Problema11 {

	public static void main(String[] args) {
		
		int kilogramos,zonas,costo;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingrese el numero de la zona a la que volara:"
				+ "\n 1. América del Norte"
				+ "\n 2. América Central"
				+ "\n 3. América del Sur"
				+ "\n 4. Europa"
				+ "\n 5. Asia");
		zonas = scanner.nextInt();
		
		System.out.print("Ingresa el peso en kilogramos que llevaras: ");
		kilogramos = scanner.nextInt();
		
		if(!(kilogramos >= 5)) {
		
		switch (zonas) {
		
		case 1:
			costo = 2400/kilogramos;
			System.out.println("El costo es: " + costo);
			break;
		case 2:
			costo = 2000/kilogramos;
			System.out.println("El costo es: " + costo);
			break;
		case 3:
			costo = 2100/kilogramos;
			System.out.println("El costo es: " + costo);
			break;
		case 4:
			costo = 1000/kilogramos;
			System.out.println("El costo es: " + costo);
			break;
		case 5:
			costo = 1800/kilogramos;
			System.out.println("El costo es: " + costo);
			break;
		default:
			System.out.println("ERROR. No existe esa zona para viajar");
		}
			
		}else {
			System.out.println("No se puede viajar con mas de 5 Kilogramos");
		}
		

	}

}
