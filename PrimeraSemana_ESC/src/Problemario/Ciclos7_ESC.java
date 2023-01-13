package Problemario;

public class Ciclos7_ESC {

	public static void main(String[] args) {

		double dinero = 700;
		int mes = 1;
		
		for (;;) {
		dinero = dinero * 1.02;
			if (dinero >= 1500) break;
			mes++;
		}
		
		System.out.println("En " + mes + " Meses Tendras --> $ " + dinero);

	}

}
