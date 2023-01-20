package com;

public abstract class Empleado extends Persona{
	//con la palabra extends se realiza la herencia
	//Para que una clase sea abstracta debe contener por lo menos un método abstracto
	//Es una clase común, pero no puede instanciarse.
	//La clase abstarcta sirve para proteger la plantilla y realizar herencia de la misma
	
	
	//La herencia se realiza con la palabra "extends"
	
	private double salario;
	private String rfc;
	private String horario;
	private String jefe;
	
	//el constructor vacio no obliga a llenar los parametros, funciona como un comodín
	public Empleado() {	
	}
	
	
	//Constructor con todos los parámetros de empleado y los parametros heredados de la persona
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
	
	//El método abstracto es aquel que define el Qué, pero no el Cómo
	public abstract void trabajar();
	
	
	
	
	
	

}
