package com;

import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
		
		//Vector - Un vector es una estructura de datos que permite almacenar 
		//un CONJUNTO de datos del MISMO tipo.
		
	//Formas de declarar un vector
		//Tenemos un vector con una dimensión inicial de 20 elementos
		//Si rebasamos dicha dimensión y guardamos 21 elementos, la dimensión crece a 25
		
		Vector v1 = new Vector (20,5);
		
		//Si se rebasa la dimensión inicial guardando 21 elementos, la dimensión del valor se duplica
		Vector v2 = new Vector (21);
		
		//Con el tercer constructor, se crea un vector cuya dimensión inicial es 10
		Vector v3 = new Vector();
		
		
		
	//Como se añaden valores
		//Hay dos formas de añadir elementos a un Vecotr
		//Podemos añadir un elemento a continuación del último elemento del vector,
		//mediante la función miembro addElement
		
		v1.addElement("uno");
		v1.addElement("tres");
		v1.addElement("cuatro");
		v1.addElement("cinco");
		
		//Para añadir un elemento en una posición específica del vector
		
		v1.insertElementAt("hola", 0);
		
		//Para saber cuantos elementos tiene un vector
		System.out.println("Número de elementos: " + v1.size());
		
		//Para saber la capacidad de un vector
		System.out.println("Dimensión: " + v3.capacity());
	
		//Como ver elementos/eliminar en un vector
		
		v1.removeElement("tres");
		
		//también podemos eliminar dicho elemento si especificamos su índice
		
		v1.removeElement(4);
		
		
		
	}
}
