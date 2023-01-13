package Problemario;

import java.util.Scanner;

public class Array1_ESC {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.println("Ingresa el numero: ");
			numeros[i]=entrada.nextInt();
		}
		System.out.println("**************************");
		for(int i=0; i<10; i++) {
			System.out.println("Indice: "+ i + " Contiene --> " + numeros[i]);

		}

     

	}

}
