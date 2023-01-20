package com;

public class enfrijoladas {
	
	private int cantidad ;
	private String crema;
	private String queso;
	private String relleno;
	
	public enfrijoladas() {
		
	}

	public enfrijoladas(int cantidad, String crema, String queso, String relleno) {
		super();
		this.cantidad = cantidad;
		this.crema = crema;
		this.queso = queso;
		this.relleno = relleno;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getCrema() {
		return crema;
	}

	public void setCrema(String crema) {
		this.crema = crema;
	}

	public String getQueso() {
		return queso;
	}

	public void setQueso(String queso) {
		this.queso = queso;
	}

	public String getRelleno() {
		return relleno;
	}

	public void setRelleno(String relleno) {
		this.relleno = relleno;
	}

	@Override
	public String toString() {
		return "enfrijoladas [cantidad=" + cantidad + ", crema=" + crema + ", queso=" + queso + ", relleno=" + relleno
				+ "]";
	}

	
}
