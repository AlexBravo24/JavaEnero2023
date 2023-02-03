package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Principal {

	public static void main(String[] args) {
		
		//JDBC -- Java DataBase Connectivity
		
		//Consulta de Base de Datos
		
//		Connection con = null; //conexión a base de datos
//		PreparedStatement ps = null; //entrada de datos 
//		ResultSet rs= null; //salida de datos 
//		String query = "SELECT * FROM SOCIOS"; //Indicamos la sentencia SQL de consulta
//		
//		try {//Intentar la comunicacion con la base de datos
//			Class.forName("oracle.jdbc.OracleDriver"); //Buscar una clase dentro de un paquete con un String
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", //Direccion de la base de datos donde localhost es nuestra conexion local y xe es el nombre de la base de datos
//					"Emmanuel", "admin"); //Indicamos usuario y contraseña de la Base de Datos
//			ps = con.prepareStatement(query); //Precompilar la consulta identidicando que es una sentencia SQL
//			rs = ps.executeQuery();//Ejecutamos la sentencia SQL interpretada
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt("ID_SOCIO") + " --> " + rs.getString("NOMBRE") + " " + rs.getString("APELLIDOS") + " --> " + rs.getString("DIRECCION") + " --> " + rs.getString("TELEFONO")); //Visualizarlos en consola por columna de tabla
//				
//			}
//			
//			
//		}catch (Exception ex) {
//			ex.printStackTrace();			
//		}
		
		
//		//Insersion de datos
//		
//		Connection con = null;
//		PreparedStatement ps = null; //entrada de datos 
//		String insert = "INSERT INTO ALUMNO VALUES (?,?,?,?,?,?,?)";  //Indicamos el numero de columnas
//		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver"); 
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
//					"Emmanuel", "admin"); 
//			ps = con.prepareStatement(insert);
//			
//			ps.setInt(1, 0);//Indicamos la posicion de la columna y el valor que lleva
//			ps.setString(2, "maria");
//			ps.setString(3, "14-06-1998"); //Ejemplo1
//			//ps.setDate(3, Date.valueOf("2006-12-12")); //Tambien se pude insertar fecha de esta forma
//			ps.setString(4, "MASCULINO");
//			ps.setString(5, "SACE90DFGDSFG67343");
//			ps.setString(6, "9o SEMESTRE");
//			ps.setInt(7, 1);
//			
//		int flag = ps.executeUpdate();
//		
//		if (flag<0) {
//			System.out.println("***Error en la Inserción De Datos***");
//		}else {
//			System.out.println("***Nuevo Registro Insertado***");
//		}
//			
//		}catch(Exception ex) {
//			ex.printStackTrace();			
//		}

		
		//Eliminacion de datos
		
		Connection con = null;
		PreparedStatement ps = null; //entrada de datos 
		String delete = "DELETE FROM ALUMNO WHERE ID_ALUMNO = ? ";  //Borrar por medio de ID
		//String delete = "DELETE FROM ALUMNO WHERE NOMBRE = (?) ";  //Borrar por medio de Nombre
		try {
			Class.forName("oracle.jdbc.OracleDriver"); 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
					"Emmanuel", "admin"); 
			ps = con.prepareStatement(delete);
			
			ps.setInt(1, 8); //Se indica la columna de id y el numero de alumno a borrar
			//ps.setString(1, "ANASTACIO"); //Se indica la concidencia de nombre que borrara

			
		int flag = ps.executeUpdate();
		
		if (flag<0) {
			System.out.println("***Error al Eliminar Registro***");
		}else {
			System.out.println("*** Registro Eliminado Correctamente***");
		}
			
		}catch(Exception ex) {
			ex.printStackTrace();			
		}
		
		
		//Actualizacion de datos
		
//		Connection con = null;
//		PreparedStatement ps = null; //entrada de datos 
//		String actualizar = "UPDATE ALUMNO SET NOMBRE=?, FECHANAC=?, SEXO=?, CURP=?, GRADO=?, STATUS=? WHERE ID_ALUMNO= ?";  //Borrar por medio de ID
//		try {
//			Class.forName("oracle.jdbc.OracleDriver"); 
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
//					"Emmanuel", "admin"); 
//			ps = con.prepareStatement(actualizar);
//			
//			ps.setString(1, "LEUNAMME");
//			ps.setString(2, "15/06/1995");
//			ps.setString(3, "MASCULINO");
//			ps.setString(4, "SACLDFGDF34545");
//			ps.setString(5, "5o SEMESTRE");
//			ps.setInt(6, 1);
//			ps.setInt(7, 8);
//			
//		int flag = ps.executeUpdate();		
//		
//		if (flag<0) {
//			System.out.println("***Error al Actualizar Registro***");
//		}else {
//			System.out.println("*** Registro Actualizado Correctamente***");
//		}
//			
//		}catch(Exception ex) {
//			ex.printStackTrace();			
//		}
		
	}
}
