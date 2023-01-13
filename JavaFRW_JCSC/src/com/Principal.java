package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		
		//Lectura y escritura de archivos y con clase File, FileWriter, FileReader y BufferedReader
				
		String linea = "";
		
		try { //Intenta
			
			//Lectura de archivos
			
//			File archivo = new File ("C:\\Users\\César\\Desktop\\fichero.txt"); //Representación del archivo en memoria
//			FileReader fr = new FileReader (archivo); //Sabe leer el archivo
//			BufferedReader buffer = new BufferedReader (fr); //Lee el contenido del archivo para acceder a él y mostrarlo
//			
//			while ((linea = buffer.readLine()) !=null) {
//				System.out.println("Linea: " +  linea);
//			}			
			
			
			//Escritura de archivos
			
			String texto = "\nabcdefg\n";
			File archivo = new File ("C:\\Users\\César\\Desktop\\fichero.txt");
			FileWriter line = new FileWriter(archivo, true); //Podemos escribir o insertar datos de texto en el archivo
			
			for (int i=0; i<texto.length(); i++) {
				line.write(texto.charAt(i) + "\n"); //Escribe cada caracter de muestra de texto en una nueva línea
			}
			line.close();
			
			
			
 		} catch (Exception ex) {
 			System.out.println("No encontré el archivo");
 		}
		
		

	}

}
