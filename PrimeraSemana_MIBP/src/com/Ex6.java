package com;

public class Ex6 {
//	Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. Cual será la cantidad
//	de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?

	public static void main(String[] args) {
		
		double inversion = 1000;
		double interes = .02;
		double it;
		double ni;
		
				
				for (int i = 0; i<=12; i++)
		{
					 it = inversion * interes;
					 ni = it + inversion;
					 inversion = ni;
					System.out.println(ni);
		}


	}

}
