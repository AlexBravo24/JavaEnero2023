package Arrays;

public class Ejercicio2AB {

	public static void main(String[] args) {
		
		String [][] matrizA = {{"5","x","9","4","t"},{"3","z","P","c","6"},{"8","3","f","i","7"}};
		
		String [][] matrizB = {{"7","P","4","g","8"},{"5","w","Y","10","2"},{"4","7","v","o","6"}};
		
		int [][] numeroA = new int [3][5];
		
		int [][] numeroB = new int [3][5];
		
		int [][] suma = new int[matrizA.length][matrizB[0].length];
		
		for(int i=0;i<3;i++){
			System.out.println();
	        for(int j=0;j<5;j++){
	        	
	        	matrizA[i][j] = matrizA[i][j].replace("x","0");
	        	matrizA[i][j] = matrizA[i][j].replace("t","0");
	        	matrizA[i][j] = matrizA[i][j].replace("z","0");
	        	matrizA[i][j] = matrizA[i][j].replace("P","0");
	        	matrizA[i][j] = matrizA[i][j].replace("c","0");
	        	matrizA[i][j] = matrizA[i][j].replace("f","0");
	        	matrizA[i][j] = matrizA[i][j].replace("i","0");
	        	matrizA[i][j] = matrizA[i][j].replace("4","0");
	        	
	        	numeroA[i][j]=Integer.parseInt(matrizA[i][j]);
	        	
	        	matrizB[i][j] = matrizB[i][j].replace("P","0");
	        	matrizB[i][j] = matrizB[i][j].replace("g","0");
	        	matrizB[i][j] = matrizB[i][j].replace("w","0");
	        	matrizB[i][j] = matrizB[i][j].replace("Y","0");
	        	matrizB[i][j] = matrizB[i][j].replace("v","0");
	        	matrizB[i][j] = matrizB[i][j].replace("o","0");
	        	matrizB[i][j] = matrizB[i][j].replace("10","0");
	        	matrizB[i][j] = matrizB[i][j].replace("8","0");
	        	
	        	numeroB[i][j]=Integer.parseInt(matrizB[i][j]);
	        	
	        	suma [i][j]= numeroA[i][j]+numeroB[i][j];
	        }
	    }
           
           System.out.println("Matriz resultante de la suma :");
           for (int i=0;i<3;i++){
           for (int j=0;j<5;j++) {
               System.out.print(suma[i][j] + " ");
           }
           System.out.println("");
           }
       }
      	
	}
