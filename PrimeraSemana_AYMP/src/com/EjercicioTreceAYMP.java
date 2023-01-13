package com;

import java.util.Scanner;

public class EjercicioTreceAYMP {

	public static void main(String[] args) {
		int ingreso;
		float cs=0,cn=0,inv=0;
		System.out.print("Ingrese el monto de la donación recibida: ");
		Scanner entrada= new Scanner(System.in);
		ingreso= entrada.nextInt();
		
		if(ingreso>=10000) {
			cs =ingreso * 0.3f;
			cn =ingreso * 0.5f;
			inv =ingreso *0.2f;
		}else if(ingreso<10000) {
			cs =ingreso * 0.3f;
			cn =ingreso * 0.5f;
			inv =ingreso *0.2f;
		}else {System.out.println("Ingrese un monto correcto");
		}
		System.out.println("El monto destinado al Centro de salud es: $"+cs);
		System.out.println("El monto destinado al Comedor de niños es: $"+cn);
		System.out.println("El monto destinado a Inversion es: $"+inv);

			
			
	}

}
