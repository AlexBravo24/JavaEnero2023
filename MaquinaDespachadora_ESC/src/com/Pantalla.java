package com;


import java.util.HashMap;

public class Pantalla implements MetodosMaqDes{
	

	private HashMap<String, Producto> productos;
	
	public Pantalla() {
		
	}
	
	public Pantalla( HashMap<String, Producto> productos) {
				this.productos = productos;
	}




	@Override
	public Producto buscarProducto(String idProducto) {
		Producto producto = null; //Instanciando un objeto de producto
		
		//Buscar dentro de las llaves del hashMap
		for(String i:this.productos.keySet()) {
			if(i.equals(idProducto)) {
				producto=this.productos.get(i);
				break;
			}
		}
		
		return producto;
	}


	@Override
	public  Pantalla despacharProducto(String idProducto, double monedas) {
		double saldo;
		Pantalla pantalla= null; //Instanciando Pantalla Vacia
		
		if(this.buscarProducto(idProducto)!=null) {
			Producto producto=this.buscarProducto(idProducto);
			if(monedas<producto.getPrecio()) {
				System.out.println("Las " + producto.getNombreProducto() + " cuestan $" + producto.getPrecio() );
				System.out.println("Tu saldo actual: $" + monedas +" pesos");
				System.out.println("Ingresa mas monedas");
				return pantalla;
				
			}else {
				saldo = monedas-producto.getPrecio();
				System.out.println("Despachando: " +producto.getNombreProducto());
				System.out.println("Ingresaste: $" + monedas +" pesos");
				System.out.println("*** Toma Tu Cambio ***");
				System.out.println("Cambio: $" + saldo +" pesos");
				return pantalla;
			}
		
		}else {
			System.out.println("No existe el producto");
			return pantalla;
		}

	}
	
//	@Override
//	public Pantalla ingresarMonedas(String idProducto, double monedas ) {
//		Pantalla pantalla = null; //Instanciando Pantalla Vacia
//		if(this.buscarProducto(idProducto)!=null) {
//			Producto producto=this.buscarProducto(idProducto);
//			if(monedas<producto.getPrecio()) {
//				System.out.println("Dinero Insificiente");
//				return pantalla;
//			}else {
//				System.out.println("Saldo Suficiente para comprar " +producto.getNombreProducto());
//				return pantalla;
//			}
//		}else {
//			System.out.println("No existe ese Numero de Producto");
//			return pantalla;
//		}
//
//	}
	
	
	
	

}
