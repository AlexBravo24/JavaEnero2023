package com.entity;

import java.sql.Date;

public class Alumno {
	
	private int idalumno;
	private String nombre;
	private Date fechanac;
	private String sexo;
	private String curp;
	private String grado;
	private int status;
	
	public Alumno () {}

	public Alumno(int idalumno, String nombre, Date fechanac, String sexo, String curp, String grado, int status) {
		
		this.idalumno = idalumno;
		this.nombre = nombre;
		this.fechanac = fechanac;
		this.sexo = sexo;
		this.curp = curp;
		this.grado = grado;
		this.status = status;
	}

	public int getIdalumno() {
		return idalumno;
	}

	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechanac() {
		return fechanac;
	}

	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
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
		return "Alumno [idalumno=" + idalumno + ", nombre=" + nombre + ", fechanac=" + fechanac + ", sexo=" + sexo
				+ ", curp=" + curp + ", grado=" + grado + ", status=" + status + "]";
	}
	
	
	

}
