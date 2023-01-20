package com;

public class Persona_AAB {
		
		//La clase nos va a sservir como plantilla de un objeto
		
		/*El objeto lo vamos a modelar con sus atributos y comportamientos
		 * 
		 */
		
	//Atributos del objeto persona
	
		//Modificadores de acceso
		//Default, Private, Protected, Public
		//Para proteger la informacion de los objetos el modificador de acceso a utilizar es el private
		
	//Modificadores o especificadores de acceso
		//static - final
		//El static permite asignar un valor inicial con la posibilidad de modificarlo con un setter
		//El final permite asignar un valor inicial que no se pueda modificar
		
		private String nombre;
		private String sexo;
		private static final int edad = 25;
		private double peso;
		private double altura;
		
		
	//Métodos constructores
		//Construyen al objeto como tal, con sus atributos
		
		//Constructor vacío - el cual nos sirve como un comodín o como "dummie",
		//con el cual vamos a poder elegir determinados atributos
		
		public Persona_AAB() {
			
		}
		
		//Constructor con todos los parámetros
		//No hay un límite de cuantos constructores agregar en una clase
		
		public Persona_AAB(String nombre, String sexo, int edad, double peso, double altura) {
			this.nombre = nombre;
			this.sexo = sexo;
			this.peso = peso;
			this.altura = altura;
		}
		
		
	//Getter&Setters
		
		//Getter - devolver el valor de un atributo
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

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

		
		//Nos permite mostrar los atributos, actuando ocmo una especie de "radiografía" del objeto.
		@Override
		public String toString() {
			return "Persona_AAB [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso
					+ ", altura=" + altura + "]";
		}
		
		
	}


