package com;

public class Cursos {
	
	private int edades;
	private int durancion;
	private int cupo;
	private double costo;
	private String fechaInicio;
	private String fechaFinal;
	
	private Arduino arduinoUno;
	private Desarrolloweb web;
	private Videojuegos juegos;
	
	public Cursos() {
		
	}

	public Cursos(int edades, int durancion, int cupo, double costo, String fechaInicio, String fechaFinal,
			Arduino arduinoUno, Desarrolloweb web, Videojuegos juegos) {
		super();
		this.edades = edades;
		this.durancion = durancion;
		this.cupo = cupo;
		this.costo = costo;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.arduinoUno = arduinoUno;
		this.web = web;
		this.juegos = juegos;
	}

	public int getEdades() {
		return edades;
	}

	public void setEdades(int edades) {
		this.edades = edades;
	}

	public int getDurancion() {
		return durancion;
	}

	public void setDurancion(int durancion) {
		this.durancion = durancion;
	}

	public int getCupo() {
		return cupo;
	}

	public void setCupo(int cupo) {
		this.cupo = cupo;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Arduino getArduinoUno() {
		return arduinoUno;
	}

	public void setArduinoUno(Arduino arduinoUno) {
		this.arduinoUno = arduinoUno;
	}

	public Desarrolloweb getWeb() {
		return web;
	}

	public void setWeb(Desarrolloweb web) {
		this.web = web;
	}

	public Videojuegos getJuegos() {
		return juegos;
	}

	public void setJuegos(Videojuegos juegos) {
		this.juegos = juegos;
	}

	@Override
	public String toString() {
		return "Cursos [edades=" + edades + ", durancion=" + durancion + ", cupo=" + cupo + ", costo=" + costo
				+ ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", arduinoUno=" + arduinoUno
				+ ", web=" + web + ", juegos=" + juegos + "]";
	}
	
	
	
	

}
