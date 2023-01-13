package com;

import java.util.Scanner;

public class ejercicioCinco {

	public static void main(String[] args) {
		int nota, edad;
		String sexo;
		System.out.println("Ingrese los datos de su solicitud");
		System.out.print("Ingrese su edad: ");
		Scanner entradaEdad= new Scanner(System.in);
		edad = entradaEdad.nextInt();
		
		System.out.print("Ingrese su nota: ");
		Scanner entradaNota= new Scanner(System.in);
		nota = entradaNota.nextInt();
		
		System.out.print("Ingrese su sexo: ");
		Scanner entradaSexo= new Scanner(System.in);
		sexo = entradaEdad.next();
		
		if(edad >= 18 && nota>=5 && sexo.equalsIgnoreCase("masculino")) {
			System.out.print("solicitud aceptada");
		}else if(edad >= 18 && nota>=5 && sexo.equalsIgnoreCase("femenino")){
			System.out.print("solicitud aceptada");
		}else {
			System.out.print("solicitud rechazada");
		}
	}

}
