package com;


/*
 * Alex Jair Loza Lopez
 * 12/01/2023
 */
//Una vez creadas, deberás crear un algoritmo que convierta los valores numéricos a 
//enteros y los sume de acuerdo a su posición en una tercera matriz (Ejemplo, valor 
//String de Matriz A 0,0=”5“+ valor String de Matriz B 0,0=”7”, entonces en la 
//coordenada 0,0 de la Matriz C debería mostrarse la suma, quedando como Matriz 
//C 0,0=”12”. Aplicando la lógica de que solo se pueden sumar los valores que son 
//numéricos, si las coordenadas tienen valores de letras o un valor numérico y una 
//letra, entonces en la Matriz C 0,1 se deberá mostrar un valor = “0”.


public class ArrayBidimensional2_AJLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] matrizA = {{"5","x","9","4","t"},{"3","z","P","c","6"},{"8","3","f","i","7"}};
		String [][] matrizB = {{"7","P","4","g","8"},{"5","w","Y","10","2"},{"4","7","v","o","6"}};
		int [][] matrizC = new int[3][5];
		int numero1;
		int numero2;
		
		for (int i = 0; i<3 ; i++)
		{
			for(int j=0 ; j<5 ; j++)
			{
				try {
					numero1 = Integer.parseInt(matrizA[i][j]);
					} catch (Exception e) {
						numero1=0;
					}
				try {
					numero2 = Integer.parseInt(matrizB[i][j]);
					} catch (Exception e) {
						numero2=0;
					}
				if(numero1 != 0 && numero2 != 0) 
				{
					matrizC[i][j]=numero1+numero2;
				} else {
					matrizC[i][j]=0;
				}
				
			}
		}
		System.out.println("La matriz de resultado es la siguiente:\n\n\n");
		for (int i = 0; i<3 ; i++)
		{
			for(int j=0 ; j<5 ; j++)
			{
				System.out.print(matrizC[i][j] + " ");
			}
			System.out.println();
		}
	}

}
