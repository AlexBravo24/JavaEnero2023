package com;

public class Ventilador {
    
    private String marca;
    private String modelo;
    private String tipo;
    private int naspas;
    private String presion;
    
    public Ventilador(){}

    public Ventilador(String marca, String modelo, String tipo, int naspas, String presion) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.tipo = tipo;
	this.naspas = naspas;
	this.presion = presion;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNaspas() {
        return naspas;
    }

    public void setNaspas(int naspas) {
        this.naspas = naspas;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    
    @Override
    public String toString() {
	return "Ventilador [" + (marca != null ? "marca=" + marca + ", " : "")
		+ (modelo != null ? "modelo=" + modelo + ", " : "") + (tipo != null ? "tipo=" + tipo + ", " : "")
		+ "número de aspas=" + naspas + ", presion=" + presion + "]";
    }
    
    
}
