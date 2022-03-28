package com.petshopbooking;

import java.util.Scanner;

import com.petshopbooking.DAO.UserDAO;

public class UserTest {
	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO PETSHOP BOOKING");
		System.out.println("Enter 1 to continue");
		int login=sc.nextInt();
		if(login==1) {
			System.out.println("Enter 1 to SIGNUP "+'\n' +"Enter 2 to SIGNIN ");
			int User=sc.nextInt();
			if (User==1) {
				System.out.println("Enter the name");
				String name=sc.next();
				System.out.println("Enter the email");
				String email=sc.next();
				System.out.println("Enter the password");
				String password=sc.next();
				System.out.println("Enter the contact no");
				String contactno=sc.next();
		        User user=new User();
			    user.setUser_name(name);
				user.setUser_email(email);
				user.setUser_password(password);
				user.setUser_contact_no(contactno);
				//System.out.println(user);
				UserDAO userDAO=new UserDAO();
				userDAO.userAdd(user);
				petDisplay.petDisplay();
				//sc.close();
				
								
			}
			else if(User==2) {
				UserLogin.login();
			}
		}
			}
			
	

	private void setuser_contact_no(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setuser_password(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setuser_email(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setuser_name(String string) {
		// TODO Auto-generated method stub
		
	}

	
}

