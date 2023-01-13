package Problemario;

public class Array5_ESC {

	public static void main(String[] args) {
		
		String productos []={"Computadora", "Celular","Ipad","Television","Bocinas"};
		int precios[]={15930,10999,8400,13500,2199};
		 
		System.out.println("***** Lista de Productos y Precios *****\n");
		 
		for (int u=0;u<productos.length;u++){
		 System.out.println(productos[u]+ " --> "+ precios[u]); 
		} 

	}

}
