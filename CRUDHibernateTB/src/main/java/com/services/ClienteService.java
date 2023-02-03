package com.services;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.dao.Listas_Clientes_DAO;
import com.entity.Listas_Clientes;
import com.general.Status;

@Path("l-clientes")
public class ClienteService {

    Listas_Clientes cliente=null;
    Listas_Clientes_DAO dao=null;
    
    @Path("mostrar")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Listas_Clientes> mostrar()
    {
	dao=new Listas_Clientes_DAO();
	List<Listas_Clientes> list=dao.mostrar();
	System.out.println("datos:"+list);
	return list;	    
    }
    
    @Path("guardar")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Status guardar(Listas_Clientes c)
    {
	System.out.println("clientes a guardar: "+c);
	Status state = new Status();
	state.setOb(c);
	
	dao=new Listas_Clientes_DAO();
	String res= dao.guardar(c);
	
	if(res.equals("1")){state.setMensaje("Insert Success"); state.setRespuesta(res);}
	else{state.setMensaje("Insert Error"); state.setRespuesta(res);}
	return state;	
    }
    
    @Path("eliminar/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Status eliminar(@PathParam("id") int id)
    {
	Status state = new Status();
	state.setOb(id);
	
	dao=new Listas_Clientes_DAO();
	String res= dao.eliminar(id);
	
	if(res.equals("1")){state.setMensaje("Delete Success"); state.setRespuesta(res);}
	else{state.setMensaje("Delete Error"); state.setRespuesta(res);}
	return state;	
    }   
    
    @POST
    @Path("editar")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})    
    public Status editar(Listas_Clientes c)
    {
	Status state = new Status();
	state.setOb(c);
	
	dao=new Listas_Clientes_DAO();
	String res= dao.editar(c);
	
	if(res.equals("1")){state.setMensaje("Update Success"); state.setRespuesta(res);}
	else{state.setMensaje("Update Error"); state.setRespuesta(res);}
	return state;	
    }
    
    @Path("buscar-por-id/{id}")
    @GET
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Listas_Clientes buscar(@PathParam("id") int id)
    {
	dao=new Listas_Clientes_DAO();
	cliente=(Listas_Clientes) dao.buscar(id);
	System.out.println("Registro encontrado");
	return cliente;	
    }    
}
