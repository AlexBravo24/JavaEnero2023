package com;

import java.util.Scanner;

public class ciclos3 {

	public static void main(String[] args) {
		
		String original, reversa="";
		System.out.print("Ingrese una palabra o frase para verificar si es palindromo ");
		Scanner entrada1= new Scanner(System.in);
		original = entrada1.nextLine();
		
		for(int i=original.length()-1;i>=0; i--) {
			reversa = reversa + original.charAt(i);
		}
		System.out.println("Reversa: "+ reversa.replace(" ",""));
		
		if(original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ",""))) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}

	}

}
