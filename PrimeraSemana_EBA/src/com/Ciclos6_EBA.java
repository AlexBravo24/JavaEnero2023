package com;

public class Ciclos6_EBA {

	public static void main(String[] args) {
		double invercion = 1000;
		int meses = 1;
		while (meses <= 12){
			invercion = (invercion + (invercion *.02)) ;
			meses++;
		}
		System.out.println("el total de su invecion en 12 meses es: " +invercion);
	}
}
