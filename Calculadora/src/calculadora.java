import java.util.Scanner;

public class calculadora extends objeto implements imedicina{
	
	private boolean celdaSolar;
	
	
	public calculadora() {}
	
	
	

	public calculadora(String marca, String modelo, boolean celdaSolar) {
		super(marca, modelo);
		this.celdaSolar = celdaSolar;
	}
	

	public boolean isCeldaSolar() {
		return celdaSolar;
	}


	public void setCeldaSolar(boolean celdaSolar) {
		this.celdaSolar = celdaSolar;
	}

	
	
	
	@Override
	public String toString() {
		return "calculadora [celdaSolar=" + celdaSolar + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ "]";
	}


	@Override
	public void sumar() {
		double a;
		double b;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el primer numero a sumar: ");
		a= leer.nextDouble();
		System.out.println("Ingrese el segundo numero a sumar: ");
		b= leer.nextDouble();
		System.out.println("el resultado es: " + (a + b) );
	}

	@Override
	public void restar() {
		// TODO Auto-generated method stub
		double a;
		double b;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el primer numero a restar: ");
		a= leer.nextDouble();
		System.out.println("Ingrese el segundo numero a restar: ");
		b= leer.nextDouble();
		System.out.println("el resultado es: " + (a - b) );		
	}

	@Override
	public void multiplicar() {
		// TODO Auto-generated method stub

		double a;
		double b;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el primer numero a restar: ");
		a= leer.nextDouble();
		System.out.println("Ingrese el segundo numero a restar: ");
		b= leer.nextDouble();
		System.out.println("el resultado es: " + (a * b) );
	}

	@Override
	public void dividir() {
		// TODO Auto-generated method stub
		double a;
		double b;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el primer numero a dividir: ");
		a= leer.nextDouble();
		System.out.println("Ingrese el segundo numero a dividir: ");
		b= leer.nextDouble();
		System.out.println("el resultado es: " + (a / b) );
	}




	@Override
	public void revisartemperatura() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void medirpresion() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
