package Problemario;

import java.util.Scanner;

public class Condicionales1_ESC {

	public static void main(String[] args) {
		
		int numero1,
		numero2;
	
	Scanner entrada1 = new Scanner(System.in);
	System.out.println("Introduce un numero:");  
	numero1 = entrada1.nextInt(); 
	
	Scanner entrada2 = new Scanner(System.in);
	System.out.println("Introduce un numero:");  
	numero2 = entrada2.nextInt(); 
	
	if (numero1>numero2) { 
		System.out.println(numero1 +" Es Mayor que " + numero2);
	}else if (numero1 == numero2) {
		System.out.println(numero1 +" Es Igual que " + numero2);
	}else {
		System.out.println(numero1 +" Es Menor que " + numero2);
	}
	

	}

}
