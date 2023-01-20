package com;

import java.util.Date;

public class Ticket {
	
	//Atributos del Ticket
	
	private int  folioOperacion;
	private Date fechaHora;
	private String numCuenta;
	private double saldo;
	private String sucursal;
	
	
	public Ticket () {}


	public Ticket(int folioOperacion, Date fechaHora, String numCuenta, double saldo, String sucursal) {
		this.folioOperacion = folioOperacion;
		this.fechaHora = fechaHora;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.sucursal = sucursal;
	}


	public int getFolioOperacion() {
		return folioOperacion;
	}


	public void setFolioOperacion(int folioOperacion) {
		this.folioOperacion = folioOperacion;
	}


	public Date getFechaHora() {
		return fechaHora;
	}


	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
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


	public String getSucursal() {
		return sucursal;
	}


	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}


	@Override
	public String toString() {
		return "Ticket [folioOperacion=" + folioOperacion + ", fechaHora=" + fechaHora + ", numCuenta=" + numCuenta
				+ ", saldo=" + saldo + ", sucursal=" + sucursal + "]";
	}
	
	
	
	
	
	

}
