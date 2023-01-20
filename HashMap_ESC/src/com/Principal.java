package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//*********************************************************************
		//HashMap --> NOS PERMITE ALMACENAR PARES CLAVE - VALOR. DESIGNA CLAVES ÚNICAS, 
		//PARA LOS VALORES CORRESPONDIENTES QUE SE PUEDEN RECUPERAR EN CUALQUIER PUNTO DADO.
		//DATOS DESORNENADOS, SI HAY CLAVES DUPLICADAS, LA ULTIMA ANULARA LAS OTRAS.
		
		HashMap<Integer, String> Comidas = new HashMap<>();
		
	//***Agregar Elementos a HashMap***
		Comidas.put(1, "Milanesa");
		Comidas.put(2, "Enchiladas");
		Comidas.put(3, "Chilaquiles");
		Comidas.put(4, "Huevos con Jamón");
		
		System.out.println(Comidas);
		
	//***Numero de elementos***
		System.out.println(Comidas.size());
		
	//***Acceder a Elementos***
		System.out.println(Comidas.get(2));//Acceder al elemento 2
		
	//***Cambiar el valor de los elementos***
		Comidas.replace(4, "Huevos Revueltos");
		System.out.println(Comidas);
		
	//***Eliminar Elementos ***
		Comidas.remove(1);
		System.out.println(Comidas);
	
	//***Todas las claves ***
		System.out.println(Comidas.keySet());
		
	//***Todas los valores***
		System.out.println(Comidas.values());
	
	//***Si existe una clave especificada***
		System.out.println(Comidas.containsKey(2));
	
	//***Valor Especificado***
		System.out.println(Comidas.containsValue("Enchiladas"));
		
	//***Eliminar todos los elementos***
		Comidas.clear();
		System.out.println(Comidas);
	
	//***Tiene elementos***
		System.out.println(Comidas.isEmpty());
	
		
	

	}

}
