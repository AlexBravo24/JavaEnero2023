package com;

public class Arrays5_AYMP {

	public static void main(String[] args) {
		String [] array = {"jabon","shampoo","mayonesa","carne","cepillo"};
		float [] array2 = {17,60,75,120,15};
		int j=1;
		
		for(int i=0;i<5;i++) {
			System.out.println("Producto "+j+": "+array[i]+", su precio es= $"+array2[i]);
			j++;
		}
	}
}
