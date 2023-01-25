package com;

public class Persona {
	
	private String nombre;
	private String sexo;
	private int edad;
	
	
	public Persona() {}
	
	

	public Persona(String nombre, String sexo, int edad) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	
	
	//Acciones que tiene una persona (METODOS)
	/* Respirar
	 * Comer
	 * Caminar
	 */
	
	//Metodos propios
	
	public void respirar() {
		System.out.println(nombre + "Respirando...");
	}
	
	//Representando un metodo polimorfico
	
	public void comer() {
		System.out.println(nombre + " esta comiendo...");
	}
	
	public void comer(String alimento) {
		System.out.println(nombre + " esta comiendo " + alimento);
	}
	
	
}
