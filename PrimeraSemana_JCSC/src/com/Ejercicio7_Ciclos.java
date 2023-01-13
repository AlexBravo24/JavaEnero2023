package com;

public class Ejercicio7_Ciclos {
public static void main(String[] args) {
	
	float dinero = 700;
	int mes = 1;
	
	
	for (;;) {
	dinero = dinero * 1.02f;
	if (dinero >= 1500) break;
	mes++;
	}
	
	System.out.println("El dinero total es: " + dinero);
	System.out.println("El cual, lo tendrá en: " + mes + " meses.");
	
	
	}
	

}
