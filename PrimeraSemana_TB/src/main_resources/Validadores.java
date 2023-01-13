package main_resources;

import java.util.Scanner;

import problemario1.Menu;

public class Validadores extends Menu {
    static Scanner sc = new Scanner(System.in);
    static boolean val=false;
    
    public static int IntVal (int NumComp)//Validar si el usuario digito un número entero
    {
	do
	{
	    try 
	    {
		NumComp=Integer.parseInt(sc.nextLine());
		val=true;		
	    }
	    catch(NumberFormatException nfe)
	    {
		System.out.println("Ingresa un número válido");
		System.out.print("r: ");
		val=false;
	    }
	    
	}while(val==false);
	int x=NumComp;
	return x;
    }
    
    public static double DecVal (double NumComp)//Validar si el usuario digito un número decimal
    {
	do
	{
	    try 
	    {
		NumComp= Double.parseDouble(sc.nextLine());
		val=true;		
	    }
	    catch(NumberFormatException nfe)
	    {
		System.out.println("Ingresa un número válido");
		System.out.print("r: ");
		val=false;
	    }
	    
	}while(val==false);
	double x=NumComp;
	return x;
    }
    
    public static int MenuVal(int NumComp,int max)//Validar opcion correcta del menu 
    {
	int x=0;
	do 
	{
	    x = IntVal(NumComp);
	    if(x>max||x<0) 
	    {
		System.out.println("Ingresa un número dentro del rango (0-"+max+")");
		System.out.print("r: ");
	    }
	}while(x>max||x<0);
	return x;
    }  
    
    public static boolean ResMenu(String r1, String r2)//Validar respuesta Y o N 
    {
        String r = sc.nextLine();
        while (!r.equalsIgnoreCase(r1) && !r.equalsIgnoreCase(r2)) 
        {
            System.out.println("Carácter no válido, intenta de nuevo\n");
            System.out.print("r: ");
            r = sc.nextLine();
        } 
        if (r.equalsIgnoreCase(r2)) 
        { 
            return false;
        }
        else 
        {
            return true;
        }
    }

    public static boolean isBetween(int x, int nMenor, int nMayor)// x num estra entre un rango determinado
    {
	  return nMenor <= x && x <= nMayor;
    }
    
    public static void printRow(int[] row) //imprimir arreglo (formato x determinar)
    {
	for (int i : row) 
	{
	    System.out.print(i);
	    System.out.print("\t");
	}
	System.out.println();
    }
    
    public static void printMatrix(String[][] grid) //impimir matriz c/formato
    {
	for(int r=0; r<grid.length; r++) 
	{
	    //System.out.print("||");
	    for(int c=0; c<grid[r].length; c++) 
	    {		
		System.out.format("%-10s", grid[r][c]+"  ");
		//System.out.print(grid[r][c]+" | ");
	    }
	    System.out.println("\n");
	    //System.out.println("\n");
	    }
	}

    //por hacer:
    //enveses de hacer validador para cada tipo intentar hacer como lo primero que hice antes del curso 3/4 ahi muere
    //crear un menu para todos los menus O.K.
}
