package com.services;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.dao.Boletos_DAO;
import com.entity.Boletos;
import com.general.Status;

@Path("boletos")
public class BoletoService {

    Boletos boleto = null;
    Boletos_DAO dao = null;

    @Path("mostrar")
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public List<Boletos> mostrar() {
	dao = new Boletos_DAO();
	List<Boletos> list = dao.mostrar();
	System.out.println("datos:" + list);
	return list;
    }

    @Path("guardar")
    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Status guardar(Boletos c) {
	System.out.println("boletos a guardar: " + c);
	Status state = new Status();
	state.setOb(c);

	dao = new Boletos_DAO();
	String res = dao.guardar(c);

	if (res.equals("1")) {
	    state.setMensaje("Insert Success");
	    state.setRespuesta(res);
	} else {
	    state.setMensaje("Insert Error");
	    state.setRespuesta(res);
	}
	return state;
    }

    @Path("eliminar/{id}")
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Status eliminar(@PathParam("id") int id) {
	Status state = new Status();
	state.setOb(id);

	dao = new Boletos_DAO();
	String res = dao.eliminar(id);

	if (res.equals("1")) {
	    state.setMensaje("Delete Success");
	    state.setRespuesta(res);
	} else {
	    state.setMensaje("Delete Error");
	    state.setRespuesta(res);
	}
	return state;
    }

    @POST
    @Path("editar")
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Status editar(Boletos c) {
	Status state = new Status();
	state.setOb(c);

	dao = new Boletos_DAO();
	String res = dao.editar(c);

	if (res.equals("1")) {
	    state.setMensaje("Update Success");
	    state.setRespuesta(res);
	} else {
	    state.setMensaje("Update Error");
	    state.setRespuesta(res);
	}
	return state;
    }

    @Path("buscar-por-id/{id}")
    @GET
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Boletos buscar(@PathParam("id") int id) {
	dao = new Boletos_DAO();
	boleto = (Boletos) dao.buscar(id);
	System.out.println("Registro encontrado");
	return boleto;
    }
}
