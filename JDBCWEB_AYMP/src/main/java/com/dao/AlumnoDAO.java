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

public class AlumnoDAO implements Metodos{
	
	//DAO - {Data Acces Object - Logica / Transformación de la información
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	Database db = new Database();
	
	Alumno a = null;
	String resultado = null;
	
	
	@Override
	public String guardar(Object ob) {
		
		a = (Alumno) ob;  //se castea para pasar el valor del ojeto
		
		String insert = "INSERT INTO ALUMNO VALUES (?,?,?,?,?,?,?)";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(insert);
			ps.setInt(1, 0);//la columna 1 llevará el id 0
			                //primara posicion es la columna, la segunda posicion es el valor del id
			ps.setString(2, a.getNombre());  //se le castea o compara la información que viene
			ps.setDate(3, a.getFechaNac());
			ps.setString(4, a.getSexo());
			ps.setString(5, a.getCurp());
			ps.setString(6, a.getGrado());
			ps.setInt(7, 1);
			
			int flag = ps.executeUpdate(); //ejecutamos la sentencia sql
			
			if(flag>0) {
				resultado = "1";
				System.out.println("Se ha guardado un nuevo alumno");
			}else {
				resultado ="0";
				System.out.println("hubo un error");
			}
			
		}catch(Exception ex) {
			resultado = ex.getMessage();		
		}
		return resultado;
	}
	
	
	@Override
	public String editar(Object ob) {
		
		a = (Alumno) ob;
		
		String update = "UPDATE ALUMNO SET NOMBRE=?, FECHANAC=?, SEXO=?, CURP=?, GRADO=? WHERE "+"ID_ALUMNO=?";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(update);
			           
			ps.setString(1, a.getNombre());  
			ps.setDate(2, a.getFechaNac());
			ps.setString(3, a.getSexo());
			ps.setString(4, a.getCurp());
			ps.setString(5, a.getGrado());
			ps.setInt(6, a.getIdAlumno()); 
			
			int flag = ps.executeUpdate();
			
			if(flag>0) {
				resultado = "1";
				System.out.println("Se ha actualizado registro del alumno");
			}else {
				resultado ="0";
				System.out.println("hubo un error en la actualización");
			}
			
		}catch(Exception ex) {
			resultado = ex.getMessage();		
		}
		return resultado;
	}
	
	
	@Override
	public String Eliminar(int id) {
		
		String delete = "DELETE FROM ALUMNO WHERE ID_ALUMNO = "+id;
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(delete);
			
			int flag = ps.executeUpdate();
			
			if(flag>0) {
				resultado = "1";
				System.out.println("Se ha eliminado registro del alumno");
			}else {
				resultado ="0";
				System.out.println("Hubo un error en el borrado");
			}
				
		}catch(Exception ex) {
			resultado = ex.getMessage();
		}
		
		return resultado;
	}
	
	
	@Override
	public Object buscar(int id) {
		
		String query = "SELECT * FROM ALUMNO WHERE ID_ALUMNO = "+ id;
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while (rs.next()){
				a = new Alumno (rs.getInt("ID_ALUMNO"),rs.getString("NOMBRE"),rs.getDate("FECHANAC"), rs.getString("SEXO"), rs.getString("CURP"), rs.getString("GRADO"), rs.getInt("STATUS"));
			}
		}catch(Exception ex) {
			resultado = ex.getMessage();
		}
		return a;
	}
	
	
	@Override
	public List mostrar() {
		
		String mostrar = "SELECT * FROM ALUMNO";
		List<Alumno> alumnos = new ArrayList<Alumno>();
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(mostrar);
			rs = ps.executeQuery();
			
			while (rs.next()){
				a = new Alumno (rs.getInt("ID_ALUMNO"),rs.getString("NOMBRE"),rs.getDate("FECHANAC"), rs.getString("SEXO"), rs.getString("CURP"), rs.getString("GRADO"), rs.getInt("STATUS"));
				alumnos.add(a);
			}
		}catch(Exception ex) {
			resultado = ex.getMessage();
		}
		return alumnos;
	}	
	
	public List getDetalles() {
		
		String query = "SELECT V.ORIGEN, TO_CHAR(V.HORARIOVIAJE, 'HH24:MI:SS') AS HORA, P.NOMBRE, A.MODELO "
				+ "FROM VUELO V "
				+ "INNER JOIN VUELO_AVION_PILOTO VAP "
				+ "ON V.ID_VUELO=VAP.ID_VUELO "
				+ "INNER JOIN PILOTOS P "
				+ "ON P.ID_PILOTO = VAP.ID_PILOTO "
				+ "INNER JOIN AVIONES A "
				+ "ON A.ID_AVION=VAP.ID_AVION";
		
		List<ObjetoDTO> detalles = new ArrayList<ObjetoDTO>();
		
		ObjetoDTO fila = null;
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while (rs.next()){
				fila = new ObjetoDTO (rs.getString("ORIGEN"),rs.getString("HORA"),rs.getString("NOMBRE"), rs.getString("MODELO"));
				detalles.add(fila);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return detalles;
	}
}
