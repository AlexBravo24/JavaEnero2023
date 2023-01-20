package com;

public class Principal {

	public static void main(String[] args) {
		
		
//		RAM ram = new RAM (" Adata", " DDR4" , 8 , 2166 );		
//		Almacenamiento disco = new Almacenamiento(" SSD", " Kingston" ," SATA 3", 2.5, 480);		
//		Procesador cpu = new Procesador("Intel","i9",24,48,6.00);
//		
//		Laptop lap = new Laptop(" Azus", " TUF 15.6 "," plata",40000, ram, disco, cpu);
//		
//		System.out.println(lap);
		
		
		Llanta llant = new Llanta(" Michelin" , " Sport" , 15 , 250);
		Motor mot = new Motor(" Ford" , " EcoBoost", " Gasolina" , 6 , 140 , " 1L" );
		
		Auto auto = new Auto(" Ford" , " Escape " , 58, llant, mot);
		
		System.out.print(auto);

	}

}
