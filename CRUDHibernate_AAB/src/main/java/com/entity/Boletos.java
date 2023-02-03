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
@Table(name = "BOLETOS")
@JsonIdentityInfo(
				  generator=ObjectIdGenerators.PropertyGenerator.class,
				  property="boletoId")


public class Boletos {
	
	public Boletos() {}
	public Boletos (int id) {
		this.boletoId = id;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "cid_boleto")
	@SequenceGenerator(name = "cid_boleto", sequenceName ="BOLETOS_SEQ")
	@Column(name="ID_BOLETO", columnDefinition = "NUMBER")
	int boletoId;
	
	@Column (name = "ID_VUELO", columnDefinition = "NUMBER")
	String id_vuelo;
	
	@ManyToOne
	@JoinColumn (name = "ID_CLIENTE", columnDefinition = "NUMBER")
	Clientes cliente;
	
	@Column (name = "COSTO", columnDefinition = "NUMBER")
	String costo;
	
	//Getters & Setters
	public int getBoletoId() {
		return boletoId;
	}
	public void setBoletoId(int boletoId) {
		this.boletoId = boletoId;
	}
	public String getId_vuelo() {
		return id_vuelo;
	}
	public void setId_vuelo(String id_vuelo) {
		this.id_vuelo = id_vuelo;
	}
	public String getCosto() {
		return costo;
	}
	public void setCosto(String costo) {
		this.costo = costo;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	
}
