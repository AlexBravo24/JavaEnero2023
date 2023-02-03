package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.BoletoDAO;
import com.entity.Boletos;
import com.general.Status;

@Path("boletos")
public class BoletoService {
	
	Boletos boleto = null;
	BoletoDAO dao = null;
	
	@GET
	@Path("mostrar")
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/CRUDHibernate_AAB/CRUDHibernate_AAB/boletos/mostrar
		
	public List <Boletos> mostrar(){
		dao = new BoletoDAO();
		List <Boletos> list = dao.mostrar();
		System.out.println("datos: " + list);
		
		return list;
	}
	
	@POST
	@Path("guardar")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/CRUDHibernate_AAB/CRUDHibernate_AAB/boletos/guardar
	
	public Status guardar(Boletos c) {
		System.out.println("cliente a guardar: " + c);
		Status state = new Status();
		state.setOb(c);
		
		dao = new BoletoDAO();
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
	//http://localhost:8090/CRUDHibernate_AAB/CRUDHibernate_AAB/boletos/eliminar/id
	
	public Status eliminar(@PathParam("id") int id) {
		Status state = new Status();
		state.setOb(id);
		
		dao = new BoletoDAO();
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
	//http://localhost:8090/CRUDHibernate_AAB/CRUDHibernate_AAB/boletos/editar
	
	public Status editar(Boletos c) {
		Status state = new Status();
		state.setOb(c);
		
		dao = new BoletoDAO();
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
	//http://localhost:8090/CRUDHibernate_AAB/CRUDHibernate_AAB/boletos/buscar-por-id/id
	
	public Boletos buscar(@PathParam("id") int id) {
		dao = new BoletoDAO();
		boleto = (Boletos) dao.buscar(id);
		System.out.println("Se encontró el registro");
		return boleto;
	}
	

}
