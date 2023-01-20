package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {

		HashMap<String, Producto> productos = new HashMap<String, Producto>();
		
		productos.put("A1", new Producto("001", "Sabritas",18.0));
		productos.put("A2", new Producto("002", "Galletas Marias",13.0));
		productos.put("B1", new Producto("003", "Gomitas",8.0));
		productos.put("B2", new Producto("004", "Mazapan",5.0));
		
		//Instanciando Maquina(Pantalla)
		Pantalla pantalla1 = new Pantalla(productos);
		
		//Consultando info de poductos
		System.out.println(pantalla1.buscarProducto("A1"));
		
		//Consusltar producto que no existe
		//System.out.println(pantalla1.buscarProducto("A10"));

		//Consusltar ingresar monedas
		//System.out.println(pantalla1.ingresarMonedas("B1", 10));
		//System.out.println(pantalla1.ingresarMonedas("B1", 15));
		
		//Consultar Despachar Productos
		System.out.println(pantalla1.despacharProducto("A1", 19.5));
		
	}

}
