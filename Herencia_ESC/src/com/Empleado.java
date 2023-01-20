package com;

//La herencia se realiza con la palabra "extends"
//Para que una clase sea abstracta debe contener por lo menos un metodo abstracto
//Es una clase comun, pero no puede instanciarse.
//La clase abstracta sirve para proteger la platilla del objeto y realiza
public abstract class Empleado extends Persona {
	
	private double Salario;
	private String rfc;
	private String horario;
	private String jefe;
	
	public Empleado() {
		
	}

	//Constructor con todos los parametros de empleado mas los atributos 
	//de la super clase o clase padre
	
	public Empleado(String nombre, String sexo, int edad, double salario, String rfc, String horario, String jefe) {
		super(nombre, sexo, edad);
		Salario = salario;
		this.rfc = rfc;
		this.horario = horario;
		this.jefe = jefe;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return Salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		Salario = salario;
	}

	/**
	 * @return the rfc
	 */
	public String getRfc() {
		return rfc;
	}

	/**
	 * @param rfc the rfc to set
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	/**
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}

	/**
	 * @param horario the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}

	/**
	 * @return the jefe
	 */
	public String getJefe() {
		return jefe;
	}

	/**
	 * @param jefe the jefe to set
	 */
	public void setJefe(String jefe) {
		this.jefe = jefe;
	}

	@Override
	public String toString() {
		return "Empleado [Salario=" + Salario + ", rfc=" + rfc + ", horario=" + horario + ", jefe=" + jefe
				+ ", getNombre()=" + getNombre() + ", getSexo()=" + getSexo() + ", getEdad()=" + getEdad() + "]";
	}

	//Metrodo Propio
	public void checarEntrada() {
		System.out.println("Checando entrada ... ");
	}
	
	//**********
	//El metod abstracto  --> Es aquel que define el QUE, pero no el como
	
	public abstract void trabajar();
	



}
