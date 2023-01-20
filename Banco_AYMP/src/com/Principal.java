package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos la base de datos de las cuentas
		
		HashMap<String, Cuenta> cuentas = new HashMap<String, Cuenta>();
		
		cuentas.put("Aylin", new Cuenta("001",5000,"970",1000,20000,"Débito"));
		cuentas.put("Edu", new Cuenta("002",8000,"5869",500,30000,"Débito"));
		cuentas.put("Emmanuel", new Cuenta("003",2000,"2869",200,20000,"Débito"));
		cuentas.put("Tavo", new Cuenta("004",3000,"7431",2000,15000,"Débito"));
		
		//Instanciando a un cajero
		Cajero cajero1 = new Cajero("Insurgentes, CDMX", cuentas);
		//Consultando información de las cuentas
		//System.out.println(cajero1.buscarCuenta("Aylin"));
		
		//Consultar cuenta de un cajero que no existe
		//
		
		//probando realizar un retiro de una cuenta
//		System.out.println(cajero1.retirar("Edu", 2000));
//		System.out.println(cajero1.retirar("Edu", 500));
//		System.out.println(cajero1.retirar("Edu", 500));
		
		//probar realizando un depósito
		
		System.out.println(cajero1.depositar("Emmanuel",15000));
		
		//probando realizar una transferencia
		
		System.out.println(cajero1.transferir("Emmanuel", "Tavo", 13000));
		System.out.println(cajero1.buscarCuenta("Tavo"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
