package com;

public interface Metodos {
    
    public Cuenta buscarCuenta(String nombreCliente);
    public Ticket retirar(String nombreCliente, double monto);
    public Ticket depositar(String nombreCliente, double monto);
    public Ticket transferir(String clienteOrigen,String clienteDestino,double monto);
}
