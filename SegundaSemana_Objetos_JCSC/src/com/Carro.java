package com;

public class Carro {
	
	private String modelo;
	private String agencia;
	private int precio;
	private String neumaticos;
	private int plazas;
	
	public Carro(String modelo, String agencia, int precio) {
		super();
		this.modelo = modelo;
		this.agencia = agencia;
		this.precio = precio;
	}
	public Carro(String modelo, String agencia, int precio, String neumaticos, int plazas) {
		super();
		this.modelo = modelo;
		this.agencia = agencia;
		this.precio = precio;
		this.neumaticos = neumaticos;
		this.plazas = plazas;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getNeumaticos() {
		return neumaticos;
	}
	public void setNeumaticos(String neumaticos) {
		this.neumaticos = neumaticos;
	}
	public int getPlazas() {
		return plazas;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", agencia=" + agencia + ", precio=" + precio + ", neumaticos=" + neumaticos
				+ ", plazas=" + plazas + "]";
	}
	
	
	
	

}
