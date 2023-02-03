package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {
	
	public static void main(String[] args) {

		//JDBC - Java Database Connectivity
		
		//Consulta de base de datos
//		Connection con = null; // Conexión a base de datos
//		PreparedStatement ps = null; //Entrada de datos
//		ResultSet rs = null; //Salida de datos
//		String query ="SELECT * FROM PATRON"; //Indicando la sentencia SQL de consulta
//		
//		try { //Intentar la comunicación con la base de datos
//			Class.forName("oracle.jdbc.OracleDriver"); //Buscar una clase dentro de un paquete con unString
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", //Direccion de la base de datos donde @localhost es nuestra conexion local y xe la nombre de la base de datos
//					"cesarsob", "admin"); //Indicamos usuario y contraseña de la base de datos
//			ps = con.prepareStatement(query); //Precompilar la consulta, identificando una instruccion sql
//			rs = ps.executeQuery();//Ejecuta la sentencia SQL interpretada
//			
//			while (rs.next()) { //Iterar sobre los registros de cada fila
//				System.out.println(rs.getInt("ID_PATRON") + " || " + rs.getString("NOMBRE") + " || " + rs.getString("DIRECCION") + " || " + rs.getString("TELEFONO"));
//			}
//			
//			
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
		
		
		//Inserción de datos (INSERT)
//		Connection con = null; // Conexión a base de datos
//		PreparedStatement ps = null; //Entrada de datos
//		String insert = "INSERT INTO PATRON VALUES (?,?,?,?)"; //Indicamos el número de columnas
//		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cesarsob", "admin");
//			ps = con.prepareStatement(insert);
//			
//			ps.setInt(1, 0); //Indicamos la posicion de la columna y el valor que lleva
//			ps.setString(2, "ALEJANDRO");
//			ps.setString(3, "PUEBLA");
//			ps.setString(4, "2721076060");
//			
//		int flag = ps.executeUpdate();
//		
//		if (flag<0) {
//			System.out.println("Hubo un error en la inserción");
//		}else {
//			System.out.println("Registro nuevo insertado");
//		}
//			
//			
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
		
		//Actualización de datos(UPDATE)	
//		Connection con = null; // Conexión a base de datos
//		PreparedStatement ps = null; //Entrada de datos
//		String update = "UPDATE PATRON SET NOMBRE=?, DIRECCION=?, TELEFONO=? WHERE ID_PATRON=?"; //Indica la tabla y los valores a modificar	
//		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cesarsob", "admin");
//			ps = con.prepareStatement(update);
//			
//			ps.setString(1, "ANA");
//			ps.setString(2, "VERACRUZ");
//			ps.setString(3, "2291076060");
//			ps.setInt(4	, 6);
//			
//		int flag = ps.executeUpdate();
//		
//		if (flag<0) {
//			System.out.println("Hubo un error en la actualización");
//		}else {
//			System.out.println("Registro actualizado exitosamente");
//		}
//			
//			
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
		
		
		//Borrado de un registro (DELETE)
		Connection con = null; // Conexión a base de datos
		PreparedStatement ps = null; //Entrada de datos
		String delete = "DELETE FROM PATRON WHERE ID_PATRON=?"; //Indica la tabla y los valores a modificar	
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cesarsob", "admin");
			ps = con.prepareStatement(delete);
			
			ps.setInt(1	, 6);
			
		int flag = ps.executeUpdate();
		
		if (flag<0) {
			System.out.println("Hubo un error en la eliminación");
		}else {
			System.out.println("Registro eliminado exitosamente");
		}
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		
	}

}
