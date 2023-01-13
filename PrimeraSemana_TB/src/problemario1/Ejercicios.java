package problemario1;

import java.util.Scanner;

import main_resources.Validadores;

public class Ejercicios {
    static Scanner sc = new Scanner(System.in);  
    static final String y="y",n="n";//si o no en menu
    
    //Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
    protected static void Ej1 ()
    {
	int x=0,y=0;
	System.out.println("Ingresa el primer valor");
	System.out.print("r: ");
	x=Validadores.IntVal(x);
	System.out.println("Ingresa el Segundo valor");
	System.out.print("r: ");
	y=Validadores.IntVal(y);	
	//System.out.println("Numeros a evaluar: N1:"+x+" y N2:"+y);
	
	if (x>y)
	    System.out.println("N1: "+x+" es mayor a N2: "+y);
	else if(x<y)
	    System.out.println("N2: "+y+" es mayor a N1: "+x);
	else 
	    System.out.println("N1: "+x+" y N2: "+y+" son números iguales");
    }
    
    //Realiza un programa que pida un número por teclado y nos indique si es par o impar.
    protected static void Ej2 ()
    {
	int x=0;
	System.out.println("Ingresa un número");
	System.out.print("r: ");
	x=Validadores.IntVal(x);
	if(x%2==0)
	    System.out.println(x+" es un número par");
	else
	    System.out.println(x+" es un número impar");
    }
    
    //Crea un programa que pida al usuario dos números y muestre el resultado de su división.
    //Si el segundo número es 0, debe mostrar un mensaje de error.
    protected static void Ej3 ()
    {	
	int x=0,y=0;
	System.out.println("Ingresa el primer valor");
	System.out.print("r: ");
	x=Validadores.IntVal(x);
	System.out.println("Ingresa el Segundo valor");
	System.out.print("r: ");
	y=Validadores.IntVal(y);
	
	if(y==0) 
	{
	    System.out.println("No se puede dividir entre 0");
	}
	else
	{
	    System.out.println(x+"/"+y+"= "+((double)x/y));
	}
    }
    
    //Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula
    protected static void Ej4 ()
    {
	System.out.println("Ingresa un texto");
	System.out.print("r: ");
	String texto=sc.nextLine(),u;
	char x;
	int i;
	boolean c=false;
	for (i=texto.length()-1; i>=0; i--) 
	{
	    x= texto.charAt(i);
	    u= Character.toString(x);
	    if(u.matches("[A-Z]+")) 
	    {
		System.out.println("El texto contiene mayúsculas");
		c=true;
		i=-1;
	    }
	}
	if (c==false)System.out.println("El texto no contiene mayúsculas");		
    }

    /* Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.   
    * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
    * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
    * Otros casos -> NO ACEPTADA
    */
    protected static void Ej5() 
    {
	int x=0,y=0;
	System.out.println("Ingresa la nota");
	System.out.print("r: ");
	x=Validadores.IntVal(x);
	System.out.println("Ingresa la edad");
	System.out.print("r: ");
	y=Validadores.IntVal(y);
	System.out.println("Ingresa el sexo M/F");//Si solo exigiera que fuera M o F usaria ResMenu
	System.out.print("r: ");
	String r = sc.nextLine();
	
	if (x==5 && y==18 && r.equalsIgnoreCase("m"))System.out.println("Solicitud Posible");
	else if (x==5 && y==18 && r.equalsIgnoreCase("f"))System.out.println("Solicitud Aceptada");
	else System.out.println("Solicitud No Aceptada");
    
   }

    /*La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B),
    y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuánto 
    recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
    
    * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.  
    * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.  
    Precio inicial se recibe desde teclado
    */
    protected static void Ej6() 
    {
	double pk=0,vk=0,pv=0;
	String tipoUva="",tamUva="";
	final String UA="a",UB="b",T1="1",T2="2";
	boolean ab=false,np=false,nv=false;
	
	do
	{
	    System.out.println("Ingresa el precio base del kg de uva");
	    System.out.print("r: ");
	    pk=Validadores.DecVal(pk);
	    
	    System.out.println("Ingresa el tipo de uva (A/B)");
	    ab=Validadores.ResMenu(UA,UB);
	    if(ab==true)tipoUva="A";
	    else tipoUva="B";		
	    
	    System.out.println("Ingresa el tamaño de la uva (1/2)");
	    ab=Validadores.ResMenu(T1,T2);
	    if(ab==true)tamUva="1";
	    else tamUva="2";		
		
	    do
	    {
		System.out.println("El Kg de uva tiene un costo de "+pk+"€");
		System.out.println("La uva es de tipo: "+tipoUva);
		System.out.println("La uva es de tamaño: "+tamUva);
		System.out.println("Ingresa los kg a vender");
		System.out.print("r: ");
		    
		vk=Validadores.DecVal(vk);
		//Tipo A - Tamaño 1 || precio de venta = (preciokilo+0.20)*kilos a vender
		if (tipoUva.contentEquals(UA)&&tamUva.contentEquals(T1))
		    pv=(pk+0.20)*vk;
		//Tipo A - Tamaño 2 ó Tipo B - Tamaño 1 || precio de venta = (preciokilo+0.30)*kilos a vender
		else if ((tipoUva.contentEquals(UA)&&tamUva.contentEquals(T2))||
			 (tipoUva.contentEquals(UB)&&tamUva.contentEquals(T1)))
		    pv=(pk+0.30)*vk;
		//Tipo B - Tamaño 2 || precio de venta = (preciokilo+0.50)*kilos a vender
		else pv=(pk+0.50)*vk;		    
			System.out.println("el precio de venta de "+vk+"Kg es de: "+pv+"€");
			
		System.out.println("¿Calcular otra venta con el mismo tipo, tamaño y precio?Y/N");	    	
		System.out.print("r: ");
	    	nv=Validadores.ResMenu(y,n);
		}while(nv==true);
	    
	    System.out.println("¿Calcular otra venta con un nuevo tipo, tamaño y precio?Y/N");	    	
	    System.out.print("r: ");
	    nv=Validadores.ResMenu(y,n);
	}while(np==true);
		//System.out.print("r: ");
		
    }

