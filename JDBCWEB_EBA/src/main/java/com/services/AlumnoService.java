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

@Path("alumno") // comenzamos con la creacion de un endpoint -- una URL con la que estableceremos la comunicación web.
public class AlumnoService {
	
	// La capa de servicio es la que establece la comunicación web y de la salida o entrada a los datos
	// Nos permite precentarlos y exponer la funcionalida de todo el backend
	
	AlumnoDAO dao = null;
	
	@POST //verbo HTTP que se utiliza para crear nuevos recurso
	@ Path("save") //esta seria la parte final de la URL o endpiont
	@ Consumes({MediaType.APPLICATION_JSON})//formato en el que se resibe la informacion
	@ Produces ({MediaType.APPLICATION_JSON})// fromato en el que se responde la informacion
	
	//http://localhost:8090/JDBCWEB_EBA/JDBCWEB_EBA/alumno/save	
	public Status save(Alumno a) {
		
		Status s = new Status(); // modelo para responder desde el lado del servidos
		
		s.setOb(a); // indicamos que vamos a guardar un objeto, en este caso al objeto alumno
		dao = new AlumnoDAO(); // llamamos al DAO para poder implementar el metodo y pasarlo a un valor de respuesta 
		String response = dao.save(a);
		
		if (response.equals("1")) { //si el valor del metodo guardas nos retorna 1 que nos regrese los mensajes correspondientes
			s.setMensaje("ok");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");
			s.setRespuesta(response);
		}
		return s;
	}
	
	
	@POST //verbo HTTP que se utiliza para crear nuevos recurso
	@Path("edit") //esta seria la parte final de la URL o endpiont
	@Consumes({MediaType.APPLICATION_JSON})//formato en el que se resibe la informacion
	@Produces ({MediaType.APPLICATION_JSON})// fromato en el que se responde la informacion
	
	//http://localhost:8090/JDBCWEB_EBA/JDBCWEB_EBA/alumno/edit
	
	public Status edit (Alumno a) {
						
		Status s = new Status(); // modelo para responder desde el lado del servidos
		
		s.setOb(a); // indicamos que vamos a guardar un objeto, en este caso al objeto alumno
		dao = new AlumnoDAO(); // llamamos al DAO para poder implementar el metodo y pasarlo a un valor de respuesta 
		String response = dao.edit(a);
		
		if (response.equals("1")) { //si el valor del metodo guardas nos retorna 1 que nos regrese los mensajes correspondientes
			s.setMensaje("ok");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");
			s.setRespuesta(response);
		}
		return s;
	}
	
	
	
	@GET // El verbo GET se utiliza para peticiones de solo lectura. En este caso necesitamos leer el registro existente
	@Path("delete/{id}")
	@Produces ({MediaType.APPLICATION_JSON})
	//http://localhost:8090/JDBCWEB_EBA/JDBCWEB_EBA/alumno/delete/id
	
	public Status delete (@PathParam("id") int id) {
		
		Status s = new Status(); // modelo para responder desde el lado del servidos
		dao = new AlumnoDAO();
		String response = dao.delete(id);
		
		if (response.equals("1")) { //si el valor del metodo guardas nos retorna 1 que nos regrese los mensajes correspondientes
			s.setMensaje("ok");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");
			s.setRespuesta(response);
		}
		return s;
	}
	
	
	@GET 
	@Path("search/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	//http://localhost:8090/JDBCWEB_EBA/JDBCWEB_EBA/alumno/search/id
	
	public Alumno search(@PathParam("id") int id) { // indicamos que en el enpoint en laparte final vamos a regresar un parametro
		dao = new AlumnoDAO();
		
		return (Alumno) dao.search(id);
	}
	
	@GET 
	@Path("mostrar")
	@Produces(MediaType.APPLICATION_JSON)
	//http://localhost:8090/JDBCWEB_EBA/JDBCWEB_EBA/alumno/mostrar
	
	public List <Alumno> mostrar(){
		dao = new AlumnoDAO();
		return dao.mostrar();
	}
	
	@Path("consulta-detalles")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/JDBCWEB_EBA/JDBCWEB_EBA/alumno/consulta-detalles
	public List<ObjetoDTO> getDetalles() {
		dao = new AlumnoDAO();
			
		return dao.getDetalles();
	}
	
	
}
