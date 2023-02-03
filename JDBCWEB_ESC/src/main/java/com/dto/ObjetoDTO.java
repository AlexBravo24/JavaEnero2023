package com.dto;

public class ObjetoDTO {
	
	private String origen;
	private String hora;
	private String piloto;
	private String modelo;
	
	public ObjetoDTO() {
	}

	public ObjetoDTO(String origen, String hora, String piloto, String modelo) {
		this.origen = origen;
		this.hora = hora;
		this.piloto = piloto;
		this.modelo = modelo;
	}

	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * @return the piloto
	 */
	public String getPiloto() {
		return piloto;
	}

	/**
	 * @param piloto the piloto to set
	 */
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "ObjetoDTO [origen=" + origen + ", hora=" + hora + ", piloto=" + piloto + ", modelo=" + modelo + "]";
	}
	
	

}
