package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos{ //
	
	//Atributos del cajero
	
	private String sucursal;
	private int folio=0;
	
	//HashMap -  nos va a ayduar a simular una pequeña base de datos 
	
	private HashMap<String, Cuenta> cuentas; // Nos va a ayudar a relacionar una cuenta al nombre del cliente 
	
	public Cajero () {}

	public Cajero(String sucursal, HashMap<String, Cuenta> cuentas) {
		this.sucursal = sucursal;
		this.cuentas = cuentas;
		
		
	}

	@Override
	public Cuenta buscarcuenta(String nombrecliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket retirar(String nombrecliente, double monto) { //Necesitamos saber de cuenta vamos a retirar
		Ticket ticket = null; //instanciamos un ticket vacío.
		if (this.buscarcuenta(nombrecliente)!=null) {//Si el método de búsqueda se realiza 
			Cuenta cuenta = this.buscarcuenta(nombrecliente);//Pasamos el valor a una variable Cuenta
			if (monto>9000) { //condicionando si el límite excede el máximo 
				System.out.println("Monto excede el máximo permitido");
				return ticket;
			}
				else if (cuenta.getSaldo()<monto) { //Si el saldo de la cuenta es menor no
					System.out.println("Saldo insuficiente");
					return ticket;
				}
				else if (cuenta.getSaldo()- monto<cuenta.getSaldomin()) {
					System.out.println("El retiro dejaría por debajo del mínimo de la cuenta, evite comisiones");
					return ticket;		
				}
				else { //El retiro puede actulizarse restando el monto al saldo de la cuenta
					cuenta.setSaldo(cuenta.getSaldo() - monto);
					ticket = new Ticket(folio++, new Date(), cuenta.getNumcuenta(), cuenta.getSaldo(),this.sucursal,1 );
					return ticket; 
				}
					else {
						
					}
		}
		
		
		
		return null;
	}

	@Override
	public Ticket depositar(String nombrecliente, double monto) {
		Ticket ticket = null; //instanciamos un ticket vacío.
		if (this.buscarcuenta(nombrecliente)!=null) {//Si el método de búsqueda se realiza 
			Cuenta cuenta = this.buscarcuenta(nombrecliente);//Pasamos el valor a una variable Cuenta
				
				if (monto> cuenta.getSaldomax()) {
					
				}
		return ticket; 
	}

	@Override
	public Ticket transferir(String clienteorigen, String clientedestino) {
		// TODO Auto-generated method stub
		return null;
	};

	
	
	
}
