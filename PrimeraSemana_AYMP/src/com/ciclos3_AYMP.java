package com;

import java.util.Scanner;

public class ciclos3_AYMP {

	public static void main(String[] args) {
		String palabra;
		String armada ="";
		char dato;
		
		int longitud;
		System.out.print("Ingrese una palabra o frase para verificar si es palindromo ");
		Scanner entrada1= new Scanner(System.in);
		palabra= entrada1.next();
		
		longitud = palabra.length();
		//System.out.println(longitud);
		
//		for(int i=0; i<longitud; i++) {
//			System.out.println(palabra.charAt(i));
//			dato = palabra.charAt(i);
//		   }
		for(int j=longitud-1; j>=0; j--) {
			//System.out.println(palabra.charAt(j));
			armada = armada + palabra.charAt(j);
			//System.out.println(armada);
           }
		if(palabra ==armada) {
			System.out.print("ES PALINDROMO ");
		}else {
			System.out.print("NO ES PALINDROMO ");
		}
}
}