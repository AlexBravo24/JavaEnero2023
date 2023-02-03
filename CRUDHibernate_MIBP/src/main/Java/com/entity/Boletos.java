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

@Entity
@Table(name="BOLETOS")
@JsonIdentityInfo (
						generator = ObjectIdGenerators.PropertyGenerator.class, property = "boletoId")
public class Boletos {
	
	public Boletos () {}
	public Boletos(int id) {
		this.boletoId = id;
	}

	@Id	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "Boletos_id")
	@SequenceGenerator (name = "Boletos_id", sequenceName="BOLETOS_SEQ")
	@Column (name = "ID_BOLETO", columnDefinition="NUMBER")
	int boletoId;
	@Column(name="ID_VUELO", columnDefinition="NUMBER")
	String idVuelo;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENTE", columnDefinition="NUMBER")
	Clientes cliente;
	
	@Column (name="COSTO",columnDefinition="NUMBER(6,2)")
	String costo;
	public int getBoletoId() {
		return boletoId;
		
		
}
	public String getIdVuelo() {
		return idVuelo;
	}
	public void setIdVuelo(String idVuelo) {
		this.idVuelo = idVuelo;
	}

	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	public String getCosto() {
		return costo;
	}
	public void setCosto(String costo) {
		this.costo = costo;
	}
	public void setBoletoId(int boletoId) {
		this.boletoId = boletoId;
	}
	
	}
	
	
	
