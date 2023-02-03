package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

//	public static void main(String[] args) {
//		//JDBC JAVA DATABASE CONNECTIVITY
//		
//			//Consulta de base de datos
//			
//			Connection con = null;  //conexion a base de datos
//			PreparedStatement ps=null;  //  entrada de datos
//			ResultSet rs =null;
//			String query ="SELECT * FROM LISTAS_CLIENTES";   //indicando la sentencia SQL de consulta
//			
//			
//			try {   //intentar la comunicacion con la base de datos
//				
//				Class.forName("oracle.jdbc.OracleDriver");//buscar una clase dentro de un paquete
//				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abdiel", "admin");
//				//dirección de la base de datos, donde @localhost es nuestra conexion local y xe es el nombre de la base de datos oracle, la version
//				//indicamos usuario y contraseña de la base de datos
//				ps = con.prepareStatement(query);     //vamos a precompilar la consulta identificando que es una instrucción sql
//				rs = ps.executeQuery();  //ejecuta la sentencia sql interpretada
//				
//				while (rs.next()) {
//					System.out.println(rs.getInt("ID_CLIENTE")+  " : " + rs.getString("NOMBRE") + " : "+ rs.getString("DIRECCION")+ " : "+ rs.getInt("TELEFONO"));
//				}
//				
//			}catch(Exception ex) {
//				ex.printStackTrace();
//			}
//		
//		//insercion de datos
//		
//				Connection con1 = null;  
//				PreparedStatement ps1=null;
//				String insert = "INSERT INTO TRIPULACION VALUES (?,?,?)";//INDICAMOS EL NUMERO DE COLUMNAS
//				
//				try {
//					Class.forName("oracle.jdbc.OracleDriver");
//					con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abdiel", "admin");
//					ps1= con1.prepareStatement(insert);
//					
//					ps1.setInt(1, 20);//indicamos la posicion de la columna y el valor que lleva
//					ps1.setString(2, "Rey");
//					ps1.setInt(3, 2);
//					
//					int flag = ps1.executeUpdate();
//					
//					if(flag<0) {
//						System.out.println("Error en la inserción de datos");
//					}
//					else {
//						System.out.println("Registro nuevo insertado");
//					}
//				}catch(Exception ex) {
//					ex.printStackTrace();
//				}
//				
//				
//			//Actualizacion de datos (UPDATE)
//				
//				Connection con1 = null;  
//				PreparedStatement ps1=null;
//				String update = "UPDATE LISTAS_CLIENTES SET NOMBRE=?, DIRECCION=?, TELEFONO=? WHERE ID_PATRON=?";//INDICAMOS EL NUMERO DE COLUMNAS
//				
//				try {
//					Class.forName("oracle.jdbc.OracleDriver");
//					con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abdiel", "admin");
//					
//					ps1= con1.prepareStatement(update);
//					
//					ps1.setInt(1, 20);//indicamos la posicion de la columna y el valor que lleva
//					ps1.setString(2, "Rey");
//					ps1.setString(3, "Veracruz");
//					ps1.setString(4, "2282565739");
//					
//					int flag = ps1.executeUpdate();
//					
//					if(flag<0) {
//						System.out.println("Error en la inserción de datos");
//					}
//					else {
//						System.out.println("Registro nuevo insertado");
//					}
//				}catch(Exception ex) {
//					ex.printStackTrace();
//				}
				
				//Borrado de un registro (DELETE)
				
				Connection con = null;  
				PreparedStatement ps=null;
				String update = "DELETE FROM LISTAS_CLIENTES WHERE ID_PATRON=?";{//INDICAMOS EL NUMERO DE COLUMNAS
				
				try {
					Class.forName("oracle.jdbc.OracleDriver");
					con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abdiel", "admin");
					
					ps= con.prepareStatement(update);
					
					ps.setInt(1, 20);//indicamos la posicion de la columna y el valor que lleva
					
					int flag = ps.executeUpdate();
					
					if(flag<0) {
						System.out.println("Error al eliminar un registro");
					}
					else {
						System.out.println("Registro nuevo insertado");
					}
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}

}


