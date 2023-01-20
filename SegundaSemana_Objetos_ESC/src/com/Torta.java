package com;

public class Torta {
	
	private String base;
	private String ingrediente;
	private String aderezos ="Mayoneza";
	private String complementos;
	
	
	//Constructor Vacio
	public Torta() {
		
	}
	
	//Constructor con todos los atributos
	public Torta(String base, String ingrediente, String aderezos, String complementos) {
		this.base = base;
		this.ingrediente = ingrediente;
		this.aderezos = aderezos;
		this.complementos = complementos;
	}
	
	//Getter y Setter

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}

	public String getAderezos() {
		return aderezos;
	}

	public void setAderezos(String aderezos) {
		this.aderezos = aderezos;
	}

	public String getComplementos() {
		return complementos;
	}

	public void setComplementos(String complementos) {
		this.complementos = complementos;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Torta [base=" + base + ", ingrediente=" + ingrediente + ", aderezos=" + aderezos + ", complementos="
				+ complementos + "]";
	}
	
	
	
	
	
	
	
	
			
	
	
	
	
	

}
