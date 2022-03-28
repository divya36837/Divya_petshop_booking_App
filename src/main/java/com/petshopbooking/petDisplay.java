package com.petshopbooking;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import com.petshopbooking.DAO.ConnectionUtil;
public class petDisplay {
	static Scanner sc = new Scanner(System.in);
public static void petDisplay() throws Exception {
	
	Connection connection;
	connection=ConnectionUtil.getConnection();
	
	String query1 = "SELECT *FROM petshopbooking";
	Statement stm = connection.createStatement();
	ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query1);
	System.out.println("pet_Id \t\t pet_Name \t\t Price");
	while (rsm.next()) {
		System.out.println(rsm.getString("id")+ "\t\t" + rsm.getString("pet_name")+"\t\t\t" +rsm.getString("pet_price"));
	}
	//orderpet();
}
private static void orderpet(int user_Id) {
	// TODO Auto-generated method stub
	
}
public static void pet_name(int user_Id ) throws Exception
{
	
		System.out.println("Enter pet Name ");
		Scanner sc = new Scanner(System.in);
		String pet = sc.nextLine();
		Connection connection;
		connection=ConnectionUtil.getConnection();
		String query2 = "SELECT pet_name,pet_price FROM petshopbooking\" =  order by pet_name " ;
		Statement stm = connection.createStatement();
		ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query2);
		while (rsm.next()) {
			System.out.println(rsm.getString("pet_id")+ "\t" + rsm.getString("pet_name"));
	}
}
public static void orderpet1(int user_Id) throws Exception {
	
	System.out.println("Want to Order? Y/N");
	char option=sc.next().charAt(0);
	if(option=='y' || option=='Y') {
		
		try {
		System.out.println("Enter pet ID to order...");
		int id=sc.nextInt();
		String petname=null;
		Connection connection;
		connection=ConnectionUtil.getConnection();
		String query2 = "select pet_name FROM petshopbooking WHERE id='"+id+"' " ;
		Statement stm = connection.createStatement();
		ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query2);
		while(rsm.next()) {
			petname=rsm.getString("pet_name");
		}
		String query="update userdetails set pet='"+petname+"' where id= '"+user_Id+"' ";
		stm.executeUpdate(query);
		System.out.println(petname+" Order Purchased");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}else if(option=='n' || option=='N') {
	// UserProcess.userpetname();
	}
	else {
		System.out.println("INVALID option");
		//petDisplay(user_Id);
	}
	
	
 }
}

































