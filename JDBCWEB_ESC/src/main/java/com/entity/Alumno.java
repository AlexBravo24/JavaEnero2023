package com.entity;

import java.sql.Date;

public class Alumno {
	private int idAlumno;
	private String nombre;
	private Date fechaNac;
	private String sexo;
	private String curp;
	private String grado;
	private int status;
	
	public Alumno() {}

	public Alumno(int idAlumno, String nombre, Date fechaNac, String sexo, String curp, String grado, int status) {
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.curp = curp;
		this.grado = grado;
		this.status = status;
	}

	/**
	 * @return the idAlumno
	 */
	public int getIdAlumno() {
		return idAlumno;
	}

	/**
	 * @param idAlumno the idAlumno to set
	 */
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fechaNac
	 */
	public Date getFechaNac() {
		return fechaNac;
	}

	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the curp
	 */
	public String getCurp() {
		return curp;
	}

	/**
	 * @param curp the curp to set
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}

	/**
	 * @return the grado
	 */
	public String getGrado() {
		return grado;
	}

	/**
	 * @param grado the grado to set
	 */
	public void setGrado(String grado) {
		this.grado = grado;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", sexo=" + sexo
				+ ", curp=" + curp + ", grado=" + grado + ", status=" + status + "]";
	}
	
	
	

}
