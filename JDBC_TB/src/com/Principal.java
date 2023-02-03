package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

    public static void main(String[] args) {
	
	//JDBC -Java DataBase Connectivity 
	
	//SELECT
	
	Connection con = null; //conexion a base de datos 
	PreparedStatement ps = null; //entrada de datos 
	ResultSet rs = null; //salida de datod 1 
	String qSelect="SELECT ID,NOMBRE,CURP,DIR FROM PATRON";
	
	try//intentar la comunicacion con la base de datos	
	{	 
	    Class.forName("oracle.jdbc.OracleDriver"); //buscar una clase dentro de un paquete
	    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TB", "admin"); 
	    ps = con.prepareStatement(qSelect);
	    rs = ps.executeQuery();
	    while(rs.next()) 
	    {
		System.out.format("%-4s","||");
		System.out.format("%-4s",rs.getInt("ID")+" ");//+rs.getNString("NOMBRE")+"||"+rs.getNString("CURP")+"||"+rs.getNString("DIR"));
		System.out.format("%-4s","||");
		System.out.format("%-18s",rs.getNString("NOMBRE")+" ");
		System.out.format("%-4s","||");
		System.out.format("%-18s",rs.getNString("CURP")+" ");
		System.out.format("%-4s","||");
		System.out.format("%-30s",rs.getNString("DIR")+" ");
		System.out.format("%-4s","||");
		System.out.println();		
	    }
	    con.close();
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	
	//INSERT my way
	
//	Connection con = null; //conexion a base de datos 
//	PreparedStatement ps = null; //entrada de datos 
//	ResultSet rs = null; //salida de datod 1 
//	String x1= "Fidel Bolaño",x2= "COOKLASKEM22939",x3="Farallon 20", x4="1";
//	String qI = "INSERT INTO PATRON (NOMBRE, CURP, DIR, STATUS_SOCIO) VALUES ('"+x1+"','"+x2+"','"+x3+"',"+x4+")";
//	
//	try//intentar la comunicacion con la base de datos	
//	{	 
//	    Class.forName("oracle.jdbc.OracleDriver"); //buscar una clase dentro de un paquete
//	    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TB", "admin"); 
//	    ps = con.prepareStatement(qI);
//	    rs = ps.executeQuery();
//	    int flag= ps.executeUpdate();
//	    if (flag<0) System.out.println("Hubo un error");
//	    else System.out.println("exito");
//	    while(rs.next()) 
//	    {
//		System.out.format("%-4s","||");
//		System.out.format("%-4s",rs.getInt("ID")+" ");//+rs.getNString("NOMBRE")+"||"+rs.getNString("CURP")+"||"+rs.getNString("DIR"));
//		System.out.format("%-4s","||");
//		System.out.format("%-18s",rs.getNString("NOMBRE")+" ");
//		System.out.format("%-4s","||");
//		System.out.format("%-18s",rs.getNString("CURP")+" ");
//		System.out.format("%-4s","||");
//		System.out.format("%-30s",rs.getNString("DIR")+" ");
//		System.out.format("%-4s","||");
//		System.out.println();		
//	    }
//	    con.close();
//	}
//	catch(Exception ex)
//	{
//	    ex.printStackTrace();
//	}
	
	//INSERT
	
//	Connection con = null; //conexion a base de datos 
//	PreparedStatement ps = null; //entrada de datos 
//	String qInsert = "INSERT INTO PATRON(NOMBRE, CURP, DIR, STATUS_SOCIO) VALUES (?,?,?,?)"; //indicando la sentencia SQL de consulta 
//	
//	try//intentar la comunicacion con la base de datos	
//	{
//	    Class.forName("oracle.jdbc.OracleDriver"); //buscar una clase dentro de un paquete
//	    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TB", "admin"); 
//	    ps=con.prepareStatement(qInsert);
//	 
//	    ps.setString(1, "ALEJANDRO"); //indicamos el indice de la columna y el valor que llevara
//	    ps.setString(2, "ALE20219300091"); 
//	    ps.setString(3, "PUEBLA");
//	    ps.setInt(4, 0);
//	    int flag= ps.executeUpdate();
//	    if (flag<0) System.out.println("Hubo un error");
//	    else System.out.println("exito");
//	    con.close();
//	}
//	catch(Exception ex)
//	{
//	    ex.printStackTrace();
//	}
	
	//UPDATE
	
//	Connection con = null; //conexion a base de datos 
//	PreparedStatement ps = null; //entrada de datos 
//	String qUpdate = "UPDATE PATRON SET NOMBRE=?, CURP=?, DIR=? WHERE ID=?"; //indicando la sentencia SQL de consulta 
//	
//	try//intentar la comunicacion con la base de datos	
//	{
//	    Class.forName("oracle.jdbc.OracleDriver"); //buscar una clase dentro de un paquete
//	    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TB", "admin"); 
//	    ps=con.prepareStatement(qUpdate);
//	 
//	    ps.setString(1, "Hector"); //indicamos el indice de la columna y el valor que llevara
//	    ps.setString(2, "HRC20219300091"); 
//	    ps.setString(3, "Hidalgo");
//	    ps.setInt(4, 26);
//	    
//	    int flag= ps.executeUpdate();
//	    if (flag<0) System.out.println("Hubo un error");
//	    else System.out.println("exito");
//	    con.close();
//	}
//	catch(Exception ex)
//	{
//	    ex.printStackTrace();
//	}
	
	//DELETE
	
//	Connection con = null; //conexion a base de datos 
//	PreparedStatement ps = null; //entrada de datos 
//	String qDelete = "DELETE FROM PATRON WHERE ID=?"; //indicando la sentencia SQL de consulta 
//	try//intentar la comunicacion con la base de datos	
//	{
//	    Class.forName("oracle.jdbc.OracleDriver"); //buscar una clase dentro de un paquete
//	    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TB", "admin"); 
//	    ps=con.prepareStatement(qDelete);
//
//	    ps.setInt(1, 26);
//	    
//	    int flag= ps.executeUpdate();
//	    if (flag<0) System.out.println("Hubo un error");
//	    else System.out.println("exito");
//	    con.close();
//	}
//	catch(Exception ex)
//	{
//	    ex.printStackTrace();
//	}


    }

}
