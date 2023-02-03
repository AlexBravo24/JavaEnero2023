package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) {
		
		//JDBC JAVA DATABASE CONNECTIVITY
	
		//Consulta de base de datos
		
//		Connection con = null;  //conexion a base de datos
//		PreparedStatement ps=null;  //  entrada de datos
//		ResultSet rs =null;
//		String query ="SELECT * FROM PATRON";   //indicando la sentencia SQL de consulta
//		
//		
//		try {   //intentar la comunicacion con la base de datos
//			
//			Class.forName("oracle.jdbc.OracleDriver");//buscar una clase dentro de un paquete
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "AylinMorales", "admin");
//			//dirección de la base de datos, donde @localhost es nuestra conexion local y xe es el nombre de la base de datos oracle, la version
//			//indicamos usuario y contraseña de la base de datos
//			ps = con.prepareStatement(query);     //vamos a precompilar la consulta identificando que es una instrucción sql
//			rs = ps.executeQuery();  //ejecuta la sentencia sql interpretada
//			
//			while (rs.next()) {
//				System.out.println(rs.getInt("ID_PATRON")+  " : " + rs.getString("NOMBRE") + " : "+ rs.getString("FECHANAC_PATRON")+ " : "+ rs.getInt("EDAD")+ rs.getString("DIRECCION"));
//			}
//			
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
		
		//insercion de datos
		
//		Connection con = null;  
//		PreparedStatement ps=null;
//		String insert = "INSERT INTO TRIPULACION VALUES (?,?,?)";//INDICAMOS EL NUMERO DE COLUMNAS
//		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "AylinMorales", "admin");
//			ps= con.prepareStatement(insert);
//			
//			ps.setInt(1, 0);//indicamos la posicion de la columna y el valor que lleva
//			ps.setString(2, "Rey");
//			ps.setInt(3, 2);
//			
//			int flag = ps.executeUpdate();
//			
//			if(flag<0) {
//				System.out.println("Error en la inserción de datos");
//			}
//			else {
//				System.out.println("Registro nuevo insertado");
//			}
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
		
		//Actualizacion de datos UPDATE
		
//		Connection con = null;  
//		PreparedStatement ps=null;
//		String update = "UPDATE TRIPULACION SET NOMBRE=?,ID_BASE=? WHERE ID_TRIPULACION =?";//INDICAMOS EL NUMERO DE COLUMNAS
//		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "AylinMorales", "admin");
//			ps= con.prepareStatement(update);
//			
//			ps.setInt(3, 23);//indicamos la posicion de la columna y el valor que lleva
//			ps.setString(1, "ANA");
//			ps.setInt(2, 2);
//			
//			int flag = ps.executeUpdate();
//			
//			if(flag<0) {
//				System.out.println("Error en la inserción de datos");
//			}
//			else {
//				System.out.println("Registro nuevo insertado");
//			}
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
		
		//borrado de un registro
		Connection con = null;  
		PreparedStatement ps=null;
		String delete = "DELETE FROM TRIPULACION WHERE ID_TRIPULACION =?";//INDICAMOS EL NUMERO DE COLUMNAS
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "AylinMorales", "admin");
			ps= con.prepareStatement(delete);
			
			ps.setInt(1, 22);//indicamos la posicion de la columna y el valor que lleva
			
			int flag = ps.executeUpdate();
			
			if(flag<0) {
				System.out.println("Error en el borrado de datos");
			}
			else {
				System.out.println("Registro BORRADO");
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		
		
		
	}
}
