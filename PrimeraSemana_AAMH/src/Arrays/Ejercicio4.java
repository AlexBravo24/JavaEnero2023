package Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		 int[] numeros = {1,2,3,4,5};
		 int[] numeros2 = new int[numeros.length];
		 
	        for (int i=(numeros.length-1),j=0;i>=0; i--,j++) {
	        	
	        	numeros2[j] = numeros[i];
	            System.out.println(numeros2[j]);
	        }
	        
	}

}
