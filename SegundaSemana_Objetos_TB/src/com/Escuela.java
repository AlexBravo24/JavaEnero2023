package com;

public class Escuela {

    private String nombre;
    private String direccion;
    private String tipo;
    private String nivel;
    private int nestudiantes;
    
    public Escuela() {}   
    
    public Escuela(String nombre, String direccion, String tipo, String nivel, int nestudiantes) {
	super();
	this.nombre = nombre;
	this.direccion = direccion;
	this.tipo = tipo;
	this.nivel = nivel;
	this.nestudiantes = nestudiantes;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public int getNestudiantes() {
        return nestudiantes;
    }
    public void setNestudiantes(int nestudiantes) {
        this.nestudiantes = nestudiantes;
    }


    @Override
    public String toString() {
	return "Escuela [" + (nombre != null ? "nombre=" + nombre + ", " : "")
		+ (direccion != null ? "direccion=" + direccion + ", " : "")
		+ (tipo != null ? "tipo=" + tipo + ", " : "") + (nivel != null ? "nivel=" + nivel + ", " : "")
		+ "estudiantes=+" + nestudiantes + "]";
    }
   
    
}
