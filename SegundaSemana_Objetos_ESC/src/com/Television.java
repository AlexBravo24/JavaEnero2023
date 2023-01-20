package com;

public class Television {
	
	private int pulgadas;
	private String resolucion;
	private boolean smartv;

	//Constructor Vacio
	public Television() {

	}
	
	//Constructor con todos los atributos
	public Television(int pulgadas, String resolucion, boolean smartv) {
		super();
		this.pulgadas = pulgadas;
		this.resolucion = resolucion;
		this.smartv = smartv;
	}

	//getters y setters
	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSmartv() {
		return smartv;
	}

	public void setSmartv(boolean smartv) {
		this.smartv = smartv;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Television [pulgadas=" + pulgadas + ", resolucion=" + resolucion + ", smartv=" + smartv + "]";
	}
	
	
	
	
	

}
