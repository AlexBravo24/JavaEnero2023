package com;

public class Almacenamiento {

    private String marca; 
    private String tipo; 
    private double formatof; 
    private double capacidad; 
    private String tecnologia;
    
    public Almacenamiento() {}

    public Almacenamiento(String marca, String tipo, double formatof, double capacidad, String tecnologia) {
	super();
	this.marca = marca;
	this.tipo = tipo;
	this.formatof = formatof;
	this.capacidad = capacidad;
	this.tecnologia = tecnologia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getFormatof() {
        return formatof;
    }

    public void setFormatof(double formatof) {
        this.formatof = formatof;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
	return "Almacenamiento [" + (marca != null ? "marca=" + marca + ", " : "")
		+ (tipo != null ? "tipo=" + tipo + ", " : "") + "formatof=" + formatof + ", capacidad=" + capacidad
		+ ", " + (tecnologia != null ? "tecnologia=" + tecnologia : "") + "]";
    }
    
    
}
