package com;

import java.util.Scanner;

public class Ejercicio11 {
//	11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
//	Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
//	la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:

	public static void main(String[] args) {
		int peso;
		int desti;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Zonas de envío");
		System.out.println("Ingrese 1 si su envío es con destino a América del norte ");
		System.out.println("Ingrese 2 si su envío es con destino a América Central");
		System.out.println("Ingrese 3 si su envío es con destino a América del Sur");
		System.out.println("Ingrese 4 si su envío es con destino a Europa");
		System.out.println("Ingrese 5 si su envío es con destino al continente Asiático");
		desti = scanner.nextInt();
		System.out.println("Ingrese el peso de su paquete en KG");
		peso = scanner.nextInt();
		 if (peso > 5) {
			 System.out.println("Su pedido no puede llevarse acabo ya que excede el límite de peso permitido");
		 }
			 else {
		switch (desti) {
		
		case 1: 
			System.out.println("Su envío tendrá un costo de \t$" + peso*24);
			break;
		case 2:
			System.out.println("Su envío tendra un costo de \t$" + peso*20);
			break;
		case 3: 
			System.out.println("Su envío tendrá un costo de \t$" +peso*21);
			break;
		case 4:
			System.out.println("Su envío tendrá un costo de \t$" + peso*10);
			break;
		case 5:
			System.out.println("Su envío tendrá un costo de \t$"+ peso*18);
			break;
		}
		
		 }
		
		 }
		 	}
	

