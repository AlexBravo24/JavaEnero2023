package com;

public class Cuenta {
    private String numCuenta; 
    private double saldo; 
    private String nip; 
    private double min; 
    private double max; 
    private String tipoCuenta; 

    public Cuenta(){}

    public Cuenta(String numCuenta, double saldo, String nip, double min, double max, String tipoCuenta) {
	super();
	this.numCuenta = numCuenta;
	this.saldo = saldo;
	this.nip = nip;
	this.min = min;
	this.max = max;
	this.tipoCuenta = tipoCuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
	return "Cuenta [" + (numCuenta != null ? "numCuenta=" + numCuenta + ", " : "") + "saldo=" + saldo + ", "
		+ (nip != null ? "nip=" + nip + ", " : "") + "min=" + min + ", max=" + max + ", "
		+ (tipoCuenta != null ? "tipoCuenta=" + tipoCuenta : "") + "]";
    }
    
    
}
