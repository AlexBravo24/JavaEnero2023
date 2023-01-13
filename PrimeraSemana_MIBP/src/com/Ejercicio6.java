package com;

import java.util.Scanner;

public class Ejercicio6 {
//	//  La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
//	//clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
//	es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
//	entrega en un embarque considerando lo siguiente:
//	* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
//	es de tamaño 2.
//	* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
//	tamaño 2.
//	Precio inicial se recibe desde teclado
	

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		int kg;
		double precioi;
		String tipo;
		int tamaño;
		
		System.out.println("Introduce los KG de producto");
		kg = scanner.nextInt();
		System.out.println("Introduce el precio inicial");
		precioi = scanner.nextDouble();
		System.out.println("Introduce el tipo de Uva A o B");
		tipo = scanner.next (); scanner.nextLine();
		System.out.println("Introduce el tamaño de la uva 1 o 2");
		tamaño = scanner.nextInt();
		
		 if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
			        (tamaño == 1 || tamaño == 2))) {
			      System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
			    } else {
			      if (tipo.toUpperCase().equals("A") && tamaño == 1) {
			        System.out.println("La ganancia final es de: " + ((kg * precioi)+(kg*0.20)));
			      } else if (tipo.toUpperCase().equals("A") && tamaño == 2) {
			        System.out.println("La ganancia final es de: " + ((kg*precioi)+(kg*0.30)));
			      } else if (tipo.toUpperCase().equals("B") && tamaño == 1) {
			        System.out.println("La ganancia final es de: " + ((kg * precioi)-(kg*0.30)));
			      } else if (tipo.toUpperCase().equals("B") && tamaño == 2) {
			        System.out.println("La ganancia final es de: " + ((kg*precioi)-(kg*0.50)));
			      }
			    }
		
		
		
		
		
		
		

	}

}
