package com;

public class PrincipalPasta {

	public static void main(String[] args) {
		Pasta pasta1 = new Pasta();
		
		pasta1.setPorcion("grande");
		pasta1.setIngrediente1("salsaTomate");
		pasta1.setIngrediente2("ajo");
		
		Pasta pasta2 = new Pasta("mediana","queso","macarrones","AceiteOliva");
		
		System.out.println(pasta1);
		System.out.println(pasta2);

	}

}
