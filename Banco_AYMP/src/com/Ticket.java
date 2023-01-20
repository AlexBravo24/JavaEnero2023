package com;

import java.util.Date;

public class Ticket {
	
	//Atributos del ticket
	private int folioOperacion;
	private Date fecha;
	private String numCuenta;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	public Ticket() {
		
	}

	public Ticket(int folioOperacion, Date fecha, String numCuenta, double saldo, String sucursal, int idCajero) {
		super();
		this.folioOperacion = folioOperacion;
		this.fecha = fecha;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}

	public int getFolioOperacion() {
		return folioOperacion;
	}

	public void setFolioOperacion(int folioOperacion) {
		this.folioOperacion = folioOperacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
		return "Ticket [folioOperacion=" + folioOperacion + ", fecha=" + fecha + ", numCuenta=" + numCuenta + ", saldo="
				+ saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	
	

}
