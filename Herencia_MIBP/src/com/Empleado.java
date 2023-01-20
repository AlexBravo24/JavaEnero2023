package com;

public abstract class Empleado extends Persona {
	
	//LA herencia se realiza con la palabra "extends"
	// Para que una clase sea abstracta debe de contener al menos un método abstracto
	// Es una clase común, pero no puede instarciarse
	//La clase abstracta sirve para proteger la pantilla del objeto y realizar la herencia de la misma
		
	private double salario;
	private String RFC;
	private String horario;
	private String jefe;
	
	public Empleado () {}

	public Empleado(String nombre, String sexo, String edad, double salario, String rFC, String horario, String jefe) {
		super(nombre, sexo, edad);
		this.salario = salario;
		RFC = rFC;
		this.horario = horario;
		this.jefe = jefe;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
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
		return "Empleado [salario=" + salario + ", RFC=" + RFC + ", horario=" + horario + ", jefe=" + jefe
				+ ", getNombre()=" + getNombre() + ", getSexo()=" + getSexo() + ", getEdad()=" + getEdad() + "]";
	}

	public void checarEntrada() {
		System.out.println("Checando entrada...");
	}
	// Método abstracta es aquel que define el QUE pero no el como
	
	public abstract void trabajar ();
	
	}
	
	


