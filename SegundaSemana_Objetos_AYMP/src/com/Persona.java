package com;

public class Persona {
	//La clase nos va a servir como plantilla de un objeto
	
	//El objeto lo vamos a modelar con sus atributos y comportamientos
	
	//Atributos del objeto persona
	//Modificadores de acceso: default, private, protected, public 
	//Para proteger la información de los objetos se utilizará el private
	
	
	
	public String nombre;
	private String sexo;
	private int edad;
	private int peso;
	private int altura;
	
	//Métodos constructores
	//Construir al objeto con sus atributos
	//Constructor vacio _ el cual nos sirve como un comodin o como "dummie", con el cual vamos a poder elegir
	//determinados atributos
	
	public Persona() {
		
	}
	
	
    //Constructor con todos los paramétros 
	//No hay un limite de cuentas constructores agregar en una clase
	public Persona(String nombre, String sexo, int edad, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
//Manera de accder a los atributos
	//Getter&Setters
	
	//Getter - devolver el valor de atributo
	//Setter - establecer el valor del atributo especificado

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

	//Nos permite mostrar los atributos como una especie de radiografía del objeto
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", altura="
				+ altura + "]";
	}
	
	
	
	
	
	
	
	
	

}
