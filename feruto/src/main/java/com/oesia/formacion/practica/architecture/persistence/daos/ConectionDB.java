package com.oesia.formacion.practica.architecture.persistence.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionDB {
	
	private static ConectionDB INSTANCE = null;
	
	private ConectionDB() {
	
	}
	
	public static ConectionDB getInstance() {
		if(INSTANCE==null)
			INSTANCE = new ConectionDB();
		
		return INSTANCE;
	}
	
	
	public Connection creaConexionDb() throws ClassNotFoundException, SQLException{
		String driveUrl = "jdbc:mysql://localhost:3306/feruto";
		Connection connection = DriverManager.getConnection(driveUrl,"root","");
		
		if(connection != null)
			System.out.println("Conexión creada con éxito");
		
		return connection;
	}

}
