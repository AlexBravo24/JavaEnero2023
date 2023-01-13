package Problemario;

import java.util.Scanner;

public class Ciclos3_ESC {

	public static void main(String[] args) {
		
		//Realiza un programa para determinar si un String es palindromo
		
		String original,
			   reversa = "";
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa Una Palabra o Frase: ");
		original = entrada.nextLine();
		
		//Iterar al revés para armar la reversa
		for (int i=original.length()-1; i>=0; i--) {
			reversa = reversa + original.charAt(i); //Extraemos los caracteres y los guardamos
													//de acuerdo a la posicion en la que se encuentra
		}
		System.out.println("Reversa: " + reversa.replace(" ",""));
		
		if(original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("Es Palindromo");
		}else {
			System.out.println("No es Palindromo");
		}
		
	}

}