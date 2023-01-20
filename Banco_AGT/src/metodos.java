
public interface metodos {
	public cuenta buscarCuenta(String nombreCliente); //identificar cuenta por llave o id
	public ticket retirar(String nombrecliente, double monto);// identificamos cuenta y monto a retirar
	public ticket depositar(String nombrecliente, double monto);//identificamos cuenta y monto a transferir
	public ticket transferir(String clienteOrigen, String clienteDestino, double monto);
	
}
