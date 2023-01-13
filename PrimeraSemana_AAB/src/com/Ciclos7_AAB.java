package com;

public class Ciclos7_AAB {

	public static void main(String[] args) {
		
		int meses = 1;
		double inversion = 700;
		
		while (inversion <= 1500) {
			inversion = inversion * 1.02;
			meses++;
		}
		System.out.println("Deberán pasar: " + meses + " meses para que consiga una inversion mayor a $1500.");
	}
}
