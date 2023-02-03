package com.services;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.dao.Alumno_DAO;
import com.dto.Objeto_DTO;
import com.entity.Alumno;
import com.general.Status;

@Path("alumno") // comenzamos con la creacion de un endpoint -- un url con la que establecemos comunicacion web
public class Alumno_Service {

    //La capa de servicio es la que establece la comunicacion web y da salida o entrada a los datos
    //Nos Permite persentarlos y exponer la funcionalidad de todo el backend    
    Alumno_DAO dao= null;
    //----------------------------------------------------------------------------------------------
    @POST //Verbo HTTP para crear recursos
    @Path("guardar")// Parte final de la url o endpoint
    @Consumes({MediaType.APPLICATION_JSON}) //Formato en que se recibe info
    @Produces({MediaType.APPLICATION_JSON}) //Formato en que se responde info
    
    //http://localhost:8090/JDBCweb_TB/JDBCweb_TB/alumno/guardar    
    public Status guardar(Alumno a) 
    {
	Status s=new Status(); //Modelo responder desde el lado del servidor
	s.setOb(a); //indicamos que vamos a quardar un obieto, en este caso al obieto alumno 
	dao = new Alumno_DAO(); //llamamos al DAO Rara poder implementar el metodo, y pasarlo a un valor de respuesta
	String response = dao.guardar(a);
	
	//Si el valor del metodo guardar retorna 1, que nos muestre los mensajes correspontiendes
	if(response.equals("1")) { s.setMensaje("OK"); s.setRespuesta(response); }
	else { s.setMensaje("Error"); s.setRespuesta(response); }
	return s; 
    }
    //-----------------------------------------------------------------------------------------------   
    @POST //Verbo HTTP para crear recursos
    @Path("editar")// Parte final de la url o endpoint
    @Consumes({MediaType.APPLICATION_JSON}) //Formato en que se recibe info
    @Produces({MediaType.APPLICATION_JSON}) //Formato en que se responde info
    
    //http://localhost:8090/JDBCweb_TB/JDBCweb_TB/alumno/editar   
    public Status editar(Alumno a) 
    {
	Status s=new Status(); //Modelo responder desde el lado del servidor
	s.setOb(a); //indicamos que vamos a quardar un obieto, en este caso al obieto alumno 
	dao = new Alumno_DAO(); //llamamos al DAO Rara poder implementar el metodo, y pasarlo a un valor de respuesta
	String response = dao.editar(a);
	
	//Si el valor del metodo guardar retorna 1, que nos muestre los mensajes correspontiendes
	if(response.equals("1")) { s.setMensaje("OK"); s.setRespuesta(response); }
	else { s.setMensaje("Error"); s.setRespuesta(response); }
	return s; 	
    }
    //------------------------------------------------------------------------------------------------
    @GET //Se utiliza para peticiones de solo lectura, aqui lo utilizamos para leer un registro existente
    @Path("eliminar/{id}")// Parte final de la url o endpoint
    @Produces({MediaType.APPLICATION_JSON}) //Formato en que se responde info
    
    //http://localhost:8090/JDBCweb_TB/JDBCweb_TB/alumno/eliminar/id
    public Status eliminar(@PathParam("id")int id)//indicamos que en la parte del endpoint vamos a ingresar un valor
    {
	Status s=new Status(); //Modelo responder desde el lado del servidor
	dao = new Alumno_DAO(); //llamamos al DAO Rara poder implementar el metodo, y pasarlo a un valor de respuesta
	String response = dao.eliminar(id);
	
	//Si el valor del metodo guardar retorna 1, todo salio ok, de caso contrario mostrara que salio error
	if(response.equals("1")) { s.setMensaje("OK"); s.setRespuesta(response); }
	else { s.setMensaje("Error"); s.setRespuesta(response); }
	return s; 	
    }
    //-------------------------------------------------------------------------------------------------
    @GET //Se utiliza para peticiones de solo lectura, aqui lo utilizamos para leer un registro existente
    @Path("buscar/{id}")// Parte final de la url o endpoint
    @Produces({MediaType.APPLICATION_JSON}) //Formato en que se responde info
    
    //http://localhost:8090/JDBCweb_TB/JDBCweb_TB/alumno/buscar/id   
    public Alumno buscar(@PathParam("id")int id) //indicamos que en la parte del endpoint vamos a ingresar un valor
    {
	dao = new Alumno_DAO(); //llamamos al DAO Rara poder implementar el metodo, y pasarlo a un valor de respuesta
	return (Alumno) dao.buscar(id); 	
    }
    //------------------------------------------------------------------------------------------------------------
    @GET //Se utiliza para peticiones de solo lectura, aqui lo utilizamos para leer un registro existente
    @Path("mostrar")// Parte final de la url o endpoint
    @Produces({MediaType.APPLICATION_JSON}) //Formato en que se responde info
    
    //http://localhost:8090/JDBCweb_TB/JDBCweb_TB/alumno/mostrar
    public List<Alumno> mostrar()
    {
	dao= new Alumno_DAO();
	return dao.mostrar();
    }
  //------------------------------------------------------------------------------------------------------------
    @GET //Se utiliza para peticiones de solo lectura, aqui lo utilizamos para leer un registro existente
    @Path("con-detalle")// Parte final de la url o endpoint
    @Produces({MediaType.APPLICATION_JSON}) //Formato en que se responde info
    
    //http://localhost:8090/JDBCweb_TB/JDBCweb_TB/alumno/mostrar
    public List<Objeto_DTO> GetDetalles()
    {
	dao= new Alumno_DAO();
	return dao.getDetalles();
    }
}
