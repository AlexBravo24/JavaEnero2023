package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 10/01/2023
 */

//7. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
//clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
//es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
//entrega en un embarque considerando lo siguiente:
//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
//es de tamaño 2.
//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
//tamaño 2.
//Precio inicial se recibe desde teclado

public class Ejercicio6 {

	public static void main(String[] args) {
		
		String uva;
		int tamaño;
		double precio_final = 0;
		double precio_inicial;
		
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el precio inicial de la uva:");
		precio_inicial = entrada.nextDouble();
		
		Scanner tipo_uva = new Scanner(System.in);
		System.out.println("Introduce el tipo de uva (A, B):");
		uva = tipo_uva.nextLine();
		
		System.out.println("Introduce el tamaño de uva (1, 2):");
		tamaño = entrada.nextInt();
		
		
		
		if(uva.compareTo("A")==0) {
			if(tamaño==1) {
				precio_final=precio_inicial+.2;
			}else if(tamaño==2) {
				precio_final = precio_inicial + .3;
			}
		}else if(uva.compareTo("B")==0) {
			if(tamaño==1) {
				precio_final=precio_inicial -.3;
			}else if(tamaño==2) {
				precio_final = precio_inicial - .5;
			}	
		}else {
			System.out.println("ERROR Ingresa parametros reales");
		}
		if(precio_final != 0) {
			System.out.println("El precio final de la uva es: " + precio_final);
		}
		
	}

}
