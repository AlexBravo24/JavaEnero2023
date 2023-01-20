package com;

public class Principal {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
   
    RAM ram = new RAM("Adata",8,2166,"DDR4"); 
    Almacenamiento disco = new Almacenamiento("Kingston","SSD",2.5,480, "SATA 3"); 
    Procesador cpu = new Procesador ("Intel","i7",8,16,4.9); 
    Laptop lap = new Laptop("HP", "ProBook 440g7", 25000, "Azul", ram, disco, cpu); 

    System.out.println(lap);
    }
}
