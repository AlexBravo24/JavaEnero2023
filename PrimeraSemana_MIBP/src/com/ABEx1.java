package com;

import java.util.Scanner;

public class ABEx1 {

	public static void main(String[] args) 
	{
		String [][] paises = new String [4][4]; //Declarando el tamaño del arreglo
		
		
		for(int i=0; i<4; i++) //Obtener los paises
        {
			System.out.println("Escribe un país:");
			Scanner inside = new Scanner(System.in);
			paises [i][0] = inside.nextLine();
        

        for(int j=1; j<4; j++) 
        {
            System.out.println("Escriba una ciudad: ");
            Scanner inside2 = new Scanner (System.in);
            paises [i][j] = inside2.nextLine();
            
        }
        }
		
		for (int i = 0; i< 4 ; i++)
		{
			System.out.print("Pais: " + paises[i][0]+ " " );
			
			for (int j=1; j<4; j++)
			{
			
				System.out.print(paises[i][j]+" ");
	
				
				
					
				
				if (j==3)
				{
					System.out.println(" ");
					
				}
			}
		}
	}
}
