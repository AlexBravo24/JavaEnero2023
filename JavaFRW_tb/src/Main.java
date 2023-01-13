import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) 
    {
	String linea="";
	
	try 
	{
	   File archivo = new File(System.getProperty("user.home")+"\\Desktop\\fichero.txt");
	   FileReader fr = new FileReader(archivo);
	   BufferedReader buffer= new BufferedReader(fr);
	   while((linea=buffer.readLine())!=null) System.out.println("Linea: "+ linea);
	   {
	       
	   }
	}
	catch(Exception ex)
	{
	    System.out.println("Fichero no encontrado");
	}
	
	try 
	{
	   File archivo = new File(System.getProperty("user.home")+"\\Desktop\\fichero.txt");
	   FileWriter fr = new FileWriter(archivo);
	   fr.write("holawas");    
           fr.close();    
	}
	catch(Exception ex)
	{
	    System.out.println("Fichero no encontrado");
	}
	
    }

    
}
