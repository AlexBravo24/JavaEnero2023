package com.dto;

public class Objeto_DTO {
	
	private String origen;
	private String hora;
	private String piloto;
	private String modelo;
	
	public Objeto_DTO () {}

	public Objeto_DTO(String origen, String hora, String piloto, String modelo) {
		super();
		this.origen = origen;
		this.hora = hora;
		this.piloto = piloto;
		this.modelo = modelo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Objeto_DTO [origen=" + origen + ", hora=" + hora + ", piloto=" + piloto + ", modelo=" + modelo + "]";
	}
	
	
	
	

}
