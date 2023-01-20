package com;

import java.util.Vector;

public class Principal {

	public static void main(String[] args) {

		// Vector --> Una estructura de datos que permite almacenar un CONJUNTO 
		// de datos del MISMO tipo
		
		//Crear vector
		
		 Vector vec=new Vector();
	     vec.addElement("Emmanuel");
	     vec.addElement("Pedro");
	     vec.addElement("Juan");
	     vec.addElement("Andres");
	     vec.addElement("Paco");

	     //Insertar Elemento 
	     vec.insertElementAt("Panfilo",2);
	     vec.insertElementAt("Anastacio",0);
	     vec.insertElementAt("Emmanuel",5);
	     System.out.println(vec);
	     
	     //Tamaño del Vector
	     System.out.println(vec.size());
	     
	     //Capacidad 
	     System.out.println(vec.capacity());
	     
	     //Acceso a elementos
	     System.out.println(vec.elementAt(3));
	     
	     //Comprueba si existe elemento
	     System.out.println(vec.contains("Panfilo"));
	     
	     //Si esta vacio
	     System.out.println(vec.isEmpty()); 
	     
	     //Eliminar por contenido -- Borra la primer coincidencia
	     vec.removeElement("Emmanuel");
	     System.out.println(vec);
	     
	     //Eliminar por Indice
	     vec.remove(3);
	     System.out.println(vec);
	     
	     //Eliminar Todo
	     vec.removeAllElements();
	     System.out.println(vec);

	       

	}

}
