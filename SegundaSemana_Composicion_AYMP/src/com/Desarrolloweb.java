package com;

public class Desarrolloweb {
	
	private int edades;
	private String materiales;
	private String curso1;
	private String curso2;
	private String curso3;
	
	public Desarrolloweb() {
	}

	public Desarrolloweb(int edades, String materiales, String curso1, String curso2, String curso3) {
		super();
		this.edades = edades;
		this.materiales = materiales;
		this.curso1 = curso1;
		this.curso2 = curso2;
		this.curso3 = curso3;
	}

	public int getEdades() {
		return edades;
	}

	public void setEdades(int edades) {
		this.edades = edades;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getCurso1() {
		return curso1;
	}

	public void setCurso1(String curso1) {
		this.curso1 = curso1;
	}

	public String getCurso2() {
		return curso2;
	}

	public void setCurso2(String curso2) {
		this.curso2 = curso2;
	}

	public String getCurso3() {
		return curso3;
	}

	public void setCurso3(String curso3) {
		this.curso3 = curso3;
	}

	@Override
	public String toString() {
		return "Desarrolloweb [edades=" + edades + ", materiales=" + materiales + ", curso1=" + curso1 + ", curso2="
				+ curso2 + ", curso3=" + curso3 + "]";
	}
	
	

}
