package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		
		//Lectura y escritura de archivos y con clase File, FileWrite,File Render y Buffered
		
		String linea = "";
		
		try { //intenta
			
			//LECTURA DE ARCHIVOS
			
//			File archivo = new File("C:\\Users\\haron\\Desktop\\Fichero.txt");//Representacion de archivo en memoria
//			FileReader fr = new FileReader(archivo); //Sabe leer el archivo
//			BufferedReader  buffer = new BufferedReader(fr); // Lee el contrnido del archivo para acceder a el y mostrarlo
//			
//			while((linea = buffer.readLine()) != null) {
//				System.out.println("Linea: " + linea);
//			}
			
			//ESCRITURA DE ARCHIVOS
			
			String texto = "nnabcdefg\n";
			File archivo = new File("C:\\Users\\haron\\Desktop\\Fichero.txt");
			FileWriter line = new FileWriter(archivo,true); //Podemos escribir o insertar datos de texto en el archivo
			
			for(int i=0;i<texto.length();i++) {
				
				line.write(texto.charAt(i)+ "\n"); //Escribimos cada caracter de nuestra cadena de texto en una nueva linea
			}
			line.close();
			
		}catch (Exception ex) {
			System.out.println("No encontre el archivo");
		}

	}

}
