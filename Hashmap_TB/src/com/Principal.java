package com;
import java.util.HashMap;
//import java.util.Map;

public class Principal {

    public static void main(String[] args) {
	
	//Declarando Hashmap
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	//Insertando valores
	hm.put(100,"Ana");  
	hm.put(101,"Jose");    
	hm.put(102,"Raul");
	
	//Crea un nuevo hashmap, y mando a traer los datos 
	//del hashmap anterior al nuevo (si los datos nuevos
	//comparten key con los del origen los reemplazaran)
	HashMap<Integer,String> map=new HashMap<Integer,String>();  
	map.put(100,"Abi"); //Este se reemplazara
	map.put(103,"Javier");  
	map.putAll(hm);  //Con esta linea llamo el hashmap anterior la nuevo
	
	//Imprimir hashmap con ciclo
	map.entrySet().forEach(entry -> {System.out.println(entry.getKey() + " " + entry.getValue());});
	//No esta mal pero arroja una advertencia
//	for(Map.Entry m:map.entrySet())
//	{
//	    System.out.println(m.getKey()+" "+m.getValue());    
//	}
	
	//Borrado basado en la llave
	map.remove(100);  
	System.out.println("Hashmap actualizado: "+map);  
	
	//Borrado basado en el valor  
	map.values().remove("Jose");  
	System.out.println("Hashmap actualizado: "+map);  
	
	//Borrado basado en la llave y el valor 
	map.remove(102, "Raul");  
	System.out.println("Hashmap actualizado: "+map); 
	
	//Insertara si la clave esta sin ocupar
	map.putIfAbsent(101, "Juan"); 
	
	//Impresion simple
	System.out.println("Hashmap actualizado: "+map);  
	System.out.println(map.get(101));  
    }

       
}
