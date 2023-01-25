package com;

public class Pizza {

	//Declaramos atributos
	private String ingrediente1; 
	private String ingrediente2; 
	private String queso;
	private String tama�o;

	//Generamos constructor vacio
	public Pizza() {
		
	}
	
	
	
	//Constructor con campos
	public Pizza(String ingrediente1, String ingrediente2, String queso, String tama�o) {
		super();
		this.ingrediente1 = ingrediente1;
		this.ingrediente2 = ingrediente2;
		this.queso = queso;
		this.tama�o = tama�o;
	}




	//GETTERS&SETTERS
	public String getIngrediente1() {
		return ingrediente1;
	}

	public void setIngrediente1(String ingrediente1) {
		this.ingrediente1 = ingrediente1;
	}

	public String getIngrediente2() {
		return ingrediente2;
	}

	public void setIngrediente2(String ingrediente2) {
		this.ingrediente2 = ingrediente2;
	}

	public String getQueso() {
		return queso;
	}

	public void setQueso(String queso) {
		this.queso = queso;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}



	//metodo toString
	
	
	@Override
	public String toString() {
		return "Pizza [ingrediente1=" + ingrediente1 + ", ingrediente2=" + ingrediente2 + ", queso=" + queso
				+ ", tama�o=" + tama�o + "]";
	}
	
	
}
