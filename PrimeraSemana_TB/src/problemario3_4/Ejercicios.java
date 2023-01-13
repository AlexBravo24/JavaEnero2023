package problemario3_4;

import java.util.Scanner;

import main_resources.Validadores;

public class Ejercicios 
{
    static Scanner sc = new Scanner(System.in);  
    static final String y="y",n="n";
    
//ARRAY    
    //Crea un array de 10 posiciones de números con valores pedidos por teclado.
    //Muestra por consola el índice y el valor al que corresponde.
    protected static void Ej1() 
    {
	int a1[]= new int[10];
	int x=0;
	
	for (int i=0;i<=9;i++) 
	{
	    System.out.println("Ingresa el valor ");
	    System.out.print("r: ");
	    x=Validadores.IntVal(x);
	    a1[i]=x;		      
	}
	x=0;
	for (int i:a1)
	{System.out.println("["+x+"] "+i);x++;}	
    }   
    
    //Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.
    protected static void Ej2() 
    {
	int a1[]= new int[100];
	int suma=0;
	for (int i=0;i<=99;i++) 
	{
	    a1[i]=i+1;
	    suma+=a1[i];
	}	
	System.out.println("La suma del arreglo es: "+suma+"\nmedia: "+suma/100);	
    }
        
    //Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
    protected static void Ej3() 
    {
	System.out.println("Ingresa un texto");
	System.out.print("r: ");
	String texto=sc.nextLine();
	
	char u=' ';
	char a1[]= new char[texto.length()];
	
	for (int i=0; i<=texto.length()-1; i++) 
	{
	    u= texto.charAt(i);
	    a1[i]=u;	
	    System.out.println(a1[i]);
	}
	for (int i=0; i<=texto.length()-1; i++) 
	{
	    System.out.println("["+i+"] "+String.valueOf(a1[i]));	
	}
    }
    
    /*
    Dado un array de números de 5 posiciones con los siguientes valores:
    {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
    los valores invertidos, es decir, que el segundo array deberá tener los valores
    {5,4,3,2,1}.
    */
    protected static void Ej4() 
    {
	int a1[]= {1,2,3,4,5};
	int a2[]= new int[a1.length];
	int x=0;
	for (int i=a1.length-1;i>=0;i--) 
	{	    
	    a2[x]=a1[i];
	    x++;
	}
	x=0;
	for (int i:a2)
	{System.out.println("["+x+"] "+i);x++;}	
    }
    
    /*
    Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
    respectivos precios. Muestra en consola la lista de productos y sus precios.
    Por lo menos 5 productos o artículos.*/
    protected static void Ej5() 
    {
	int a1[]= {33,25,16,64,35};
	String a2[]={"papa","elote","platano","tomate","cebolla"};
	    for (int y=0; y<=a2.length-1; y++) 
	    {		
		System.out.print(a1[y]+"   ");
		System.out.print(a2[y]+"\n");
	    }
    }

//MATRIZ    
    /*
    Crea un programa que pida por pantalla cuatro países y a continuación tres ciudades de cada uno de estos países. 
    Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer índice sea el número 
    asignado a cada país y el segundo índice el número asignado a cada ciudad. 4*6
    */
    protected static void Ej6() 
    {
	String matriz[][]= new String[4][6];
	int r=0,c=3;
	while(r<=3)
	{
	    matriz[r][0]="País  :";
	    matriz[r][2]="Ciudades :";	    
	    System.out.println("Ingresa un País");
	    System.out.print("r: ");
	    matriz[r][1]=sc.nextLine();	    
	    while(c<6) 
	    {
		 System.out.println("Ingresa una ciudad de "+matriz[r][1]);
		 System.out.print("r: ");
		 matriz[r][c]=sc.nextLine();
		 c++;
	    }
	    r++;
	    c=3;
	}	
	    Validadores.printMatrix(matriz);	
    }

    /*
    Crea las siguientes matrices. Ejemplo: String matrizA [] [] = new String [3][5]; para que muestre los siguientes valores:
    
    Matriz A
    “5” “x” “9” “4” “t”
    “3” “z” “P” “c” “6”
    “8” “3” “f” “i” “7”
    Matriz B
    “7” “P” “4” “g” “8”
    “5” “w” “Y” “10” “2”
    “4” “7” “v” “o” “6”
    
    Una vez creadas, deberás crear un algoritmo que convierta los valores numéricos a enteros y los sume de acuerdo a su posición 
    en una tercera matriz (Ejemplo, valor String de Matriz A 0,0=”5“+ valor String de Matriz B 0,0=”7”, entonces en la
    coordenada 0,0 de la Matriz C debería mostrarse la suma, quedando como Matriz C 0,0=”12”. 
    
    Aplicando la lógica de que solo se pueden sumar los valores que son numéricos, si las coordenadas tienen valores de letras 
    o un valor numérico y una letra, entonces en la Matriz C 0,1 se deberá mostrar un valor = “0”.
    
    Matriz C
    “12” “0” “13” “0” “0”
    “8” “0” “0” “0” “8”
    “12” “10” “0” “0” “13”
    */
    protected static void Ej7() 
    {
	String 	matrizA[][]= new String[3][5],
		matrizB[][]= new String[3][5],
		matrizC[][]= new String[3][5];
	
	//MATRIZ A
	matrizA[0][0]="5";
	matrizA[1][0]="3";
	matrizA[2][0]="8";
	
	matrizA[0][1]="x";
	matrizA[1][1]="z";
	matrizA[2][1]="3";
	
	matrizA[0][2]="9";
	matrizA[1][2]="P";
	matrizA[2][2]="f";
	
	matrizA[0][3]="4";
	matrizA[1][3]="c";
	matrizA[2][3]="i";
	
	matrizA[0][4]="t";
	matrizA[1][4]="6";
	matrizA[2][4]="7";	
	
	//MATRIZB
	matrizB[0][0]="7";
	matrizB[1][0]="5";
	matrizB[2][0]="4";
	
	matrizB[0][1]="p";
	matrizB[1][1]="W";
	matrizB[2][1]="7";
	
	matrizB[0][2]="4";
	matrizB[1][2]="Y";
	matrizB[2][2]="v";
	
	matrizB[0][3]="g";
	matrizB[1][3]="10";
	matrizB[2][3]="O";
	
	matrizB[0][4]="8";
	matrizB[1][4]="2";
	matrizB[2][4]="6";
	System.out.println("Matriz A");
	Validadores.printMatrix(matrizA);
	System.out.println();
	System.out.println("Matriz B");
	Validadores.printMatrix(matrizB);
	System.out.println();
	System.out.println("Matriz C");     
        
	for(int r=0; r<matrizC.length; r++) 
	{
	    //System.out.print("||");
	    for(int c=0; c<matrizC[r].length; c++) 
	    {		
		try 
    	    	{
		    matrizC[r][c]=Integer.toString((Integer.parseInt(matrizA[r][c])+(Integer.parseInt(matrizB[r][c]))));		
    	    	}
    	    	catch(NumberFormatException nfe)
    	    	{
    	    	    matrizC[r][c]="0";
    	    	}   
	    }
	}    
	Validadores.printMatrix(matrizC);
	System.out.println();
    }
}
