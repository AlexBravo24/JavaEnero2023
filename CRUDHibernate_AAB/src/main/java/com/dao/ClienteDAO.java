package com.dao;
import java.util.List;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import com.entity.Clientes;
import com.general.Metodos;

public class ClienteDAO implements Metodos{

	//Carga los objetos (las clases definidas en el persistance)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	//Carga todas las operaciones (insert, update, delete, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	Clientes cliente = null;
	
	@Override
	public String guardar(Object ob) {
		cliente = (Clientes) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(cliente); //Este es el insert
			em.getTransaction().commit();
			resultado = "1";
		System.out.println("Registro insertado");
		} catch (Exception e){
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse el registro");
		}
		em.close(); //Es importante cerrar el Entity Manager para liberar memoria
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		cliente = (Clientes) ob;
		Clientes clientedb = em.find(Clientes.class, cliente.getClienteId());
		String r = null;
		em.getTransaction().begin();
		try {
			clientedb.setNombre(cliente.getNombre());
			clientedb.setDireccion(cliente.getDireccion());
			clientedb.setTelefono(cliente.getTelefono());
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			r = "1";
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();
		}
		em.close();
		return r;
	}

	@Override
	public String eliminar(int id) {
		String r = null;
		cliente = em.find(Clientes.class, id);
		em.getTransaction().begin();
		try {
			em.remove(cliente);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r = "1";
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar el registro");
			r = e.getMessage();
		}
		em.close();
		return r;
	}

	@Override
	public Object buscar(int id) {
		cliente = em.find(Clientes.class, id);
		return cliente;
	}

	@Override
	public List mostrar() {
		List <Clientes> ls = em.createQuery("from Clientes").getResultList();
		return ls;
	}
	
}
