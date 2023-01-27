package Ej1;

public class CatHerra extends Empresa{
    public String nomcat;
    public String enfoque;
    public CatHerra(String nom, String origen, int fundacion, String nomcat, String enfoque) {
	super(nom, origen, fundacion);
	this.nomcat = nomcat;
	this.enfoque = enfoque;
    }
    public String getNomcat() {
        return nomcat;
    }
    public void setNomcat(String nomcat) {
        this.nomcat = nomcat;
    }
    public String getEnfoque() {
        return enfoque;
    }
    public void setEnfoque(String enfoque) {
        this.enfoque = enfoque;
    }

   
    
}
