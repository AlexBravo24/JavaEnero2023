package com;

import java.util.Scanner;

public class Herra extends ObjElectrico implements MetodosObjElectrico{

    private Scanner sc = new Scanner(System.in);
    private String tipo;
    private String conector;
    private String desc;
    public Herra(String modelo, String marca, String origen, String tipo, String conector, String desc) {
	super(modelo, marca, origen);
	this.tipo = tipo;
	this.conector = conector;
	this.desc = desc;
    }
    @Override
    public void on() {
	// TODO Auto-generated method stub
	System.out.println("gatillo accionado\ntrabajando...");
    }
    @Override
    public void off() {
	// TODO Auto-generated method stub
	System.out.println("gatillo soltado\napagando...");
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
	case 1:System.out.println("modo lento");break;
	case 2:System.out.println("modo normal");break;
	case 3:System.out.println("modo rapido");break;	
	}
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getConector() {
        return conector;
    }
    public void setConector(String conector) {
        this.conector = conector;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    @Override
    public String toString() {
	return "Herra [" + (tipo != null ? "tipo=" + tipo + ", " : "")
		+ (conector != null ? "conector=" + conector + ", " : "") + (desc != null ? "desc=" + desc + ", " : "")
		+ (getModelo() != null ? "getModelo()=" + getModelo() + ", " : "")
		+ (getMarca() != null ? "getMarca()=" + getMarca() + ", " : "")
		+ (getOrigen() != null ? "getOrigen()=" + getOrigen() : "") + "]";
    }
    
    
}
