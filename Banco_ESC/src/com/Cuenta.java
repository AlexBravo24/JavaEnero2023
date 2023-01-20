package com;

public class Cuenta {
	
	//Atributos que tiene una cuenta de banco
	
	private String numcuenta;
	private double saldo;
	private String nip;
	private double min;
	private double max;
	private String tipoCuenta;
	
	public Cuenta() {
		
	}

	public Cuenta(String numcuenta, double saldo, String nip, double min, double max, String tipoCuenta) {
		this.numcuenta = numcuenta;
		this.saldo = saldo;
		this.nip = nip;
		this.min = min;
		this.max = max;
		this.tipoCuenta = tipoCuenta;
	}

	/**
	 * @return the numcuenta
	 */
	public String getNumcuenta() {
		return numcuenta;
	}

	/**
	 * @param numcuenta the numcuenta to set
	 */
	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the nip
	 */
	public String getNip() {
		return nip;
	}

	/**
	 * @param nip the nip to set
	 */
	public void setNip(String nip) {
		this.nip = nip;
	}

	/**
	 * @return the min
	 */
	public double getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(double min) {
		this.min = min;
	}

	/**
	 * @return the max
	 */
	public double getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(double max) {
		this.max = max;
	}

	/**
	 * @return the tipoCuenta
	 */
	public String getTipoCuenta() {
		return tipoCuenta;
	}

	/**
	 * @param tipoCuenta the tipoCuenta to set
	 */
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [numcuenta=" + numcuenta + ", saldo=" + saldo + ", nip=" + nip + ", min=" + min + ", max=" + max
				+ ", tipoCuenta=" + tipoCuenta + "]";
	}
	
	

}
