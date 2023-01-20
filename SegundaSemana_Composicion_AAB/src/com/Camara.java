package com;

public class Camara {

	private int calidad;
	private String camFrontal;
	private int calidadFrontal;
	
	public Camara() {
		
	}

	public Camara(int calidad, String camFrontal, int calidadFrontal) {
		super();
		this.calidad = calidad;
		this.camFrontal = camFrontal;
		this.calidadFrontal = calidadFrontal;
	}

	public int getCalidad() {
		return calidad;
	}

	public void setCalidad(int calidad) {
		this.calidad = calidad;
	}

	public String getCamFrontal() {
		return camFrontal;
	}

	public void setCamFrontal(String camFrontal) {
		this.camFrontal = camFrontal;
	}

	public int getCalidadFrontal() {
		return calidadFrontal;
	}

	public void setCalidadFrontal(int calidadFrontal) {
		this.calidadFrontal = calidadFrontal;
	}

	@Override
	public String toString() {
		return "Camara [calidad=" + calidad + ", camFrontal=" + camFrontal + ", calidadFrontal=" + calidadFrontal + "]";
	}
	
	
	
}
