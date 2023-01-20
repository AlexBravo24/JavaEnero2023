package com;

public class Videojuegos {
	private int edades;
	private String curso1;
	private String curso2;
	private String curso3;
	private String proyectofinal;
	
	public Videojuegos() {
	}

	public Videojuegos(int edades, String curso1, String curso2, String curso3, String proyectofinal) {
		super();
		this.edades = edades;
		this.curso1 = curso1;
		this.curso2 = curso2;
		this.curso3 = curso3;
		this.proyectofinal = proyectofinal;
	}

	public int getEdades() {
		return edades;
	}

	public void setEdades(int edades) {
		this.edades = edades;
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

	public String getProyectofinal() {
		return proyectofinal;
	}

	public void setProyectofinal(String proyectofinal) {
		this.proyectofinal = proyectofinal;
	}

	@Override
	public String toString() {
		return "Videojuegos [edades=" + edades + ", curso1=" + curso1 + ", curso2=" + curso2 + ", curso3=" + curso3
				+ ", proyectofinal=" + proyectofinal + "]";
	}
	
	

}
