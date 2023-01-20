package com;

public class Pelicula {
	
	private String nombre;
	private String duración;
	private int año;
	private String director;
	private String distribuidora;
	private int presupuesto;
	private int recaudacion;
	
	public Pelicula(String nombre, String duración, int año) {
		super();
		this.nombre = nombre;
		this.duración = duración;
		this.año = año;
	}

	public Pelicula(String nombre, String duración, int año, String director, String distribuidora, int presupuesto,
			int recaudacion) {
		super();
		this.nombre = nombre;
		this.duración = duración;
		this.año = año;
		this.director = director;
		this.distribuidora = distribuidora;
		this.presupuesto = presupuesto;
		this.recaudacion = recaudacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDuración() {
		return duración;
	}

	public void setDuración(String duración) {
		this.duración = duración;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public int getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(int recaudacion) {
		this.recaudacion = recaudacion;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", duración=" + duración + ", año=" + año + ", director=" + director
				+ ", distribuidora=" + distribuidora + ", presupuesto=" + presupuesto + ", recaudacion=" + recaudacion
				+ "]";
	}
	
	
	

}
