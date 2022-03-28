package com.petshopbooking;
import com.petshopbooking.*;
import com.petshopbooking.DAO.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;
public class UserPetOrder {
	   
static Scanner sc = new Scanner(System.in);
public static void UserPetOrder(int user_id) throws Exception {
		
		Connection connection;
		connection=ConnectionUtil.getConnection();
		
		String query1 = "SELECT id,pet_name,pet_price FROM petshopbooking ";
		Statement stm = connection.createStatement();
		ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query1);
		System.out.println("id \t  Gift_Name \t\t Price");
		while (rsm.next()) {
			System.out.println(rsm.getString("id")+ "\t" + rsm.getString("pet_name")+"\t\t"+rsm.getString("pet_price"));
		}
		orderpet(id);
	}
	public static void pet_name(int id)throws Exception
	{
		
			System.out.println("Enter pet name");
			Scanner sc = new Scanner(System.in);
			String pet=sc.next();
			Connection connection;
			connection=ConnectionUtil.getConnection();
			String query2 = "select id,pet_name FROM petshopbooking WHERE pet_name =  order by pet_name " ;
			Statement stm = connection.createStatement();
			ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query2);
			while (rsm.next()) {
				System.out.println(rsm.getString("id")+ "\t" + rsm.getString("pet_name"));
		}
	}
	public static void User(int user_id)throws Exception {
		
		System.out.println("Want to Order? Y/N");
		char option=sc.next().charAt(0);
		if(option=='y' || option=='Y') {
			
			try {
			System.out.println("Enter pet ID to order...");
			int id=sc.nextInt();
			String pet_name=null;
			Connection connection;
			//connection=ConnectionUtil.sqlConnection();
			String query2 = "select pet_name FROM petshopbooking WHERE id='"+id+"' " ;
			Statement stm =Connection.createStatement();
			ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query2);
			while(rsm.next()) {
				pet_name=rsm.getString("pet_name");
			}
			String query="update  userdetails set pet='"+"' where id= '"+id+"' ";
			stm.executeUpdate(query);
			System.out.println(pet_name+" Order Purchased");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}else if(option=='n' || option=='N') {
		// UserProcess.userItem();
		}
		else {
			System.out.println("INVALID option");
		    UserPetOrder(user_id);
		}
		
		
	 }
	}

	