package Problemario;

public class Array2_ESC {

	public static void main(String[] args) {

		
		int suma =0;
		int media;
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = i+1;
            System.out.println(numeros[i]);
            suma += i+1;
        }
        
        media = suma / numeros.length;
        
        System.out.println("La suma es: " +suma);
        System.out.println("La media es: " +media);
	
	}

}
