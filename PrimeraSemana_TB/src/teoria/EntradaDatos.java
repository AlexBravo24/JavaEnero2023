package teoria;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDatos {
	
	public static void main (String[]args)
	{
		
        Scanner entrada = new Scanner(System.in);
        int r,c;
        
        do{
        System.out.print("No. de Filas: "); r = entrada.nextInt();
        }while(r<1);
        do{
        System.out.print("No. de Columnas: "); c = entrada.nextInt();
        }while(c<1);
       
        int[][] foo = new int[][]{new int[r],new int[c],};
        for(int x:foo[0])
        {
            for(int y:foo[1])
            {
                foo[x][y]=(int)(Math.random()*100);
                System.out.print(foo[x][y]+" ");
            }
            System.out.println(" ");
        }
        
        System.out.println(foo[0].length); //fila
        System.out.println(foo[1].length); //columna         
               
        String palabra="x";       
        char letra=palabra.charAt(0);
        int entero=0;
        double decimal=0.0;
        String input;
        
        for (byte contador = 0; contador <= 3; contador++) 
        {
            String val=""; String tip="";
            switch (contador)
            {
                // "*"admite 0 o mas (longitud), "."cualquier caracter,"^"empieza con, "$"termina con,"a-zA-Z0-9" a a la z 0 al 9 etc
                case 0 : 
                    val=".*"; tip="texto";break;
                    
                case 1 : 
                    val=".*"; tip="carácter";break;
                    
                case 2 :
                    val="^[0-9]*$"; tip="número entero";break;
                    
                case 3 : 
                    val="^[0-9.]*$"; tip="número decimal";break;
                    
            }           
            do 
            {
                input = JOptionPane.showInputDialog("Ingresa un "+tip);
                if(input==null) System.exit(0);
                else if (input.matches(val) && !input.isEmpty())
                {
                    switch (contador)
                    {
                        case 0 : 
                            palabra=input;break;
                        
                        case 1 : 
                            letra=input.charAt(0);break;
                        
                        case 2 : 
                            entero=Integer.parseInt(input);break;
                        
                        case 3 : 
                            decimal=Double.parseDouble(input);break;
                        
                    }
                }
                else JOptionPane.showMessageDialog(null,"Dato no válido, intenta nuevamente");
            }
            while (!input.matches(val) && input.isEmpty() || !input.matches(val) || input.isEmpty());
        }
        JOptionPane.showMessageDialog(null,
                "La cadena es: " + palabra
                + "\nEl caracter es: " + letra
                + "\nEl numero entero es: " + entero
                + "\nEl decimal es: " + decimal);
		
	}
}
