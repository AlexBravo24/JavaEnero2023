package com;

public class Quesadilla {
	
	private String base="Tortilla";
	private boolean queso= true;
	private String verdura;
	private boolean salsa;
	
	//Constructor Vacio
	public Quesadilla() {
		
	}

	//Constructor con todos los atributos
	public Quesadilla(String base, boolean queso, String verdura, boolean salsa) {
		this.base = base;
		this.queso = queso;
		this.verdura = verdura;
		this.salsa = salsa;
	}
	
	//Getters y Setters
	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public boolean isQueso() {
		return queso;
	}

	public void setQueso(boolean queso) {
		this.queso = queso;
	}

	public String getVerdura() {
		return verdura;
	}

	public void setVerdura(String verdura) {
		this.verdura = verdura;
	}

	public boolean isSalsa() {
		return salsa;
	}

	public void setSalsa(boolean salsa) {
		this.salsa = salsa;
	}
	
	//Metodo toSring
	@Override
	public String toString() {
		return "Quesadilla [base=" + base + ", queso=" + queso + ", verdura=" + verdura + ", salsa=" + salsa + "]";
	}
	
	
	
	
	
	

	
	
	
}
