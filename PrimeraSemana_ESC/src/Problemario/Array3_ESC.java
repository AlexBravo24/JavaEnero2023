package Problemario;

import java.util.Scanner;

public class Array3_ESC {

	public static void main(String[] args) {
		
		 Scanner entrada=new Scanner(System.in);
		 int c=0; 
		 String palabra;
		 
		 System.out.println("Escriba una Frase: ");
		 palabra=entrada.nextLine();
		 
		 char caracteres[]=new char[palabra.length()];
		 for(int i=0;i<palabra.length();i++){            
		 c=c+1;             
		 caracteres[i]=palabra.charAt(i); 
		 System.out.println(caracteres[i]);           
		 } 
		System.out.println("\nLa cantidad de caracteres es : "+palabra.length());

	}

}
