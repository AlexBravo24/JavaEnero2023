package com;

public class Principal {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Calcu c= new Calcu("Casio","MX100i",true);
	System.out.println(c);
//	
//	c.sumar();
//	c.restar();
//	c.multi();
//	c.div();
	c.checkPres();
	c.checkTemp();
    }
    
    
}
