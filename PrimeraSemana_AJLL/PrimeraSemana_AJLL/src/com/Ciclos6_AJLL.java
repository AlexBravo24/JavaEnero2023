package com;


/* 
 * ALEX JAIR LOZA LOPEZ
 * 11/01/2023
 */

//6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. Cual será la cantidad 
//de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.




public class Ciclos6_AJLL {

	public static void main(String[] args) {
		
		int in = 1000;
		double fin = in;
		
		
		for(int i=1; i<=12; i++) {
			
			fin = fin * 1.02;
		}
		
		System.out.print("Con una inversion incial de 1000, con un interes mensual del 2%, despues de 1 año tendras: $");
		System.out.printf("%.2f", fin);
	}

}
