package com;

public class Arduino {
	private int edades;
	private String tarjeta;
	private String sensores;
	private String plataforma;
	private String material1;
	private String material2;
	
	public Arduino() {
	}

	public Arduino(int edades, String tarjeta, String sensores, String plataforma, String material1, String material2) {
		super();
		this.edades = edades;
		this.tarjeta = tarjeta;
		this.sensores = sensores;
		this.plataforma = plataforma;
		this.material1 = material1;
		this.material2 = material2;
	}

	public int getEdades() {
		return edades;
	}

	public void setEdades(int edades) {
		this.edades = edades;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public String getSensores() {
		return sensores;
	}

	public void setSensores(String sensores) {
		this.sensores = sensores;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getMaterial1() {
		return material1;
	}

	public void setMaterial1(String material1) {
		this.material1 = material1;
	}

	public String getMaterial2() {
		return material2;
	}

	public void setMaterial2(String material2) {
		this.material2 = material2;
	}

	@Override
	public String toString() {
		return "Arduino [edades=" + edades + ", tarjeta=" + tarjeta + ", sensores=" + sensores + ", plataforma="
				+ plataforma + ", material1=" + material1 + ", material2=" + material2 + "]";
	}
	
	
	

}
