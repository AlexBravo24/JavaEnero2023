package Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int media, suma = 0;
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
        	numeros[i] = i+1;
            System.out.println(numeros[i]);
            suma += i+1;
        }
        media = suma / numeros.length;
        System.out.println("La suma da "+suma);
        System.out.println("La media da "+media);

	}

}
