package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Listas_Clientes;
import com.general.Metodos;

public class Listas_Clientes_DAO implements Metodos {

    // Carga los objetos (las clases definidas en la persistencia)
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
    // Carga todas las operaciones (crud.. etc.)
    EntityManager em = emf.createEntityManager();
    Listas_Clientes cliente = null;

    @Override
    public String guardar(Object ob) {
	// INSERT
	cliente = (Listas_Clientes) ob;
	em.getTransaction().begin();
	String res = null;

	try {
	    em.persist(cliente);
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
	cliente = (Listas_Clientes) ob;
	Listas_Clientes clientedb = em.find(Listas_Clientes.class, cliente.getClienteId());
	String res = null;
	em.getTransaction().begin();

	try {
	    clientedb.setNombre(cliente.getNombre());// (cliente.getNombre());
	    clientedb.setTelefono(cliente.getTelefono());
	    clientedb.setDireccion(cliente.getDireccion());
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
	cliente = em.find(Listas_Clientes.class, id);
	em.getTransaction().begin();

	try {
	    em.remove(cliente);
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
	cliente = em.find(Listas_Clientes.class, id);
	em.close();
	return cliente;
    }

    @Override
    public List mostrar() {
	// SELECT
	List<Listas_Clientes> ls = em.createQuery("from Listas_Clientes").getResultList();
	em.close();
	return ls;
    }
}
