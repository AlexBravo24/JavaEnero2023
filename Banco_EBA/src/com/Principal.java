package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		// Creamos la base de datos con las cuentas
		
		HashMap <String, Cuenta> cuentas = new HashMap <String , Cuenta>();
		
		cuentas.put("Aylin", new Cuenta(" 001", 5000 , " 4862", 1000 , 20000, " Debito"));
		cuentas.put("Eduardo", new Cuenta("002", 8000 , "1995", 500 , 30000, "Debito"));
		cuentas.put("Emmanuel", new Cuenta("003", 2000 , "1234", 200 , 25000, "Debito"));
		cuentas.put("Tavo", new Cuenta("004", 3000 , "9713", 2000 , 15000, "Debito"));
		
		//Intanciando un cajero
		Cajero cajero1 = new Cajero("Insurgentes, CDMX", cuentas);
		
		//Consultando informacion de las cuentas 
		//System.out.println(cajero1.buscarCuenta("Aylin"));
		
		//Consultando informacion de una cuenta que no existe
		//System.out.println("Cesar");
		
		//Probando a realizar un retiro de una cuenta		
		//System.out.println(cajero1.retirar("Eduardo", 8000)); 
		
		//probando a depositar
		
		System.out.println(cajero1.depositar("Emmanuel", 20000));
		
		//probando hacer una tranferencia
		System.out.println(cajero1.tranferir("Emmanuel", "Tavo", 10000));
		System.out.println(cuentas.get("Tavo"));

	}

}
