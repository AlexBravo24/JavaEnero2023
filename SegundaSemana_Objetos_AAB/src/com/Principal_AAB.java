package com;

public class Principal_AAB {

	public static void main(String[] args) {
		
		//Instanciando a un objeto de la clase o "plantilla" Persona_AAB
		Persona_AAB persona1 = new Persona_AAB();
		
		persona1.setNombre("Abdiel");
		persona1.getEdad();
		
		Persona_AAB persona2 = new Persona_AAB("Aylin","Femenino",27,60.0,1.65);
		
		
		System.out.println(persona1);
		System.out.println(persona2 + "\n");
		
		//Modelar 5 objetos
		
		//Crear una clase para cada objeto
		/* Cada objeto debe llevar sus atributos, 
		 * constructores, 
		 * getters&setters, 
		 * metodo toString
		 * Instanciarlos en la clase Principal
		 * 1 con atributos que ustedes eligen
		 * 1 con todos los atributos (constructor de todos los parámetros)
		 */
		
//1er objeto
		baño baño1 = new baño();
		
		baño1.setArea(10.5);
		baño1.setColor("amarillo");
		baño1.setDucha("si");
		
		baño baño2 = new baño(22.3, "rojo", "si", "no");
		
		System.out.println(baño1);
		System.out.println(baño2 + "\n");
		
//2do objeto
		enfrijoladas enfrijoladas1 = new enfrijoladas();
		
		enfrijoladas1.setCantidad(3);
		enfrijoladas1.setRelleno("pollo");
		
		enfrijoladas enfrijoladas2 = new enfrijoladas(4, "si", "no", "huevo");
		
		System.out.println(enfrijoladas1);
		System.out.println(enfrijoladas2 + "\n");
		
//3er objeto
		internet internet1 = new internet();
		
		internet1.setCompañia("Telmex");
		internet1.setVelocidadMB(50);
		
		internet internet2 = new internet("Megacable", 100, 2);
		
		System.out.println(internet1);
		System.out.println(internet2 + "\n");
		
//4to objeto
		cancion cancion1 = new cancion();
		
		cancion1.setNombre("Bizcochito");
		cancion1.setArtista("Rosalia");
		cancion1.setDuracionmins(2.50);
		
		cancion cancion2 = new cancion("Me Rehuso", "Danny Ocean", "Album 1", "Regueton", 3.00);
		
		System.out.println(cancion1);
		System.out.println(cancion2 + "\n");
		
//5to objeto
		escuela escuela1 = new escuela();
		
		escuela1.setNombre("Universidad Veracruzana");
		escuela1.setNumsalones(30);
		escuela1.setMaxgrado("Universidad");
		
		escuela escuela2 = new escuela("Colegio Lizardi", "preparatoria", 15, "Si");
		
		System.out.println(escuela1);
		System.out.println(escuela2);
		
		
	}

}
