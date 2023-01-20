package com;

import java.util.*;  

public class Principal {

    public static void main(String[] args) {
	
	/*
	 * Vector es como un array dinámico que puede crecer o reducir su tamaño. 
	 * A diferencia de la matriz, podemos almacenar n-número de elementos en ella, ya que no hay límite de tamaño. 
	 * Se recomienda utilizar la clase Vector sólo en la implementación thread-safe. 
	 * Si no necesitas usar la implementación thread-safe, deberías usar la ArrayList, ya que esta funcionará mejor en tal caso.
	 * Es similar al ArrayList, pero con dos diferencias-.

    		un Vector está sincronizado.
    		Java Vector contiene muchos métodos heredados que no son parte de un framework de colecciones.
	 */

	//Declarando vector  
        Vector<String> v = new Vector<String>();  
        //Añadiento elementos 
        v.add("Agua");  
        v.add("Refresco");      
        v.addElement("Jugo");  
        v.addElement("Licuado");
        
        
        //Imprimiendo vector
        System.out.println("Bebidas: "+v);
        System.out.println();
        v.forEach(contador -> System.out.println(contador)); 
        //Mostrar tamaño vector
        System.out.println("Tamaño vector: "+v.size());
        System.out.println();
        
        //borrar elemento
        v.remove(1);
        //Mostrar tamaño vector
        System.out.println("Bebidas: "+v);
        System.out.println("Tamaño vector: "+v.size());
        
        v.add("Coctel"); 
        v.add("Cerveza"); 
        System.out.println("Bebidas: "+v);
        System.out.println("Tamaño vector: "+v.size());
    }

}
