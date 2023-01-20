package com;

import java.util.HashMap;

public class PrincipalMaquina {

	public static void main(String[] args) {
		
		HashMap <String, Producto> productos =new HashMap<String, Producto>();
		productos.put("Donas", new Producto(25412,18,22,"solido"));
		
		Maquina maquina1= new Maquina("zona centro",productos);
		System.out.println(maquina1.buscarProducto("Donas"));
		
		System.out.println(maquina1.comprar("Donas", 20));
		

	}

}
