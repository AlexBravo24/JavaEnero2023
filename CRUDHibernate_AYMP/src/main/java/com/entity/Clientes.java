package com.entity;

import javax.persistence.Table;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity  //identificar que vamos a trabajar con un objeto o entidad en una base de datos
@Table(name="LISTAS_CLIENTES")//indicamos el nombre de la tabla en la base de datos
public class Clientes {
	
	public Clientes() {}
	public Clientes(int id) {
		this.clienteId = id;
	}
	
	@Id //identifica nuestra primary key de nuestro objeto en la tabla o entidad
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="id_cliente")
	@SequenceGenerator(name="id_cliente",sequenceName="LISTAS_CLIENTES_SEQ")
	@Column(name="ID_CLIENTE",columnDefinition = "NUMBER")
	int clienteId;
	
	@Column (name="NOMBRE",columnDefinition = "NVARCHAR2 (30)")
	String nombre;
	@Column (name="TELEFONO",columnDefinition = "NVARCHAR2(10)")
	String telefono;
	@Column (name="DIRECCION",columnDefinition = "NVARCHAR2(30)")
	String direccion;
	
	//atributo relacional (no existe en la tabla)
	@OneToMany(mappedBy="cliente")
	List <Boletos> boleto;
	
	
	public int getClienteId() {
		return clienteId;
	}
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
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
	public List<Boletos> getBoleto() {
		return boleto;
	}
	public void setBoleto(List<Boletos> boleto) {
		this.boleto = boleto;
	}
	
	
	
	
	

}
