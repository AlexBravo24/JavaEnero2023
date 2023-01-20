
public class principal {
	
	public static void main(String [] args) {
		
		continentes continentes = new continentes();
		paises paises = new paises("Argentina","Canadá","Panamá");
		
		mundo mundo = new mundo(continentes, paises);
		
		System.out.print(mundo);
	}
}
