package ej1;

public class Brocha {

    private String marca;
    private String modelo;
    private String cerda;
    private String tama�o;
    
    public Brocha(){}

    public Brocha(String marca, String modelo, String cerda, String tama�o) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.cerda = cerda;
	this.tama�o = tama�o;
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

    public String getCerda() {
        return cerda;
    }

    public void setCerda(String cerda) {
        this.cerda = cerda;
    }

    public String getTama�o() {
        return tama�o;
    }

    public void setTama�o(String tama�o) {
        this.tama�o = tama�o;
    }

    @Override
    public String toString() {
	return "Brocha [" + (marca != null ? "marca=" + marca + ", " : "")
		+ (modelo != null ? "modelo=" + modelo + ", " : "") + (cerda != null ? "cerda=" + cerda + ", " : "")
		+ (tama�o != null ? "tama�o=" + tama�o : "") + "]";
    }
    
    
}
