package com;

public class Persona {
	
	private String nombre;
	private String sexo;
	private int edad;
	
	public Persona() {}
	

	public Persona(String nombre, String sexo, int edad) {
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
	
	
	// Acciones que tiene ina persona 
	/*Respirar
	 * Comer
	 * Caminar
	 */
	 
	 public void Respirar() {
		 System.out.println("Esta respirando");
	 }
	
	 public void Comer() {
		 System.out.println("Comiendo...");
	 }
	 
	 public void Comer(String alimento) {
		 System.out.println("Comiendo " + alimento);
	 }
		
}
