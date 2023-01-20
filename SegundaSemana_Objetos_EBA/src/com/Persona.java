package com;

public class Persona {

	
	// la clase nos va a servir como plantilla de un objeto
		
	/* El objeto lo vamos a modelar con sus atributos y comportamientos
	 * 
	*/
		
	//Atributos del objeto persona
	
	//Modificadores de acceso
	// Default, Private, Protected, Public
	//Para proteger la informacion de los objetos el modificador dde acceso
	//a utilizar va a ser el private
	
	//Existen otros modificadores o especificadoress de acceso
	//static o el final
	//Static - podemos especifical un valor que no queremos cambiar
	// pero si podemos modificarlos aun con setters
	//Modificador Final - crear valores inmutables
	
	private String nombre;
	private String sexo;
	public static final int edead = 30;
	private int peso;
	private int altura;
	
	
    //Métodos constructores
	//Contruyen al objeto como tal, con sus atributos.
	
	// Constructor vacio - el cual nos sirve como un comodin o como "dummie",
	//con el cual vamos a poder elegir determinados atributos.
		
	public Persona() {
		
	}

	// Contructor con todos los parámetros
	public Persona(String nombre, String sexo, int peso, int altura) {
		this.nombre = nombre;
		this.sexo = sexo;
		
		this.peso = peso;
		this.altura = altura;
	}
	
	// geter&Setters
	//Getter - devolvera el valor de un atrivuto
	//Setter - estableceta el valor del atributo especificado.
	
	
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

	public int getEdead() {
		return edead;
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

	
	// Nos permite mostrar los atributos, actuando como una especie de 
	//"Radiografia" del objeto.
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edead=" + edead + ", peso=" + peso + ", altura="
				+ altura + "]";
	}
	
	
	
		
		

}
