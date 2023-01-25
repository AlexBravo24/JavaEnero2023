package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos {//Clase que implementa las acciones o la logica
	
	//Atributos cajero
	
	private String sucursal;
	private int folio=0;
	
	//HashMap- Nos va a ayudar a simular una pequeña base de datos
	//Encontrando los valores por su key y el objeto (Cuenta)
	
	private HashMap<String,Cuenta> cuentas; //Nos va a ayudar a relacionar una cuenta
											//Con el nombre del cliente
	
	public Cajero() {}
	
	public Cajero(String sucursal, HashMap<String, Cuenta> cuentas) {
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta buscarCuenta(String nombreCliente) {
		
		Cuenta cuenta = null;//Instanciando un objeto cuenta
		
		//Buscar dentro del conjunto de Keys del HashMap
		
		for(String i : this.cuentas.keySet()) {//Iteramos sobre las keys
			if(i.equals(nombreCliente)) {//Si el nombre que buscamos es igual a la llave
				cuenta = this.cuentas.get(i);//La guarda en una instancia del objeto cuenta
				break;
			}
		}
		
		return cuenta;//El retorno nos va a dar el resultado en pantalla, la cuenta a buscar
	}

	@Override
	public Ticket retirar(String nombreCliente, double monto) {//Necesitamos saber de que cuenta vamos a retirar y el monto
		
		Ticket ticket = null;//Instanciamos un ticket vacio
		
		if(this.buscarCuenta(nombreCliente)!=null) {//Si el metodo de busqueda se realiza
			Cuenta cuenta = this.buscarCuenta(nombreCliente);//Pasamos el valor a un variable cuenta
			if(monto>9000) { //Condicionando si la operacion excede el limite diario en cajeros
				System.out.println("El monto excede el maximo permitido para retiros");
				return ticket;
			}
			else if(cuenta.getSaldo()<monto) {//Si el saldo de la cuenta es menosr al monto solicitado manda error
				System.out.println("SALDO INSUFICIENTE");
				return ticket;
			}
			else if(cuenta.getSaldo()-monto < cuenta.getMin()){//Si el retiro deja por dejabo del min a la cuenta
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return ticket;
			}
			else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);//Se actualiza saldo de la cuenta y se crea un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getNumcuenta(), cuenta.getSaldo(), this.sucursal,1);
				return ticket;
			}
			
		 }
		else {//Si en la busqueda de la cuenta no encuentra un valor o cuenta asociada
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}

	@Override
	public Ticket depositar(String nombreCliente, double monto) {
		
		Ticket ticket = null;
		
		if(this.buscarCuenta(nombreCliente)!=null) {
			Cuenta cuenta = this.buscarCuenta(nombreCliente);
			if(monto>cuenta.getMax()) {
				System.out.println("El monto excede el saldo maximo permitido en la cuenta");
				return ticket;
			}
			else if(cuenta.getSaldo()+monto > cuenta.getMax()) {
				System.out.println("El saldo final de la cuenta excede el maximo permitido por la cuenta");
				return ticket;
			}
			else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getNumcuenta(), cuenta.getSaldo(), this.sucursal,1);
				return ticket;
			}
			
		}
		else {
			System.out.println("No hay una cuenta asocciada a ese cliente");
			return ticket;
		}
		
		
		
	}

	@Override
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto) {
		
		Ticket ticket = null;
		
		if(this.buscarCuenta(clienteOrigen)!=null && this.buscarCuenta(clienteDestino)!=null) { //Nos sercioramos de que el cliente de origen y el cliente destino existan
			Cuenta origen = this.buscarCuenta(clienteOrigen);
			Cuenta destino = this.buscarCuenta(clienteDestino);
			if(origen.getSaldo() < monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia");
				return ticket;
			} 
			else if (origen.getSaldo()-monto<origen.getMin()) {
				System.out.println("La transferencia dejaria por debajo del monto minimo la cuenta, de destino");
				return ticket;
			}
			else if(destino.getMax()<monto) {
				System.out.println("El monto a depositar excede el maximo permitido");
				return ticket;
			}
			else if (destino.getSaldo()+monto>destino.getMax()) {
				System.out.println("El saldo final excede el maximo permitido en la cuenta de destino");
				return ticket;
			}
			else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), origen.getNumcuenta(), origen.getSaldo(), this.sucursal,1);
				return ticket;
				
			}

			
		}
		else {
			System.out.println("Alguno de los clientes no tiene una cuenta asociada");
			return ticket;
		}
		
	}

	
	
	
}
