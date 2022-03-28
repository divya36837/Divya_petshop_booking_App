package com.petshopbooking.DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getConnection() throws ClassNotFoundException {
		String id="jdbc:mysql://101.53.133.59:3306/revature_training_db";
		String pet_name="rev_user";
		String pet_price="rev_user";
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(id,pet_name,pet_price);
		}
		catch (SQLException e){//| ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to connect db");
		}
		return connection;
	}
	public static void close(Statement statement,Connection connection) {
		try {
			if(statement !=null) {
				((Connection) statement).close();
			}
			if(connection !=null) {
				connection.close();
			}
		}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}


