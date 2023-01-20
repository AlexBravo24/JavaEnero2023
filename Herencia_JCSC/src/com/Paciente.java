package com;

public abstract class Paciente extends Persona {
	
	private String enfermedad;
	private int dias;
	private String doctor;
	private String medicamento;
	
	public Paciente () {}

	public Paciente(String nombre, String sexo, int edad, String enfermedad, int dias, String doctor,
			String medicamento) {
		super(nombre, sexo, edad);
		this.enfermedad = enfermedad;
		this.dias = dias;
		this.doctor = doctor;
		this.medicamento = medicamento;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	@Override
	public String toString() {
		return "Paciente [enfermedad=" + enfermedad + ", dias=" + dias + ", doctor=" + doctor + ", medicamento="
				+ medicamento + ", getNombre()=" + getNombre() + ", getSexo()=" + getSexo() + ", getEdad()=" + getEdad()
				+ "]";
	}
	
	public void statusA () {
		System.out.println("Estable");
	}
	
	

}
