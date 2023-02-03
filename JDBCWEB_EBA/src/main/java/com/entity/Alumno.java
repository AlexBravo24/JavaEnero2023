package com.entity;

import java.sql.Date;

public class Alumno {
	
	private int id_alumno;
	private String nombre;
	private Date fechaNac;
	private String sexo;
	private String curp;
	private String grado;
	private int status;
	
	public Alumno() {}

	public Alumno(int id_alumno, String nombre, Date fechaNac, String sexo, String curp, String grado, int status) {
		this.id_alumno = id_alumno;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.curp = curp;
		this.grado = grado;
		this.status = status;
	}

	public int getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	

	@Override
	public String toString() {
		return "Alumno [id_alumno=" + id_alumno + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", sexo=" + sexo
				+ ", curp=" + curp + ", grado=" + grado + ", status=" + status + "]";
	}
	
	
	
	

}
