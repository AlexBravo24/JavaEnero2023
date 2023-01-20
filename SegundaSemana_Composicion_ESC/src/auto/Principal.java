package auto;

public class Principal {

	public static void main(String[] args) {
		
		Frenos frenos = new Frenos("Bosh","ABS","Acero",80000);
		Autoestereo estereo = new Autoestereo("Pioneer","LDC","AM-FM",true,true);
		Llantas llantas = new Llantas("Firestone", 205,55,"Radial",16,99.9);
		Motor motor = new Motor(2.1,4,120, 4.5, 4000);
		
		Automovil automovil = new Automovil("Chevrolet","Malibu",255000,"Vino",frenos,estereo,llantas,motor);

		System.out.println(automovil);
	}

}
