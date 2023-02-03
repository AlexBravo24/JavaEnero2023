package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity //Identificar que vamos a trabajar con un objeto o entidad en una base de datos
@Table(name="LISTAS_CLIENTES") //Indicamos el nombre de la tabla en la base de datos
public class Clientes {
	
	public Clientes() {
		
	}
	public Clientes(int id) {
		this.clienteId = id;
	}

	@Id//Identifica nuestra Primary key de nuestro objeto en la base de daos
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")//eQUIVALE AL TRIGGER
	@SequenceGenerator(name="cid_auto", sequenceName="LISTAS_CLIENTES_SEQ")//Indicamos la columna de su nombre y el tipo de dato de la columna
	
	@Column(name="ID_CLIENTE", columnDefinition="NUMBER")
	int clienteId;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(30)")
	String nombre;
	@Column(name="TELEFONO", columnDefinition="NVARCHAR2(10)")
	String telefono;
	@Column(name="DIRECCION", columnDefinition="NVARCHAR2(30)")
	String direccion;
	
	//Atributo relacional (no existe en la tabla)
	@OneToMany(mappedBy="cliente")
	List <Boletos> boleto;
	
	//Getters & Setters
	/**
	 * @return the clienteId
	 */
	public int getClienteId() {
		return clienteId;
	}
	/**
	 * @param clienteId the clienteId to set
	 */
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the boleto
	 */
	/**
	 * @return the boleto
	 */
	public List<Boletos> getBoleto() {
		return boleto;
	}
	/**
	 * @param boleto the boleto to set
	 */
	public void setBoleto(List<Boletos> boleto) {
		this.boleto = boleto;
	}

	
	
	
	
}
