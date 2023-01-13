package com;

import java.util.Arrays;


public class Ejercicio2_2_Arrays {

	public static void main(String[] args) {
		
		String matrizA[][] = {{"5", "x", "9", "4", "t"}, {"3", "z", "P", "c", "6"}, {"8", "3", "f", "i", "7"}};
        String matrizB[][] = {{"7", "P", "4", "g", "8"}, {"5", "w", "Y", "10", "2"}, {"4", "7", "v", "o", "6"}};
        int matrizC[][] = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (isNumeric(matrizA[i][j]) && isNumeric(matrizB[i][j])) {
                    matrizC[i][j] = Integer.parseInt(matrizA[i][j]) + Integer.parseInt(matrizB[i][j]);
                } else {
                    matrizC[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
