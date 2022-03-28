package com.petshopbooking;

public class UserReg {
	private Integer id;
	private String user_name;
	private String user_email;
	private String user_password;
	private String user_contact_no;
	
		public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_contact_no() {
		return user_contact_no;
	}
	public void setUser_contact_no(String user_contact_no) {
		this.user_contact_no = user_contact_no;
	}
	@Override
	public String toString() {
		return "UserReg [id=" + id + ", user_name=" + user_name + ", user_email=" + user_email + ", user_password="
				+ user_password + ", user_contact_no=" + user_contact_no + "]";
	}
}
	
	

