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

@Path ("alumno") //Comenzamos con la creación de un endpoint - una URL en la que estableceremos la comunicación web
public class AlumnoService {
	
	//La capa la de servicio es la que establece la comunicación web y da salida o entrada a los datos
	//Nos permite presentarlos y exponer la funcionalidad de todo el backend
	
	AlumnoDAO dao=null;
	
	@POST //Verbo HTTP que se utiliza para crear nuevos recursos
	@Path ("guardar") //esta sería la parte final de la URL o endpoint
	@Consumes({MediaType.APPLICATION_JSON})//Formato en el que se recibe la información
	@Produces({MediaType.APPLICATION_JSON})//Formato en el que se responde la información
	
	//http://localhost:8090/JDBCWEB_JCSC/JDBCWEB_JCSC/alumno/guardar
	
	public Status guardar (Alumno a) {
		
		Status s=new Status();//Modelo para responder desde el lado del servidor
		
		s.setOb(a);//Indicamos que vamos a guardar un objeto, en este caso al alumno
		dao = new AlumnoDAO();//Llamamos al DAO para poder implementar el metodo y pasarlo a un valor de respuesta
		String response = dao.guardar(a);
		
		if (response.equals("1")) {
			s.setMensaje("OK");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");
			s.setRespuesta(response);
		}
		
		return s;
		
	}
	
	@POST //Verbo HTTP que se utiliza para crear nuevos recursos
	@Path ("editar") //esta sería la parte final de la URL o endpoint
	@Consumes({MediaType.APPLICATION_JSON})//Formato en el que se recibe la información
	@Produces({MediaType.APPLICATION_JSON})//Formato en el que se responde la información
	
	//http://localhost:8090/JDBCWEB_JCSC/JDBCWEB_JCSC/alumno/editar
	
	public Status editar (Alumno a) {
Status s=new Status();//Modelo para responder desde el lado del servidor
		
		s.setOb(a);//Indicamos que vamos a guardar un objeto, en este caso al alumno
		dao = new AlumnoDAO();//Llamamos al DAO para poder implementar el metodo y pasarlo a un valor de respuesta
		String response = dao.editar(a);
		
		if (response.equals("1")) {
			s.setMensaje("OK");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");
			s.setRespuesta(response);
		}
		
		return s;
		
	}
	
	@GET //El verbo GET se utiliza para peticiones de solo lectura
		//Necesitamos leer el registro existente
	@Path ("eliminar/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/JDBCWEB_JCSC/JDBCWEB_JCSC/alumno/eliminar/id
	
	
	public Status eliminar (@PathParam("id")int id) {
		
		Status s=new Status();//Modelo para responder desde el lado del servidor
		
		dao = new AlumnoDAO();//Llamamos al DAO para poder implementar el metodo y pasarlo a un valor de respuesta
		String response = dao.eliminar(id);
		
		if (response.equals("1")) {
			s.setMensaje("OK");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");
			s.setRespuesta(response);
		}
		
		return s;
		
	}
	
	@GET
	@Path("buscar/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/JDBCWEB_JCSC/JDBCWEB_JCSC/alumno/buscar/id
	
	public Alumno buscar (@PathParam ("id") int id) {
		dao = new AlumnoDAO();
		return (Alumno) dao.buscar(id);
		
	}
	
	@GET
	@Path("mostrar")
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/JDBCWEB_JCSC/JDBCWEB_JCSC/alumno/mostrar
	public List<Alumno> mostrar(){
		dao = new AlumnoDAO();
		return dao.mostrar();
	}
	
	@Path ("consulta-detalles")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/JDBCWEB_JCSC/JDBCWEB_JCSC/alumno/consulta-detalles
	public List <ObjetoDTO> getDetalles(){
		dao = new AlumnoDAO();
		return dao.getDetalles();
		
	}
	

}
