package Tareaif;

import java.util.Scanner;

public class Problema3 {

	public static void main(String[] args) {
        
		int n1,n2;
		
		Scanner entrada = new Scanner (System.in);

		System.out.println("Introduce el primer numero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		n2 = entrada.nextInt();
		
		if(n2 == 0) {
			System.out.println("¡ERROR! No se puede el 0");
		}else {
			System.out.println("¡CORRECTO!");
		}
		
	}

}
