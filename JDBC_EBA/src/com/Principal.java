package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Principal {

	public static void main(String[] args) {
		
		//JDBC -Java DataaBase Connectivity
		
		//Consulta de Base de Datos
		
//		Connection con = null; // Connexión a base de datos
//		PreparedStatement ps = null;  //entrada de datos
//		ResultSet rs = null; //Salida de datos
//		String query = "SELECT * FROM PATRONS";  //INDICAMOS LA SENTENCIIA SQL DE CONSULTA
//		
//		try { //intentar la conexión a la base de datos
//			Class.forName("oracle.jdbc.OracleDriver"); //buscar una clase dentro de un paquete 
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", //direccion de la base de datos donde se muestra la conexion local y xe es el nombre de la base de datos
//					"DbCeteq", "admin"); //indicamos usuario y contraseña de la base de datos
//			con.setAutoCommit(false);
//			ps = con.prepareStatement(query); //precompilar la consulta, identificamos que es un 
//			rs = ps.executeQuery(); //ejecuta la sentencia SQL interpretada
//			
//			while (rs.next()) {
//				System.out.println(rs.getInt("ID_PATRON") + " : " + rs.getString("NOMBRE") +
//						" : " + rs.getString("DIRECCION") + " : " + rs.getString("TELEFONO"));
//			}
//			
//			
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
		
//		Connection con = null; // Connexión a base de datos
//		PreparedStatement ps = null;  //entrada de datos
//		String insert = "INSERT INTO PATRONS VALUES (?,?,?,?)"; // Indicamos el numero de columnas
//		
//		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","DbCeteq", "admin");
//			
//			ps = con.prepareStatement(insert);
//			ps.setInt(1, 0); //indicamos la posición de la columna y el valor que lleva
//			ps.setString(2,"ALEXANDRO");
//			ps.setString(3,"PUEBLA");
//			ps.setString(4,"48546539");
//			
//		int flag = ps.executeUpdate();
//		
//		if (flag < 0 ) {
//			System.out.println("Error en la insercion de datos");
//		}else {
//			System.out.println("Registro insertado");
//		}
//			
//		}catch(Exception ex) {
//		ex.printStackTrace();
//	    }
		
		
		//actualizando un registro en la base de datos
//		Connection con = null; // Connexión a base de datos
//		PreparedStatement ps = null;  //entrada de datos
//		String update = "UPDATE  PATRONS SET NOMBRE=?, DIRECCION=?, TELEFONO=? WHERE ID_PATRON=? "; // Indicamos el numero de columnas
//		
//		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","DbCeteq", "admin");
//			
//			ps = con.prepareStatement(update);
//			ps.setInt(4, 7); //indicamos la posición de la columna y el valor que lleva
//			ps.setString(1,"ANA");
//			ps.setString(2,"VERACRUZ");
//			ps.setString(3,"888888888");
//			
//		int flag = ps.executeUpdate();
//		
//		if (flag < 0 ) {
//			System.out.println("Error en la actualizacion");
//		}else {
//			System.out.println("Registro actualizado correctamente");
//		}
//			
//		}catch(Exception ex) {
//		ex.printStackTrace();
//	    }
		
		// Eliminación de registros
		
		
		Connection con = null; // Connexión a base de datos
		PreparedStatement ps = null;  //entrada de datos
		String delete = "DELETE FROM  PATRONS  WHERE ID_PATRON=? "; // Indicamos el numero de columnas
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","DbCeteq", "admin");
			
			ps = con.prepareStatement(delete);
			ps.setInt(1, 8); //indicamos la posición de la columna y el valor que lleva
		
			
		int flag = ps.executeUpdate();
		
		if (flag < 0 ) {
			System.out.println("Error en al eliminar el registro");
		}else {
			System.out.println("Registro eliminado correctamente");
		}
			
		}catch(Exception ex) {
		ex.printStackTrace();
	    }

	}

}
