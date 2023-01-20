package com;

public class CuerpoH {
	
	private double altura;
	private double peso;
	private String complexion;
	
	private SistemaD sistemad;
	private SistemaN sisteman;
	private SistemaR sistemar;
	
	CuerpoH(){}

	public CuerpoH(double altura, double peso, String complexion, SistemaD sistemad, SistemaN sisteman,
			SistemaR sistemar) {
		super();
		this.altura = altura;
		this.peso = peso;
		this.complexion = complexion;
		this.sistemad = sistemad;
		this.sisteman = sisteman;
		this.sistemar = sistemar;
		
		
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getComplexion() {
		return complexion;
	}

	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}

	public SistemaD getSistemad() {
		return sistemad;
	}

	public void setSistemad(SistemaD sistemad) {
		this.sistemad = sistemad;
	}

	public SistemaN getSisteman() {
		return sisteman;
	}

	public void setSisteman(SistemaN sisteman) {
		this.sisteman = sisteman;
	}

	public SistemaR getSistemar() {
		return sistemar;
	}

	public void setSistemar(SistemaR sistemar) {
		this.sistemar = sistemar;
		
		
	}

	@Override
	public String toString() {
		return "CuerpoH [altura=" + altura + ", peso=" + peso + ", complexion=" + complexion + ", sistemad=" + sistemad
				+ ", sisteman=" + sisteman + ", sistemar=" + sistemar + "]";
	};
	
	

}
