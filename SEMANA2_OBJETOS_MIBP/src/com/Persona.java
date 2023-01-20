package com;

public class Persona {

	
		
		//La clase persona nos va a servir como plantilla de un objeto
		
		/*
		 * El objeto lo vamos a modelar con sus atributos y sus comportamientos
		 */
		
	    //Atributos del objeto persona
		// Modificadores de acceso
		// Default, private, protected, public.
		// Para proteger la información de los objetos el modificador de acceso
		// El que se utiliza es el private
		//Exiten otros modificadores de acceso
		// Static o Final
		//Static podemos especificar un valor que no queremos cambiar pero sí podemos mpodificarlos aun con setters
		// Modificador final - crear valores inmutables
		
	    private	String nombre; //Atributos del objeto persona
		String sexo;
		int edad;
		int peso;
		double altura;
		
		// Métodos constructores
		//Construyen al objeto cómo tal, con sus atributos
		
		//Constructor vacio -  el cual nos sirve como un comodín o como "dummie"
		// Con el cual vamos a poder elegir determinados atributos
		
		public Persona() {
		
		}

		
		
		
		//Constructor con todos sus parámetros
		// No hay un límite de cuantos constructores agragar en una clase
		
		public Persona(String nombre, String sexo, int edad, int peso, double altura) {
			this.nombre = nombre;
			this.sexo = sexo;
			this.edad = edad;
			this.peso = peso;
			this.altura = altura;
		}


		//Getter&Setters
		
				//Getter - Devolver el valor de un atributo
				//Setter - establecer el valor de un atributo especificado
				

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




		public double getAltura() {
			return altura;
		}




		public void setAltura(double altura) {
			this.altura = altura;
		}


		//Nos permite mostar los atributos, actuando como una especie de radiografia del objeto

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", altura="
					+ altura + "]";
		}
		
		
		
		
		
		
		
}


