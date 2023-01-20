package Tareaif;

import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) {
        
		int n1,n2;
		
		Scanner entrada = new Scanner (System.in);

		System.out.println("Introduce el primer numero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		n2 = entrada.nextInt();
		
		if (n1 == n2){
			System.out.println("Son iguales");
		}else if (n1 > n2){
			System.out.println(n1 + " es mayor que " + n2);
		}else if (n1 < n2){
			System.out.println(n1 + " es menor " + n2);
		}
	}

}
