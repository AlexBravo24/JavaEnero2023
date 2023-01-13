package Tareaif;

import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		
        int n1;
		
		Scanner entrada = new Scanner (System.in);

		System.out.println("Introduce el primer numero: ");
		n1 = entrada.nextInt();
		
		if ( n1 % 2 == 0 ){
            System.out.printf( "ES PAR" );
        }else{
            System.out.printf( "ES IMPAR" );
        }
	}

}
