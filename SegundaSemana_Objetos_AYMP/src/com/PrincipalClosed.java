package com;

public class PrincipalClosed {

	public static void main(String[] args) {
		
		Closed closed1 = new Closed();
		
		closed1.setAltura(1);
		closed1.setAncho(1);
		closed1.setColor("cafe");
		
		Closed closed2= new Closed(1,1,25,"rojo","madera");
		
		System.out.println(closed1);
		System.out.println(closed2);
		
		
		
		
		
		
	}

}
