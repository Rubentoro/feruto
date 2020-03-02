package com.oesia.formacion.practica.architecture.persistence.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PopulateDB {
	
	private static PopulateDB INSTANCE = null;

	private PopulateDB() {

	}

	public static PopulateDB getInstance() {
		if (INSTANCE == null)
			INSTANCE = new PopulateDB();

		return INSTANCE;
	}

	public void start() throws SQLException {
		Connection connection = null;

		try {
			connection = ConectionDB.getInstance().creaConexionDb();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		} finally {
			connection.close();
		}
	}

	private void showResults(ResultSet resultSet) throws SQLException {
		while (resultSet.next()) {

		}
	}

	private void newSentence(Connection connection, String sentence) throws SQLException {
		Statement statement = connection.createStatement();
		statement.executeUpdate(sentence);
		//ResultSet resultSet = statement.executeQuery(sentence);

	}

}
