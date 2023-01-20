package Arrays;

import java.util.Scanner;

public class Ejercicio1Array {

	public static void main(String[] args) {
		
		String [][] pais = new String[4][4];
		
		Scanner scanner = new Scanner(System.in);

		
		
		for (int i=0;i<4;i++) {
			System.out.println("Ingresa pais: ");
			pais[i][0] = scanner.nextLine();
		
			for (int j=1;j<4;j++) {
				System.out.println("Ingresa un la cuidad: ");
				pais[i][j] = scanner.nextLine();	
			}
			
			for (int k=0;k<4;k++) {
			    System.out.println();
				for (int l=0;l<4;l++) {
					System.out.print(pais[k][l]+" ");
				}
			}
		}
	}

}
