package com;

import java.util.Date;


public class Ticket {
	
	//Atributos de ticket
	
	private int folio;
	private Date fechaHora;
	private String numCuenta;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	
	public Ticket() {}


	public Ticket(int folio, Date fechaHora, String numCuenta, double saldo, String sucursal, int idCajero) {
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}


	public int getFolio() {
		return folio;
	}


	public void setFolio(int folio) {
		this.folio = folio;
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


	public int getIdCajero() {
		return idCajero;
	}


	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}


	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", numCuenta=" + numCuenta + ", saldo=" + saldo
				+ ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	
	
	
	
}
