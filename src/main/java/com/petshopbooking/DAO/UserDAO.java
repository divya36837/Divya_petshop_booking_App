package com.petshopbooking.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.petshopbooking.User;
import com.petshopbooking.pets;

public class UserDAO {
	public void userAdd(User user) throws Exception{
		Connection connection=null;
		PreparedStatement statement=null;
		int rows=0;
		connection=ConnectionUtil.getConnection();
		String sql="INSERT INTO userdetails (user_name,user_email,user_password,user_contact_no) VALUES(?,?,?,?)";
		statement=connection.prepareStatement(sql);
		statement.setString(1, user.getUser_name());
		statement.setString(2,user.getUser_email());
		statement.setString(3,user.getUser_password());
		statement.setString(4,user.getUser_contact_no());
		rows=statement.executeUpdate();
		//System.out.println("No of rows inserted:"+rows);
		if(rows==1)
		{
			System.out.println("Successfully Registered");
		}
	}
}

		
		
	
	