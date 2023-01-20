package com;


import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos{ // Clase que implementa las acciones o la lógica
	
	private String sucursal;
	private int folio = 0;
	
	// HashMap - nos va a ayudara simular una pequeña base de datos 
	// Encontrando los valores por key y el objeto(Cuenta)
	
	private HashMap <String , Cuenta > cuentas; // nos va ayudar a relacionar una cuenta con el nombre del cliente
	
	public Cajero () {}

	public Cajero(String sucursal, HashMap<String, Cuenta> cuentas) {
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta buscarCuenta(String nombreCliente) {
		
		Cuenta cuenta = null; //Instanciando un objeto cuenta 
		// buscar dentro del conjunto de llaves del HashMap
		
		for (String i : this.cuentas.keySet()) { //iteramos sobre las llaves
			if (i.equals(nombreCliente)) {  // si el nombre que buscamos es igual a la llave
				cuenta = this.cuentas.get(i); //la guarda en una instancia del objeto cuenta
				break; // rompe la iteracion una vez encontrado el valor 
			}
		} 
		
		return cuenta; //el retorno nos va a dar el resultado en la pantalla de la cuenta
	}

	@Override
	public Ticket retirar(String nombreCliente, double monto) { //nesecitamos saber de que cuenta vamos a retirar 
		Ticket ticket = null; // Instanciamos un ticket vacio.
		
		if (this.buscarCuenta(nombreCliente) != null) {
			Cuenta cuenta  = this.buscarCuenta(nombreCliente); // pasamos lel valor a una variable cuenta 
			if (monto > 9000) { // condicionado si la operacion excede el limite diario en cajeros
				System.out.println("Monto excede el maximo permitido");
				return ticket;
			}else if (cuenta.getSaldo() < monto) { // si el saldo es menor a la cantidad del retiro que envie un mensaje
				System.out.println("Saldo insidiciente: ");
				return ticket;
			}else if (cuenta.getSaldo() - monto < cuenta.getMin()) { // si el retiro deja por debajo del min el saldo de la cuenta envia un mensaje
				System.out.println("El retiro dejaría por debajo del minimo a la cuenta ");
				return ticket;
			}else { // Si el retiro puede realizarse
				cuenta.setSaldo(cuenta.getSaldo()-monto); // se actualiza el saldo de la cuenta restando el valor del monto a retirar.
				ticket = new Ticket(folio++, new Date(), cuenta.getNumeroCuenta(), cuenta.getSaldo(), this.sucursal , 1);
				return ticket;
			}
		}else {// aien la busqueda de la cuenta noy hay coincidencia con el numero de cuenta.
			System.out.println("No hay cuenta asociada a ese cliente");
			return ticket;
		}
			
	}

	
	
	
	@Override
	public Ticket depositar(String nombreCliente, double monto) {
		
		Ticket ticket = null; 
		if (this.buscarCuenta(nombreCliente) != null) {
			Cuenta cuenta  = this.buscarCuenta(nombreCliente);
			if(monto > cuenta.getMax()) {
				System.out.println("El monto excede el maximo permitido en la cuenta");
				return ticket;
			}else if(cuenta.getSaldo() + monto > cuenta.getMax()) {
				System.out.println("El saldo excedería el maximo permitido por la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo() + monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getNumeroCuenta(), cuenta.getSaldo(), this.sucursal , 1);
				return ticket;
			}	
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}	
	}

	
	
	
	
	@Override
	public Ticket tranferir(String clienteOrigen, String clienteDestino, double monto) {
		
		Ticket ticket = null; 
		if (this.buscarCuenta(clienteOrigen) != null && this.buscarCuenta(clienteDestino) != null) {
			Cuenta origen = this.buscarCuenta(clienteOrigen);
			Cuenta destino = this.buscarCuenta(clienteDestino);
			if (origen.getSaldo() < monto) {
				System.out.println("No hay fondos suficientes pora hacer la transferencia");
				return ticket;
			}else if (origen.getSaldo() - monto < origen.getMin()) {
				System.out.println("La transferencia dejaria la cuenta debajo del minimo");
				return ticket;
			}else if (monto > destino.getMax()) {
				System.out.println("Monto exede el maximo permitido en la cuenta de destino");
				return ticket;
			}else if (destino.getSaldo() + monto > destino.getMax()) {
				System.out.println("El saldo excederia el maximo permitido");
				return ticket;
			}else {
				origen.setSaldo(origen.getSaldo() - monto);
				destino.setSaldo(destino.getSaldo() + monto);
				ticket = new Ticket(folio++, new Date(), origen.getNumeroCuenta(), origen.getSaldo(), this.sucursal , 1);
				return ticket;
			}
		} else {
			System.out.println("Alguno de los clientes no tiene cuenta asociada");
			return ticket;
		}
		
		
		
	}

	

	

}
