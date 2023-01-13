package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		
		// Lectura y escritura de archivos y con clase File, File Writter, File Reader y Buffer
		
		//Lectura de archivos
		
		String linea = ""; 
		
		try //intenta  
		{
		
//		File archivo = new File ("C:\\Users\\Abysmalito\\Desktop\\Fichero.txt"); // Representación del archivo en memoria
//		FileReader fr = new FileReader (archivo); // Sabe leer el archivo	
//		BufferedReader buffer = new BufferedReader (fr); // Lee el contenido del archivo para almacenarlo en el buffer
//		
//		while ((linea = buffer.readLine())!= null) {
//			
//			System.out.println("Línea: " + linea);
//		}
			
			// Escritura de Archivos
			
		String texto = "\nabcde\n";	
		File archivo = new File ("C:\\Users\\Abysmalito\\Desktop\\Fichero.txt");
		FileWriter Line = new FileWriter (archivo, true); //Podemos escribir o insertar textos en el archivo
		
		for (int i= 0; i<texto.length(); i++)
		{
			 Line.write(texto.charAt(i) + "\n"); // Escribimos cada caracter en nuestra cadena de texto en una nueva línea 
		}
		 Line.close();
	
		}	catch (Exception ex) {
		
		System.out.println("No se encontró el archivo");
	}
	}

}
