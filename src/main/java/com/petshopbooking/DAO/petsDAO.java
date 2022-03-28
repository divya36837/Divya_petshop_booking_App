package com.petshopbooking.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Connection;

import com.petshopbooking.pets;

public class petsDAO{
	public void petsAdd(pets pets) throws Exception{
		Connection connection=null;
		PreparedStatement statement=null;
		int rows=0;
		connection=ConnectionUtil.getConnection();
		String sql="INSERT INTO petshopbooking (pet_name,pet_price) VALUES(?,?)";
		statement=connection.prepareStatement(sql);
		statement.setString(1,pets.getPet_name());
		statement.setInt(2,pets.getPet_price());
		System.out.println(sql);
		rows=statement.executeUpdate();
		System.out.println("No of rows inserted:"+rows);
	}

	public void petsUpdate(pets pets) throws Exception{
		Connection connection=null;
		PreparedStatement statement=null;
		int rows=0;
		connection=ConnectionUtil.getConnection();
		String sql="UPDATE  petshopbooking SET pet_name='Fish' WHERE pet_name=?";
		statement=connection.prepareStatement(sql);
		System.out.println(sql);
		rows=statement.executeUpdate();
		System.out.println("No.of rows Updated:"+rows);
	}
	
	public void petsDelete(pets pets) throws Exception{
		Connection connection=null;
		PreparedStatement statement=null;
		int rows=0;
		connection=ConnectionUtil.getConnection();
		String sql="DELETE FROM petshopbooking WHERE pet_name=?";
		statement=connection.prepareStatement(sql);
		System.out.println(sql);
		rows=statement.executeUpdate();
		System.out.println("No.of rows Deleted:"+rows);
	}
}
	


	
			