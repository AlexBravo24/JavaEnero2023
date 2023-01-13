package Problemario;

import java.util.Scanner;

public class Ciclos8_ESC {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
        int numero1, numero2, menor, mayor;
       
        
        do {
            System.out.print("Introduce un número entero: ");
            numero1 = entrada.nextInt();
            System.out.print("Introduce otro número entero distinto del anterior: ");                   
            numero2 = entrada.nextInt();
            
            if(numero1 == numero2){
                System.out.println("Debes introducir dos números distintos");
            }
        } while (numero1 == numero2);
       

        if (numero1 > numero2) {
            mayor = numero1;
            menor = numero2;
        } else {
            mayor = numero2;
            menor = numero1;
        }
       
        System.out.println("\nNúmeros desde " + menor + " hasta " + mayor + " : ");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }

	}

}
