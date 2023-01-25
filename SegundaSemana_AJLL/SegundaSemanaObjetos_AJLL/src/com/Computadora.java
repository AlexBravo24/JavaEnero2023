package com;

public class Computadora {
	
	private String procesador;
	private String disco_duro;
	private int Gb_ram;
	private int Gb_discoduro;
	
	
	
	public Computadora() {
		
	}
	
	

	public Computadora(String procesador, String disco_duro, int gb_ram, int gb_discoduro) {
		super();
		this.procesador = procesador;
		this.disco_duro = disco_duro;
		Gb_ram = gb_ram;
		Gb_discoduro = gb_discoduro;
	}



	public String getProcesador() {
		return procesador;
	}



	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}



	public String getDisco_duro() {
		return disco_duro;
	}



	public void setDisco_duro(String disco_duro) {
		this.disco_duro = disco_duro;
	}



	public int getGb_ram() {
		return Gb_ram;
	}



	public void setGb_ram(int gb_ram) {
		Gb_ram = gb_ram;
	}



	public int getGb_discoduro() {
		return Gb_discoduro;
	}



	public void setGb_discoduro(int gb_discoduro) {
		Gb_discoduro = gb_discoduro;
	}



	@Override
	public String toString() {
		return "Computadora [procesador=" + procesador + ", disco_duro=" + disco_duro + ", Gb_ram=" + Gb_ram
				+ ", Gb_discoduro=" + Gb_discoduro + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
