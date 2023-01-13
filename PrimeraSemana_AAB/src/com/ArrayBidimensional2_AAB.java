package com;

public class ArrayBidimensional2_AAB {

	public static void main(String[] args) {
		
		String [][] matrizA = new String [3][5];
		int [][] matrizA2 = new int [3][5];
		
		matrizA [0][0] = "5";
		matrizA [0][1] = "x";
		matrizA [0][2] = "9";
		matrizA [0][3] = "4";
		matrizA [0][4] = "t";
		
		matrizA [1][0] = "3";
		matrizA [1][1] = "z";
		matrizA [1][2] = "P";
		matrizA [1][3] = "c";
		matrizA [1][4] = "6";
		
		matrizA [2][0] = "8";
		matrizA [2][1] = "3";
		matrizA [2][2] = "f";
		matrizA [2][3] = "i";
		matrizA [2][4] = "7";
		
		String [][] matrizB = new String [3][5];
		int [][] matrizB2 = new int [3][5];
		
		matrizB [0][0] = "7";
		matrizB [0][1] = "P";
		matrizB [0][2] = "4";
		matrizB [0][3] = "g";
		matrizB [0][4] = "8";
		
		matrizB [1][0] = "5";
		matrizB [1][1] = "w";
		matrizB [1][2] = "Y";
		matrizB [1][3] = "10";
		matrizB [1][4] = "2";
		
		matrizB [2][0] = "4";
		matrizB [2][1] = "7";
		matrizB [2][2] = "v";
		matrizB [2][3] = "o";
		matrizB [2][4] = "6";
		
		int [][] matrizC = new int [3][5];
		
		
		for (int i = 0; i < 3; i++) {
			try {
			    matrizA2[i][0] = Integer.parseInt(matrizA[i][0]);
			} catch(Exception e) {
				matrizA2[i][0] = 0;
			}
			for (int j = 0; j < 5; j++) {
				try {
				    matrizA2[i][j] = Integer.parseInt(matrizA[i][j]);
				} catch(Exception e) {
					matrizA2[i][j] = 0;
				}
			}
		}
		System.out.println("La matriz A resulta así: ");
		for (int i = 0; i < 3; i++) {
				System.out.print(matrizA2[i][0] + "	");
				for (int j = 1; j < 5; j++) {
					System.out.print(matrizA2[i][j] + "	");
				}
				System.out.println();
		}
		 
		for (int i = 0; i < 3; i++) {
				try {
				    matrizB2[i][0] = Integer.parseInt(matrizB[i][0]);
				} catch(Exception e) {
					matrizB2[i][0] = 0;
				}
				for (int j = 0; j < 5; j++) {
					try {
					    matrizB2[i][j] = Integer.parseInt(matrizB[i][j]);
					} catch(Exception e) {
						matrizB2[i][j] = 0;
					}
				}
		}
		
		System.out.println();
		System.out.println("La matriz B resulta así: ");
		for (int i = 0; i < 3; i++) {
					System.out.print(matrizB2[i][0] + "	");
					for (int j = 1; j < 5; j++) {
						System.out.print(matrizB2[i][j] + "	");
					}
					System.out.println();
		}
		
		for (int i = 0; i < 3; i++) {
			matrizC[i][0] = matrizA2[i][0] + matrizB2[i][0];
			if (matrizA2[i][0] == 0 || matrizB2[i][0] == 0) {
				matrizC[i][0] = 0;
			}
			for(int j = 0; j < 5; j++) {
				matrizC[i][j] = matrizA2[i][j] + matrizB2[i][j];
				if (matrizA2[i][j] == 0 || matrizB2[i][j] == 0) {
					matrizC[i][j] = 0;
				}
			}
		}

		System.out.println();
		System.out.println("La matriz resultante de la suma es: ");
		for (int i = 0; i < 3; i++) {
					System.out.print(matrizC[i][0] + "	");
					for (int j = 1; j < 5; j++) {
						System.out.print(matrizC[i][j] + "	");
					}
					System.out.println();
		}
		
	}

}
