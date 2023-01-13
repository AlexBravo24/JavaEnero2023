package Problemario;

import java.io.IOException;
import java.util.Scanner;

public class Ciclos4_ESC {

	public static void main(String[] args) throws IOException {
		
//		Scanner entrada = new Scanner(System.in);
//        String texto;
//        char caracter;
//        int numeroDeVeces = 0;
//        do {
//            System.out.println("Introduce texto: ");
//            texto = entrada.nextLine();
//        } while (texto.isEmpty());
//        System.out.print("Introduce un carácter: ");
//        caracter = (char) System.in.read();
//        
//        numeroDeVeces = contarCaracteres(texto, caracter);
//        System.out.println("\nLa letra " + caracter + " aparece " + numeroDeVeces + " veces");                   
//    }
//
//	
//    //calcular el número de veces que se repite un carácter en un String
//    public static int contarCaracteres(String cadena, char caracter) {
//        int posicion, contador = 0;
//        //se busca la primera vez que aparece
//        posicion = cadena.indexOf(caracter);
//        while (posicion != -1) { //mientras se encuentre el caracter
//            contador++;           //se cuenta
//            //se sigue buscando a partir de la posición siguiente a la encontrada
//            posicion = cadena.indexOf(caracter, posicion + 1);
//        }
//        return contador;
		
		Scanner entrada = new Scanner(System.in);
		String Texto="";
		String caracter="";
		int cont=0;

		System.out.println("Ingresa el texto: ");
		Texto = entrada.nextLine();

		System.out.println("Elige Letra: ");
		caracter = entrada.nextLine();
		for (int i = 0; i < Texto.length(); i++) {
		if(Texto.charAt(i)== caracter.charAt(0) ){
		cont ++;
		}
		}

		if (cont != 0) {
		System.out.println("\nEl caracter "+caracter.charAt(0)+ " se repite " + cont + " veces");
		}else{
		System.out.println("\n El caracter no se encuentra en este texto");
		}
	}
}
