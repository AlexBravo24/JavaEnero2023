package com;


/* 
 * ALEX JAIR LOZA LOPEZ
 * 11/01/2023
 */

//6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s mensual. Cual ser� la cantidad 
//de dinero que esta persona tendr� al cabo de un a�o si todo el dinero lo reinvierte?.




public class Ciclos6_AJLL {

	public static void main(String[] args) {
		
		int in = 1000;
		double fin = in;
		
		
		for(int i=1; i<=12; i++) {
			
			fin = fin * 1.02;
		}
		
		System.out.print("Con una inversion incial de 1000, con un interes mensual del 2%, despues de 1 a�o tendras: $");
		System.out.printf("%.2f", fin);
	}

}
