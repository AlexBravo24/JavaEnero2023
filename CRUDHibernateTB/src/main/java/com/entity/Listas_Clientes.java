package com.entity;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="LISTAS_CLIENTES")
public class Listas_Clientes {
    
    public Listas_Clientes() {}
    public Listas_Clientes(int id) {this.clienteId=id;}
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cid_auto")
    @SequenceGenerator(name="cid_auto",sequenceName="LISTAS_CLIENTES_SEQ")
    
    @Column(name="ID_CLIENTE",columnDefinition="NUMBER") int clienteId;  
    @Column(name="NOMBRE", columnDefinition="NVARCHAR2(30)") String nombre;     
    @Column(name="TELEFONO", columnDefinition="NVARCHAR2(10)") String telefono;
    @Column(name="DIRECCION", columnDefinition="NVARCHAR2(30)") String direccion; 
    
    //Atributo relacional, no existe en la tabla
    //@OneToOne(mappedBy="cliente") Boletos boleto;
    @OneToMany(fetch = FetchType.EAGER,mappedBy="cliente",cascade = CascadeType.ALL)
    List<Boletos> boleto;
    
    //Getters & Setters 
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
