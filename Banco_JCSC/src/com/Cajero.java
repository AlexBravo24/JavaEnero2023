package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos {
	
	//Atributos del cajero
	
	private String sucursal;
	private int folio=0;
	
	
	//HashMap - Nos va a ayudar a simular una pequeña base de datos
	// Encontrando los valores por su key y el objeto
	
	private HashMap<String,Cuenta> cuentas; // Nos va a ayudar a relacionar una cuenta
											// con el nombre del cliente
	
	public Cajero () {}
										
	public Cajero(String sucursal, int folio, HashMap<String, Cuenta> cuentas) {
		this.sucursal = sucursal;			
		this.folio = folio;					
		this.cuentas = cuentas;
		}

	@Override
	public Cuenta buscarCuenta(String nombreCliente) {
		Cuenta cuenta = null; //Instanciando un objeto cuenta
		
		//Buscar dentro del conjutno de llavees del HashMap
		for (String i:this.cuentas.keySet()) { //Iteramos sobre las llaves
			if (i.equals(nombreCliente)) { //Si el nombre que buscamos es igual a la llave
				cuenta=this.cuentas.get(i); //La guarda en una instancia del objeto cuenta
				break; //Rompe con la iteración una vez encontrado el valor
			}
		}
		
		
		return cuenta; //El retorno nos va a dar el resultado en pantalla de la cuenta
	}

	@Override
	public Ticket retirar(String nombreCliente, double monto) {
		Ticket ticket = null; //Instanciamos un ticket vacío
		
		if (this.buscarCuenta(nombreCliente) !=null) { //Si el metodo de busqueda se realiza
			Cuenta cuenta = this.buscarCuenta(nombreCliente); //Pasamos el valor a una variable cuenta
			if (monto>9000) { //Condicionando si la operacion  excede el maximo limite de cajeros
				System.out.println("El monto excede el máximo permitido para retiros");
				return ticket;
			}else if (cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente.");
			}else if (cuenta.getSaldo()-monto<cuenta.getMin()) {
				System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getNumcuenta(), cuenta.getSaldo(), this.sucursal);
				return ticket;
				
			}
				
		}else {
			System.out.println("No hay cuenta asociada a ese cliente");
		}
		return ticket;
	}

	@Override
	public Ticket depositar(String nombreCliente, double monto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	

}
