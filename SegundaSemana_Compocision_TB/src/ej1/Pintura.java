package ej1;

public class Pintura {
    
    private String marca;
    private String modelo;
    private String tipo;
    private String lt;
    private String color;
    
    public Pintura() {}

    public Pintura(String marca, String modelo, String tipo, String lt, String color) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.tipo = tipo;
	this.lt = lt;
	this.color = color;
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

    public String getLt() {
        return lt;
    }

    public void setLt(String lt) {
        this.lt = lt;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
	return "Pintura [" + (marca != null ? "marca=" + marca + ", " : "")
		+ (modelo != null ? "modelo=" + modelo + ", " : "") + (tipo != null ? "tipo=" + tipo + ", " : "")
		+ (lt != null ? "lt=" + lt + ", " : "") + (color != null ? "color=" + color : "") + "]";
    }
    
    
}
