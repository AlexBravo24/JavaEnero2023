package com;

public class Principal {

	public static void main(String[] args) {
		
//		RAM ram = new RAM("Adata", 8, 2166, "DDR4");
//		Almacenamiento disco = new Almacenamiento("Kingstone", "SSD", 2.5, 480, "SATA 3");
//		Procesador cpu = new Procesador("AMD", "Ryzen 5", 6, 12, 3.3);
//		
//		Laptop lap = new Laptop("Huawei", "Series 16", 16000, "Gris", ram, disco, cpu);
//
//		System.out.println(lap);
		
		Pantalla pantalla = new Pantalla(6.1, "1792 x 828", 326);
		AlmacenamientoyProcesador specs = new AlmacenamientoyProcesador("Apple A13 Bionic", 6, 2.4, 4, 64);
		Camara camara = new Camara(24, "si", 12);
		
		Celular cel = new Celular("Apple", "Iphone 11", "iOS 13", 3110, pantalla, camara, specs);
		
		System.out.println(cel);
	}

}
