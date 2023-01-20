package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos la base de datos de las cuentas
		
		HashMap<String, Cuenta> cuentas = new HashMap<String, Cuenta>();
		
		cuentas.put("Aylin", new Cuenta("001",5000,"9707",1000,20000,"Debito"));
		cuentas.put("Eduardo", new Cuenta("002",8000,"7675",500,30000,"Debito"));
		cuentas.put("Emmanuel", new Cuenta("003",2000,"6543",200,25000,"Debito"));
		cuentas.put("Tavo", new Cuenta("004",3000,"5654",2000,15000,"Debito"));
		
		//Instanciando a un cajero
		Cajero cajero1= new Cajero("Insurgentes, CDMX", cuentas);
		
		//Consultando Informacion de las cuentas
		//System.out.println(cajero1.buscarCuenta("Aylin"));
		
		//Consultar informacion de una cuenta que no existe
		//System.out.println(cajero1.buscarCuenta("Cesar"));
		
		//Probando realizar un retiro de una cuenta
//		System.out.println(cajero1.retirar("Eduardo", 2000));
//		System.out.println(cajero1.retirar("Eduardo", 500));
//		System.out.println(cajero1.retirar("Eduardo", 500));

		//Probando realizar un deposito
		System.out.println(cajero1.depositar("Emmanuel", 20000));
		//System.out.println(cajero1.depositar("Emmanuel", 24000));//Excederia el saldo maximo
		
		//Probando realizar una trasferencia
		System.out.println(cajero1.trasnferir("Emmanuel", "Tavo", 12000));
		System.out.println(cajero1.buscarCuenta("Tavo"));
		
		

	}

}
