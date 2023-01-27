package com;

public class ciclos5_AYMP {

	public static void main(String[] args) {
		
		int horas=0, min=0, seg;
		for(seg=0;seg<=59;seg++) {
			System.out.println(horas +" : "+ min +" : "+seg);
		}
		for(min=1;min<=59;min++) {
			System.out.println(horas +" : "+ min +" : "+seg);
			for(seg=1;seg<=59;seg++) {
			System.out.println(horas +" : "+ min +" : "+seg);
			}
		}
		for(horas=0;horas<=23;horas++) {
			System.out.println(horas +" : "+ min +" : "+seg);
			for(min=1;min<=59;min++) {
			System.out.println(horas +" : "+ min +" : "+seg);
			    for(seg=1;seg<=59;seg++) {
				System.out.println(horas +" : "+ min +" : "+seg);
				}
			}
		}
		

}
}
