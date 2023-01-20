package com;

import java.util.Date;
import java.util.HashMap;

public class Maquina implements MetodosMaquina {
	
	private String sucursal;
	private int folio=0;
	
	//vamos a encontrar los productos por su id y su nombre
	
	private HashMap <String, Producto> productos;  //relacionar producto con el nombre del producto
	
	public Maquina() {
		
	}

	public Maquina(String sucursal, HashMap<String, Producto> productos) {
		super();
		this.sucursal = sucursal;
		this.productos = productos;
	}

	@Override
	public Producto buscarProducto(String nombreProducto) {
		Producto producto = null;
		
		for (String i : this.productos.keySet()) {//iteramos sobre las llaves
			if(i.equals(nombreProducto)) {  //si el nombre que utilizamos es igual a la llave
				producto=this.productos.get(i);//lo guarda en una instancia del objeto producto
				break;//rompe con la iteración cuando encuentra el valor
			}
		}
		return producto;
	}

	@Override
	public Ticket comprar(String nombreProducto, double monto) {
		Ticket ticket=new Ticket();//instanciamos un ticket vacio
		double faltante,cambio;
		if(this.buscarProducto(nombreProducto) != null) {//si el metodo de cuenta se realiza
			Producto producto=this.buscarProducto(nombreProducto);//pasamos el valor a una variable cuenta
			if(producto.getInventario() == 0) {//condicionando si la opracion excede el limite diario en cajeros
				System.out.println("El producto no está disponible en inventario");
				return ticket;
			}else if(producto.getCosto() > monto) {
				faltante =producto.getCosto() - monto;
				System.out.println("Monto ingresado insuficiente, faltan $"+faltante);
				return ticket;
			}else if(producto.getCosto() < monto) {
				//cambio = monto - producto.getCosto();
				ticket.setPago(monto);
				ticket.setCambio(monto - producto.getCosto());
				System.out.println("Despachando producto...\n Su cambio es $"+ticket.getCambio());
				ticket = new Ticket(folio++, new Date(), producto.getNip(),ticket.getPago(), ticket.getCambio(), this.sucursal, 1);
				return ticket;
			}else if(producto.getCosto() == monto) { 
				System.out.println("Despachando producto...\n Su cambio es $0.00");
				return ticket;
			}
		
		}else {
			System.out.println("No se tiene ese producto");
			return ticket;
		}return ticket;
	}

	

	
	
	

}
