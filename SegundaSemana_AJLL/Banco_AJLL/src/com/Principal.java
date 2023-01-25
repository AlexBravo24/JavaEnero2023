package com;

import java.util.HashMap;

public class Principal {
	
	public static void main(String[] args) {
		
		//Creamos una base de datos de las cuentas 
		
		HashMap<String, Cuenta> cuentas = new HashMap<String,Cuenta>();
		
		//Creamos ya la mini base de datos 
		Cuenta c1 = new Cuenta();
		cuentas.put("Aylin", new Cuenta("0001",5000,"9707",1000,20000,"Debito"));
		cuentas.put("Eduardo", new Cuenta("0002",8000,"1707",1500,30000,"Debito"));
		cuentas.put("Emmanuel", new Cuenta("0003",2000,"4505",1000,25000,"Cheques"));
		cuentas.put("Tavo", new Cuenta("0004",3000,"0525",2000,15000,"Debito"));
		
		//Instamciamos a un cajero
		
		Cajero cajero1 = new Cajero("Insergentes, CDMX", cuentas);
		
//		//Consultando info de las cuentas
//		System.out.println(cajero1.buscarCuenta("Aylin"));
//		
//		//Consultando informacion de una cuenta inexistente
//		System.out.println(cajero1.buscarCuenta("Cesar"));
//		
		//Haciendo retiro de una cuenta
//		System.out.println(cajero1.retirar("Eduardo", 2000));
//		System.out.println(cajero1.retirar("Eduardo", 500));
//		System.out.println(cajero1.retirar("Eduardo", 500));
		
		//Realizando depositos
		//System.out.println(cajero1.depositar("Emmanuel", 24000));//Manda mensaje de error de acuerdo con el saldo final de la operacion
		System.out.println(cajero1.depositar("Emmanuel", 20000));
		
		//Probando una transferencia
		System.out.println(cajero1.transferir("Emmanuel", "Tavo", 13000));
		System.out.println(cajero1.buscarCuenta("Tavo"));
	
	
	
	}

}
