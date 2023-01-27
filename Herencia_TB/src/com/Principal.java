package com;

public class Principal {

    public static void main(String[] args) 
    {
	// TODO Auto-generated method stub
	Persona p1=new Persona("Ana","Femenino",27); 
	p1.comer("Pizza"); 
	System.out.println(p1); 
	//Al heredar de la clasepadre Persona, la clase hija empleado 
	//debe contar con los atributos de la clase hija
	Empleado e1=new Empleado("Juan","Masculino",30,30000,"JHD089673400P9","8:00-17:00","Pedro");
	System.out.println(e1); 
    }

}
