package com;

import java.util.Scanner;

public class ArrayBidimensional2 {

	public static void main(String[] args) {
	
		String [][] matrizA = {{"5","x","9","4","t"},{"3","z","P","c","6"},{"8","3","f","i","7"}};
		String[][] matrizB = {{"7","P","4","g","8"},{"5","w","Y","10","2"},{"4","7","v","o","6"}};
		String [][] matrizC = new String [3][5];
		String dato1A;
		
		for(int i=0;i<3;i++) {
			System.out.println();
			for (int j=0;j<5;j++) {
				dato1A = matrizA[i][j];
				try {
					int numero1A = Integer.parseInt(dato1A);
					int numero1B = Integer.parseInt(matrizB[i][j]);
					int suma = numero1A +numero1B;
					String numStrg = String.valueOf(suma);
					matrizC[i][j]=numStrg;
					System.out.print(matrizC[i][j] + " ");
				}catch(Exception e) {
							matrizC[i][j]="0";
							System.out.print(matrizC[i][j] + " ");
				}
			}
		}
		
			
			
			
			
			
	}

}
