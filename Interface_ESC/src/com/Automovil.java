package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Automovil extends ObjetoCar implements Metodos{
	
	public Automovil() {
		
	}

	public Automovil(String marca, String modelo, int año) {
		super(marca, modelo, año);
		
	}

	@Override
	public String toString() {
		return "Automovil [getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getAño()=" + getAño() + "]";
	}

	@Override
	public void Arrancar() {
		System.out.println("Arrancando Automovil . . . ");
		
	}

	@Override
	public void Acelerar() {
		System.out.println("Acelerando Automovil . . .");
		
	}

	@Override
	public void Avanzar() {
		System.out.println("Metiendo velocidad para avanzar . . .");
		
	}
	
	@Override
	public void CambiarVelocidad() {
		System.out.println("Cambiando Velocidad . . .");
		
	}

	@Override
	public void Frenar() {
		System.out.println("Sistema de frenado activado... Frenando. . .");
		
	}

	@Override
	public void BajarVidrios() {
		System.out.println("Oprimir boton para bajar vidrio . . . ");
		
	}

	@Override
	public void Tocarclaxon() {
		System.out.println("Presionar claxon . . .");
		
	}
	
	@Override
	public void Menu() {
		
		Automovil auto = new Automovil ("Chevrolet","Malibu",2022);
		Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
 
        	System.out.println("¿Que deseas realizar con el Automovil?");
            System.out.println("1. Arracar Automovil");
            System.out.println("2. Acelerar Automovil");
            System.out.println("3. Avanzar Automovil");
            System.out.println("4. Cambiar Velocidad De Automovil");
            System.out.println("5. Frenar Automovil");
            System.out.println("6. Bajar Vidrios Del Automovil");
            System.out.println("7. Tocar El Claxón Del Automovil");
            System.out.println("8. Salir");

            
            try {
 
                System.out.println("\n Escribe una de las opciones: ");
                opcion = entrada.nextInt();
 
                switch (opcion) {
                    case 1:
                        auto.Arrancar();
                        System.out.println();
                        break;
                    case 2:
                        auto.Acelerar();
                        System.out.println();
                        break;
                    case 3:
                        auto.Avanzar();
                        System.out.println();
                        break;
                    case 4:
                        auto.CambiarVelocidad();
                        System.out.println();
                        break;
                    case 5:
                        auto.Frenar();
                        System.out.println();
                        break;
                    case 6:
                        auto.BajarVidrios();
                        System.out.println();
                        break;
                    case 7:
                        auto.Tocarclaxon();
                        System.out.println();
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Error... Elige un número entre 1 y 7\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error...Debes insertar un número \n");
                entrada.next();
            }
        }
		
	}
	



}
