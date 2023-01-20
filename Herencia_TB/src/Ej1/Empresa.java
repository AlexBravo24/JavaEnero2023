package Ej1;

public class Empresa {

    public String nom;
    public String origen;
    public int fundacion;
    public Empresa(String nom, String origen, int fundacion) {
	super();
	this.nom = nom;
	this.origen = origen;
	this.fundacion = fundacion;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public int getFundacion() {
        return fundacion;
    }
    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    
    
}
