package ej1;

public class HerramientaPintor {

    private String NomPaquete;
    private double precio;
    private Brocha bro1;
    private Brocha bro2;
    private Escalera esc;
    private Pintura pint;
    
    public HerramientaPintor(){}

    public HerramientaPintor(String nomPaquete, double precio, Brocha bro1, Brocha bro2, Escalera esc, Pintura pint) {
	super();
	NomPaquete = nomPaquete;
	this.precio = precio;
	this.bro1 = bro1;
	this.bro2 = bro2;
	this.esc = esc;
	this.pint = pint;
    }

    
    public String getNomPaquete() {
        return NomPaquete;
    }

    public void setNomPaquete(String nomPaquete) {
        NomPaquete = nomPaquete;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Brocha getBro1() {
        return bro1;
    }

    public void setBro1(Brocha bro1) {
        this.bro1 = bro1;
    }

    public Brocha getBro2() {
        return bro2;
    }

    public void setBro2(Brocha bro2) {
        this.bro2 = bro2;
    }

    public Escalera getEsc() {
        return esc;
    }

    public void setEsc(Escalera esc) {
        this.esc = esc;
    }

    public Pintura getPint() {
        return pint;
    }

    public void setPint(Pintura pint) {
        this.pint = pint;
    }

    @Override
    public String toString() {
	return "HerramientaPintor [" + (NomPaquete != null ? "NomPaquete=" + NomPaquete + ", " : "") + "precio="
		+ precio + ", " + (bro1 != null ? "bro1=" + bro1 + ", " : "")
		+ (bro2 != null ? "bro2=" + bro2 + ", " : "") + (esc != null ? "esc=" + esc + ", " : "")
		+ (pint != null ? "pint=" + pint : "") + "]";
    }

    

    

    
    
}
