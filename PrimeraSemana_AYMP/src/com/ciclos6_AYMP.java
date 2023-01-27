package com;

public class ciclos6_AYMP {

	public static void main(String[] args) {
		float inversion =1000;
		float porcentaje = 0.02f;
		float ganancia;
		int i=0;
		while(i<12) {
			ganancia= (inversion * porcentaje)+inversion;
			inversion=ganancia;
			i++;
		}System.out.printf("Ganancia total despues de 1 año: $ "+inversion);
		
	}
}
