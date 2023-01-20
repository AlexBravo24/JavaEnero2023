package com;

import java.util.Vector;

public class PrincipalVector {
	
	public static void main(String[] args) {
		
		//vector _ definicón de la clase vector
		//un vector crece automáticamente cuando alcanza la dimensión inicial máxima
		//proporciona métodos para añadir, eliminar e insertar elementos
		
		
		//formas de declarar un vector
		Vector vector1 = new Vector(20);//si se rebasa la dimensión inicial el vector se duplica
		Vector vector2= new Vector(20,5);//vector con dimensión de 20, si se rebasa este crece 5 más, osea hasta 25
		Vector vector3 = new Vector();//dimensión de 10 por defecto
		
		
		//como se añaden valores en un vector
		
		vector3.addElement(1);
		vector3.addElement(2);
		vector3.addElement(3);
		vector3.addElement(4);
		vector3.addElement(5);
		vector3.insertElementAt("dos", 2); //añade String dos en la tercera posición del vector3
		
		System.out.println(vector3);
		
		//ejemplos breves de los métodos de las listas
		
		System.out.println("No. de elementos que tiene el vector: "+vector3.size());
		System.out.println("Capacidad del vector: "+vector3.capacity());
//		vector3.removeAllElements();//elimina todos los elemntos del vector
//		System.out.println(vector3);
		vector3.removeElement("dos");//elimina el elemento dos del vector3
		System.out.println(vector3);
		
		vector3.removeElementAt(0);//elimina el elemento que se encuentra en el indice 0 del vector
		System.out.println(vector3);
		
		//Acceso a los elementos de un vector
		
		
	}

}