    /*
    El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y
    cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
    
    * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
    * De 50 a 99 alumnos, el costo es de 70 euros.
    * De 30 a 49 alumnos, el costo es de 95 euros.
    * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
    *    
    Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
    pagar cada alumno por el viaje
    */
    protected static void Ej7() 
    {
	int x=0,ca=0;
	double pa=0;
	System.out.println("Ingresa el número de alumnos que irán al viaje");
	System.out.print("r: ");
	x=Validadores.IntVal(x);
	if(Validadores.isBetween(x,100,10000)) 
	{
	    ca=x*65;
	    pa=65;
	    
	}
	else if(Validadores.isBetween(x,50,99)) 
	{
	    ca=x*70;
	    pa=70;
	}
	else if(Validadores.isBetween(x,30,49)) 
	{
	    ca=x*95;
	    pa=95;
	}
	else if (Validadores.isBetween(x,1,29)) 
	{
	    ca=4000;
	    pa=4000/(double)x;
	}
	else System.out.println("No existen -x alumnos!");
	if (x>0) 
	{
	    System.out.print("Se deberá pagar a la agencia un total de €"+String.format("%,d%n",ca));
	    System.out.print("Cada alumno tendrá que pagar €"+String.format("%,f%n",pa));
	}
    }

    /*
    Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y
    muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
    Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
    Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
    “ERROR: número incorrecto”.
    */
    protected static void Ej8()
    {
	int x=0;
	System.out.println("Roll the Dice!");
	System.out.print("Cara obtenida: ");
	x=Validadores.IntVal(x);
	switch (x) 
	{
	case 1: System.out.println("Cara opuesta es seis");break;
	case 2: System.out.println("Cara opuesta es cinco");break;
	case 3: System.out.println("Cara opuesta es cuatro");break;
	case 4: System.out.println("Cara opuesta es tres");break;
	case 5: System.out.println("Cara opuesta es dos");break;
	case 6: System.out.println("Cara opuesta es uno");break;
	default: System.out.println("No es posible!");break;
	}
    }

    //Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.
    protected static void Ej9() 
    {
	int x=0;
	System.out.println("Introduce el número de un día de la semana");
	System.out.print("r: ");
	x=Validadores.IntVal(x);
	switch (x) 
	{ 
	case 1: System.out.println("El día 1 es Lunes");break;
	case 2: System.out.println("El día 2 es Martes");break;
	case 3: System.out.println("El día 3 es Miércoles");break;
	case 4: System.out.println("El día 4 es Jueves");break;
	case 5: System.out.println("El día 5 es Viernes");break;
	case 6: System.out.println("El día 6 es Sábado");break;
	case 7: System.out.println("El día 7 es Domingo");break;
	default: System.out.println("No es posible!");break;
	}
    }

    //Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.
    protected static void Ej10() 
    {
	int x=0;
	System.out.println("Introduce el número de un mes");
	System.out.print("r: ");
	x=Validadores.IntVal(x);
	switch (x) 
	{ 
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12: System.out.println("tiene 31 días");break;
	case 4:
	case 6:
	case 9:
	case 11: System.out.println("tiene 30 días");break;
	case 2: System.out.println("tiene 28 o 29 días");break;
	default: System.out.println("No es posible!");break;
	    
	
	}
    }
    
