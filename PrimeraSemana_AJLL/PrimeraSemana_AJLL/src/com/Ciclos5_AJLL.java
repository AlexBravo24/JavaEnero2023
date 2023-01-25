package com;


/* 
 * ALEX JAIR LOZA LOPEZ
 * 11/01/2023
 */
//Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un día desde las 00:00:00 
//horas hasta las 23:59:59 horas


public class Ciclos5_AJLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int x=0; x<=23; x++) {
			for(int y=0; y<=59 ; y++) {
				for(int z=0; z<=59; z++) {
					System.out.println("La hora es: " + x + ":" + y + ":" + z );
				}
			}
		}
		

	}

}
