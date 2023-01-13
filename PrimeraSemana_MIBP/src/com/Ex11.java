package com;

import java.util.Scanner;

public class Ex11 {
//	11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto.
//	Ejemplo: 8 x 8


	public static void main(String[] args) {
		
		int lado;
		
		System.out.println("Ingrese la medida deseada en su cuadrado");
		Scanner l = new Scanner(System.in);
		lado = l.nextInt();
		 
		if (lado>= 2 && lado < 50) 
		{
			for (int i = 1; i <= lado; i++) {
                for (int j = 1; j <= lado; j++) {
                    System.out.print(" *");
			
			
		}
                System.out.println("");
                
                
        }
    
			
			}
		
		
		
		
		
		
		
		
		
	}

}
