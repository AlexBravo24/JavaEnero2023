package com;

public class Musica {

	String genero;
	String artista;
	String cancion;
	int año;
	public Musica(String genero, String artista, String cancion, int año) {
		super();
		this.genero = genero;
		this.artista = artista;
		this.cancion = cancion;
		this.año = año;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getCancion() {
		return cancion;
	}
	public void setCancion(String cancion) {
		this.cancion = cancion;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	@Override
	public String toString() {
		return "Musica [genero=" + genero + ", artista=" + artista + ", cancion=" + cancion + ", año=" + año + "]";
	}
	
	
	
	
}
