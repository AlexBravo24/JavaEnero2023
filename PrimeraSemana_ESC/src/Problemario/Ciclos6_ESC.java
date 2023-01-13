package Problemario;

public class Ciclos6_ESC {

	public static void main(String[] args) {
		double dinero = 1000;
		int mes = 1;

		while (mes<=12) {
		dinero = dinero * 1.02;
		mes++;
		}
		System.out.println("Si reinviertes todo tu dinero al finalizar el año tendras --> $ " + dinero);

	}

}
