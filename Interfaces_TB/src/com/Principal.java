package com;

public class Principal {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Herra h=new Herra("UT500PW","Dewalt","usa","Electrico","Alambrico","Esmeril 7pulg.");
	System.out.println(h);
	h.modos();
	h.on();
	h.off();
	
	Calcu c=new Calcu("MX200RE","Casio","Japon",true);
	System.out.println(c);
	c.on();
	c.modos();
	c.suma();
	c.resta();
	c.multi();
	c.div();
	c.off();
    }

    
}
