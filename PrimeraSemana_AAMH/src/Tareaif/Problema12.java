package Tareaif;

import java.util.Scanner;

public class Problema12 {

	public static void main(String[] args) {
		
		double peso,altura,imc;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("INDICE DE MASA CORPORAL"
				+ "\n Introduce peso (kg):");
		peso = scanner.nextDouble();
		
		System.out.println(" Introduce altura (m):");
		altura = scanner.nextDouble();
		
		imc = peso/(altura*altura);
		
		if(imc < 16) {
			System.out.println("Tiene criterio de ingreso en hospital");
		}else if(imc < 17) {
			System.out.println("Tiene infrapeso");
		}else if(imc < 18) {
			System.out.println("Tiene bajo peso");
		}else if(imc < 26) {
			System.out.println("Tiene peso normal (saludable)");
		}else if(imc < 30) {
			System.out.println("Tiene sobrepeso (obesidad de grado I)");
		}else if(imc < 35) {
			System.out.println("Tiene sobrepeso crónico (obesidad de grado II)");
		}else if(imc > 40) {
			System.out.println("Tiene obesidad premórbida (obesidad de grado III)");
		}else {
			System.out.println("Usted tiene obesidad morbida o de grado IV");
		}
		
  		
		
	}

}
