package com;

public class Transaccion 
{
    private int ingr;
    private int monto;    
    private int cambio;
    private String idProd;
    public Transaccion(int ingr, int monto, int cambio, String idProd) {
	super();
	this.ingr = ingr;
	this.monto = monto;
	this.cambio = cambio;
	this.idProd = idProd;
    }
    public int getIngr() {
        return ingr;
    }
    public void setIngr(int ingr) {
        this.ingr = ingr;
    }
    public int getMonto() {
        return monto;
    }
    public void setMonto(int monto) {
        this.monto = monto;
    }
    public int getCambio() {
        return cambio;
    }
    public void setCambio(int cambio) {
        this.cambio = cambio;
    }
    public String getIdProd() {
        return idProd;
    }
    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }
    @Override
    public String toString() {
	return "Transaccion [ingr=" + ingr + ", monto=" + monto + ", cambio=" + cambio + ", "
		+ (idProd != null ? "idProd=" + idProd : "") + "]";
    }
    
    
    
}
