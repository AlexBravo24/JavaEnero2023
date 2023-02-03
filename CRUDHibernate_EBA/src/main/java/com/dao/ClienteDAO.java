package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Cliente;
import com.general.Metodos;

public class ClienteDAO implements Metodos{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Cliente cliente = null;

	@Override
	public String guardar(Object ob) {
		cliente = (Cliente) ob;
		em.getTransaction().begin();
		String resultado = null;
		
		try {
			em.persist(cliente); // este es el insert
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");	
		}catch (Exception e){
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");	
		}
		em.close();
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		
		cliente = (Cliente) ob;
		Cliente clientedb = em.find(Cliente.class, cliente.getClienteId()); 
		String r = null;
		em.getTransaction().begin();
		try {
			clientedb.setNombre(cliente.getNombre());
			clientedb.setDireccion(cliente.getDireccion());
			clientedb.setTelefono(cliente.getDireccion());
			em.getTransaction().begin();
			System.out.println("Registro editado correctamente");
			r = "1";
		}catch (Exception e){
			em.getTransaction().rollback();
			System.out.println("No pudo Editarse el registro");
			r = e.getMessage();
		}				
		return r;
	}

	@Override
	public String eliminar(int id) {
		
		String r = null;
		cliente = em.find(Cliente.class, id);
		em.getTransaction().begin();
		try {
			em.remove(cliente);
			em.getTransaction().commit();
			System.out.println("Registro eliminado");	
			r = "1";
		}catch (Exception e){
			em.getTransaction().rollback();
			r = e.getMessage();
			System.out.println("No pudo eliminarse el registro");	
			
		}
		return r;
	}

	@Override
	public Object buscar(int id) {
		cliente = em.find(Cliente.class, id);
		return cliente;
	}

	@Override
	public List mostrar() {
		List<Cliente> ls = em.createQuery("from Cliente").getResultList();
		return ls;
	}

}
