package com;

public class Pizza {

	private String typo;
	private String acompañamiento;
	private int numIngredientes;
	private String ingExtra;
	
	public Pizza() {
		
	}

	public Pizza(String typo, String acompañamiento, int numIngredientes, String ingExtra) {
		super();
		this.typo = typo;
		this.acompañamiento = acompañamiento;
		this.numIngredientes = numIngredientes;
		this.ingExtra = ingExtra;
	}

	public String getTypo() {
		return typo;
	}

	public void setTypo(String typo) {
		this.typo = typo;
	}

	public String getAcompañamiento() {
		return acompañamiento;
	}

	public void setAcompañamiento(String acompañamiento) {
		this.acompañamiento = acompañamiento;
	}

	public int getNumIngredientes() {
		return numIngredientes;
	}

	public void setNumIngredientes(int numIngredientes) {
		this.numIngredientes = numIngredientes;
	}

	public String getIngExtra() {
		return ingExtra;
	}

	public void setIngExtra(String ingExtra) {
		this.ingExtra = ingExtra;
	}

	@Override
	public String toString() {
		return "Pizza [typo=" + typo + ", acompañamiento=" + acompañamiento + ", numIngredientes=" + numIngredientes
				+ ", ingExtra=" + ingExtra + "]";
	}
	
	
	
}
