package com;

import java.util.Date;

public class Ticket {
	
	private int folioOperación;
	private Date fechaHora;
	private int nip;
	private double pago;
	private double cambio;
	private String sucursal;
	private int idMaquina;
	
	public Ticket() {
		
	}

	public Ticket(int folioOperación, Date fechaHora, int nip, double pago, double cambio, String sucursal,
			int idMaquina) {
		super();
		this.folioOperación = folioOperación;
		this.fechaHora = fechaHora;
		this.nip = nip;
		this.pago = pago;
		this.cambio = cambio;
		this.sucursal = sucursal;
		this.idMaquina = idMaquina;
	}

	public int getFolioOperación() {
		return folioOperación;
	}

	public void setFolioOperación(int folioOperación) {
		this.folioOperación = folioOperación;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public double getPago() {
		return pago;
	}

	public void setPago(double pago) {
		this.pago = pago;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public int getIdMaquina() {
		return idMaquina;
	}

	public void setIdMaquina(int idMaquina) {
		this.idMaquina = idMaquina;
	}

	@Override
	public String toString() {
		return "Ticket [folioOperación=" + folioOperación + ", fechaHora=" + fechaHora + ", nip=" + nip + ", pago="
				+ pago + ", cambio=" + cambio + ", sucursal=" + sucursal + ", idMaquina=" + idMaquina + "]";
	}
	
	
	


}
