package com;

public class Ejercicio5_Arrays {
public static void main(String[] args) {
	
		String [] productos = {"Arroz","Frijoles","Maíz","Carne","Pollo"};
		int [] precios = {30,35,40,45,50};
		
		for (int i=0; i<productos.length; i++) {
			System.out.println("El producto " + productos[i] + " tiene un precio de " + precios[i]);
		}
	
}
}
