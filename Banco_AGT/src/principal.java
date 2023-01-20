import java.util.HashMap;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,cuenta> cuenta = new HashMap<String, cuenta>();
		cuenta.put("Aylin",new cuenta("001",5000,"9707",1000,2000,"debito"));
		cuenta.put("Eduardo",new cuenta("002",8000,"7607",500,3000,"debito"));
		cuenta.put("Emanuel",new cuenta("003",2000,"9687",200,25000,"debito"));
		cuenta.put("Tavo",new cuenta("004",3000,"6854",2000,15000,"debito"));
	//instanciando cajero
		
	cajero cajero1= new cajero("Insurgentes, CMX", cuenta);
	
	//consultando informacion de las cuentas 
	
	System.out.println(cajero1.buscarCuenta("Eduardo"));
	System.out.println(cajero1.retirar("Eduardo", 1000));
	
	}
	
	
	
}
