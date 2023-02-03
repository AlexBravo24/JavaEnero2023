package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Boletos;
import com.entity.Clientes;
import com.general.Metodos;

public class BoletoDAO implements Metodos {
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Boletos boleto = null;

	@Override
	public String guardar(Object ob) {
		boleto = (Boletos) ob;
		em.getTransaction().begin();
		String resultado = null;
		 try {
			 em.persist(boleto);
			 em.getTransaction().commit();
			 resultado = "1";
			 System.out.println("Registro insertado");
		 }catch(Exception e)
		 {
			 em.getTransaction().rollback();
			 resultado = e.getMessage();
			 System.out.println("No pudo insertarse");
		 }
		  em.close();
		  return resultado;
	}
				  
	@Override
	public String editar(Object ob) {
		boleto = (Boletos) ob;
		Boletos boletodb = em.find(Boletos.class, boleto.getBoletoId());
		Clientes cliente = em.find(Clientes.class, boleto.getCliente().getClienteId());
		String r = null;
		em.getTransaction().begin();
		
		try {
			boletodb.setIdVuelo(boletodb.getIdVuelo());
			boletodb.setCliente(cliente);
			boletodb.setCosto(boletodb.getCosto());
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			r = "1";
			
		}catch (Exception e)
		{
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();
		}
		return r;
	}

	@Override
	public String eliminar(int id) {
		String r = null;
		boleto = em.find(Boletos.class, id);
		em.getTransaction().begin();
		try {
			
			em.remove(boleto);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r = "1";
		
		}
		catch (Exception e)
		{
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r=e.getMessage();
			
		}
		return r;
	}

	@Override
	public Object buscar(int id) {
		boleto =em.find(Boletos.class, id);
		return boleto;
		
	}

	@Override
	public List mostrar() {
		List<Boletos> ls = em.createQuery("from Boletos").getResultList();
		return ls;
	}

}
