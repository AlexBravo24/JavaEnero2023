package com;

public class Principal {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	//Instanciando a un objeto, de la clase o "plantilla" Persona Persona personal = new Persona(); 
	Persona persona1 = new Persona();
	persona1.setAltura(111);
	persona1.setEdad(24);	
	persona1.setNombre("tebe"); 	
	Persona persona2 = new Persona("Alejandro","Masculino",37,80,2); 
	System.out.println(persona1);
	System.out.println(persona2); 
	
	System.out.println();
	
	Microondas m1 = new Microondas();
	m1.setMarca("Samsung");
	m1.setPotencia(1600);
	m1.setPrecio(14499.99);
	Microondas m2 = new Microondas("Phillips","U21a","Cuarzo",1100,6999.99);
	System.out.println(m1);
	System.out.println(m2);
	
	System.out.println();
	
	Ventilador v1 = new Ventilador();
	v1.setMarca("LG");
	v1.setTipo("Pedestal");
	v1.setPresion("Alta");
	Ventilador v2 = new Ventilador("Taurus","RR12v2","Techo",6,"Alta");
	System.out.println(v1);
	System.out.println(v2);
	
	System.out.println();
	
	Pais p1 = new Pais();
	p1.setNombre("México");
	p1.setCdcapital("CDMX");
	Pais p2 = new Pais("Italia","Roma",39,59.11);
	System.out.println(p1);
	System.out.println(p2);
	
	System.out.println();
	
	Escuela e1= new Escuela();
	e1.setNombre("Benemérito de las Ámericas");
	e1.setNivel("primaria");
	Escuela e2= new Escuela("Español","Av. Michoacán,Progreso","Privada","Secundaria",400);
	System.out.println(e1);
	System.out.println(e2);
    }

}
