package com;

public class Cuenta {
	
	//Atributos de la cuenta
	private String numeroCuenta;
	private double saldo;
	private String nip;
	private double min;
	private double max;
	private String tipoCuenta;
	
	public Cuenta() {}

	public Cuenta(String numeroCuenta, double saldo, String nip, double min, double max, String tipoCuenta) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.nip = nip;
		this.min = min;
		this.max = max;
		this.tipoCuenta = tipoCuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
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
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", nip=" + nip + ", min=" + min + ", max="
				+ max + ", tipoCuenta=" + tipoCuenta + "]";
	}
	
	
	
	
	
}
