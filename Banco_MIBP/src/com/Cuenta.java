package com;

public class Cuenta {
	
	//Atributos que tiene una cuenta de banco
	
	private String numcuenta;
	private double saldo;
	private String nip;
	private double saldomin;
	private double saldomax;
	private String tipocuenta;
	
	public Cuenta (){}

	public Cuenta(String numcuenta, double saldo, String nip, double saldomin, double saldomax, String tipocuenta) {
		this.numcuenta = numcuenta;
		this.saldo = saldo;
		this.nip = nip;
		this.saldomin = saldomin;
		this.saldomax = saldomax;
		this.tipocuenta = tipocuenta;
		
		
		
	}

	public String getNumcuenta() {
		return numcuenta;
	}

	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
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

	public double getSaldomin() {
		return saldomin;
	}

	public void setSaldomin(double saldomin) {
		this.saldomin = saldomin;
	}

	public double getSaldomax() {
		return saldomax;
	}

	public void setSaldomax(double saldomax) {
		this.saldomax = saldomax;
	}

	public String getTipocuenta() {
		return tipocuenta;
	}

	public void setTipocuenta(String tipocuenta) {
		this.tipocuenta = tipocuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [numcuenta=" + numcuenta + ", saldo=" + saldo + ", nip=" + nip + ", saldomin=" + saldomin
				+ ", saldomax=" + saldomax + ", tipocuenta=" + tipocuenta + "]";
	}
	
	
	

}
