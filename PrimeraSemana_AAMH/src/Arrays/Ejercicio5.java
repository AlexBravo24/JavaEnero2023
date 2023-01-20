package Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String [] productos = {"silla","escoba","recogedor","sacapuntas","lapiz"};
		int [] precio = {150,80,70,8,10};
		
		for (int i=0,j=0;i>=0; i++,j++) {	
            System.out.println(productos[j] + " precio: " + precio[j]);
        }
	}
}
