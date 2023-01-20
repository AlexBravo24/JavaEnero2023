package com;

//La herencia se realiza con la palabra "extends"
//La clase abstracta contiene al menos un método abstracto
//Es una clase comun, pero no puede instanciarse.
//La clase abstrracta sirve para poder proteger la plantilla del objeto y 
//realizar herencia de la misma
public abstract class Empleado extends Persona {
	
	private double salario;
	private String rfc;
	private String horario;
	private String jefe;
	
	public Empleado() {
		
	}

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
	
	//Método abstracto
	public void checarEntrada() {
		System.out.println("Checando entrada... ");
	}
	
	//Método abstracto - es aquel que define el que, pero no el como
	
	public abstract void trabajar();
	
	
	
	
	
}
