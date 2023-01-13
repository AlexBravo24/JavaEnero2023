package com;

import java.util.Scanner;

public class Condicionales12_EBA {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in); 
		
		System.out.println("Introduce tu altura tu peso: " );
		double peso = leer.nextDouble();
		System.out.println("Introdice tu altura en metros: ");
		double altura = leer.nextDouble();
		
		double imc =( peso /(altura*altura));
		
		if (imc < 16) {
			System.out.println("Criterio de ingreso al hospital");
		}
		else if (imc > 16 && imc <17) {
			System.out.println("Infra peso");
		}
		else if (imc > 17 && imc <18) {
			System.out.println("bajo peso");
		}
		else if (imc >= 18 && imc <25) {
			System.out.println("Peso normal (Saludable)");
		}
		else if (imc >= 25 && imc <30) {
			System.out.println("Sobre peso (Obesidad grado I)");
		}
		else if (imc >= 30 && imc <35) {
			System.out.println("Sobrepeso crónico (Obesidad grado II)");
		}
		else if (imc >= 35 && imc < 40) {
			System.out.println("Obesidad premorbida (Obesidad grado III)");
		}
		else if (imc >40) {
			System.out.println("Obesidad mórbida (Obesidad grado IV)");
		}

	}

}
