package com;

//La herencia se realize con is palabra "extends" 
public class Empleado extends Persona { 
    
    private double salario;
    private String rfc; 
    private String horario; 
    private String jefe;
    
    public Empleado() {}

    public Empleado(String nombre, String sexo, int edad, double salario, String rfc, String horario, String jefe) {
	super(nombre, sexo, edad);
	this.salario = salario;
	this.rfc = rfc;
	this.horario = horario;
	this.jefe = jefe;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
	return "Empleado [salario=" + salario + ", " + (rfc != null ? "rfc=" + rfc + ", " : "")
		+ (horario != null ? "horario=" + horario + ", " : "") + (jefe != null ? "jefe=" + jefe + ", " : "")
		+ (getNombre() != null ? "getNombre()=" + getNombre() + ", " : "")
		+ (getSexo() != null ? "getSexo()=" + getSexo() + ", " : "") + "getEdad()=" + getEdad() + "]";
    }
    
  //Metodo propio  
    public void checarEntrada() 
    { System.out.println("Checando entrada... "); }
  //Metodo abstracto - es aquel que define el QUE, Pero no el COMO 
  //  public abstract void trabajar();
}
