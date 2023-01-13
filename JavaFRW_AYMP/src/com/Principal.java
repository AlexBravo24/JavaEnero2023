package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		//Lectura y escritura de archivos, con clase File, FileWriter, File Reader y BufferredReader
		
		String linea = "";
		try {
//			File archivo =new File("C:\\Users\\Aylin\\Desktop\\fichero.txt");//representación del archivo
//			FileReader fr = new FileReader (archivo);//sabe leer archivo
//			BufferedReader buffer = new BufferedReader(fr);//lee el contenido del archivo para acceder a el y mostrarlo
//			
//			while((linea = buffer.readLine()) != null) {
//				System.out.println("Linea: "+ linea);
//			}
			
			//Escritura de archivos
			String texto = "\nabcdefg\n";
			File archivo =new File("C:\\Users\\Aylin\\Desktop\\fichero.txt");
			FileWriter line = new FileWriter(archivo, true); //Podemos escribir o insertar datos de texto en el archivo
			
			for(int i =0;i<texto.length();i++) {
				line.write(texto.charAt(i) + "\n");//Escribimos cada caracter de nuestra cadena de texto en una nueva linea
			}
			line.close();
			
		}catch(Exception ex) {
			System.out.println("Archivo no encontrado");
		}

	}

}
