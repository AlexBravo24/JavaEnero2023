package com;


/* 
 * ALEX JAIR LOZA LOPEZ
 * 11/01/2023
 */
//7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual. En cuantos meses tendrá 
//mas de $1500, si reinvierte cada mes todo su dinero?.

public class Ciclos7_AJLL {

	public static void main(String[] args) {
		
		int in = 700;
		double fin = in;
		int contador=1;
		
		
		while(fin<1500){
			fin = fin * 1.02;
			contador++;
		}
			
			
		
		
		System.out.print("Con una inversion incial de 700, con un interes mensual del 2%, despues de " + contador + " meses tendras: $");
		System.out.printf("%.2f", fin);
		

	}

}
