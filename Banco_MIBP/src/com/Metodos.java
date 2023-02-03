package com;

public interface Metodos {
	
	//Métodos a implementar 
	//Repositorio de métodos
	
	
	public Cuenta buscarcuenta(String nombrecliente);
	public Ticket retirar(String nombrecliente, double monto);
	public Ticket depositar(String nombrecliente, double monto);
	public Ticket transferir(String clienteorigen, String clientedestino);
}
