package com;

public class Persona {
	
	private String nombre;
	private String sexo;
	private String edad;
	
	public Persona () {}

	public Persona(String nombre, String sexo, String edad) {
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

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
		
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
		};
	
	//Acciones que tiene una persona
		
		/* Respirar
		 * comer
		 * caminar
		 */
	
	// Métodos propios
		
	public void respirar() {
		
		System.out.println("Respirando...");
	}
		
	//POLIMORFISMO 
	//Habilidad de una función o método de tener varias formas distintas
	
	public void comer( ) {
		System.out.println("Comiendo...");
	}
	
	public void comer (String alimento) {
		System.out.println("Comiendo " + alimento);
	}
	
	
	
}
