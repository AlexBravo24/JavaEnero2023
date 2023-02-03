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

@Path("alumno")  //Comenzamos con la creacion de un endpoint - una url con la que estableceremos la comunicacion web
public class AlumnoService {
	
	//La capa de servicio es la que establece la comunicacion web y da salida o entrada a los datos
	//Nos permite presentarlos y exponer la funcionalidad de todo el backend
	
	AlumnoDAO dao = null;
	
	@POST //Verbo HTTP que se utiliza para crear nuevos recursos
	@Path("guardar") //esta seria la parte final de la URL o endpoint
	@Consumes({MediaType.APPLICATION_JSON})//formato en el que se recibe la informacion
	@Produces({MediaType.APPLICATION_JSON})//formato en el que se responde la informacion
	
	//http://localhost:8090/JDBCWEB_AYMP/JDBCWEB_AYMP/alumno/guardar
	
	public Status guardar(Alumno a) {
		
		Status s = new Status(); //Modelo para responder del lado del servidor
		
		s.setOb(a);  //indicamos que vamos a guardar a un objeto alumno
		dao = new AlumnoDAO(); //llamamos al dao para poder implementar el metodo y pasarlo a un valor de respuesta
		String response = dao.guardar(a); 
		 
		if(response.equals("1")) { //si el valor del metodo guardar nos retorna 1, que nos regrese los mensajes correspondientes
			s.setMensaje("Ok");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");
			s.setRespuesta(response);
		}
		return s;
	}
	
	
	@POST //Verbo HTTP que se utiliza para crear nuevos recursos
	@Path("editar") //esta seria la parte final de la URL o endpoint
	@Consumes({MediaType.APPLICATION_JSON})//formato en el que se recibe la informacion
	@Produces({MediaType.APPLICATION_JSON})//formato en el que se responde la informacion
	
	//http://localhost:8090/JDBCWEB_AYMP/JDBCWEB_AYMP/alumno/editar
	public Status editar(Alumno a) {
        Status s = new Status(); //Modelo para responder del lado del servidor
		
		s.setOb(a);  //indicamos que vamos a guardar a un objeto alumno
		dao = new AlumnoDAO(); //llamamos al dao para poder implementar el metodo y pasarlo a un valor de respuesta
		String response = dao.editar(a); 
		 
		if(response.equals("1")) { //si el valor del metodo guardar nos retorna 1, que nos regrese los mensajes correspondientes
			s.setMensaje("Ok");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");
			s.setRespuesta(response);
		}
		return s;
	}
	
	@GET //El verbo get se utiliza para peticiones de solo lectura, en este caso necesitamos leer el refgistro existente
	@Path("Eliminar/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/JDBCWEB_AYMP/JDBCWEB_AYMP/alumno/Eliminar/id
	
	public Status Eliminar(@PathParam("id") int id) { //indicamos que en el endpoint en la parte final vamos a ingresar un parametro
		Status s = new Status();
		dao = new AlumnoDAO();
		String response = dao.Eliminar(id);
		
		if(response.equals("1")) { //si el valor del metodo guardar nos retorna 1, que nos regrese los mensajes correspondientes
			s.setMensaje("Ok");
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
	//http://localhost:8090/JDBCWEB_AYMP/JDBCWEB_AYMP/alumno/buscar/id
	
	public Alumno buscar(@PathParam("id") int id) { //indicamos en el endpoint en la part final vamos a 
		dao= new AlumnoDAO();
		return (Alumno) dao.buscar(id);
	}
	
	
	@GET
	@Path("mostrar")
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/JDBCWEB_AYMP/JDBCWEB_AYMP/alumno/mostrar
	
	public List<Alumno> mostrar(){
		dao = new AlumnoDAO();
		return dao.mostrar();
	}
	
	@Path("consulta-detalles")
	@GET 
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/JDBCWEB_AYMP/JDBCWEB_AYMP/alumno/consulta-detalles
	public List<ObjetoDTO> getDetalles(){
		dao = new AlumnoDAO();
		
		return dao.getDetalles();
	}
	
	
	

}
