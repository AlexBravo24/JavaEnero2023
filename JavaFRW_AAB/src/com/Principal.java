package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		
		// Lectura y escritura de archivos y con clase File, File Writer, File Reader y BufferedReader
		
		String linea = "";
		
		try { //intentar
//			File archivo = new File ("C:\\Users\\abdie\\OneDrive\\Escritorio\\Fichero.txt"); //Representacion del archivo en memoria
//			FileReader fr = new FileReader (archivo); //Sabe leer el archivo
//			BufferedReader buffer = new BufferedReader (fr); //Lee el contenido del archivo para acceder a el y mostrarlo
//			
//			while ((linea = buffer.readLine()) != null) { 
//				System.out.println("Linea: " + linea);
//			}
			
		//Escritura de Archivos
			
		String texto = "\nabcdefg\n";
		
			File archivo = new File ("C:\\Users\\abdie\\OneDrive\\Escritorio\\Fichero.txt"); 
			FileWriter line = new FileWriter(archivo, true); //Podemos insertar datos de texto en el archivo
			
			for (int i = 0; i < texto.length(); i++) {
				line.write(texto.charAt(i) + "\n"); //Escribimos cada caracter de nuestra cadena de texto en una nueva linea
			}
			line.close();
			
		} catch (Exception ex) {
			System.out.println("No se encontró el archivo");
	
		}
		
		
	}

}
