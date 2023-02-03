package com.entity;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="BOLETOS")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="boletoId")
public class Boletos {

    public Boletos() {}
    public Boletos(int id) {this.boletoId=id;}
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cid_auto")
    @SequenceGenerator(name="cid_auto",sequenceName="BOLETOS_SEQ")
    
    @Column(name="ID_BOLETO",columnDefinition="NUMBER") int boletoId;  
    @Column(name="ID_VUELO", columnDefinition="NUMBER") int vueloId;     
    /*
    @OneToOne
    @JoinColumn(name="ID_CLIENTE", columnDefinition="NUMBER") Listas_Clientes clienteId;
    */
    @ManyToOne
    @JoinColumn(name="ID_CLIENTE", columnDefinition="NUMBER") Listas_Clientes cliente;
    
    @Column(name="COSTO", columnDefinition="NUMBER(6,2)") double costo; 
    //Getters & Setters
    public int getBoletoId() {
        return boletoId;
    }
    public void setBoletoId(int boletoId) {
        this.boletoId = boletoId;
    }
    public int getVueloId() {
        return vueloId;
    }
    public void setVueloId(int vueloId) {
        this.vueloId = vueloId;
    }
    public Listas_Clientes getCliente() {
        return cliente;
    }
    public void setCliente(Listas_Clientes cliente) {
        this.cliente = cliente;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    
}
