package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//HASHMAP
		// Un Hashmap es la implementación de la interface MAP, esta interface es un tipo de collection que almacena datos
		//asociando una llave a un valor, esta interface sirve para muchas cosas y tiene ciertas características que la definen
		//por ejemplo, no permite key duplicados, cada key tiene que estar asociado a un valor como máximo, si agregas un key 
		//que ya existe sobrescribe el valor de la key anterior, solo permite ObjectType lo que quiere decir que no puede poner un valor primitivo.
		
		
		//FORMAS DE DECLARAR UN HASHMAP
		HashMap<String, Integer> hashMapEdad = new HashMap<String, Integer>();
		
		
		
		
		//Añadiendo valores al hashmap
		
		hashMapEdad.put("Pedro", 21);
	}

}
