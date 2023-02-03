package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.ObjetoDTO;
import com.entity.Alumno;
import com.general.Database;
import com.general.Metodos;

public class AlumnoDAO implements Metodos {

	//DAO - (Data Acces Objet - logica tranformación de la información)
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	Database db = new Database();

	Alumno a = null;
	String result = null;

	@Override
	public String save(Object ob) {
		a = (Alumno) ob; // se le castea para pasar el valor del objeto

		String insert = "INSERT INTO alumno VALUES (?,?,?,?,?,?,?)";

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());	
			ps = con.prepareStatement(insert);
			
			ps.setInt(1, 0); // la primera posisicion es la columna y la segunda el valor de id
			ps.setString(2, a.getNombre());
			ps.setDate(3, a.getFechaNac());
			ps.setString(4, a.getSexo());
			ps.setString(5, a.getCurp());
			ps.setString(6, a.getGrado());
			ps.setInt(7, 1);
			
			int flag = ps.executeUpdate(); //ejecutamos la sentencia SQL
			if (flag > 0 ) {
				result = "1";
				System.out.println("Se ha guardad un nuevo alumno");
			}else {
				result = "0";
				System.out.println("Hubo un error al guardar el registro");
			}
			
		} catch (Exception ex) {
			result = ex.getMessage();
		}

		return result;
	}

	@Override
	public String edit(Object ob) {
		a = (Alumno) ob; // se le castea para pasar el valor del objeto

		String update = "UPDATE alumno SET NOMBRE=? , FECHANAC=?, SEXO=?, CURP=?, GRADO = ? WHERE " + "ID_ALUMNO= ?";
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());	
			ps = con.prepareStatement(update);
			
			
			ps.setString(1, a.getNombre());
			ps.setDate(2, a.getFechaNac());
			ps.setString(3, a.getSexo());
			ps.setString(4, a.getCurp());
			ps.setString(5, a.getGrado());
			ps.setInt(6, a.getId_alumno());
		 
			
			int flag = ps.executeUpdate(); //ejecutamos la sentencia SQL
			if (flag > 0 ) {
				result = "1";
				System.out.println("Se ha actualizado el registro alumno");
			}else {
				result = "0";
				System.out.println("Hubo un error al actualizar el registro");
			}
			
		} catch (Exception ex) {
			result = ex.getMessage();
		}

		return result;
	}
		
	

	@Override
	public String delete(int id) {
		
		String delet = "DELETE FROM alumno WHERE id_alumno= " +id;
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());	
			ps = con.prepareStatement(delet);
			
			int flag = ps.executeUpdate(); //ejecutamos la sentencia SQL
			if (flag > 0 ) {
				result = "1";
				System.out.println("Se ha eliminado el registro alumno");
			}else {
				result = "0";
				System.out.println("Hubo un error al eliminar el registro");
			}
			
		}catch(Exception ex){
			result = ex.getMessage();
			
		}
		
		return result;
	}

	@Override
	public Object search(int id) {
		
		String query = "SELECT * FROM alumno WHERE id_alumno= " + id;
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());	
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				a = new Alumno(rs.getInt("id_alumno"),rs.getString("nombre"),rs.getDate("fechanac"),rs.getString("sexo"),rs.getString("curp"),rs.getString("grado"),rs.getInt("status"));
			}
									
		}catch(Exception ex){
			
			result = ex.getMessage();			
		}
		
		return a;
	}

	@Override
	public List mostrar() {
		
		
		String mostrar = "SELECT * FROM ALUMNO";
		List<Alumno> alumnos =  new ArrayList<Alumno>();
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());	
			ps = con.prepareStatement(mostrar);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				a = new Alumno(rs.getInt("ID_ALUMNO"),rs.getString("NOMBRE"),rs.getDate("FECHANAC"),rs.getString("SEXO"),rs.getString("CURP"),rs.getString("GRADO"),rs.getInt("STATUS"));
				alumnos.add(a);
			}
									
		}catch(Exception ex){
			
			ex.printStackTrace();				
		}
		return alumnos;
		
		}
	
		
		
	public List getDetalles() {
			
			String query = "SELECT V.ORIGEN, TO_CHAR(V.HORARIOVIAJE, 'HH24:MI:SS') AS HORA, P.NOMBRE, A.MODELO " 
			+ "FROM VUELO V " 
			+ "INNER JOIN VUELO_AVION_PILOTO VAP " 
			+ "ON V.ID_VUELO=VAP.ID_VUELO " 
			+ "INNER JOIN PILOTOS P "
			+ "ON P.ID_PILOTO=VAP.ID_PILOTO "
			+ "INNER JOIN AVIONES A " 
			+ "ON A.ID_AVION=VAP.ID_AVION"; 

			List <ObjetoDTO> detalles = new ArrayList<ObjetoDTO>();
			ObjetoDTO fila = null;
			
			try {
				Class.forName(db.getDriver());
				con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());	
				ps = con.prepareStatement(query);
				rs = ps.executeQuery();
				
				while(rs.next()) {
					fila = new ObjetoDTO(rs.getString("ORIGEN"),rs.getString("HORA"),rs.getString("NOMBRE"),
							rs.getString("MODELO"));
					detalles.add(fila);
				}
										
			}catch(Exception ex){
				ex.printStackTrace();			
			}

			return detalles;	
		}
		
		
	

	

}
