package com;
import java.util.Vector;

public class Principal {
	
	public static void main(String[] args) {
		
		//Vector - Definicion
//		Vector es como la matriz din�mica que puede crecer o reducir su tama�o. 
//		A diferencia de la matriz, podemos almacenar n n�meros de elementos en ella, ya que no hay l�mite de tama�o.
		
		//dif con las listas
		//Contiene metodos heredados de clases que no estan en framework
		//El vector esta sincronizado
		
		//Formas de declarar un vector
		Vector<Integer> miVector = new Vector <Integer> (10,3);
		
		//A�adiendo elementos al Vector
		miVector.add(1);
		miVector.add(4);
		miVector.add(9);
		miVector.add(16);
		miVector.add(25);
		miVector.add(36);
		
		//Imprimir Vector con foreach
		for(Integer i : miVector) {
			System.out.println(i);
		}
		
		//eliminar en un vector
		miVector.remove(5); //Removemos el ultimo elemento del vector
		System.out.println();
		for(Integer i : miVector) {
			System.out.println(i);
		}
		
		//Ver elementos en particular
		System.out.println("El elemento 5 del vector es: " + miVector.get(4));
		
		//Tama�o del vector
		System.out.println("El tama�o del vector actual es: " + miVector.size());
		
		//Modificar elementos del Array
		miVector.set(1, 12345);
		System.out.println(miVector);
		
		//Source: https://open-bootcamp.com/cursos/java/vectores
		
		
	}

}
