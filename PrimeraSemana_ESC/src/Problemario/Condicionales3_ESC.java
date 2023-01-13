package Problemario;

import java.util.Scanner;

public class Condicionales3_ESC {

	public static void main(String[] args) {
		double numero1,
			   numero2;

		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Introduce el primer numero:");  
		numero1 = entrada1.nextInt(); 

		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce el segundo numero:");  
		numero2 = entrada2.nextInt(); 

		if(numero2 ==0){
			System.out.println( "*** Error, el segundo numero no debe ser 0 ***" );
		}else{
			System.out.println("El Resultado de la División es: " + numero1/numero2);
		}

	}

}
