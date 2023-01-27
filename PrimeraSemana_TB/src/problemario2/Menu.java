package problemario2;
import java.util.Scanner;

import main_resources.Validadores;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    static boolean val=false;   
    
    public static void main(String[] args)//MENU DE EJERCICIOS 
    {
	int x=0;//seleccion ejercicio en el menu
	boolean repeje=false,vmenu=false;//repetir ejercicio || volver al menu
	final String y="y",n="n";//si o no en menu
	do
	{
	    x=0;
	    vmenu=false;
	    repeje=false;
	    System.out.println("\nProblemario 2: Iteración (for-while)\n");
	    System.out.println
        		("Ingresa el núm correspondiente al ejercicio:\n"
        		+"0.Atrás\n"
        		+ "1.Ejercicio1\n"
        		+ "2.Ejercicio2\n"
        		+ "3.Ejercicio3\n"
        		+ "4.Ejercicio4\n"
        		+ "5.Ejercicio5\n"
        		+ "6.Ejercicio6\n"
        		+ "7.Ejercicio7\n"
        		+ "8.Ejercicio8\n"
        		+ "9.Ejercicio9\n"
        		+ "10.Ejercicio10\n"
        		+ "11.Ejercicio11\n"
        		+ "12.Ejercicio12\n");
	    System.out.print("r: ");
	    x=Validadores.MenuVal(x,12);	
        	//System.out.println(x);
	    switch (x) 
	    {	
	    	case 0:
	    	    System.out.println("...");
	    	    break;
	    	case 1:
	    	    do 
	    	    {
	    		System.out.println("\nEjercicio 1\n");
	    		Ejercicios.Ej1();
	    		System.out.println("¿Repetir Ejercicio?Y/N");
	    		System.out.print("r: ");
	    		repeje=Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;
	    	case 2:
	    	    do 
	    	    {
	    		System.out.println("\nEjercicio 2\n");
	    		Ejercicios.Ej2();
	    		System.out.println("¿Repetir Ejercicio?Y/N");
	    		System.out.print("r: ");
	    		repeje=Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;
	    	case 3:
	    	    do 
	    	    {
	    		System.out.println("\nEjercicio 3\n");
	    		Ejercicios.Ej3();
	    		System.out.println("¿Repetir Ejercicio?Y/N");
	    		System.out.print("r: ");
	    		repeje=Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;
	    	case 4:
	    	    do 
	    	    {
	    		System.out.println("\nEjercicio 4\n");
	    		Ejercicios.Ej4();
	    		System.out.println("¿Repetir Ejercicio?Y/N");
	    		System.out.print("r: ");
	    		repeje=Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;
	    	case 5:
	    	    do 
	    	    {
	    		System.out.println("\nEjercicio 5\n");
	    		Ejercicios.Ej5();
	    		System.out.println("¿Repetir Ejercicio?Y/N");
	    		System.out.print("r: ");
	    		repeje=Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;
	    	case 6:
	    	    do 
	    	    {
	    		System.out.println("\nEjercicio 6\n");
	    		Ejercicios.Ej6();
	    		System.out.println("¿Repetir Ejercicio?Y/N");
	    		System.out.print("r: ");
	    		repeje=Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;
	    	case 7:
	    	    do 
	    	    {
	    		System.out.println("\nEjercicio 7\n");
	    		Ejercicios.Ej7();
	    		System.out.println("¿Repetir Ejercicio?Y/N");
	    		System.out.print("r: ");
	    		repeje=Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;
	    	case 8:
	    	    do 
	    	    {
	    		System.out.println("\nEjercicio 8\n");
	    		Ejercicios.Ej8();
	    		System.out.println("¿Repetir Ejercicio?Y/N");
	    		System.out.print("r: ");
	    		repeje=Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;
	    	case 9:
	    	    do 
	    	    {
	    		System.out.println("\nEjercicio 9\n");
	    		Ejercicios.Ej9();
	    		System.out.println("¿Repetir Ejercicio?Y/N");
	    		System.out.print("r: ");
	    		repeje=Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;
	    	case 10:
	    	    do 
	    	    {
	    		System.out.println("\nEjercicio 10\n");
	    		Ejercicios.Ej10();
	    		System.out.println("¿Repetir Ejercicio?Y/N");
	    		System.out.print("r: ");
	    		repeje=Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;
	    	case 11:
	    	    do 
	    	    {
	    		System.out.println("\nEjercicio 11\n");
	    		Ejercicios.Ej11();
	    		System.out.println("¿Repetir Ejercicio?Y/N");
	    		System.out.print("r: ");
	    		repeje=Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;
	    	case 12:
	    	    do 
	    	    {
	    		System.out.println("\nEjercicio 12\n");
	    		Ejercicios.Ej12();
	    		System.out.println("¿Repetir Ejercicio?Y/N");
	    		System.out.print("r: ");
	    		repeje=Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;	    		    
	    }
	    
	    if(x!=0) 
	    {
		System.out.println("¿Volver al Sub-Menú?Y/N");
		System.out.print("r: ");
		vmenu=Validadores.ResMenu(y,n);
	    }
	}while(vmenu==true);
    }   

    }
