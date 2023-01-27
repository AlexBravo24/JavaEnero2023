package ej1;

public class Escalera {

    private String marca;
    private String modelo;
    private String tama�o;
    private String color;
    private String material;
    
    public Escalera() {}

    public Escalera(String marca, String modelo, String tama�o, String color, String material) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.tama�o = tama�o;
	this.color = color;
	this.material = material;
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

    public String getTama�o() {
        return tama�o;
    }

    public void setTama�o(String tama�o) {
        this.tama�o = tama�o;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
	return "Escalera [" + (marca != null ? "marca=" + marca + ", " : "")
		+ (modelo != null ? "modelo=" + modelo + ", " : "") + (tama�o != null ? "tama�o=" + tama�o + ", " : "")
		+ (color != null ? "color=" + color + ", " : "") + (material != null ? "material=" + material : "")
		+ "]";
    }
    
    
}
