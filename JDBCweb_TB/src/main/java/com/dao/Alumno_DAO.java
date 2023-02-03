package com.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.dto.Objeto_DTO;
import com.entity.Alumno;
import com.general.Database;
import com.general.Metodos;

public class Alumno_DAO implements Metodos {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    Database db = new Database();
    Alumno a = null;
    String resultado = null;

    @Override
    public String guardar(Object ob) {
	
	a=(Alumno) ob;
	String qInsert = "INSERT INTO ALUMNO (NOMBRE,FECHANAC,SEXO,CURP,GRADO,STATUS) VALUES (?,?,?,?,?,?)";
	
	try 
	{
	    Class.forName(db.getDriver());
	    con= DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
	    ps = con.prepareStatement(qInsert);
	    
	    ps.setString(1, a.getNombre());
	    ps.setDate(2, a.getFechaNac());
	    ps.setString(3, a.getSexo());
	    ps.setString(4, a.getCurp());
	    ps.setString(5, a.getGrado());
	    ps.setInt(6, 1);
	    
	    int flag= ps.executeUpdate();
	    if (flag<0) {resultado="0"; System.out.println("error");}
	    else {resultado="1"; System.out.println("exito");}
	    con.close();
	}
	catch(Exception ex)
	{
	   resultado = ex.getMessage(); 
	}
	return resultado;
    }

    @Override
    public String editar(Object ob) {
	
	a=(Alumno) ob;
	String qInsert = "UPDATE ALUMNO SET NOMBRE=?,FECHANAC=?,SEXO=?,CURP=?,GRADO=?,STATUS=? WHERE ID_ALUMNO=?";
	
	try 
	{
	    Class.forName(db.getDriver());
	    con= DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
	    ps = con.prepareStatement(qInsert);
	    
	    ps.setString(1, a.getNombre());
	    ps.setDate(2, a.getFechaNac());
	    ps.setString(3, a.getSexo());
	    ps.setString(4, a.getCurp());
	    ps.setString(5, a.getGrado());
	    ps.setInt(6, a.getStatus());
	    ps.setInt(7, a.getIdAlumno());
	    
	    int flag= ps.executeUpdate();
	    if (flag<0) {resultado="0"; System.out.println("error");}
	    else {resultado="1"; System.out.println("exito");}
	    con.close();
	}
	catch(Exception ex)
	{
	   resultado = ex.getMessage(); 
	}
	return resultado;
    }

    @Override
    public String eliminar(int id) {

	String qDelete = "DELETE FROM ALUMNO WHERE ID_ALUMNO="+id;
	
	try 
	{
	    Class.forName(db.getDriver());
	    con= DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
	    ps = con.prepareStatement(qDelete);
	    
	    int flag= ps.executeUpdate();
	    if (flag<0) {resultado="0"; System.out.println("error");}
	    else {resultado="1"; System.out.println("exito");}
	    con.close();
	}
	catch(Exception ex)
	{
	   resultado = ex.getMessage(); 
	}
	return resultado;
    }

    @Override
    public Object buscar(int id) {

	String qSelect = "SELECT * FROM ALUMNO WHERE ID_ALUMNO="+id;
	
	try 
	{
	    Class.forName(db.getDriver());
	    con= DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
	    ps = con.prepareStatement(qSelect);
	    rs= ps.executeQuery();
	    
	    while(rs.next()) 
	    {
		a=new Alumno(
			rs.getInt("ID_ALUMNO"),
			rs.getString("NOMBRE"),
			rs.getDate("FECHANAC"),
			rs.getString("SEXO"),
			rs.getString("CURP"),
			rs.getString("GRADO"),
			rs.getInt("STATUS"));
	    }
	}
	catch(Exception ex)
	{
	   resultado = ex.getMessage(); 
	}
	return a;    
    }

    @Override
    public List mostrar() {
	String mostrar = "SELECT * FROM ALUMNO"; 
	List<Alumno> alumnos = new ArrayList<Alumno>(); 
	try 
	{ 
	    Class.forName(db.getDriver()); 
	    con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword()); 
	    ps = con.prepareStatement(mostrar); 
	    rs = ps.executeQuery(); 
	    while (rs.next())
	    {
		a=new Alumno(
			rs.getInt("ID_ALUMNO"),
			rs.getString("NOMBRE"),
			rs.getDate("FECHANAC"),
			rs.getString("SEXO"),
			rs.getString("CURP"),
			rs.getString("GRADO"),
			rs.getInt("STATUS"));
		alumnos.add(a); 
	    }
	}
	catch(Exception ex)
	{
	    resultado = ex.getMessage(); 
	}
	return alumnos;
    }

    public List getDetalles() 
    {
	String query ="SELECT V.ORIGEN, TO_CHAR(V.HORARIOVIAJE, 'HH24:MI:SS') AS HORA, P.NOMBRE, A.MODELO " + 
		"FROM VUELO V " + 
		"INNER JOIN VUELO_AVION_PILOTO VAP " + 
		"ON V.ID_VUELO=VAP.ID_VUELO " + 
		"INNER JOIN PILOTOS P " + 
		"ON P.ID_PILOTO=VAP.ID_PILOTO " + 
		"INNER JOIN AVIONES A " + 
		"ON A.ID_AVION=VAP.ID_AVION";
	List<Objeto_DTO> detalles = new ArrayList<Objeto_DTO>();
	Objeto_DTO fila = null;
	
	try 
	{ 
	    Class.forName(db.getDriver()); 
	    con = DriverManager.getConnection(db.getUrl(), "DB_AVIONES_TB", db.getPassword()); 
	    ps = con.prepareStatement(query); 
	    rs = ps.executeQuery(); 
	    while (rs.next())
	    {
		fila=new Objeto_DTO(
			rs.getString("ORIGEN"),
			rs.getString("HORA"),
			rs.getString("NOMBRE"),
			rs.getString("MODELO"));
		detalles.add(fila);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace(); 
	}
	return detalles;
	
    }
}
