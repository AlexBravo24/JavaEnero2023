package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Boletos;
import com.entity.Listas_Clientes;
import com.general.Metodos;

public class Boletos_DAO implements Metodos {

    // Carga los objetos (las clases definidas en la persistencia)
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
    // Carga todas las operaciones (crud.. etc.)
    EntityManager em = emf.createEntityManager();
    Boletos boleto = null;

    @Override
    public String guardar(Object ob) {
	// INSERT
	boleto = (Boletos) ob;
	em.getTransaction().begin();
	String res = null;

	try {
	    em.persist(boleto);
	    em.getTransaction().commit();
	    res = "1";
	    System.out.println("Insert Success");
	} catch (Exception e) {
	    em.getTransaction().rollback();
	    res = e.getMessage();
	    System.out.println("Insert Error");
	}
	em.close();
	return res;
    }
    @Override
    public String editar(Object ob) {
	// UPDATE WHERE ID
	boleto = (Boletos) ob;
	Boletos clientedb = em.find(Boletos.class, boleto.getBoletoId());
	Listas_Clientes cliente = em.find(Listas_Clientes.class, boleto.getCliente().getClienteId());
	String res = null;
	em.getTransaction().begin();

	try {
	    clientedb.setVueloId(boleto.getVueloId());// (cliente.getNombre());
	    clientedb.setCliente(cliente);
	    clientedb.setCosto(boleto.getCosto());
	    em.getTransaction().commit();
	    System.out.println("Update Success");
	    res = "1";
	} catch (Exception e) {
	    em.getTransaction().rollback();
	    System.out.println("Update Error");
	    res = e.getMessage();
	}
	em.close();
	return res;
    }
    @Override
    public String eliminar(int id) {
	// DELETE WHERE ID
	String res = null;
	boleto = em.find(Boletos.class, id);
	em.getTransaction().begin();

	try {
	    em.remove(boleto);
	    em.getTransaction().commit();
	    System.out.println("Delete Success");
	    res = "1";
	} catch (Exception e) {
	    em.getTransaction().rollback();
	    System.out.println("Delete Error");
	    res = e.getMessage();
	}
	em.close();
	return res;
    }
    @Override
    public Object buscar(int id) {
	// SELECT WHERE ID
	boleto = em.find(Boletos.class, id);
	em.close();
	return boleto;
    }    
    @Override
    public List mostrar() {
	// SELECT
	List<Boletos> ls = em.createQuery("from Boletos").getResultList();
	em.close();
	return ls;
    }
}
