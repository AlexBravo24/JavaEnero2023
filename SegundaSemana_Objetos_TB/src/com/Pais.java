package com;

public class Pais {
	
    private String nombre;
    private String cdcapital;
    private int prefijo;
    private double censo;
    
    public Pais() {}

    public Pais(String nombre, String cdcapital, int prefijo, double censo) {
	super();
	this.nombre = nombre;
	this.cdcapital = cdcapital;
	this.prefijo = prefijo;
	this.censo = censo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCdcapital() {
        return cdcapital;
    }

    public void setCdcapital(String cdcapital) {
        this.cdcapital = cdcapital;
    }

    public int getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(int prefijo) {
        this.prefijo = prefijo;
    }

    public double getCenso() {
        return censo;
    }

    public void setCenso(double censo) {
        this.censo = censo;
    }

    @Override
    public String toString() {
	return "Pais [" + (nombre != null ? "nombre=" + nombre + ", " : "")
		+ (cdcapital != null ? "cdcapital=" + cdcapital + ", " : "") + "prefijo=" + prefijo + ", censo=" + censo
		+ "]";
    }  
    
}
