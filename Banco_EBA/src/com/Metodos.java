package com;

public interface Metodos {

	public Cuenta buscarCuenta(String nombreCliente); //Identificamos la cuenta por la llave o id (en este caso en el nombre del cliente)	
	public Ticket retirar(String nombreCliente , double monto);	//Identificamos la cuenta y el monto a retirar
	public Ticket depositar(String nombreCliente , double monto); //Identificamos la cuenta y el monto a depositar	
	public Ticket tranferir(String clienteOrigen, String clienteDestino, double monto);
	
}
