package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.AlumnoDAO;
import com.dto.ObjetoDTO;
import com.entity.Alumno;
import com.general.Status;

@Path("alumno") //comenzamos con la creacion de un endpoint - una URL con la que estableceremos una conexion web
public class AlumnoService {

	//La capa de servicio es la que establesce la comunicacion web y da salida o entrada a los datos
	//Nos permite presentarlos y exponer la funcionalidad de todo el backend
	
	AlumnoDAO dao = null;
	
	@POST //Verbo HTTP que se utiliza para crear nuevos recursos
	@Path("guardar") //Esta seria la parte final de la url o endpoint
	@Consumes({MediaType.APPLICATION_JSON}) //formato en el que se recibe la informacion
	@Produces({MediaType.APPLICATION_JSON}) //formato en el que se responde la informacion
	
	//http://localhost:8090/JDBCWEB_AAB/JDBCWEB_AAB/alumno/guardar
	
	public Status guardar(Alumno a) {
		
		Status s = new Status(); //Modelo para responder desde el lado del servidor
		
		s.setOb(a); //Indicamos que vamos a guardar un objeto, en este caso al objeto alumno
		dao = new AlumnoDAO(); //Llamamos al DAO para poder implementar el metodo y pasarlo a un valor de respuesta
		String response = dao.guardar(a); //Pasar dicho valor a un String
		
		if (response.equals("1")) { //Si el valor del metodo guardar retorna 1, nos muestra los mensajes correspondiente
			s.setMensaje("Ok");
			s.setRespuesta(response);
		} else {
			s.setMensaje("Error"); //Si el valor es 0, nos muestra los mensajes correspondientes
			s.setRespuesta(response);
		}
		
		return s;
		
	}
	
	@POST
	@Path("editar")
	@Consumes({MediaType.APPLICATION_JSON}) 
	@Produces({MediaType.APPLICATION_JSON}) 
	
	//http://localhost:8090/JDBCWEB_AAB/JDBCWEB_AAB/alumno/editar
	
	public Status editar(Alumno a) {
		
		Status s = new Status(); //Modelo para responder desde el lado del servidor
		
		s.setOb(a); //Indicamos que vamos a guardar un objeto, en este caso al objeto alumno
		dao = new AlumnoDAO(); //Llamamos al DAO para poder implementar el metodo y pasarlo a un valor de respuesta
		String response = dao.editar(a); //Pasar dicho valor a un String
		
		if (response.equals("1")) { //Si el valor del metodo guardar retorna 1, nos muestra los mensajes correspondiente
			s.setMensaje("Ok");
			s.setRespuesta(response);
		} else {
			s.setMensaje("Error"); //Si el valor es 0, nos muestra los mensajes correspondientes
			s.setRespuesta(response);
		}
		
		return s;
	}
	
	@GET //El verbo GET se utiliza para peticiones de solo lectura. En este caso necesitamos leer el registro existente
	@Path("eliminar/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	
	//http://localhost:8090/JDBCWEB_AAB/JDBCWEB_AAB/alumno/eliminar/id
	
	public Status eliminar(@PathParam("id") int id) { //indicamos que en el endpoint en la parte final vamos a ingresar un parametro
		
		Status s = new Status(); //Modelo para responder desde el lado del servidor
		
		dao = new AlumnoDAO(); //Llamamos al DAO para poder implementar el metodo y pasarlo a un valor de respuesta
		String response = dao.eliminar(id); //Pasar dicho valor a un String
		
		if (response.equals("1")) { //Si el valor del metodo guardar retorna 1, nos muestra los mensajes correspondiente
			s.setMensaje("Ok");
			s.setRespuesta(response);
		} else {
			s.setMensaje("Error"); //Si el valor es 0, nos muestra los mensajes correspondientes
			s.setRespuesta(response);
		}
		
		return s;
	}
	
	
	@GET
	@Path("buscar/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	
	//http://localhost:8090/JDBCWEB_AAB/JDBCWEB_AAB/alumno/buscar/id
	
	public Alumno buscar(@PathParam("id") int id) { //indicamos que en el endpoint en la parte final vamos a ingresar un parametro
		dao = new AlumnoDAO();
		return (Alumno) dao.buscar(id);
	}
	
	@GET
	@Path("mostrar")
	@Produces({MediaType.APPLICATION_JSON})
	
	//http://localhost:8090/JDBCWEB_AAB/JDBCWEB_AAB/alumno/mostrar
	
	public List<Alumno> mostrar(){
		dao = new AlumnoDAO();
		return dao.mostrar();
	}
	
	
	@GET
	@Path("consulta-detalles")
	@Produces({MediaType.APPLICATION_JSON})
	
	//http://localhost:8090/JDBCWEB_AAB/JDBCWEB_AAB/alumno/consulta-detalles
	
	public List<ObjetoDTO> getDetalles() {
		dao = new AlumnoDAO();
		return dao.getDetalles();
		
	}
}
	

