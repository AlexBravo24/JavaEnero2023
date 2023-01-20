package com;

public class Principal {

	public static void main(String[] args) {
		
//		RAM ram = new RAM ("XPG",16,3200,"DDR3");
//		Almacenamiento disco = new Almacenamiento("Seagate","HDD",2.5,"SATA 3", 3200);
//		Procesador cpu = new Procesador("AMD","Ryzen 3400G",4,8,3.7 );
//		Laptop lap = new Laptop("Asus","Armada", 12500,"Negro", ram, disco, cpu);
//		
//		System.out.println(lap);
		
		//CUERPO HUMANO
		
		SistemaD sistemad = new SistemaD ("Estómago","Esófago","Intestinos");
		SistemaN sisteman = new SistemaN ("Cerebro", "Cerebelo","Médula Espinal");
		SistemaR sistemar = new SistemaR ("Pulmones","Nariz","Boca");
		CuerpoH cuerpoh = new CuerpoH (1.75,80.2,"Delgada",sistemad,sisteman,sistemar);
		
		System.out.println(cuerpoh);

	}

}
