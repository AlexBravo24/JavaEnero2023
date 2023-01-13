package Problemario;

import java.util.Scanner;

public class Ciclos2_ESC {

	public static void main(String[] args) {
		//Programa un algoritmo uqe realice la tabla de multiplicar de un numero introducido desde teclado  
		//hasta la iteracion deseada por el usuario.
		
		int numero,
			incremento;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero del que deseas la tabla: ");
		numero = entrada.nextInt();
		
		System.out.println("Introduce el numero hasta el que deseas multiplicar la tabla: ");
		incremento = entrada.nextInt();
		
		for(int i=1; i<=incremento; i++) {
			System.out.println(numero + " x " + i + " = " + numero*i);
		}
		
	}

}
