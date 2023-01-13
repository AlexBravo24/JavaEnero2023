package Problemario;

import java.util.Scanner;

public class Condicionales14_ESC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	     
	     int horastrab,
	     	 total,
	     	 hrsex;
	     

	     System.out.println("Ingrese el número de horas trabajadas: ");
	     horastrab=entrada.nextInt();
	     

	     if(horastrab <= 40){
	         total= horastrab*16;
	         System.out.println("Su sueldo es de $ "+total);
	     }else{
	         hrsex=horastrab-40;
	         total=(hrsex*20)+(40*16);
	         System.out.println("Su sueldo es de $ "+ total);
	     }

	}

}
