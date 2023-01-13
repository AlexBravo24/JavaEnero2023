package com;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Indica el resultado del dado");
		numero = entrada.nextInt();
	
		if (numero<=0 || numero>=7) {
			System.out.println("ERROR: Número incorrecto");
		}else if (numero==1) {
			System.out.println("El número de la cara opuesta al resultado es seis");
		}else if (numero==2) {
			System.out.println("El número de la cara opuesta al resultado es cinco");
		}else if (numero==3) {
			System.out.println("El número de la cara opuesta al resultado es cuatro");
		}else if (numero==4) {
			System.out.println("El número de la cara opuesta al resultado es tres");
		}else if (numero==5) {
			System.out.println("El número de la cara opuesta al resultado es dos");
		}else if (numero==6) {
			System.out.println("El número de la cara opuesta al resultado es uno");
		}
		
		
		
		
		
	}
	
	}
