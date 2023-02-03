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
import com.dto.Objeto_DTO;
import com.entity.Alumno;
import com.general.Status;

@Path ("alumno/") //Comenzamos con la creacion de un endpoint - una URL con la que estableceremos una conección web

public class AlumnoService {
	
	
	 // LA CAPA DE SERVICIO ES LA ESTABLECE LA COMUNICACIÓN WEB Y DA SALIDA O ENTRADA A LOS DATOS 
	//nOS PERMITE PRESENTARLOS Y EXPONER LA FUNCIONALIDAD DE TODO EN EL BACKEND
	
	AlumnoDAO dao = null;
	
	@POST //Verbo HTTP que se utliza para crear nuevos recursos
	@Path ("guardar")
	@Consumes (MediaType.APPLICATION_JSON) // Formato en el que se recibe la información
	@Produces (MediaType.APPLICATION_JSON)// Formato en el que se responde la información
	
	//http://localhost:8090/JDBCWEB_MIBP/JDBC_MIBP/alumno/guardar
	
	
	public Status guardar (Alumno a) {
		
		Status s = new Status ();
		
		s.setOb(a); //Indicamos que vamos a guardar un objeto, en este caso al objeto alumno
		 dao = new AlumnoDAO ();//Llamamos al DAO para poder implementar el método y pasarlo a un valor de respuesta
		 
		 String response = dao.guardar(a);
		 
		 	if (response.equals("1")) //Si el valor del método guardar nos retorna 1,
		 	{
		 		s.setMensaje("OK");
		 		s.setRespuesta(response);
		 	} else {
		 		
		 		s.setMensaje("Error");
		 		s.setRespuesta(response);
		 	}
		 
		return s;
		
	}
	
	@POST //Verbo HTTP que se utliza para crear nuevos recursos
	@Path ("editar")
	@Consumes ({MediaType.APPLICATION_JSON}) // Formato en el que se recibe la información
	@Produces ({MediaType.APPLICATION_JSON})// Formato en el que se responde la información
	
	//http://localhost:8090/JDBCWEB_MIBP/JDBC_MIBP/alumno/editar
	
	public Status editar(Alumno a) {
		
		Status s = new Status ();
		
		s.setOb(a); //Indicamos que vamos a guardar un objeto, en este caso al objeto alumno
		 dao = new AlumnoDAO ();//Llamamos al DAO para poder implementar el método y pasarlo a un valor de respuesta
		 
		 String response = dao.editar(a);
		 
		 	if (response.equals("1")) //Si el valor del método guardar nos retorna 1,
		 	{
		 		s.setMensaje("OK");
		 		s.setRespuesta(response);
		 	} else {
		 		
		 		s.setMensaje("Error");
		 		s.setRespuesta(response);
		 	}
		
		 	return  s;
	}
	
	@GET //El verbo GET se utiliza para peticiones de solo lectura. En este caso necesitamos leer el registro existente
	
	@Path ("eliminar/{id}")
	@Produces ({MediaType.APPLICATION_JSON})
	
	//http://localhost:8090/JDBCWEB_MIBP/JDBC_MIBP/alumno/eliminar/id
	
	
	public Status eliminar (@PathParam ("id")int id) {
		
		Status s = new Status ();
		dao = new AlumnoDAO();
		String response = dao.eliminar(id);
		
		if (response.equals("1")) //Si el valor del método guardar nos retorna 1,
	 	{
	 		s.setMensaje("OK");
	 		s.setRespuesta(response);
	 	} else {
	 		
	 		s.setMensaje("Error");
	 		s.setRespuesta(response);
	 	}
		
		return s;
		
		
	}
	@GET
	@Path("buscar/{id}")
	@Produces ({MediaType.APPLICATION_JSON})
	//http://localhost:8090/JDBCWEB_MIBP/JDBC_MIBP/alumno/buscar
	
	public Alumno buscar(@PathParam ("id")int id) { //indicamos que en el endpoint en la parte final 
		dao = new AlumnoDAO();
		return (Alumno) dao.buscar(id);
		
	}
	
	
	@GET
	@Path ("mostrar")
	@Produces ({MediaType.APPLICATION_JSON})
	//http://localhost:8090/JDBCWEB_MIBP/JDBCWEB_MIBP/alumno/mostrar
	public List <Alumno> mostrar (){
		dao = new AlumnoDAO();
		return dao.mostrar();
	}

	@Path("Consulta-detalles")
	@GET 
	@Produces ({MediaType.APPLICATION_JSON})
	//http://localhost:8090/JDBCWEB_MIBP/JDBCWEB_MIBP/alumno/consulta-detalles
	public List <Objeto_DTO> getDetalles(){
		
		dao = new AlumnoDAO();
		return dao.getDetalles();
		
	}
}
	



