package com;

public class cancion {
	
	private String nombre;
	private String artista;
	private String album;
	private String genero;
	private double duracionmins;
	
	public cancion() {
		
	}

	public cancion(String nombre, String artista, String album, String genero, double duracionmins) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.album = album;
		this.genero = genero;
		this.duracionmins = duracionmins;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getDuracionmins() {
		return duracionmins;
	}

	public void setDuracionmins(double duracionmins) {
		this.duracionmins = duracionmins;
	}

	@Override
	public String toString() {
		return "cancion [nombre=" + nombre + ", artista=" + artista + ", album=" + album + ", genero=" + genero
				+ ", duracionmins=" + duracionmins + "]";
	}

	
	
}
