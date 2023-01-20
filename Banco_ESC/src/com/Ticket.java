package com;

import java.util.Date;

public class Ticket {
	
	//Atributos del Ticket
	
	private int folioOperacion;
	private Date fechaHora;
	private String numCuenta;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	public Ticket() {
		
	}

	public Ticket(int folioOperacion, Date fechaHora, String numCuenta, double saldo, String sucursal, int idCajero) {
		this.folioOperacion = folioOperacion;
		this.fechaHora = fechaHora;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}

	/**
	 * @return the folioOperacion
	 */
	public int getFolioOperacion() {
		return folioOperacion;
	}

	/**
	 * @param folioOperacion the folioOperacion to set
	 */
	public void setFolioOperacion(int folioOperacion) {
		this.folioOperacion = folioOperacion;
	}

	/**
	 * @return the fechaHora
	 */
	public Date getFechaHora() {
		return fechaHora;
	}

	/**
	 * @param fechaHora the fechaHora to set
	 */
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	/**
	 * @return the numCuenta
	 */
	public String getNumCuenta() {
		return numCuenta;
	}

	/**
	 * @param numCuenta the numCuenta to set
	 */
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
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
	 * @return the sucursal
	 */
	public String getSucursal() {
		return sucursal;
	}

	/**
	 * @param sucursal the sucursal to set
	 */
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	/**
	 * @return the idCajero
	 */
	public int getIdCajero() {
		return idCajero;
	}

	/**
	 * @param idCajero the idCajero to set
	 */
	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	@Override
	public String toString() {
		return "Ticket [folioOperacion=" + folioOperacion + ", fechaHora=" + fechaHora + ", numCuenta=" + numCuenta
				+ ", saldo=" + saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	

}
