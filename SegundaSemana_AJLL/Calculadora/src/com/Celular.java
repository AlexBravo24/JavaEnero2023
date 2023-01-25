package com;

public class Celular extends Objeto implements IMetodos2 {

	
	public Celular() {}
	
	
	
	public Celular(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Celular [getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + "]";
	}



	@Override
	public void llamar() {
		System.out.println("Llamada en curso...");
		
	}

	@Override
	public void llamada() {
		System.out.println("Llamada entrante...");
		
	}

	@Override
	public void mensaje() {
		System.out.println("Verificando nuevos mensajes...");
		
	}

	@Override
	public void lampara() {
		System.out.println("Encendiendo lampara...");
		
	}

	@Override
	public void camara() {
		System.out.println("Accediendo a la camara...");
	}
	
	

}
