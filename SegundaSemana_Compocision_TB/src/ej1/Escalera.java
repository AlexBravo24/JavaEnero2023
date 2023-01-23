package ej1;

public class Escalera {

    private String marca;
    private String modelo;
    private String tamaño;
    private String color;
    private String material;
    
    public Escalera() {}

    public Escalera(String marca, String modelo, String tamaño, String color, String material) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.tamaño = tamaño;
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
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
		+ (modelo != null ? "modelo=" + modelo + ", " : "") + (tamaño != null ? "tamaño=" + tamaño + ", " : "")
		+ (color != null ? "color=" + color + ", " : "") + (material != null ? "material=" + material : "")
		+ "]";
    }
    
    
}