    /*
    Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América
    Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
    la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
    ZONA UBICACIÓN COSTO/KILOGRAMO
    1 	América del Norte 	24,00 euros
    2 	América Central 	20, 00 euros
    3 	América del Sur 	21,00 euros
    4 	Europa 			10,00 euros
    5 	Asia 			18,00 euros
    Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por
    cuestiones de logística y seguridad.
    Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
    de la entrega.
    */
    protected static void Ej11() 
    {
	double x=0;	
	System.out.println("Introduce el peso del paquete");
	System.out.print("r: ");
	x=Validadores.DecVal(x);
	if (Validadores.isBetween((int)x,0,5)&&5/x>=1)
	{
	    int q=0;
	    System.out.println
		("Ingresa el núm correspondiente a la zona de envío:\n"
		+ "0.Cancelar\n"
		+ "1.América del Norte (24€/kg)\n"
		+ "2.América Central (20€/kg)\n"
		+ "3.América del Sur (21€/kg)\n"
		+ "4.Europa (10€/kg)\n"
		+ "5.Asia (18€/kg)\n");
	    q=Validadores.IntVal(q);
	    switch (q) 
	    {
	    case 0: System.out.println("Acción cancelada");break;	    	    
	    case 1: System.out.print("El precio es de €"+String.format("%,f%n",(x*24)));break;
	    case 2: System.out.print("El precio es de €"+String.format("%,f%n",(x*20)));break;
	    case 3: System.out.print("El precio es de €"+String.format("%,f%n",(x*21)));break;
	    case 4: System.out.print("El precio es de €"+String.format("%,f%n",(x*10)));break;
	    case 5: System.out.print("El precio es de €"+String.format("%,f%n",(x*18)));break;
	    default: System.out.print("El número de zona no es correcto");break;
	    }
	}
	else System.out.println("No es posible realizar la cotización");
    }

    //Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2
    //[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
    protected static void Ej12()
    {
	double p=0,a=0,imc=0;
	System.out.println("Ingresa tu peso en kg");
	System.out.print("r: ");
	p=Validadores.DecVal(p);
	System.out.println("Ingresa tu estatura en m");
	System.out.print("r: ");
	a=Validadores.DecVal(a);
	imc=p/(Math.pow(a, 2));
	
	if (Validadores.isBetween((int)imc,40,300)&&p<800&&a<3)//imc historico fue de 247 
	    System.out.println("Tu IMC es de: "+imc+"\n Tienes obesidad de grado IV");
	else if (Validadores.isBetween((int)imc,35,40)&&p<800&&a<3)
	    System.out.println("Tu IMC es de: "+imc+"\n Tienes obesidad de grado III");
	else if (Validadores.isBetween((int)imc,30,35)&&p<800&&a<3)
	    System.out.println("Tu IMC es de: "+imc+"\n Tienes obesidad de grado II");
	else if (Validadores.isBetween((int)imc,25,30)&&p<800&&a<3)
	    System.out.println("Tu IMC es de: "+imc+"\n Tienes obesidad de grado I");
	else if (Validadores.isBetween((int)imc,18,25)&&p<800&&a<3)
	    System.out.println("Tu IMC es de: "+imc+"\n Estás saludable");
	else if (Validadores.isBetween((int)imc,17,18)&&p<800&&a<3)
	    System.out.println("Tu IMC es de: "+imc+"\n Posees bajo peso");
	else if (Validadores.isBetween((int)imc,16,17)&&p<800&&a<3)
	    System.out.println("Tu IMC es de: "+imc+"\n Posees infrapeso");
	else if (Validadores.isBetween((int)imc,18,25)&&p<800&&a<3)
	    System.out.println("Tu IMC es de: "+imc+"\n Estás en criterio de ingreso a hospital");
	else
	    System.out.println("Datos fuera de rango");	
    }

    /*
    Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
    centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
    Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
    y el resto se invierte en la bolsa.
    Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
    niños y el resto se invierte en la bolsa.
    La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
     */
    protected static void Ej13()
    {
	double cd=0;	
	System.out.println("Introduce la donación recibida");
	System.out.print("r: ");
	cd=Validadores.DecVal(cd);
	if (Validadores.isBetween((int)cd,10000,100000000)&&100000000/cd>=1)
	    System.out.println("Se debera destinar:\n"+(cd*0.3)+"€ al centro de salud\n"+(cd*0.5)+"€ al comedor de niños\n"+(cd*0.2)+"€ a la inversion en la bolsa");
	else if (Validadores.isBetween((int)cd,1,10000)&&10000/cd>=1)
	    System.out.println("Se debera destinar:\n"+(cd*0.25)+"€ al centro de salud\n"+(cd*0.6)+"€ al comedor de niños\n"+(cd*0.15)+"€ a la inversion en la bolsa");
	else 
	    System.out.println("Datos fuera de rango");
    }
    
    //Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
    //Si trabaja 40 horas o menos se le paga $16 por hora. 
    //Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
    protected static void Ej14()
    {
	double ht=0,he=0;
	System.out.println("Ingresa las horas trabajadas");
	System.out.print("r: ");
	ht=Validadores.DecVal(ht);
	he=ht%-40;
	if (Validadores.isBetween((int)ht,0,40)&&40/ht>=1)
	    System.out.println("La paga deberá ser de: $"+(ht*16));
	else if (Validadores.isBetween((int)ht,40,168)&&168/ht>=1)
	    System.out.println("La paga total deberá ser de: $"+((40*16)+(he*20))+"\n$"+(40*16)+" por las primeras 40hr y \n$"+(he*20)+" por las horas extras ("+he+"hr extras)");
	else 
	    System.out.println("Datos fuera de rango");
    }

}
