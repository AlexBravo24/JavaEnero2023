package com;

public class ArrayBidimensional_ESC {

	public static void main(String[] args) {
		
		
		/*
		 *Array Bidimensional. Se pasa de una idea de una  "lista"
		 *a tener mas elementos en estructuras de dos dimensiones o mas.
		 *Graficamente o en salida de datos, podriamos asemejarlo o compararlo a una tabla. 
		 */
		
		//Declarar un array de dos dimensiones
		
//		int [][] matriz = new int[3][3];
//		
//		matriz[0][0]=1;
//		matriz[0][1]=2;
//		matriz[0][2]=3;
//		
//		matriz[1][0]=4;
//		matriz[1][1]=5;
//		matriz[1][2]=6;
//		
//		matriz[2][0]=7;
//		matriz[2][1]=8;
//		matriz[2][2]=9;
		
		int[][]matriz= {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		for(int i=0; i<3;i++) {
			System.out.println();
			for(int j=0; j<3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
		

	}

}
