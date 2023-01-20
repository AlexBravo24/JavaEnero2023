package com;

public class Persona {
  //La clase nos va servir como plantilla de un objeto  
  	//El objeto lo vamos a modelar con sus atributos y comportamientos 
  	//Atributos del objeto personal 
  	private String nombre;
  	private String sexo;
  	private int edad;
  	private int peso;
  	private int altura; 
  	
  	//Constructor vacio - el cual nos sirve como un comodin o como "dummie", //con el cual vamos a poder elegir determinados atributos 
  	public Persona() { }
  	
  	//Constructor con todos los parámetros  
  	//No hay un limite de cuantos constructores agregar en una clase 
  	public Persona(String nombre, String sexo, int edad, int peso, int altura)
  	{this.nombre = nombre; this.sexo = sexo; this.edad = edad; this.peso = peso; this.altura = altura; }

	public String getNombre() {
	    return nombre;
	}
	
	//Get & Set
	//Obtener valor
	//Asignar valor
	
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

	@Override
	public String toString() {
	    return "Persona [" + (nombre != null ? "nombre=" + nombre + ", " : "")
		    + (sexo != null ? "sexo=" + sexo + ", " : "") + "edad=" + edad + ", peso=" + peso + ", altura="
		    + altura + "]";
	}

  	
  	

}
