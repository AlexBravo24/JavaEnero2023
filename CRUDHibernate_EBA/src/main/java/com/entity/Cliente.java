package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="LISTAS_CLIENTES")
public class Cliente {
	
	public Cliente() {}
	
	public Cliente(int id) {
		this.clienteId = id;
	}
	
	@Id //identifica nuestra primary key de nuestro objeto en la tabla o entidad 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")  //equivale al valor del trigger
	@SequenceGenerator(name="cid_auto",sequenceName="LISTAS_CLIENTES_SEQ" ) // indicamos el nombre de la secuencia en sql
	@Column(name = "id_cliente",columnDefinition = "NUMBER") // indicamos la columna con su nombre y erl tipo de dato de la columna 
	int clienteId;
	
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(30)" )
	String nombre;
	@Column(name = "TELEFONO", columnDefinition = "NVARCHAR2(10)" )
	String telefono;
	@Column(name = "DIRECCION", columnDefinition = "NVARCHAR2(30)" )
	String direccion;
	public int getClienteId() {
		return clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
		
}
