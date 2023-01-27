package com;

import java.util.HashMap;

public class Principal {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	HashMap<String, Cuenta> cuentas = new HashMap<String, Cuenta>(); 
	cuentas.put("Aylin", new Cuenta("001",5000,"9707",1000,20000,"Debito"));
	cuentas.put("Eduardo", new Cuenta("002",8000,"7675",500,30000,"Debito")); 
	cuentas.put("Emmanuel", new Cuenta("003",20000,"6543",200,25000,"Debito"));
	cuentas.put("Tavo", new Cuenta("004",3000,"5654",2000,15000,"Debito")); 
	
	Cajero cajero1 = new Cajero("Cuajinicuilapa",cuentas);
	//Instanciando a un cajero Cajero cajerol=new Cajero("Insurgentes, CDMX", cuentas); //Consultando informacion de las cuentas 
	System.out.println(cajero1.buscarCuenta("Aylin")); 
	
	//Consultar informacion de una cuenta que no existe 
	System.out.println(cajero1.buscarCuenta("Cesar")); 
	
	//Probando a realizar un retiro de una cuenta 
	System.out.println(cajero1.retirar("Eduardo", 3000));
	System.out.println(cajero1.retirar("Eduardo", 100)); 
	
	//Probando a realizar un deposito de una cuenta 
	System.out.println(cajero1.depositar("Emmanuel", 23000)); 
	System.out.println(cajero1.depositar("Emmanuel", 1)); 
	
	//Probando realizar una transferencia  
	System.out.println(cajero1.transferir("Emmanuel", "Tavo", 10000)); 
	System.out.println(cajero1.buscarCuenta("Tavo"));
    }
    
}
