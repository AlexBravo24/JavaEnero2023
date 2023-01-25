package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Array Bidimensional. Se pasa de una idea a una lista
		 * a tener mas elementos en estructuras de dos dimensiones o mas
		 * Graficamente o en salida de datos. Podriamos asemejarlo o 
		 * o compararlo con una tabla.
		 */
		
		//Declarando un array bidimensional
		
//		int [][] matrix = new int[3][2];
//		
//		//Primer fila
//		matrix [0][0] = 1;
//		matrix [0][1] = 2;
//		
//		//Segunda fila
//		matrix [1][0] = 3;
//		matrix [1][1] = 4;
//		
//		//Tercera fila
//		matrix [2][0] = 5;
//		matrix [2][1] = 6;
		
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0; i<3 ; i++)
		{
			for(int x=0; x<3 ; x++)
			{
				System.out.print(matrix[i][x] + " ");
			}
			System.out.println();
		}
		
	}

}
