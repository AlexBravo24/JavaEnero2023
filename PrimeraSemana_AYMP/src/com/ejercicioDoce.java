package com;

import java.util.Scanner;

public class ejercicioDoce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float peso,IMC, estatura;
		System.out.print("Ingrese su peso en kilos: ");
		Scanner entrada1= new Scanner(System.in);
		peso= entrada1.nextFloat();
		System.out.print("Ingrese su estatura en metros: ");
		Scanner entrada2= new Scanner(System.in);
		estatura= entrada2.nextFloat();
		
		IMC= peso /(estatura*estatura);
		if(IMC < 16) {
			System.out.println("Su IMC es de: %.2f"+IMC+" :CRITERIO DE INGRESO AL HOSPITAL");
		}else if(IMC >= 16 && IMC<17) {
			System.out.println("Su IMC es de: %.2f"+IMC+" :INFRAPESO");
		}else if(IMC >= 17 && IMC<18) {
			System.out.println("Su IMC es de: %.2f"+IMC+" :BAJO PESO");
		}else if(IMC >= 18 && IMC<25) {
			System.out.println("Su IMC es de: %.2f"+IMC+" :PESO NORMAL (SALUDABLE)");
		}else if(IMC >= 25 && IMC<30) {
			System.out.println("Su IMC es de: %.2f"+IMC+" :SOBREPESO");
		}else if(IMC >= 30 && IMC<35) {
			System.out.println("Su IMC es de: %.2f"+IMC+" :SOBREPESO CRONICO (OBESIDAD GRADO II)");
		}else if(IMC >= 35 && IMC<40) {
			System.out.println("Su IMC es de: %.2f"+IMC+" :OBESIDAD PREMÓRBIDA (OBESIDAD GRADO III)");
		}else if(IMC >40) {
			System.out.println("Su IMC es de: %.2f"+IMC+" :SOBREPESO CRONICO (OBESIDAD GRADO IV)");
		}
		

	}

}
