package com;

public class internet {

	private String compañia;
	private int velocidadMB;
	private int numbandas;
	
	
	public internet() {
		
	}


	public internet(String compañia, int velocidadMB, int numbandas) {
		super();
		this.compañia = compañia;
		this.velocidadMB = velocidadMB;
		this.numbandas = numbandas;
	}


	public String getCompañia() {
		return compañia;
	}


	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}


	public int getVelocidadMB() {
		return velocidadMB;
	}


	public void setVelocidadMB(int velocidadMB) {
		this.velocidadMB = velocidadMB;
	}


	public int getNumbandas() {
		return numbandas;
	}


	public void setNumbandas(int numbandas) {
		this.numbandas = numbandas;
	}


	@Override
	public String toString() {
		return "internet [compañia=" + compañia + ", velocidadMB=" + velocidadMB + ", numbandas=" + numbandas + "]";
	}
	
	
}
