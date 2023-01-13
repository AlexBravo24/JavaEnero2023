package Problemario;

import java.util.Scanner;

public class Condicionales12_ESC {

	public static void main(String[] args) {
		System.out.println("*****IMC******");     
		Scanner entrada = new Scanner(System.in);     
		
		System.out.print("\nIntroduce el peso (en kg): ");     
		double peso = entrada.nextDouble();     
		
		System.out.print("\nIntroduce la altura (en centimetros): ");     
		double altura = entrada.nextDouble()/100;     
		double imc = peso/(altura*altura);     
		
		System.out.println("\nEl IMC es de:" + imc);     

		
		if (imc<16) { System.out.println("Necesita ingresar en un hospital");      
		}  else if (imc<17) { 
			System.out.println("Tienes infrapeso");      
			} else if (imc<18) { 
				System.out.println("Tienes bajo peso");      
				}  else if (imc<26) { 
					System.out.println("Tienes un peso saludable");      
				}  else if (imc<30) { 
					System.out.println("Tienes sobrepeso de grado I");      
					}  else if (imc<35) { 
						System.out.println("Tienes obesidad de grado II");      
						}  else if (imc<40) { 
							System.out.println("Tienes obesidad premorbida (III)");      
							}  else { 
								System.out.println("Tiene obesidad morbida o de grado IV");      } 

	}

}
