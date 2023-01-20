package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos { //Clase que 
	
	private String sucursal;
	private int folio = 0;
	
	//HashMap - Nos va a ayudar a simular una pequeña base de datos encontrando los valores por su key
	// y el objeto (cuenta)
	
	private HashMap<String, Cuenta> cuentas; //Nos va a ayudar a relacionar una cuenta con el nombre de
											 //del cliente
	
	public Cajero() {
		
	}
	
	public Cajero(String sucursal, HashMap<String, Cuenta> cuentas) {
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	
	//Implementando las acciones
	@Override
	public Cuenta buscarCuenta(String nombreCliente) {
		Cuenta cuenta = null; //Instanciando un objeto cuenta
		
		//Buscar dentro del conjunto de llaves del HashMap
		for (String i:this.cuentas.keySet()) { //Iteramos sobre las llaves
			if(i.equals(nombreCliente)) { //Si el nombre que buscamos es igual a la llave
				cuenta = this.cuentas.get(i); //La guarda en una instancia del objeto cuenta
				break; //Rompe con la iteracion una vez encontrado el valor
			}
		}
		return cuenta; //El retorno nos va a dar el resultado en pantalla de la cuenta a buscar
	}

	@Override
	public Ticket retirar(String nombreCliente, double monto) { //Necesitamos saber de que cuenta vamos a retirar
		Ticket ticket = null; //Instanciamos un ticket vacio
		
		if(this.buscarCuenta(nombreCliente) != null) { //Si el metodo de busqueda se realiza 
			Cuenta cuenta = this.buscarCuenta(nombreCliente); //Pasamos el valor a una variable cuenta
			if (monto > 9000) { //Condicionando si la operacion excede el limite diario en cajeros
				System.out.println("El monto excede el maximo permitido para retiros");
				return ticket;
			} else if (cuenta.getSaldo() < monto) { // si el saldo de la cuenta es menor al monto solicitado
				System.out.println("Saldo Insuficiente");
				return ticket;
			} else if (cuenta.getSaldo() - monto < cuenta.getMin()) { //Si el retiro deja por debajo del min saldo 
				System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
				return ticket;
			} else { //Si el retiro puede realizarse 
				cuenta.setSaldo(cuenta.getSaldo() - monto); //Se actualiza el saldo de la cuenta restando el monto a retirar
				ticket = new Ticket(folio++, new Date(), cuenta.getNumcuenta(), cuenta.getSaldo(), this.sucursal, 1);
				return ticket;
			}
		} else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}

	@Override
	public Ticket depositar(String nombreCliente, double monto) {
		Ticket ticket = null;
		if(this.buscarCuenta(nombreCliente) != null) {
			Cuenta cuenta = this.buscarCuenta(nombreCliente);
			if(monto > cuenta.getMax()) {
				System.out.println("El monto excede el saldo máximo permitido en la cuenta");
				return ticket;
			} else if ((cuenta.getSaldo() + monto) > cuenta.getMax()) {
				System.out.println("El saldo excedería el máximo permitido por la cuenta");
				return ticket;
			} else {
				cuenta.setSaldo(cuenta.getSaldo() + monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getNumcuenta(), cuenta.getSaldo(), this.sucursal, 1);
				return ticket;
			}
			
		} else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}

	@Override
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto) {
		Ticket ticket = null;
		if(this.buscarCuenta(clienteOrigen) != null && this.buscarCuenta(clienteDestino) != null) {
			Cuenta origen = this.buscarCuenta(clienteOrigen);
			Cuenta destino = this.buscarCuenta(clienteDestino);
			if(origen.getSaldo() < monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia");
				return ticket;
			} else if ((origen.getSaldo() - monto) < origen.getMin()) {
				System.out.println("La transferencia dejaría por debajo del mínimo");
				return ticket;
			} else if (monto > destino.getMax()) {
				System.out.println("El monto excede el máximo permitido en la cuenta de destino");
				return ticket;
			} else if ((destino.getSaldo() + monto) > destino.getMax()) {
				System.out.println("El saldo de la cuenta excedería el máximo permitido en la cuenta destino");
				return ticket;
			} else {
				origen.setSaldo(origen.getSaldo() - monto);
				destino.setSaldo(destino.getSaldo() + monto);
				System.out.println("Operación exitosa");
				ticket = new Ticket(folio++, new Date(), origen.getNumcuenta(), origen.getSaldo(), this.sucursal, 1);
				return ticket;
			}
			
		} else {
			System.out.println("Alguno de los clientes no tiene una cuenta asociada");
			return ticket;
		}
	}
	
	
	
	

}
