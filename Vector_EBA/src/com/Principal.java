package com;

import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
		
		
		//Vector - 
		
		
	//Formas de declarar un Vector
		//Tenemos un vector con una dimensión inicial de 20 elementos. 
		//Si rebasamos dicha dimensión y guardamos 21 elementos la dimensión del vector crece a 25
		Vector v1 = new Vector(20, 5);
		
		//Si se rebasa la dimensión inicial guardando 21 elementos, la dimensión del vector se duplica.
		Vector v2 = new Vector(20);
		
		//Con el tercer constructor, se crea un vector cuya dimensión inicial es 10.
		Vector v3 = new Vector();
						
						
	//Añadiendo valores a un Vector
		//Hay dos formas de añadir elementos a un vector
		//Podemos añadir un elemento a continuación del último elemento del vector, mediante la función miembro addElement
		v1.addElement("uno");
		v1.addElement("tres");
		v1.addElement("cuatro");
		v1.addElement("cinco");
		
		// para añadir un elemento en una posicion especifica del vector
		v1.insertElementAt("hola",0);
		
		// para saber cuantos elementos tiene un vectos
        System.out.println("nº de elementos "+v1.size());
        // para saber la capacidad de un vector
        System.out.println("dimensión "+v3.capacity());
        
        //para eliminar un elemento
        v1.removeElement("tres");
        
        // tambien podemos eliminar dicho elemento, si especificamos su índice.
        v1.removeElementAt(4);

	}

}
