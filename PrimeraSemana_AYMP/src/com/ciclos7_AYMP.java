package com;

public class ciclos7_AYMP {

	public static void main(String[] args) {
		float inversion =700;
		float porcentaje = 0.02f;
		float ganancia;
		int meses=0;
		while(inversion<1500) {
			ganancia= (inversion * porcentaje)+inversion;
			inversion=ganancia;
			meses++;
		}System.out.printf("Ganancia total despues de "+meses+" meses es $"+inversion);

	}

}
