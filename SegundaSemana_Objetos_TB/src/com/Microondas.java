package com;

public class Microondas {

    private String marca;   
    private String modelo;
    private String color;
    private int potencia;
    private double precio;
    
    public Microondas() { }

    public Microondas(String marca, String modelo, String tama�o, int potencia, double precio) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.color = tama�o;
	this.potencia = potencia;
	this.precio = precio;
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

    public String getTama�o() {
        return color;
    }

    public void setTama�o(String tama�o) {
        this.color = tama�o;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    @Override
    public String toString() {
	return "Microondas [" + (marca != null ? "marca=" + marca + ", " : "")
		+ (modelo != null ? "modelo=" + modelo + ", " : "") + (color != null ? "color=" + color + ", " : "")
		+ "potencia=" + potencia + "W, precio=$" + precio + "]";
    }
    
    
}
