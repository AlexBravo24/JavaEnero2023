package com;

public abstract class Objeto {

    private String marca;
    private String modelo;
    
    public Objeto() {}

    public Objeto(String marca, String modelo) {
	super();
	this.marca = marca;
	this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
	return "Objeto [" + (marca != null ? "marca=" + marca + ", " : "") + (modelo != null ? "modelo=" + modelo : "")
		+ "]";
    }
    
    public abstract void sumar();
    public abstract void restar();
    public abstract void multi();
    public abstract void div();
    
}
