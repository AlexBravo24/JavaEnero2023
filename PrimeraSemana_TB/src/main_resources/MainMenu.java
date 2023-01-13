package main_resources;

class MainMenu {

    //CORRER ESTE
    public static void main(String[] args) 
    {
	int x=0;//seleccion ejercicio en el menu
	boolean repeje=false,vmenu=false;//repetir ejercicio || volver al menu
	final String y="y",n="n";//si o no en menu
	do
	{
	    x=0;
	    vmenu=false;
	    repeje=false;
	    System.out.println
        		("Ingresa el núm correspondiente al submenu deseado:\n"
        		+"0.Salir\n"
        		+ "1.Problemario 1: Selección (if-switch)\n"
        		+ "2.Problemario 2: Iteración (for-while)\n"
        		+ "3.Problemario 3 y 4: Arrays y Matrices\n");
	    System.out.print("r: ");
	    x=Validadores.MenuVal(x,3);	
        	//System.out.println(x);
	    switch (x) 
	    {	
	    	case 0:
	    	    System.out.println("Saliendo...");
	    	    break;
	    	case 1:
	    	    do 
	    	    {
	    		//System.out.println("\nProblemario 1: Selección (if-switch)\n");
	    		System.out.print("\nSeleccionado:");
	    		problemario1.Menu.main(null);
	    		System.out.println("¿Estás  seguro?Y/N");
	    		System.out.print("r: ");
	    		repeje=!Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;
	    	case 2:
	    	    do 
	    	    {
	    		//System.out.println("\nProblemario 2: Iteración (for-while)\n");
	    		System.out.print("\nSeleccionado:");
	    		problemario2.Menu.main(null);
	    		System.out.println("¿Estás  seguro?Y/N");
	    		System.out.print("r: ");
	    		repeje=!Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;
	    	case 3:
	    	    do 
	    	    {
	    		//System.out.println("\nProblemario 3 y 4: Arrays y Matrices\n");
	    		System.out.print("\nSeleccionado:");
	    		problemario3_4.Menu.main(null);
	    		System.out.println("¿Estás  seguro?Y/N");
	    		System.out.print("r: ");
	    		repeje=!Validadores.ResMenu(y,n);
	    	    }while(repeje==true);
	    	    break;	    		    
	    }
	    
	    if(x!=0) 
	    {
		System.out.println("¿Volver al Menú Principal?Y/N");
		System.out.print("r: ");
		vmenu=Validadores.ResMenu(y,n);
	    }
	}while(vmenu==true);
        System.out.println("Hasta luego");
    

    }

}
