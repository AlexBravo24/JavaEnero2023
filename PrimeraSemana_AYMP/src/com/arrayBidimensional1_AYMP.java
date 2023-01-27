package com;

import java.util.Scanner;

public class arrayBidimensional1_AYMP {

	public static void main(String[] args) {
		String entrada;
		int i,j=0;
		
		String [][] matriz = new String [4][4];
		for(i=0;i<4;i++) {
			System.out.println("Ingrese país y sus respectivas cuidades");
			for (j=0;j<4;j++) {
				System.out.print("- ");
			    Scanner entrada1= new Scanner(System.in);
			    entrada= entrada1.nextLine();
				matriz[i][j]=entrada;
			}
		}
		System.out.println("La matriz es: ");
		for(i=0;i<4;i++) {
			System.out.print("País: ");
			for (j=0;j<4;j++) {
				System.out.print(matriz[i][j] + " ");
			}System.out.println();
		}
		

	}

}
