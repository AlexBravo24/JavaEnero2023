package com;

import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
		
	//Vector - definicion de la clase vector
		//Un vector es similar a un array, la diferencia estriba en que un vector crece automáticamente cuando 
		//alcanza la dimensión inicial máxima. Además, proporciona métodos adicionales para añadir, 
		//eliminar elementos, e insertar elementos entre otros dos existentes.
		
	//Formas de declarar un vector
		Vector<String> colores=new Vector<String>(20, 5); //dentro de <> se especifica el tipo de dato que va a 
		//guardar, dentro de los () se especifica el tamaño del vector y cuanto va a incrementar el vector
		//si excede esa dimension inicial.
		
		
	//Como se añaden valores en un vector
		//para añadir valores a continuacion del ultimo elemento agregado
		colores.addElement("rojo");
		colores.addElement("azul");
		colores.addElement("verde");
		colores.addElement("morado");
		System.out.println(colores);
		//para insertar un elemento en determinada posicion
		colores.insertElementAt("amarillo", 3);
		System.out.println(colores);
		
		
	//Como ver elementos/eliminar elementos en un vector
		System.out.println(colores.elementAt(2)); //para ver un elemento en concreto
		
		for(int i=0; i<colores.size(); i++){ //para ver todos los elementos en forma de lista
            System.out.print(colores.elementAt(i)+"\n");
        }
		
		//Para eliminar un elemento 
		colores.removeElementAt(3);
		System.out.println(colores);
		//Tambien podemos eliminar un elemento segun su contenido
		colores.removeElement("rojo");
		System.out.println(colores);
		//Para eliminar todos los elementos de un vector se usa
		colores.removeAllElements();
		System.out.println(colores + "...");

	}

}
