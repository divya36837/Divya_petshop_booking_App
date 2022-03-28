package com.petshopbooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.petshopbooking.DAO.ConnectionUtil;

public class UserLogin {
	public static void login() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user_email:");
		String user_email=sc.next();
		System.out.println("Enter the user_password:");
		String user_password=sc.next();
		Connection connection=null;
		PreparedStatement statement=null;
		connection=ConnectionUtil.getConnection();
		String query="select user_email,user_password from userdetails where user_email=?";
		statement=connection.prepareStatement(query);
		statement.setString(1, user_email);
		//statement.setString(2, user_password);
		ResultSet result=statement.executeQuery();
		String useremail=null;
		String userpassword=null;
		while(result.next()) {
			useremail=result.getString("user_password");
		}
		if(useremail==null) {
			System.out.println("No records found please register");
		}
		else if(user_password.equals(user_password)) {
			System.out.println("Successfully Login");
		}
		
		
		sc.close();
	}
}
