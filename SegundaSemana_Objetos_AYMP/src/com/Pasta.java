package com;

public class Pasta {
	private String porcion;
	private String ingrediente1;
	private String ingrediente2;
	private String ingrediente3;
	
	public Pasta() {
		
	}

	public Pasta(String porcion, String ingrediente1, String ingrediente2, String ingrediente3) {
		super();
		this.porcion = porcion;
		this.ingrediente1 = ingrediente1;
		this.ingrediente2 = ingrediente2;
		this.ingrediente3 = ingrediente3;
	}

	public String getPorcion() {
		return porcion;
	}

	public void setPorcion(String porcion) {
		this.porcion = porcion;
	}

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

	public String getIngrediente3() {
		return ingrediente3;
	}

	public void setIngrediente3(String ingrediente3) {
		this.ingrediente3 = ingrediente3;
	}

	@Override
	public String toString() {
		return "Pasta [porcion=" + porcion + ", ingrediente1=" + ingrediente1 + ", ingrediente2=" + ingrediente2
				+ ", ingrediente3=" + ingrediente3 + "]";
	}

	
	
	

}
