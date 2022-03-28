package com.petshopbooking;
import com.petshopbooking.UserReg;

public class UserRegValidation {
	public static void UserRegValidation(UserReg User) throws Exception{
		if(User.getUser_name()==null) {
			throw new Exception("Invalid User_name");
		}
		else if (User.getUser_email()==null) {
			throw new Exception("Invalid User_email");
		}
		else if (User.getUser_password()==null) {
			throw new Exception("Invalid User_password");
		}
		else if (User.getUser_contact_no()==null) {
			throw new Exception("Invalid User_contact_no");
		}
		else {
			System.out.println("Validation successfull");
		}
	}
}
