package com;

import java.util.Date;

public class Ticket {
	
	//Atributos del ticket
	
	private int folioop;
	private Date fechahora;
	private String numcuenta;
	private double saldo;
	private String sucursal;
	private int idcajero;
	
	public Ticket(){}

	public Ticket(int folioop, Date fechahora, String numcuenta, double saldo, String sucursal, int idcajero) {
		super();
		this.folioop = folioop;
		this.fechahora = fechahora;
		this.numcuenta = numcuenta;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idcajero = idcajero;
		
		
		
	}

	public int getFolioop() {
		return folioop;
	}

	public void setFolioop(int folioop) {
		this.folioop = folioop;
	}

	public Date getFechahora() {
		return fechahora;
	}

	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
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

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public int getIdcajero() {
		return idcajero;
	}

	public void setIdcajero(int idcajero) {
		this.idcajero = idcajero;
	}

	@Override
	public String toString() {
		return "Ticket [folioop=" + folioop + ", fechahora=" + fechahora + ", numcuenta=" + numcuenta + ", saldo="
				+ saldo + ", sucursal=" + sucursal + ", idcajero=" + idcajero + "]";
	};
	
	
	

}
