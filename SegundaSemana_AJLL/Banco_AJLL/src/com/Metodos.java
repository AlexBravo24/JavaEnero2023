package com;

public interface Metodos {

	public Cuenta buscarCuenta(String nombreCliente);//Identificamos la cuenta por la llave o nombre del ID
	public Ticket retirar(String nombreCliente, double monto);//Identificamos la cuenta y el monto a retirar
	public Ticket depositar(String nombreCliente, double monto);//Identificamos la cuenta y el monto a depositar
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto);
	
}
