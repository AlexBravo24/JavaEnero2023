package com;

import java.util.Scanner;

public class Calcu extends Objeto implements IMed {

    Scanner sc = new Scanner(System.in);
    private boolean CSolar;
    public Calcu()
    {}  
    
    public Calcu(String marca, String modelo, Boolean CSolar)
    {super (marca,modelo);this.CSolar=CSolar;}  
    
    
    public boolean isCSolar() {
        return CSolar;
    }

    public void setCSolar(boolean cSolar) {
        CSolar = cSolar;
    }

    
    @Override
    public void sumar() {
	double x=0,y=0;
	System.out.println("Ingresa el primer valor");
	System.out.print("r: ");
	x=Double.parseDouble(sc.nextLine());
	System.out.println("Ingresa el Segundo valor");
	System.out.print("r: ");
	y=Double.parseDouble(sc.nextLine());
	System.out.println(x+y);
    }

    @Override
    public void restar() {
	double x=0,y=0;
	System.out.println("Ingresa el primer valor");
	System.out.print("r: ");
	x=Double.parseDouble(sc.nextLine());
	System.out.println("Ingresa el Segundo valor");
	System.out.print("r: ");
	y=Double.parseDouble(sc.nextLine());
	System.out.println(x-y);
    }

    @Override
    public void multi() {
	double x=0,y=0;
	System.out.println("Ingresa el primer valor");
	System.out.print("r: ");
	x=Double.parseDouble(sc.nextLine());
	System.out.println("Ingresa el Segundo valor");
	System.out.print("r: ");
	y=Double.parseDouble(sc.nextLine());
	System.out.println(x*y);
    }

    @Override
    public void div() {
	double x=0,y=0;
	System.out.println("Ingresa el primer valor");
	System.out.print("r: ");
	x=Double.parseDouble(sc.nextLine());
	System.out.println("Ingresa el Segundo valor");
	System.out.print("r: ");
	y=Double.parseDouble(sc.nextLine());
	System.out.println(x/y);
    }

    @Override
    public String toString() {
	return "Calcu [Panel Solar=" + CSolar + ", " + (getMarca() != null ? "Marca=" + getMarca() + ", " : "")
		+ (getModelo() != null ? "Modelo=" + getModelo() : "") + "]";
    }

    @Override
    public void checkTemp() {
	System.out.println("Temp: 101°");
	
    }

    @Override
    public void checkPres() {
	// TODO Auto-generated method stub
	System.out.println("pres 112");
    }

    
}
