package Tareaif;

import java.util.Scanner;

public class Problema13 {

	public static void main(String[] args) {
		
		double donativo,salud,comedor,resto; 
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingrese donativo a dar:");
		donativo = scanner.nextInt();
		
		if (donativo < 10000){
			
			salud = donativo * 0.25;
			comedor = donativo * 0.60;
			resto = donativo * 0.15;
			
			System.out.println(" Centro de salud: " + salud +"\n Comedor de niños: " + comedor + "\n Invertir en la bolsa: "+ resto);
			
		}else if(donativo >= 10000) {
			
			salud = donativo * 0.30;
			comedor = donativo * 0.50;
			resto = donativo * 0.20;
			
			System.out.println(" Centro de salud: " + salud +"\n Comedor de niños: " + comedor + "\n Invertir en la bolsa: "+ resto);
			
		}
		
		

	}

}
