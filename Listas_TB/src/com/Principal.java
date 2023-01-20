package com;

import java.util.*;

public class Principal {
    public static void main(String args[]) {
    /*
     * Las listas permiten colecciones ordenadas. Contiene métodos basados
     * en índices para insertar, actualizar, eliminar y buscar elementos.
     * Puede tener elementos duplicados. 
     * Podemos almacenar elementos null en la lista.
     * Al igual que un array, primer indice es 0
     */
    //Creando una lista
    List<String> l = new ArrayList<String>();

    //Añadiendo valores
    l.add("Comida");
    l.add("Estudio");
    l.add("Bacteria");
    l.add("Auxilio");
    
    //Imprimiendo lista
    System.out.println("Palabras: "+l);
    l.forEach(contador -> System.out.println(contador));
    System.out.println();
    
    //Obteniendo elemento    
    System.out.println("Dato devuelto: "+l.get(1));
    //Cambiando elemento
    l.set(1,"Balon");  
    System.out.println("Dato devuelto: "+l.get(1));
    System.out.println();
    //Borrando elemento
    l.remove(3);//x index
    l.removeIf(s -> s.equalsIgnoreCase("comida")); //x valor
    System.out.println("Palabras: "+l);
    System.out.println();
    
    //Ordenando lista Collections.sort(l,Collections.reverseOrder()) orden inverso
    l.add("Joroba");
    l.add("Llama");
    l.add("Helio");
    l.add("Helio");
    Collections.sort(l);    
    System.out.println("Palabras: "+l);
    System.out.println("Tamaño lista: "+l.size());
    }
    
    
}
