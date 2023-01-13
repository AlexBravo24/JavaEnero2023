package Problemario;

import java.util.Scanner;

public class Ciclos12_ESC {

	public static void main(String[] args) {
		
		  int Edad, 
		  	  Suma = 0,
		  	  Contador = 0,
		  	  Promedio=0;
		  
		  Scanner entrada=new Scanner(System.in);
		  do {
			  System.out.println("Edad: ");
			  Edad=entrada.nextInt();
			  Suma=Suma+Edad;
			  Contador=Contador+1;
			  Promedio=Suma/Contador;
		   		  //System.out.println("El promedio por ahora es " +Promedio);
			  if (Promedio>25) {
				  break;		  
			  }
		    } while (Edad>0);
		   	    	if (Promedio>25) {
		    		System.out.println("El promedio de las edades registradas es mayor que 25 y ha finalizado el programa");

		    	}

	}

}
