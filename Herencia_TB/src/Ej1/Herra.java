package Ej1;

public class Herra extends CatHerra {
    public String Modelo;
    public String Tipo;
    public String Desc;
    public Herra(String nom, String origen, int fundacion, String nomcat, String enfoque, String modelo, String tipo,
	    String desc) {
	super(nom, origen, fundacion, nomcat, enfoque);
	Modelo = modelo;
	Tipo = tipo;
	Desc = desc;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public String getDesc() {
        return Desc;
    }
    public void setDesc(String desc) {
        Desc = desc;
    }
    @Override
    public String toString() {
	return "Herra [" + (Modelo != null ? "Modelo=" + Modelo + ", " : "")
		+ (Tipo != null ? "Tipo=" + Tipo + ", " : "") + (Desc != null ? "Desc=" + Desc + ", " : "")
		+ (getNomcat() != null ? "getNomcat()=" + getNomcat() + ", " : "")
		+ (getEnfoque() != null ? "getEnfoque()=" + getEnfoque() + ", " : "")
		+ (getNom() != null ? "getNom()=" + getNom() + ", " : "")
		+ (getOrigen() != null ? "getOrigen()=" + getOrigen() + ", " : "") + "getFundacion()=" + getFundacion()
		+ "]";
    }


    
    
}
