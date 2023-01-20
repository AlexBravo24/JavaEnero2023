package com;

public class PrincipalRobotica {

	public static void main(String[] args) {
		
		Arduino arduinoUno = new Arduino(9,"ArduinoUno","ultrasonico","IDE arduino","protoboard","jumpers");
		Desarrolloweb web =new Desarrolloweb(12,"VisualStudioCode","HTML","CSS","JavaScript");
		Videojuegos juegos = new Videojuegos(6,"Scratch","Roblox","Minecraft","Juegopropio3D");
		
		Cursos curso1 = new Cursos(6,1,15,5000,"1/enero/23","15/dic/23",arduinoUno,web,juegos);
		
		System.out.println(curso1);

	}

}
