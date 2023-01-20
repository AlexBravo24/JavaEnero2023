package com;

public interface MetodosMaquina {
	
	public Producto buscarProducto(String nombreProducto);//identificamos el producto por id
	public Ticket comprar(String nombreProducto, double monto);//identificamos producto y monto a pagar
	//public Ticket pagarDepositar(String nombreProducto, double precio);//identificamos producto y pagamos

}
