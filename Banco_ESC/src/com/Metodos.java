package com;

public interface Metodos {
	
	//Metodos a implementar
	//o repositorio de metodos

	public Cuenta buscarCuenta(String nombreCliente);//	Identificamos la cuenta por la llave 0 id (Nombre del cliente)
	public Ticket retirar(String nombreCliente, double monto); //Identificamos la cuenta y el monto a retirar
	public Ticket depositar(String nombreCliente, double monto);//Identificamos la cuenta y el monto a depositar
	public Ticket trasnferir(String clienteOrigen, String clienteDestino, double monto);// Identificamos la cuenta origen, la cuenta destino y el monto a trasferir
}
