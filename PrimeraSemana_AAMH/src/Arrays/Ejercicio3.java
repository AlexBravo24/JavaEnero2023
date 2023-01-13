package Arrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String frase;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserta una frace porfavor: ");
        frase = scanner.nextLine();
        
        char caracteres[]=new char[frase.length()];
 
        for(int i=0;i<frase.length();i++){
            caracteres[i]=frase.charAt(i);
            System.out.println(caracteres[i]);
        }
	}

}
