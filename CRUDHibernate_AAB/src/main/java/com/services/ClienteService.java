package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ClienteDAO;
import com.entity.Clientes;
import com.general.Status;

@Path("clientes")
public class ClienteService {

	Clientes cliente = null;
	ClienteDAO dao = null;
	
	@GET
	@Path("mostrar")
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/CRUDHibernate_AAB/CRUDHibernate_AAB/clientes/mostrar
		
	public List <Clientes> mostrar(){
		dao = new ClienteDAO();
		List <Clientes> list = dao.mostrar();
		System.out.println("datos: " + list);
		
		return list;
	}
	
	@POST
	@Path("guardar")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/CRUDHibernate_AAB/CRUDHibernate_AAB/clientes/guardar
	
	public Status guardar(Clientes c) {
		System.out.println("cliente a guardar: " + c);
		Status state = new Status();
		state.setOb(c);
		
		dao = new ClienteDAO();
		String res = dao.guardar(c);
		
		if (res.equals("1")) {
			state.setMensaje("Guardado correctamente");
			state.setRespuesta(res);
		} else {
			state.setMensaje("No fue posible guardar");
			state.setRespuesta(res);
		}
		return state;
	}
	
	@GET
	@Path("eliminar/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/CRUDHibernate_AAB/CRUDHibernate_AAB/clientes/eliminar/id
	
	public Status eliminar(@PathParam("id") int id) {
		Status state = new Status();
		state.setOb(id);
		
		dao = new ClienteDAO();
		String res = dao.eliminar(id);
		
		if (res.equals("1")) {
			state.setMensaje("Eliminado correctamente");
			state.setRespuesta(res);
		} else {
			state.setMensaje("No fue posible eliminar el registro");
			state.setRespuesta(res);
		}
		
		return state;
	
	}
	
	
	@POST
	@Path("editar")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/CRUDHibernate_AAB/CRUDHibernate_AAB/clientes/editar
	
	public Status editar(Clientes c) {
		Status state = new Status();
		state.setOb(c);
		
		dao = new ClienteDAO();
		String res = dao.editar(c);
		
		if (res.equals("1")) {
			state.setMensaje("Actualizado correctamente");
			state.setRespuesta(res);
		} else {
			state.setMensaje("No fue posible actualizar este registro");
			state.setRespuesta(res);
		}
		
		return state;
	}
	
	@GET
	@Path("buscar-por-id/{id}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/CRUDHibernate_AAB/CRUDHibernate_AAB/clientes/buscar-por-id/id
	
	public Clientes buscar(@PathParam("id") int id) {
		dao = new ClienteDAO();
		cliente = (Clientes) dao.buscar(id);
		System.out.println("Se encontró el registro");
		return cliente;
	}
	
	
	
	
	
	
	
	
	
}
