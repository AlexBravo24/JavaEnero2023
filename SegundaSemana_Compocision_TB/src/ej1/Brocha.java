package ej1;

public class Brocha {

    private String marca;
    private String modelo;
    private String cerda;
    private String tamaño;
    
    public Brocha(){}

    public Brocha(String marca, String modelo, String cerda, String tamaño) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.cerda = cerda;
	this.tamaño = tamaño;
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
	return "Brocha [" + (marca != null ? "marca=" + marca + ", " : "")
		+ (modelo != null ? "modelo=" + modelo + ", " : "") + (cerda != null ? "cerda=" + cerda + ", " : "")
		+ (tamaño != null ? "tamaño=" + tamaño : "") + "]";
    }
    
    
}
