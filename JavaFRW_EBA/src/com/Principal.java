package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		
	// Lectura y escritura de archivos con clase file, file whriter, file reader y buffer
		
		
		String linea = "";
		
		try {//intenta
			
//			File archivo = new File("C:\\Users\\alons\\Desktop\\fichero.txt"); //reprecentacion del archivo nen memoria
//			
//			FileReader fr = new FileReader (archivo); //sabe leer el archivo
//			BufferedReader buffer = new BufferedReader(fr);  //lee el contenido del archivo para acceder a el y mostrarlo
//			
//			while ((linea = buffer.readLine()) != null){
//				System.out.println("Linea: " + linea);
//			}
			
	// Escritura de archivos 
			
			String texto = "\n abcdfeghi";
			File archivo = new File("C:\\Users\\alons\\Desktop\\fichero.txt");
			FileWriter line = new FileWriter (archivo, true); //podemos escribir o inseertar datos en el archivo.
			
			for (int i = 0; i < texto.length(); i++) {
				line.write(texto.charAt(i) + " ");  //Escribimos cada caracter de nuestra cadena de texto en una nueva linea 
			}
			line.close();
			System.out.println("operacion realizada");
		}catch(Exception ex) {
			System.out.println("Archivo no encontrado");
		}

	}

}
