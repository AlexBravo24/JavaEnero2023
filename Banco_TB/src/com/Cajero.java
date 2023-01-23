package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos{ //Clase que implementa las accioneso la logica

    private String sucursal; 
    private int folio=0; 
    //HashMap - Nos va a ayudar a simular una pequena base be datos //Encontrando los valores por su key y el objeto (Cuenta) 
    private HashMap<String, Cuenta> cuentas; //Nos va a yudar a relacionar una cuenta con el nombre del cliente  
    
    public Cajero() {}

    public Cajero(String sucursal, HashMap<String, Cuenta> cuentas) {
	super();
	this.sucursal = sucursal;
	this.cuentas = cuentas;
    }

    @Override
    public Cuenta buscarCuenta(String nombreCliente) {
	// TODO Auto-generated method stub
	//Buscar dentro del conlunto de llaves del HashMap 
	Cuenta cuenta=null;
	for (String i:this.cuentas.keySet()) //Se realiza un ciclo sobre las llaves
	{ 
	    if(i.equals(nombreCliente)) //Si el nombre que buscamos es igual a la llave
	    { 
		cuenta=this.cuentas.get(i); //La guarda en un objeto ya declarado previamente(tipo cuenta)
		break;//Rompe con el ciclo una vez encontrado el valor 
	    } 
	}
	return cuenta;//El retorno nos va dar el resultado en pantalla de la cuenta a buscar
    }

    @Override
    public Ticket retirar(String nombreCliente, double monto) 
    {
	Ticket ticket = null;//Creamos un nuevo ticket(objeto) vacio
	if(this.buscarCuenta(nombreCliente)!=null) 
	{							//Si el metodo de busqeuda se realiza
    	    Cuenta cuenta = this.buscarCuenta(nombreCliente);	//Pasamos el valor a una variable cuenta
    	    if(monto>9000) //Si el monto sobrepasa el limite permitido del cajero
    	    { 
    		System.out.println("El monto excede el maximo permitido para retiros");
    		return ticket;
    	    }
    	    else if(cuenta.getSaldo()<monto)
    	    {//Si el saldo es menor al monto muestra un error
    		System.out.println("saldo insuficiente");
    		return ticket;
    	    } 
    	    else if(cuenta.getSaldo()-monto < cuenta.getMin()) 
    	    {//Si el retiro deja el saldo con un valor menor al minimo 
    		System.out.println("El retiro dejaria por debajo del inimo a la cuenta");
    		return ticket;
    	    } 
    	    else
    	    {
    		cuenta.setSaldo(cuenta.getSaldo()-monto);//Actualiza el saldo de la cuenta dps del retiro
    		ticket = new Ticket(folio++, new Date(), cuenta.getNumCuenta(), cuenta.getSaldo(), this.sucursal,1); 
    		return ticket;
    	    }
	}
	else 
	{
	    System.out.println("No hay una cuenta asociada al cliente");
	    return ticket;
	}
	    
    }	

    @Override
    public Ticket depositar(String nombreCliente, double monto) {
	Ticket ticket = null;//Creamos un nuevo ticket(objeto) vacio
	if(this.buscarCuenta(nombreCliente)!=null) 
	{							//Si el metodo de busqueda se realiza
    	    Cuenta cuenta = this.buscarCuenta(nombreCliente);	//Pasamos el valor a una variable cuenta
    	    if(monto>cuenta.getMax()) //Si el monto sobrepasa el limite permitido del cajero
    	    { 
    		System.out.println("El monto excede el maximo permitido para depositos");
    		return ticket;
    	    }
    	    else if(cuenta.getSaldo()+monto>cuenta.getMax())
    	    {//Si el saldo es menor al monto muestra un error
    		System.out.println("El monto excederia el maximo permitido para depositos");
    		return ticket;
    	    }  
    	    else
    	    {
    		cuenta.setSaldo(cuenta.getSaldo()+monto);//Actualiza el saldo de la cuenta dps del retiro
    		ticket = new Ticket(folio++, new Date(), cuenta.getNumCuenta(), cuenta.getSaldo(), this.sucursal,1); 
    		return ticket;
    	    }
	}
	else 
	{
	    System.out.println("No hay una cuenta asociada al cliente");
	    return ticket;
	}
    }

    @Override
    public Ticket transferir(String clienteOrigen, String clienteDestino, double monto) 
    {
	Ticket ticket = null;
	if(this.buscarCuenta(clienteOrigen)!=null && this.buscarCuenta(clienteDestino)!=null) 
	{ 
	    Cuenta origen = this.buscarCuenta(clienteOrigen); 
	    Cuenta destino = this.buscarCuenta(clienteDestino); 
	    if(origen.getSaldo()<monto) 
	    { 
		System.out.println("No hay fondos suficientes pars realisar la transferencia.");		
		    return ticket;
		}
		else if (origen.getSaldo()-monto<origen.getMin())
		{ 
		    System.out.println("La transferencia dejaria por debajo del minimo a is cuenta");
		    return ticket; 
		}
		else if (monto>destino.getMax())
		{ 
		    System.out.println("El monto excede el maximo permitido en la cuenta de destino.");
		    return ticket; 
		}
		else if(destino.getSaldo()+monto>destino.getMax()) 
		{
		    System.out.println("El saldo de is cuenta destino excederia el maxim° permitido."); 
		    return ticket; 
		}
		else 
		{
		    origen.setSaldo(origen.getSaldo()-monto); 
		    destino.setSaldo(destino.getSaldo()+monto);
		    ticket = new Ticket(folio++, new Date(), origen.getNumCuenta(), origen.getSaldo(), this.sucursal,1); 
		    return ticket; 
		}  	    
	}
	else 
	{ 
	    System.out.println("Alguno de los clientes no tiene una cuenta asociada"); 
	    return ticket;
	} 
    }
    
}
  
