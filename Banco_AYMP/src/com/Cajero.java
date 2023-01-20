package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos {//seria la clase que implementa las acciones o la lógica
	
	private String sucursal;
	private int folio=0;
	
	//HashMap - nos ayudara a simular una pequeña base de datos encontrando los valores por su key y el objeto (cuenta)
	private HashMap <String, Cuenta> cuentas;   //nos ayudará a relacionar una cuenta con el nombre del cliente
	
	public Cajero() {
		
	}

	public Cajero(String sucursal, HashMap<String, Cuenta> cuentas) {
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta buscarCuenta(String nombreCliente) {
		Cuenta cuenta =null;//Instanciando un objeto cuenta
		//Buscar dentro del conjunto de llaves del Hashmap
		
		for (String i : this.cuentas.keySet()) {//iteramos sobre las llaves
			if(i.equals(nombreCliente)) {  //si el nombre que utilizamos es igual a la llave
				cuenta=this.cuentas.get(i);//lo guarda en una instancia del objeto cuenta
				break;//rompe con la iteración cuando encuentra el valor
			}
		}
		return cuenta;//El return mostrará el resultado de la cuenta
	}

	@Override
	public Ticket retirar(String nombreCiente, double monto) {//necesaitamos saber de que cuenta vamos a retirar
		Ticket ticket=null;//instanciamos un ticket vacio
		
		if(this.buscarCuenta(nombreCiente) != null) {//si el metodo de cuenta se realiza
			Cuenta cuenta=this.buscarCuenta(nombreCiente);//pasamos el valor a una variable cuenta
			if(monto>9000) {//condicionando si la opracion excede el limite diario en cajeros
				System.out.println("el monto excede el máximo permitido para retiros");
				return ticket;
			}else if(cuenta.getSaldo() < monto) {//Si el saldo de la cuenta es menor al monto solicitado envia mensaje
				System.out.println("Saldo insuficiente");
				return ticket;
			}else if(cuenta.getSaldo() - monto < cuenta.getMin()) {//si el retiro deja por debajo del minimo a la cuenta imprime mensaje
				System.out.println("El retiro dejará por debajo del minimo a la cuenta");
				return ticket;
			}else { //si el retiro puede realizarse se actualiza el saldo de la cuenta, restando el valor del monto a retirar
				cuenta.setSaldo(cuenta.getSaldo() - monto);
				ticket = new Ticket(folio++, new Date(),cuenta.getNumcuenta(),cuenta.getSaldo(), this.sucursal,1);
				return ticket;
			}
		
		}else {//si en la busqueda de la cuenta no encuentra un valor o cuenta asociada, imprime mensaje
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
		
	}

	@Override
	public Ticket depositar(String nombreCliente, double monto) {
		Ticket ticket = null;
		if(this.buscarCuenta(nombreCliente) != null) {
			Cuenta cuenta=this.buscarCuenta(nombreCliente);
			if(monto > cuenta.getMax()) {
				System.out.println("El monto excede el saldo máximo permitido en la cuenta");
				return ticket;
			}else if(cuenta.getSaldo() + monto > cuenta.getMax()) {
				System.out.println("El saldo excedería el máximo permitido por la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+ monto);
				ticket = new Ticket(folio++, new Date(),cuenta.getNumcuenta(),cuenta.getSaldo(), this.sucursal,1);
				return ticket;
			}
			
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}

	@Override
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto) {
		Ticket ticket= null;
		if(this.buscarCuenta(clienteOrigen) != null && this.buscarCuenta(clienteDestino) != null ) { 
			Cuenta origen = this.buscarCuenta(clienteOrigen);
			Cuenta destino= this.buscarCuenta(clienteDestino);
			if(origen.getSaldo()<monto) {
				System.out.println("No hay fondos sufientes para realizar la transferencia");
				return ticket;
			}else if (origen.getSaldo()-monto < origen.getMin()) {
				System.out.println("La transferencia dejaría por debajo del mínimo a la cuenta");
				return ticket;
			}else if(monto > destino.getMax()) {
				System.out.println("El monto excede el máximo permitido por la cuenta de destino");
				return ticket;
			}else if(destino.getSaldo() + monto > destino.getMax()) {
				System.out.println("El saldo de la cuenta de destino excedería el máximo permitido");
				return ticket;
			}else{
				origen.setSaldo(origen.getSaldo()- monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(),origen.getNumcuenta(),origen.getSaldo(), this.sucursal,1);
				return ticket;
			}
		}else {
			System.out.println("alguno de los clientes no tiene una cuenta asociada");
			return ticket;
		}
	}
	
	//implementando
	
	
	
	
	
}
