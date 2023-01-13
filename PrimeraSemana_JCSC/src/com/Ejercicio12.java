package com;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		float IMC;
		float peso;
		float altura;
		float altura2;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa tu peso en kg");
		peso = entrada.nextFloat();
		System.out.println("Ingresa tu altura en metros");
		altura = entrada.nextFloat();
		
		altura2 = altura*altura;
				
		IMC = (peso/altura2);
		System.out.println("Tu IMC es: " + IMC);
		
		if (IMC<=15) {
			System.out.println("Criterio de ingreso en hospital");
		}else if (IMC==16 || IMC==17 ) {
			System.out.println("Infrapeso");
		}else if (IMC==18) {
			System.out.println("Bajo peso");
		}else if (IMC>=19 && IMC<=25) {
			System.out.println("Peso normal (saludable)");
		}else if (IMC>=26 && IMC<=30) {
			System.out.println("Sobrepeso (Obesidad de grado I)");
		}else if (IMC>=31 && IMC<=35) {
			System.out.println("Sobrepeso crónico (Obesidad de grado II)");
		}else if (IMC>=36 && IMC<=40) {
			System.out.println("Obesidad premórbida (Obesidad de grado III)");
		}else if (IMC>=41) {
			System.out.println("Obesidad mórbida (Obesidad de grado IV)");
		}
		

	}

}
