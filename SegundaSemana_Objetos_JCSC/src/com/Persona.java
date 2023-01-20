package com;

public class Persona {
	
	//La clase sirve como plantilla de un objeto
	
	//El objeto se modela con sus atributos y comportamientos
	 
	
	//Modificadores de acceso
	//Default, Private, Protected, Public
	//Para proteger la información de los objetos el modificadord de acceso
	//a utilizar va a ser el private
	
	/*
	 * Existen otros modificadores o especificadores de acceso
	 * Static o el Final
	 * Static - podemos especificar un valor que no queremos cambiar,
	 * pero si podemos modificarlo aún con Setters
	 * 
	 * Final - crear valores inmutables
	 */
	
	//Atributos del objeto o persona
	private String nombre;
	private String sexo;
	private int edad;
	private int peso;
	private int altura;
	
	//Métodos cconstructores
	//Construyen al objeto como tal, con sus atributos
	
	//Constructor vacío - el cual nos sirve como comodín "dummy",
	// Con el cual vamos a poder elegir determinados atributos
	
	public Persona() {	
	
	}

	
	//Constructor con todos los parámetros
	//No hay límite de cuantos constructores agregar en una clase
	public Persona(String nombre, String sexo, int edad, int peso, int altura) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	//Getter&Setters
	
		//Getter - devuelve el valor de un atributo 
		//Setter - establece el valor del atributo especificado

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


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	
	//Permite mostrar los atributos, actuando como una especie de radiografía del objeto
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", altura="
				+ altura + "]";
	}
	

	
	
	
	
	
	
	
	
	
	

}
