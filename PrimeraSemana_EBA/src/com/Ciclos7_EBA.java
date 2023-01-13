package com;

public class Ciclos7_EBA {

	public static void main(String[] args) {
		double invercion = 700;
		int meses = 0;
		while (invercion <= 1500){
			invercion = (invercion + (invercion *.02)) ;
			meses++;
		}
		System.out.println("el total de su invecion en 12 meses es: " + meses);

	}

}
