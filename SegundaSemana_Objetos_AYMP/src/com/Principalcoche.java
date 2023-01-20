package com;

public class Principalcoche {

	public static void main(String[] args) {
		Coche coche1 = new Coche();
		
		coche1.setMarca("Chevrolet");
		coche1.setColor("gris");
		
		Coche coche2 = new Coche("Audi","rojo","semi-hibrido",2022);
	
		System.out.println(coche1);
		System.out.println(coche2);
		
		
	}
	
	
	
	
	
	

}
