package problemario2;

import java.util.Scanner;

import main_resources.Validadores;

public class Ejercicios {
    static Scanner sc = new Scanner(System.in);  
    static final String y="y",n="n";//si o no en menu
    
    //Programa un algoritmo que realice la tabla de multiplicar del 12
    protected static void Ej1()
    {
	for (int x=1;x<=10;x++)
	    {
	    	System.out.println(x+"x12="+x*12);
	    }
	System.out.println();
    }
    
    //Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, hasta la iteración
    //deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
    protected static void Ej2()
    {
	int x=0,y=0;
	System.out.println("Ingresa el multiplicador");
	System.out.print("r: ");
	x=Validadores.IntVal(x);
	System.out.println("¿Cuántas veces se va a multiplicar?");
	System.out.print("r: ");
	y=Validadores.IntVal(y);
	for (int i=1;i<=y;i++)
	    {
	    	System.out.println(i+"x"+x+"="+i*x);
	    }
	System.out.println();
    }
    
    //Realiza un programa para determinar si un String es palíndromo
    protected static void Ej3()
    {
	System.out.println("Ingresa un texto");
	System.out.print("r: ");
	String texto=sc.nextLine(),inv="";
	texto = texto.toLowerCase();
	boolean c=false;
	for (int i=texto.length()-1;i>=0;i--) 
	{
	    inv = inv + texto.charAt(i);
	}
	// Compara string original con el invertido
	if (texto.replace(" ","").equals(inv.replace(" ",""))) 
	{
	    c = true;
	}
	if (c==true) System.out.println("Es palíndromo");
	else System.out.println("No es palíndromo");
    }
    
    //Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado cuántas veces existe esa letra
    //dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”.
    protected static void Ej4()
    {
	System.out.println("Ingresa un texto");
	System.out.print("r: ");
	String texto=sc.nextLine(),o;
	System.out.println("Ingresa un carácter (Sólo se considera el primero)");
	System.out.print("r: ");
	char x =(sc.nextLine()).charAt(0),u;
	int n=0;
	for (int i=texto.length()-1; i>=0; i--) 
	{
	    u= texto.charAt(i);
	    o= Character.toString(x);
	    if(o.equals(Character.toString(u)))
	    {
		n+=1;
	    }	    
	}
	if (n==0)System.out.println("Carácter no encontrado");
	else System.out.println("Coincidencias encontradas: "+n);
    }
    
    //Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas   
    protected static void Ej5()
    {
	System.out.println("Reloj Digital");
	int x=0;
	for (int h = 00; h <= 23; h++)
        {
            for (int m = 00; m <= 59; m++)
            {
                for (int s = 00; s <= 59; s++)
                {
                    System.out.println(h + ":" + m + ":" + s);
                    x+=1;
                }
            }
        }
	System.out.println("Segundos transcurridos (iteraciones): "+x);//1 dia=86400 segs 
    }
    
    //Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. Cual será la cantidad
    //de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.
    protected static void Ej6()
    {
	double c=1000;
	for(int i=0;i<=12;i++)
	{
	    c*=1.02;
	    System.out.println("Mes "+i+": $"+String.format("%.2f", c));
	}	
    }
    
    //Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual. En cuantos meses tendrá
    //mas de $1500, si reinvierte cada mes todo su dinero?
   
    protected static void Ej7()
    {
	double c=700;
	int m=0;
	while(c<=1500) 
	{
	    c*=1.02;
	    m++;
	}
	System.out.println(
		"Si se invierten $700 con un interés mensual del %2,\n"
		+ "pasarán "+m+" meses para obtener mas de $1500 ($"+String.format("%.2f", c)+")\n");
    }
    
    //Programa Java que lea dos números y muestre los números desde el menor hasta el mayor
    protected static void Ej8()
    {
	int x=0,y=0,ma,me;
	System.out.println("Ingresa el primer valor");
	System.out.print("r: ");
	x=Validadores.IntVal(x);
	System.out.println("Ingresa el Segundo valor");
	System.out.print("r: ");
	y=Validadores.IntVal(y);
	if(x!=y)
	{
	    if (x<y) 
	    {
		ma=y;
		me=x;
	    }
	    else 
	    {
		ma=x;
		me=y;
	    }
	    for(int i=me;i<=ma;i++)
	    {
		System.out.println(i);
	    }
	}
	else System.out.println("son iguales!");
    }
    
    //Programa Java que lea dos números y muestre los números pares entre ellos
    protected static void Ej9()
    {
	int x=0,y=0,ma,me;
	System.out.println("Ingresa el primer valor");
	System.out.print("r: ");
	x=Validadores.IntVal(x);
	System.out.println("Ingresa el Segundo valor");
	System.out.print("r: ");
	y=Validadores.IntVal(y);
	if(x!=y)
	{
	    if (x<y) 
	    {
		ma=y;
		me=x;
	    }
	    else 
	    {
		ma=x;
		me=y;
	    }
	    System.out.println("\nNúmeros pares desde " + ma + " hasta " + me +":");
	        for (int i=me;i<=ma;i++) 
	        {
	            if (i%2==0) System.out.println(i);
	    }
	}
	else System.out.println("son iguales!");
	
    }
    
    //Programa que lea 20 números e indique si son positivos o negativos y pares o impares y ademas muestre la
    //sumatoria de los positivos y sumatoria de los impares.
    protected static void Ej10()
    {
	int c=1,x=0,ps=0,is=0;
	while(c<=20) 
	{
	    
	    System.out.println("Ingresa un número");
	    System.out.print("r: ");
	    x=Validadores.IntVal(x);
	 //   foo[c-1]=x;
	    if(x>0)
	    {
		System.out.print(x+" es positivo ");
		if(x%2==0) System.out.println("y par\n");
		else {System.out.println("e impar\n");is+=x;}
		ps+=x;
	    }
	    else if(x<0)
	    {
		System.out.print(x+" es negativo ");
		if(x%2==0) System.out.println("y par\n");
		else {System.out.println("e impar\n");is+=x;}			
	    } else System.out.println("Es cero\n");
	c++;
	}
	System.out.println("Suma postivos: "+ps+"\nSuma impares: "+is);
    }
    
    //Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto.
    protected static void Ej11()
    {
	int r=0,c=0;
	
	
	do
	{
	    System.out.println("No. de filas");
	    System.out.print("r: ");
	    r=Validadores.IntVal(r);
	}while(r<1);
	        
	do
	{
	    System.out.println("No. de Columnas");
	    System.out.print("r: ");
	    c=Validadores.IntVal(c);
	}while(c<1);
	
	char[][] foo = new char[][]{new char[r],new char[c]};
	for(int x:foo[0])
	{
	    for(int y:foo[1])
	    {
		foo[x][y]='*';
		System.out.print(foo[x][y]+" ");
	    }
    	    System.out.println(" ");
	}
    }
    
    //Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara cuando el promedio de las
    //edades sea superior a 25.
    public static void Ej12()
    {
	int x=0;
	double prom=0,se=0,c=0;
	do 
	{
	    c++;
	    System.out.println("Ingresa una Edad");
	    System.out.print("r: ");
	    x=Validadores.IntVal(x);
	    se+=(double)x;
	    prom=(se/c);
	    System.out.println("Actual promedio :"+String.format("%.2f", prom)+"\nTomado de "+c+" personas");
	}while(prom<=25);
	
    }

}
