package com;

import java.util.*;  

public class Principal {

    public static void main(String[] args) {
	
	/*
	 * Vector es como un array din�mico que puede crecer o reducir su tama�o. 
	 * A diferencia de la matriz, podemos almacenar n-n�mero de elementos en ella, ya que no hay l�mite de tama�o. 
	 * Se recomienda utilizar la clase Vector s�lo en la implementaci�n thread-safe. 
	 * Si no necesitas usar la implementaci�n thread-safe, deber�as usar la ArrayList, ya que esta funcionar� mejor en tal caso.
	 * Es similar al ArrayList, pero con dos diferencias-.

    		un Vector est� sincronizado.
    		Java Vector contiene muchos m�todos heredados que no son parte de un framework de colecciones.
	 */

	//Declarando vector  
        Vector<String> v = new Vector<String>();  
        //A�adiento elementos 
        v.add("Agua");  
        v.add("Refresco");      
        v.addElement("Jugo");  
        v.addElement("Licuado");
        
        
        //Imprimiendo vector
        System.out.println("Bebidas: "+v);
        System.out.println();
        v.forEach(contador -> System.out.println(contador)); 
        //Mostrar tama�o vector
        System.out.println("Tama�o vector: "+v.size());
        System.out.println();
        
        //borrar elemento
        v.remove(1);
        //Mostrar tama�o vector
        System.out.println("Bebidas: "+v);
        System.out.println("Tama�o vector: "+v.size());
        
        v.add("Coctel"); 
        v.add("Cerveza"); 
        System.out.println("Bebidas: "+v);
        System.out.println("Tama�o vector: "+v.size());
    }

}
