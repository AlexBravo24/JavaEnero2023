package com;

public class Ciclos6_AAB {

	public static void main(String[] args) {
		
		double inversion = 1000;
		
		for (int i = 1; i <= 12; i++) {
			inversion = inversion * 1.02;
		}
		System.out.println("La inversión al cabo de un año será de: $" + inversion);

	}

}
