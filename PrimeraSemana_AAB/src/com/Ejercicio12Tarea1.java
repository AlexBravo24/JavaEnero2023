package com;

import java.util.Scanner;

public class Ejercicio12Tarea1 {

	public static void main(String[] args) {
		
		double altura;
		double peso;
		double imc;
		
		System.out.println("Escriba su peso en kilos: ");
		Scanner entrada1 = new Scanner(System.in);
		peso = entrada1.nextDouble();
		
		System.out.println("Escriba su estatura en metros: ");
		Scanner entrada2 = new Scanner(System.in);
		altura = entrada2.nextDouble();
		
		imc = peso / Math.pow(altura,2);

		System.out.println("Su IMC es de: " + imc);
		
		if (imc < 16) {
			System.out.println("Se encuentra en criterio de ingreso a hospital");
		} else if ((imc >= 16) && (imc < 17)){
			System.out.println("Se encuentra en rango de infrapeso");
		} else if ((imc >= 17) && (imc < 18)){
			System.out.println("Se encuentra en rango bajo de peso");
		} else if ((imc >= 18) && (imc < 25)){
			System.out.println("Se encuentra en rango de peso normal (saludable)");
		} else if ((imc >= 25) && (imc < 30)){
			System.out.println("Se encuentra en rango de sobrepeso (obesidad de grado I)");
		} else if ((imc >= 30) && (imc < 35)){
			System.out.println("Se encuentra en rango de sobrepeso crónico (obesidad de grado II)");
		} else if ((imc >= 35) && (imc < 40)){
			System.out.println("Se encuentra en rango de obesidad premórbida (obesidad de grado III)");
		} else if (imc > 40){
			System.out.println("Se encuentra en rango de obesidad mórbida (obesidad de grado IV)");
		}

	}

}
