package Problemario;

import java.util.Scanner;

public class Condicionales13_ESC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double donacion,
			csalud,
			comedor,
			bolsa;
		
		 System.out.println("\n Ingresa la Donación Anual: ");
		    donacion = entrada.nextInt();
		    
		    if(donacion >= 10000){
	            csalud = 0.30  * donacion;
	            comedor = 0.50  * donacion;
	            bolsa = 0.20  * donacion;
	            System.out.println("Se destinara a Centro de Salud: " +csalud);
	            System.out.println("Se destinara a Comedor: " +comedor);
	            System.out.println("Se destinara a Bolsa: " +bolsa);
	            
		    }else{
	            csalud = 0.25  * donacion;
	            comedor = 0.60  * donacion;
	            bolsa = 0.15  * donacion;
	            
	            System.out.println("Se destinara a Centro de Salud: " +csalud);
	            System.out.println("Se destinara a Comedor: " +comedor);
	            System.out.println("Se destinara a Bolsa: " +bolsa);
		    }
		    

	}

}
