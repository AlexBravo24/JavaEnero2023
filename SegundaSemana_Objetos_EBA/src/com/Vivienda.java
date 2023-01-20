package com;

public class Vivienda {
	
	private String typo;
	private String ubicacion;
	private int numabitaciones;
	private int numbaños;
	
	public Vivienda() {
		
	}

	public Vivienda(String typo, String ubicacion, int numabitaciones, int numbaños) {
		super();
		this.typo = typo;
		this.ubicacion = ubicacion;
		this.numabitaciones = numabitaciones;
		this.numbaños = numbaños;
	}

	public String getTypo() {
		return typo;
	}

	public void setTypo(String typo) {
		this.typo = typo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getNumabitaciones() {
		return numabitaciones;
	}

	public void setNumabitaciones(int numabitaciones) {
		this.numabitaciones = numabitaciones;
	}

	public int getNumbaños() {
		return numbaños;
	}

	public void setNumbaños(int numbaños) {
		this.numbaños = numbaños;
	}

	@Override
	public String toString() {
		return "Vivienda [typo=" + typo + ", ubicacion=" + ubicacion + ", numabitaciones=" + numabitaciones
				+ ", numbaños=" + numbaños + "]";
	}
	
	

}
