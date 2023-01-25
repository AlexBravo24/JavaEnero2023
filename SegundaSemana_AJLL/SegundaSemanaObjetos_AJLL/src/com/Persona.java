package com;

public class Persona {
	
	//La clase nos va a servir como plantilla para un objeto
	
	/*
	 * El objeto lo vamos a modelar con sus atributos y comportamientos
	 * ABSTRACCION
	 */
		
	//Atributos del objeto persona
	//Modificadores de acceso
	//Default, Private, Protected, Public
	//Para proteger la informacion de los objetos el modificador de acceso
	// a utilizar va a ser el private
	
	//Existen otros modificadores, como Static o Final
	
	//Static - podemos especificar un valor que no queremos cambiar
	//pero si podemo modificarlos aun con setters
	//Final - CREA VALORES INMUTABLES static final
		
	private String nombre; //modificamos el tipo de acceso, lo hacemos accesible en otros paquetes
	private String sexo;
	private  int  edad;
	private int peso;
	private int altura;
		
	//Metodos constructores
	//Construyen al objeto como tal, con sus atributos
	
	//Constructor vacio - el cual nos sirve como un comodin o como "dummie",
	//con el cual vamos a poder elegir determinados atributos
	//Muchas veces con un constructor vacio es suficiente
	
	public Persona() {
		
	}

	
	//Constructor con todos los parametros
	//Clic derecho > source > generate Constructor Usign Fields
	//No hay limite de constrctores en una clase
	
	
	public Persona(String nombre, String sexo, int edad, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}


	
	//Getters&Setters
	
	//Getter -  devolver el valor de un atributo
	//Setter - establecer el valor del atributo especificado
	// click derecho > source > Generate Getters & Setters
	
	
	//AL TENER EL CONSTRUCTOR VACIO SE PUEDE ACCEDER A LOS PARAMETROS
	//DE NUESTROS ATRIBUTOS MEDIANTE GET Y SET
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

//
//	public int getPeso() {
//		return peso;
//	}
//
//
//	public void setPeso(int peso) {
//		this.peso = peso;
//	}
//
//
//	public int getAltura() {
//		return altura;
//	}
//
//
//	public void setAltura(int altura) {
//		this.altura = altura;
//	}


	//Nos permite mostrar los atributos, actuando como una especie de
	//"radiografia" del objeto.
	//Se muestra como una especie de arreglo con los valores
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", altura="
				+ altura + "]";
	}
	
	
	
		


}
