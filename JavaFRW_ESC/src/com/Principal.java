package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		
		//Lectura y escritura de Archivos y con clase File, FileWriter, File Reader y BuffedReader
		
		//Lectura de Archivos
		
		String linea = "";
		
		try { //Intenta
			
//			File archivo = new File("C:\\Users\\Emmanuel\\Desktop\\fichero.txt");//Representacion del Archivo en memoria
//			FileReader fr = new FileReader (archivo);//Sabe leer el archivo
//			BufferedReader buffer = new BufferedReader(fr);//Lee el contenido del archivo para acceder a el y mostrarlo
//			
//			while ((linea=buffer.readLine()) !=null) {
//				System.out.println("Linea: " + linea);
//			}
		
			
		//Escritura De Archivos
			
		String texto = "\nabcdefg\n";
		File archivo = new File("C:\\Users\\Emmanuel\\Desktop\\fichero.txt");
		FileWriter line = new FileWriter(archivo, true); //Podemos escribir o insertar datos de texto en el archivo
		
		for (int i = 0; i<texto.length(); i++) {
			line.write(texto.charAt(i) + "\n");//Escribimos cada caracter de nuestra cadena de texto en una nueva linea
			//line.write(texto.charAt(i));
			
		}
		line.close();
		
		}catch(Exception ex){
			System.out.println("No encontre el archivo");			
		}
	}

}
