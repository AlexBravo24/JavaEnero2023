package com;

import java.util.Scanner;

public class ejercicioDos {

	public static void main(String[] args) {
		float numero;
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese un número entero: ");
		numero = dato.nextFloat();
		float residuo =numero%2;
		
		if (residuo == 0) {
			System.out.print("El número ingresado es PAR");
		}else if(residuo == 1) {
			System.out.print("El número ingresado es impar");
		}else {
			System.out.print("Usted no ingresó un número ENTERO");
		}
		
		
		
		

	}

}
