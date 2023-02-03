package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity //Identificar que vamos a trabajar con un objeto o entidad en una base de datos
@Table(name="BOLETOS") //Indicamos el nombre de la tabla en la base de datos
@JsonIdentityInfo(
				  generator = ObjectIdGenerators.PropertyGenerator.class,
				  property="boletoId")
public class Boletos {

	public Boletos() {
	}
	
	public Boletos(int id) {
		this.boletoId = id;
	}

	@Id//Identifica nuestra Primary key de nuestro objeto en la base de daos
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_auto")//eQUIVALE AL TRIGGER
	@SequenceGenerator(name="id_auto", sequenceName="BOLETOS_SEQ")//Indicamos la columna de su nombre y el tipo de dato de la columna

	@Column(name="ID_BOLETO", columnDefinition="NUMBER")
	int boletoId;
	@Column(name="ID_VUELO", columnDefinition="NUMBER")
	int vueloId;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENTE", columnDefinition="NUMBER")
	Clientes cliente;
	
	@Column(name="COSTO", columnDefinition="NUMBER(6,2)")
	int costo;
	//Getters & Setters
	/**
	 * @return the boletoId
	 */
	public int getBoletoId() {
		return boletoId;
	}
	/**
	 * @param boletoId the boletoId to set
	 */
	public void setBoletoId(int boletoId) {
		this.boletoId = boletoId;
	}
	/**
	 * @return the vueloId
	 */
	public int getVueloId() {
		return vueloId;
	}
	/**
	 * @param vueloId the vueloId to set
	 */
	public void setVueloId(int vueloId) {
		this.vueloId = vueloId;
	}

	
	/**
	 * @return the cliente
	 */
	public Clientes getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the costo
	 */
	public int getCosto() {
		return costo;
	}
	/**
	 * @param costo the costo to set
	 */
	public void setCosto(int costo) {
		this.costo = costo;
	}
	
}


