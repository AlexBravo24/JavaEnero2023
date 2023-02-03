package com.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Boletos;
import com.entity.Clientes;
import com.general.Metodos;

public class BoletosDAO implements Metodos{

	//Carga los objeros (las clases definidas en el persisntence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	//Carga todas las operaciones (insert, update, delete, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	Boletos boleto = null;
	
	@Override
	public String guardar(Object ob) {
		boleto = (Boletos) ob;
		em.getTransaction().begin();
		String resultado = null;
		
		try {
			em.persist(boleto); //Este es el insert
			em.getTransaction().commit(); //Se realiza el commit en la base de datos
			resultado = "1";
		System.out.println("Registro Insertado");
		}catch(Exception e) {
			em.getTransaction().rollback();//Si el registro no puede realizarse, se instruye un rollback para que quede todo como estaba antes del commit
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close();//Es importante cerrar el metodo para liberar memoria
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		boleto = (Boletos) ob;
		Boletos boletodb = em.find(Boletos.class, boleto.getBoletoId());
		Clientes cliente = em.find(Clientes.class, boleto.getCliente().getClienteId());
		String resultado = null;
		em.getTransaction().begin();
		
		try {
			boletodb.setBoletoId(boleto.getBoletoId());
			boletodb.setVueloId(boleto.getVueloId());
			boletodb.setCliente(cliente);
			boletodb.setCosto(boleto.getCosto());
			em.getTransaction().commit();
			System.out.println("Editado Corectamente");
			resultado ="1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			resultado = e.getMessage();
		}
		return resultado;
	}

	@Override
	public String eliminar(int id) {
		String resultado = null;
		boleto = em.find(Boletos.class, id);
		em.getTransaction().begin();
		try {
			em.remove(boleto);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			resultado = "1";
		}catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			resultado = e.getMessage();
		}
		return resultado;
	}

	@Override
	public Object buscar(int id) {
		boleto = em.find(Boletos.class, id);
		return boleto;
	}

	@Override
	public List mostrar() {
		List<Boletos> ls = em.createQuery("from Boletos").getResultList();
		return ls;
	}

}
