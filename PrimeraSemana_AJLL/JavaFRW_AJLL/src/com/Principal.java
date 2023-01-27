package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		
		
		
		//Lectura y escritura de archivos
		//con clase File, FileWriter, FileReader y BufferedReader
		
		//Lectura de archivos
		
		String linea ="";
		
		try {
//			
//			File archivo = new File ("C:\\Users\\alexj\\OneDrive\\Escritorio\\Fichero.txt"); //Representacion del archivo en memoria
//			FileReader fr =new FileReader(archivo); //Sabe leer archivo
//			BufferedReader buffer = new BufferedReader (fr); //Lee el contenido del archivo para accder a el y mostrarlo
//			
//			while((linea = buffer.readLine()) != null) {
//			System.out.println("Linea: " + linea);
//			
//			
//			}
			
			//Escritura de archivos
			
			String texto = "abcdefg";
			File archivo = new File ("C:\\Users\\alexj\\OneDrive\\Escritorio\\Fichero.txt");
			FileWriter line = new FileWriter(archivo,true); //Insertar datos de texto e el archivo
			
			for (int i = 0; i<texto.length() ; i++) {
				
				line.write(texto.charAt(i) + "\n"); //Escribimos cada caracter en nuestra cadena de texto en una nueva linea
				
			}
			line.close();
			
			
			
		}catch(Exception ex) {
			System.out.println("No encontre el archivo");
		}
		
		

		
		
		
		
		

	}

}
