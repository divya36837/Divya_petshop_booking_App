package com.petshopbooking.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.petDisplay.*;
import com.petshopbooking.petDisplay;
public class SearchPetDAO {
	public static List<petDisplay> selectAll()throws Exception
	{
		List<petDisplay>petDisplayList=new ArrayList<petDisplay>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		
		String query="SELECT * FROM petshopbooking";
		
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.err.println("Pet Id \t"+"Pet Name \t" +"");
		while(rs.next())
		{
			Integer id=rs.getInt("train_id");
			String trainName=rs.getString("train_name");
			String trainFrom=rs.getString("train_from");
			String trainTo=rs.getString("train_to");
			String trainDate=rs.getString("train_date");
			String trainTiming=rs.getString("train_timing");
			
			DisplayTrain trainObj=new DisplayTrain(id,trainName,trainFrom,trainTo,trainDate,trainTiming);
			 displayTrainList.add(trainObj);			
			
		}
		
		//System.out.println("no of rows selected"+rows);
		connection.close();
		return displayTrainList;
		
	}
}
