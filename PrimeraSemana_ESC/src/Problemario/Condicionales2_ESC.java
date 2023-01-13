package Problemario;

import java.util.Scanner;

public class Condicionales2_ESC {

	public static void main(String[] args) {
		
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero:");  
		numero = entrada.nextInt();
		
		if(numero % 2 ==0){
			System.out.println( numero +  " Es Un Numero Par " );
			}else{
			System.out.println("\n" + numero +  " Es Un Numero Impar ");
			}
		

	}

}
