package com;

// la erencia se realiza con la palabra extends
// para que una clase sea Abstracta debe contener por lo menos un Metodo obstracto
//Es una clase común, pero no puede instanciarse.
//la clase abstracta sirve para proteger la prantilla del objeto y rea

public abstract class Empleado extends Persona {
	
	private double salario;
	private String rfc;
	private String horario;
	private String jefe;
	
	public Empleado() {}

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
				+ ", Nombre=" + getNombre() + ", Sexo=" + getSexo() + ", Edad=" + getEdad() + "]";
	}
	
	// Método propio
	public void checharEntrada() {
		System.out.println("Checando entrada...");
	}
	
	//Metodo abstracto - es aquel que define el QUE 
	
	public abstract void Trabajar();
	
	
	
}
