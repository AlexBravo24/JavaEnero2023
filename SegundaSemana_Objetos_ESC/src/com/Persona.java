package com;

public class Persona {
	
	//La clase persona va a servir como plantilla de un objeto
	
	/*El objeto lo vamos a modelar con sus atributos y comportamientos
	 * 
	 */
	
	//Atributos del objeto persona
	
	//Modificadores de acceso
	//Default, Private, protected, Public
	//Para proteger la informacion de los objetos el modificador de acceso
	//a utilizar va a ser el private
	
	//Existen otros modificadores o especificadores de acceso
	//static --> Podemos especificar un valor que no queremos cambiar, pero si podemos 
				//modificarlo con setters
	//final --> Crear valores inmutables
	
	private String nombre;
	private String sexo;
	private static final int edad=30;
	private int peso;
	private int altura;
	
	//**********Metodos construcctores********** 
	//Construyen al objeto como tal, con sus atributos
	
	//Constructor Vacio --> El cual nos a servir como un comodin o como "dummie",
						//con el cual vamos a poder elegir determinados atributos
	
	public Persona() {
		
	}
	
	//Constructor con todos los parametros
	//No hay un limit de cuantos constructores agregar en una clase
	
	public Persona(String nombre, String sexo, int peso, int altura) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	//Getter&Setters
	
		//Getter --> Devolver el valor de un atributo
		//Setter --> Establecer el valor de un atributo especificado
	
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

	//Nos permite mostrar los atributos como una especie de 
	//"radiografia" del objeto. 
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", altura="
				+ altura + "]";
	}
	
	
	
	
	
	
	
	
	

}
