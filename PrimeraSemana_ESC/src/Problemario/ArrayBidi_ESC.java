package Problemario;

import java.util.Scanner;

public class ArrayBidi_ESC {

	public static void main(String[] args) {

        String[] países = new String[4];
        String[][] ciudades = new String[4][3];
        Scanner entrada = new Scanner(System.in);
               
        for(int i=0;i<4;i++){//Ciclo for para solicitar los 4 paises
            System.out.println("Escribe el "+ (i+1) +" país: ");
            países[i] = entrada.nextLine();//Guarda datos
        }
        
        for(int i=0;i<4;i++){ //Ciclo for para los 4 paises ingresado para pedir las ciudades 
        	System.out.println();
            for(int j=0;j<3;j++){//Ciclo for anidado para pedir solo 3 ciudades por pais
            	System.out.println("Escribe la " + (j+1) + " ciudad de "+países[i]+": ");
                ciudades[i][j] = entrada.nextLine();//Guarda en el array bidimensional las 12 ciudades.
            }
        }
        for(int i=0;i<4;i++){//Ciclo for para imprimir el array de 4 paises
            System.out.print("\n País "+ (i+1) +" : " +países[i]+"  \t Ciudades:  ");
            for(int j=0;j<3;j++){//Ciclo for anidado para imprimir el array bidimensional de las 3 ciudades de cada pais
                System.out.print(" " + ciudades[i][j]+"\t");
            }
        }

	}

}
