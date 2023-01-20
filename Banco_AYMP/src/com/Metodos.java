package com;

public interface Metodos {
	
	//métodos a implementar
	//repositotio de metodos
	
	public Cuenta buscarCuenta(String nombreCliente);  //identificamos la cuenta por la llave o id (nombre del cliente)
	public Ticket retirar(String nombreCiente, double monto);//identificamos la cuenta y el monto a retirar
	public Ticket depositar(String nombreCliente, double monto);//identificamos la cuenta y el monto a depositar
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto);
	
	

}
