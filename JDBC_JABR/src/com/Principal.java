package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) {
////		Connection con = null; //Conexion a base de datos
////		PreparedStatement ps = null; //entrada de datos
////		ResultSet rs = null; // Salida de datos
////		
////		String query = "SELECT * FROM LISTAS_CLIENTES" ;
////		
////		try {
////			Class.forName("oracle.jdbc.OracleDriver");
////			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Abyss","admin");
////			
////			ps = con.prepareStatement(query);
////			rs = ps.executeQuery();
////			while (rs.next()) {
////				System.out.println(rs.getInt(1)+ "-"+ rs.getString(2)+ "-"+ rs.getString(3)+ "-"+ rs.getString(4));
////			}
////			
////		}catch (Exception ex) {
////			ex.printStackTrace();
//		
//		
//			//Inserción de datos
//	
//		
//	
//	Connection con = null;
//	PreparedStatement ps = null;
//	String insert = "INSERT INTO LISTAS_CLIENTES VALUES (?,?,?,?)"; //Indicamos el número de columnas
//	try
//	{
//		Class.forName("oracle.jdbc.OracleDriver");
//	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Abyss","admin");
//	ps = con.prepareStatement(insert);
//	ps.setInt(1, 0);
//	ps.setString(2, "ALEJANDRO");
//	ps.setString(3, "PUEBLA");
//	ps.setString(4, "2726398690");
//	
//	int flag = ps.executeUpdate();
//	if (flag<0) {
//		System.out.println("Hubo un error en la inserción");
//	}else {
//		System.out.println("Registro nuevo insertado");
//	}
//		
//	
//	} catch (Exception ex) {
//    	ex.printStackTrace();


	
	
	
//	Connection con = null; //Conexion a base de datos
//	PreparedStatement ps = null; //entrada de datos
//	ResultSet rs = null; // Salida de datos
//	
//	String query = "SELECT * FROM LISTAS_CLIENTES" ;
//	
//	try {
//		Class.forName("oracle.jdbc.OracleDriver");
//		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Abyss","admin");
//		
//		ps = con.prepareStatement(query);
//		rs = ps.executeQuery();
//		while (rs.next()) {
//			System.out.println(rs.getInt(1)+ "-"+ rs.getString(2)+ "-"+ rs.getString(3)+ "-"+ rs.getString(4));
//		}
//		
//	}catch (Exception ex) {
//		ex.printStackTrace();
	
	
		//Inserción de datos

	
	
//Connection con = null;
//PreparedStatement ps = null;
//String update = "UPDATE LISTAS_CLIENTES SET NOMBRE=?, TELEFONO=?, DIRECCION=? WHERE ID_CLIENTE=? "; //Indicamos el número de columnas
//try
//{
//	Class.forName("oracle.jdbc.OracleDriver");
//con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Abyss","admin");
//ps = con.prepareStatement(update);
//ps.setInt(4, 21);
//ps.setString(1, "JESSICA");
//ps.setString(2, "CDMX");
//ps.setString(3, "2281960898");
//
//int flag = ps.executeUpdate();
//if (flag<0) {
//	System.out.println("Hubo un error en la actualización");
//}else {
//	System.out.println("Registro actualizado correctamente");
//}
//	
//
//} catch (Exception ex) {
//	ex.printStackTrace();
//	}

	// Borrado de un registro (DELETE)

		Connection con = null;
		PreparedStatement ps = null;
		String delete = "DELETE FROM LISTAS_CLIENTES WHERE ID_CLIENTE=? "; 
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Abyss","admin");
		ps = con.prepareStatement(delete);
		ps.setInt(1, 21);
		
		int flag = ps.executeUpdate();
		if (flag<0) {
			System.out.println("Hubo un error en eliminar el registo");
		}else {
			System.out.println("Registro eliminado correctamente");
		}
			

		} catch (Exception ex) {
			ex.printStackTrace();
			}


	}
}

