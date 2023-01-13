package Problemario;

import java.util.Scanner;

public class Condicionales7_ESC {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
	    int numeroA;
	    
	
	    System.out.println(" Número de alumnos que asistiran: ");
	    numeroA = scanner.nextInt();
	
	    if (numeroA >= 100) {
	      System.out.println("El pago a la agencia es de " + numeroA*65 + " "
	          + "euros y cada alumno debe pagar 65 euros");
	    } else if (numeroA <100 && numeroA >= 50) {
	      System.out.println("El pago a la agencia es de " + numeroA*70 + " "
	          + "euros y cada alumno debe pagar 70 euros");
	    } else if (numeroA < 50 && numeroA >= 30) {
	      System.out.println("El pago a la agencia es de " + numeroA*95 + " "
	          + "euros y cada alumno debe pagar 95 euros");
	    } else {
	      System.out.println("El precio del autobús es de 4000 euros y cada alumno "
	          + "tiene que pagar " + (4000/numeroA) + " euros.");
	    }

	}

}
