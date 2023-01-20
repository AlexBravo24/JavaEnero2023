package com;



//La herencia se realiza con la palabra 'extends'
//Para que una clase sea abstracta debe contener por lo menos un método abstracto
//Es una clase común pero no puede instanciarse
//La clase abstracta sirve para proteger la plantilla del objeto y realizar herencia de la misma	
public abstract class Empleado extends Persona {
	
	private double salario;
	private String rfc;
	private String horario;
	private String jefe;
	
	public Empleado () {}

	//Constructor con todos los parámetros de empleado más los atribuutos de la
	//super clase o clase padre
	public Empleado(String nombre, String sexo, int edad, double salario, String rfc, String horario, String jefe) {
		super(nombre, sexo, edad);
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

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", rfc=" + rfc + ", horario=" + horario + ", jefe=" + jefe
				+ ", getNombre()=" + getNombre() + ", getSexo()=" + getSexo() + ", getEdad()=" + getEdad() + "]";
	}
	
	
	//Método propio
	public void checarEntrada() {
		System.out.println("Checando entrada...");
	}
	
	//Método abstracto - es aquel que define el QUE, pero no el COMO
	public abstract void trabajar();
	
	
	

}
