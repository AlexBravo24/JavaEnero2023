package com;

//La herencia se realiza con la palabra extends
//Para que una clse se vuelva Abstracta debe cpntener por lo menos un metodo abstracto
//Es una clase comun, pero no puede instanciarse.
//La clase abstracta sirve para proteger la plantilla del objeto y realizar
public abstract class Empleado extends Persona { //La clase Empleado hereda lo de la clase Persona
	
	private  double salario;
	private String rfc;
	private String horario;
	private String jefe;
	
	public Empleado () {} //Permite utilizar los GETTERS&SETTERS y "setear" algunos parametros nada mas

	//Constructor con todos los parametros de Empleado mas los atributos de
	//la super clase o la clsae heredada
	public Empleado(String nombre, String sexo, int edad, double salario, String rfc, String horario, String jefe) {
		super(nombre, sexo, edad);//Es el super constructor de la clase heredada
		this.salario = salario;
		this.rfc = rfc;
		this.horario = horario;
		this.jefe = jefe;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getJefe() {
		return jefe;
	}

	public void setJefe(String jefe) {
		this.jefe = jefe;
	}
	
	
	//Para crear el to String se deben seleccionar los inherits methods para que 
	//Se puedan imprimir los datos de la clase heredada
	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", rfc=" + rfc + ", horario=" + horario + ", jefe=" + jefe
				+ ", getNombre()=" + getNombre() + ", getSexo()=" + getSexo() + ", getEdad()=" + getEdad() + "]";
	}
	
	
	//Metodo propio
	public void checarEntrada() {
		System.out.println("Checando entrada...");
	}
	
	//Metodo abstracto -aquel que define el QUE, pero no el COMO
	public abstract void trabajar();
	

}
