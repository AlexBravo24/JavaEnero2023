package com;

import java.util.Scanner;

public class Calcu extends ObjElectrico implements MetodosAritmeticos,MetodosObjElectrico {   
    private Scanner sc = new Scanner(System.in);
    private boolean CSolar;    
    
    public Calcu(String modelo, String marca, String origen, boolean cSolar) {
	super(modelo, marca, origen);
	CSolar = cSolar;
    }

    @Override
    public void on() {
	// TODO Auto-generated method stub
	System.out.println("encendido");
    }

    @Override
    public void off() {
	// TODO Auto-generated method stub
	System.out.println("apagao");
    }

    @Override
    public void modos() {
	// TODO Auto-generated method stub	
	int modo;
	System.out.println("modo de trabajo");
	System.out.print("r: ");
	modo=Integer.parseInt(sc.nextLine());
	
	switch (modo) 
	{
	case 1:System.out.println("modo nor");break;
	case 2:System.out.println("modo sci");break;
	case 3:System.out.println("modo eng");break;	
	}
	
    }

    @Override
    public void suma() {
	// TODO Auto-generated method stub
	double x=0,y=0;
	System.out.println("Ingresa el primer valor");
	System.out.print("r: ");
	x=Double.parseDouble(sc.nextLine());
	System.out.println("Ingresa el Segundo valor");
	System.out.print("r: ");
	y=Double.parseDouble(sc.nextLine());
	System.out.println(x+"+"+y+"="+(x+y));
    }

    @Override
    public void resta() {
	// TODO Auto-generated method stub
	double x=0,y=0;
	System.out.println("Ingresa el primer valor");
	System.out.print("r: ");
	x=Double.parseDouble(sc.nextLine());
	System.out.println("Ingresa el Segundo valor");
	System.out.print("r: ");
	y=Double.parseDouble(sc.nextLine());
	System.out.println(x+"-"+y+"="+(x-y));
    }

    @Override
    public void multi() {
	// TODO Auto-generated method stub
	double x=0,y=0;
	System.out.println("Ingresa el primer valor");
	System.out.print("r: ");
	x=Double.parseDouble(sc.nextLine());
	System.out.println("Ingresa el Segundo valor");
	System.out.print("r: ");
	y=Double.parseDouble(sc.nextLine());
	System.out.println(x+"*"+y+"="+(x*y));
    }

    @Override
    public void div() {
	// TODO Auto-generated method stub
	double x=0,y=0;
	System.out.println("Ingresa el primer valor");
	System.out.print("r: ");
	x=Double.parseDouble(sc.nextLine());
	System.out.println("Ingresa el Segundo valor");
	System.out.print("r: ");
	y=Double.parseDouble(sc.nextLine());
	System.out.println(x+"/"+y+"="+(x/y));
    }

    public boolean isCSolar() {
        return CSolar;
    }

    public void setCSolar(boolean cSolar) {
        CSolar = cSolar;
    }

    @Override
    public String toString() {
	return "Calcu [CSolar=" + CSolar + ", " + (getModelo() != null ? "getModelo()=" + getModelo() + ", " : "")
		+ (getMarca() != null ? "getMarca()=" + getMarca() + ", " : "")
		+ (getOrigen() != null ? "getOrigen()=" + getOrigen() : "") + "]";
    }
    
    
}
