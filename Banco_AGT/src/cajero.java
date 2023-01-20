import java.util.Date;
import java.util.HashMap;

public class cajero implements metodos {
	
	private String sucursal;
	private int folio=0;
	
	//Hashmap - Nos ayudará a simular una pequeña base de datos 
	//encontrando los valores por su key y su objeto (cuenta)
	
	private HashMap<String, cuenta> cuentas; // nos ayudará a relazionar una cuenta con el nombre del cliente 
	
	public cajero () {}

	public cajero(String sucursal, HashMap<String, cuenta> cuentas) {
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}
	
	@Override
	public cuenta buscarCuenta(String nombrecliente) {
		
		cuenta cuenta = null; //instanciando objeto cuenta
		
		//Buscar dentro del conjunto de llaves del Hashmap
		
		for(String i:this.cuentas.keySet()) {  //iteracion sobre llaves
			if (i.equals(nombrecliente)) { //si el nombre que buscamos es igual a la llave
				cuenta=this.cuentas.get(i);// se guarda en una instancia  del objeto cuenta
				break;
			}
			
		}
		
		return cuenta;
	}

	@Override
	public ticket retirar(String nombrecliente, double monto) { //necesitamos ver de que cuenta vamos a retirar
		
		ticket ticket = null; //instanciamos ticket vacio
		
		if(this.buscarCuenta(nombrecliente) != null) {
			cuenta cuenta = this.buscarCuenta(nombrecliente);
			if (monto > 9000) {
				System.out.print("monto excede el maximo de retiros");
				return ticket;
			
			}
			else if(cuenta.getSaldo()<monto){
				System.out.println("saldo insuficiente" );
				return ticket;
			}
			else if(cuenta.getSaldo() - monto< cuenta.getMin()) {
				System.out.println("El retiro dejaria por debajo del minimo la cuenta" );
				return ticket;
			}
			else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);//se actualiza el saldo de la cuenta 
				ticket = new ticket(folio++,new Date(), cuenta.getNumcuenta(),cuenta.getSaldo(), this.sucursal,1);
				return ticket;
			}
			
		}
		else {
			System.out.println("No hay una cuenta asociada a este cliente");
			return ticket;
		}
		
		
	}

	@Override
	public ticket depositar(String nombrecliente, double monto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ticket transferir(String clienteOrigen, String clienteDestino, double monto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//implementado las acciones
	
	
}
