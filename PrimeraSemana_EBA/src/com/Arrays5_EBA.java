package com;

public class Arrays5_EBA {

	public static void main(String[] args) {
		String [] productos = {"Leche", "Cereal", "Jugo", "Papas", "Cafe"};
		
		int [] precios = {25, 65, 28, 20, 100};
		
		int contador =0;
		for(int i = 0; i < productos.length ; i++) {
//			
			System.out.println(productos[contador] +"  $"+ precios[contador]);
			contador++;
		}
		
	}

}
