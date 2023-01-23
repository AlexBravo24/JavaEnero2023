package com;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	HashMap<String, Producto> items = new HashMap<String, Producto>(); 
	items.put("10", new Producto("10",15,"awa epura",6));
	items.put("20", new Producto("20",25,"colacola",10));
	items.put("30", new Producto("30",30,"pinwinos",3));
	items.put("40", new Producto("40",10,"m&n's",5));
	items.put("50", new Producto("50",26,"chips",1));
	
	Maquina m = new Maquina(0,10,20,items);
	
	//System.out.println(m.buscarProd("10"));
	boolean c= false;
	do //Solo para repetir ejercicio
	{
	System.out.println(m.tran());
	System.out.println("Fondos: "+m.getCaja());//namas pa pruebas
	System.out.println("¿Repetir?Y/N");
	System.out.print("r:");
	String r= sc.nextLine();
		if (r.equalsIgnoreCase("Y")) c=true;
		else c=false;
	}
	while (c==true);
    }

}
