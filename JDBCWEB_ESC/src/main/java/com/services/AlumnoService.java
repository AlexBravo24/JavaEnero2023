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

@Path("alumno") //Comenzamos con la creacion de un endpoint - una URL con la que estableceremos una comunicacion Web
public class AlumnoService {
	
	//La capa de servicio es la que establece la comunicacion web y da salida o entrada a los datos
	//Nos permite presentarlos y exponer la funcionalidad de todo el backend

	AlumnoDAO dao=null;
	
	@POST //Verbo HTTP que se utiliza para crear nuevos recursos
	@Path("guardar") //Esta seria la parte final de la URL O Endpoint
	@Consumes({MediaType.APPLICATION_JSON})//Formato en el que se recibe la informacion
	@Produces({MediaType.APPLICATION_JSON})//Formato en el que se responde la infromacion
	
	//http://localhost:8090/JDBCWEB_ESC/JDBCWEB_ESC/alumno/guardar
	public Status guardar(Alumno a) {
		
		Status s = new Status(); //Modelo para responder desde el lado del servidor

		s.setOb(a);//Indicamos que vamos a guardar un objeto, en este caso el objeto alumno
		dao = new AlumnoDAO(); //Llamamos al DAO para poder implementar el metodo y pasarlo a un valor de respuesta
		String response = dao.guardar(a);
		
		if(response.equals("1")) { //Si el valor del metodo guardar es 1, que nos regrese los mensajes correspondientes
			s.setMensaje("OK");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");//Si el valor del metodo guardar es 0, que nos regrese los mensajes correspondientes
			s.setRespuesta(response);
		}
		
		return s;
		
	}
	
	@POST //Verbo HTTP que se utiliza para crear nuevos recursos
	@Path("editar") //Esta seria la parte final de la URL O Endpoint
	@Consumes({MediaType.APPLICATION_JSON})//Formato en el que se recibe la informacion
	@Produces({MediaType.APPLICATION_JSON})//Formato en el que se responde la infromacion
	
	//http://localhost:8090/JDBCWEB_ESC/JDBCWEB_ESC/alumno/editar
	public Status editar(Alumno a) {
		Status s = new Status(); //Modelo para responder desde el lado del servidor

		s.setOb(a);//Indicamos que vamos a guardar un objeto, en este caso el objeto alumno
		dao = new AlumnoDAO(); //Llamamos al DAO para poder implementar el metodo y pasarlo a un valor de respuesta
		String response = dao.editar(a);
		
		if(response.equals("1")) { //Si el valor del metodo guardar es 1, que nos regrese los mensajes correspondientes
			s.setMensaje("OK");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");//Si el valor del metodo guardar es 0, que nos regrese los mensajes correspondientes
			s.setRespuesta(response);
		}
		
		return s;
	}
	
	@GET //El verbo Get se utiliza para peticiones de solo lectura. En este caso
		 //necesitamos leer le registro existente
	@Path ("eliminar/{id}")
	@Produces({MediaType.APPLICATION_JSON})//Formato en el que se responde la infromacion
	//http://localhost:8090/JDBCWEB_ESC/JDBCWEB_ESC/alumno/eliminar/id
	
	public Status eliminar(@PathParam("id") int id) { //Indicamos que en el endpoint en la parte final vamos a enviar un parametro
		
		Status s = new Status();
		dao = new AlumnoDAO(); 
		String response = dao.eliminar(id);
		
		if(response.equals("1")) { //Si el valor del metodo guardar es 1, que nos regrese los mensajes correspondientes
			s.setMensaje("OK");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");//Si el valor del metodo guardar es 0, que nos regrese los mensajes correspondientes
			s.setRespuesta(response);
		}
		return s;
		
	}
	
	@GET
	@Path("buscar/{id}")
	@Produces({MediaType.APPLICATION_JSON})//Formato en el que se responde la infromacion
	//http://localhost:8090/JDBCWEB_ESC/JDBCWEB_ESC/alumno/buscar/id
	
	public Alumno buscar(@PathParam ("id") int id) { //Indicamos que en el endpoint en la parte final vamos a enviar un parametro
		dao = new AlumnoDAO(); 
		return (Alumno) dao.buscar(id);
	}
	
	@GET
	@Path("mostrar")
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/JDBCWEB_ESC/JDBCWEB_ESC/alumno/mostrar
	
	public List<Alumno> mostrar(){
		dao = new AlumnoDAO();
		return dao.mostrar();
	}
	
	@Path ("consulta-detalles")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/JDBCWEB_ESC/JDBCWEB_ESC/alumno/consulta-detalles
	
	public List<ObjetoDTO> getDetalles(){
		dao=new AlumnoDAO();
		return dao.getDetalles();
	}
	
	
	
}
