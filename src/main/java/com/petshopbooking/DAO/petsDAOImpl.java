package com.petshopbooking.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.petshopbooking.pets;

public class petsDAOImpl implements petsDAO  {
	
	public void petsDAO(pets pets) throws Exception{
		Connection connection=null;
		PreparedStatement statement=null;
		int rows=0;
		connection=connection.getconnection();
		String sql="INSERT INTO petshopbooking (pet_name,pet_price) VALUES(?,?)";
		statement=connection.prepareStatement(sql);
		statement.setString(1,pets.getPet_name());
		statement.setInt(2,pets.getPet_price());
		System.out.println(sql);
		rows=statement.executeUpdate();
		System.out.println("No of rows inserted:"+rows);
	}
}
	

