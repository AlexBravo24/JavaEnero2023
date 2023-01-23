package com;

public class ObjElectrico {

    private String modelo;
    private String marca;
    private String origen;
    public ObjElectrico(String modelo, String marca, String origen) {
	this.modelo = modelo;
	this.marca = marca;
	this.origen = origen;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    @Override
    public String toString() {
	return "ObjElectrico [" + (modelo != null ? "modelo=" + modelo + ", " : "")
		+ (marca != null ? "marca=" + marca + ", " : "") + (origen != null ? "origen=" + origen : "") + "]";
    }

    
    
}
