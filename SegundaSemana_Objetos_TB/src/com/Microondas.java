package com;

public class Microondas {

    private String marca;   
    private String modelo;
    private String color;
    private int potencia;
    private double precio;
    
    public Microondas() { }

    public Microondas(String marca, String modelo, String tamaño, int potencia, double precio) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.color = tamaño;
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

    public String getTamaño() {
        return color;
    }

    public void setTamaño(String tamaño) {
        this.color = tamaño;
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
