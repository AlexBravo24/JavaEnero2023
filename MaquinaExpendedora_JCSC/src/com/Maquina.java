package com;

import java.util.HashMap;
import java.util.Scanner;

public class Maquina implements Metodos{

    private int credito;//monedas introducidas
    private int caja;//dinero dentro de la maquina de ventas y p/cambio
    private int max;//maximo de credito ingresado
    private HashMap<String, Producto> productos;//stock
    
    public Maquina() {}

    public Maquina(int credito, int caja, int max, HashMap<String, Producto> productos) {
	//super();
	this.credito = credito;
	this.caja = caja;
	this.max = max;
	this.productos = productos;
    }

    @Override
    public Producto buscarProd(String idProd) {
	Producto prod=null;
	for (String i:this.productos.keySet()) 
	{
	    if(i.equals(idProd))
	    { 
		prod=this.productos.get(i); 
		break;
	    } 
	}
	return prod;
    }

    @Override
    public Transaccion tran()
    {
	String idProd; int monto, cambio;
	if(caja<=0) {System.out.println("No tengo cashcash");return null;}//No hay fondos en la maquina
	else 
	{
	    Scanner sc = new Scanner(System.in);
	    Transaccion tr = null;
	    do //Pedir un codigo valido
	    {
		System.out.println("Ingresa codigo item:");
		System.out.print("r:");
		idProd= sc.nextLine();
		Producto prod = this.buscarProd(idProd);		
		if(this.buscarProd(idProd)!=null)
		{	
		    if(prod.getStock()!=0)//Si hay stock
		    {
			monto = prod.getPrecio();
			System.out.println("Seleccionaste: "+prod.getDesc()+" precio: $"+prod.getPrecio());
			do //pedir billelle hasta que cubra el monto
			{			    
			    System.out.println("Ingresa el dinero:");
			    System.out.print("r:");
			    credito= credito+sc.nextInt();
			    System.out.println("Dinero ingresado:"+ credito);
			}while(credito<monto);			
			cambio=credito-monto;
		    	if(cambio>caja || cambio>max) //si el cambio supera los fondos
		    	{ 
		    	    System.out.println("No tengo suficiente cambio o el dinero ingresado sobrepasa el cambio maximo ($"+max+")\nDevolviendo dinero");
		    	    credito=0;
		    	}
		    	else //todo ok para hacer la transaccion
		    	{		    
			    caja=caja-cambio;
			    caja=caja+monto;
			    tr = new Transaccion(credito,monto,cambio,idProd);
			    credito=0;
			    monto=0;
			    prod.setStock(prod.getStock()-1);
			    System.out.println("Pago realizado\nDespachando...\nSu cambio es de "+cambio);
		    	}
		    }
		    else {System.out.println("No tengo existencias");}
		System.out.println("");
		}
		else
		{
		    System.out.println("Codigo no valido");
		}
	    }while(this.buscarProd(idProd)==null);	
	    return tr;
	}	
    }
   
    public int getCaja() {
        return caja;
    }
    
    
    
}
