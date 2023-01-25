package com;

public class Principal {
	
	public static void main(String[] args) {
		
//		RAM ram = new RAM("Adata",8,2166,"DDR4");
//		Almacenamiento disco = new Almacenamiento("Kingstone","SSD","2.5",480,"SATA");
//		Proccesador cpu = new Proccesador("AMD","Ryzen 5 5600H",8,16,3.3);
//		
//		Laptop lap = new Laptop("Huawei","Matepad 15", 25000, "Spacial Gray", ram, disco,cpu );
//		
//		System.out.println(lap);
		
		Combustible gas = new Combustible("Gasolina","92 octanos", 40);
		Llantas neumaticos = new Llantas("Michelin",16,"235/75","Acero");
		Exterior carroceria = new Exterior ("Blanco",2,"Pick Up", 3.5,2);
		Vehiculo camioneta = new Vehiculo("Toyota","Hilux", 2016, 256000, gas, carroceria, neumaticos);
		
		System.out.println(camioneta);
		
		
	}

}
