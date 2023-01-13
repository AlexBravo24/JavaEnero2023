package Arrays;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int [] numeros = new int [10];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<numeros.length;i++) {
			
		System.out.println("Introduce un numero:");
		numeros[i] = scanner.nextInt();
		}
		
		for (int j:numeros) {
			System.out.print(j);
		}
	}

}
