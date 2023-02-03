package com.dto;

public class Objeto_DTO {

    private String origen;
    private String hors;
    private String piloto;
    private String modelo;
    
    public Objeto_DTO() {}

    public Objeto_DTO(String origen, String hors, String piloto, String modelo) {
	super();
	this.origen = origen;
	this.hors = hors;
	this.piloto = piloto;
	this.modelo = modelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getHors() {
        return hors;
    }

    public String getPiloto() {
        return piloto;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
	return "Objeto_DTO [" + (origen != null ? "origen=" + origen + ", " : "")
		+ (hors != null ? "hors=" + hors + ", " : "") + (piloto != null ? "piloto=" + piloto + ", " : "")
		+ (modelo != null ? "modelo=" + modelo : "") + "]";
    }
    
    
    
}
