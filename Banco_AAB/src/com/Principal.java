package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos la base de datos de las cuentas
		
		HashMap<String, Cuenta> cuentas = new HashMap<String, Cuenta>();
		
		cuentas.put("Aylin", new Cuenta("001", 5000, "9707", 1000, 20000, "Débito"));
		cuentas.put("Eduardo", new Cuenta("002", 8000, "7675", 500, 30000, "Débito"));
		cuentas.put("Emmanuel", new Cuenta("003", 2000, "6543", 200, 25000, "Débito"));
		cuentas.put("Tavo", new Cuenta("004", 3000, "5654", 2000, 15000, "Débito"));
		
		//Instanciando a un cajero
		
		Cajero cajero1 = new Cajero("Insurgentes, CDMX", cuentas);
		
		//Consultando informacion de las cuentas
		//System.out.println(cajero1.buscarCuenta("Aylin"));
		
		//Consultar informacion de una cuenta que no existe
		//System.out.println(cajero1.buscarCuenta("César"));
		
		//Probando a realizar un retiro de una cuenta
//		System.out.println(cajero1.retirar("Eduardo", 2000));
//		System.out.println(cajero1.retirar("Eduardo", 500));
//		System.out.println(cajero1.retirar("Eduardo", 500));
		
		//Probar realizando un depósito
		
		System.out.println(cajero1.depositar("Emmanuel", 20000));
		
		//Probando realizar una transferencia
		System.out.println(cajero1.transferir("Emmanuel", "Tavo", 13000));
		System.out.println(cajero1.buscarCuenta("Tavo"));

	}

}