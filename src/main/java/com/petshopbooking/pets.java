package com.petshopbooking;

public class pets {
	private int id;
	private String pet_name;
	private int pet_price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPet_name() {
		return pet_name;
	}
	public void setPet_name(String pet_name) {
		this.pet_name = pet_name;
	}
	public int getPet_price() {
		return pet_price;
	}
	public void setPet_price(int pet_price) {
		this.pet_price = pet_price;
	}
	@Override
	public String toString() {
		return "pets [id=" + id + ", pet_name=" + pet_name + ", pet_price=" + pet_price + "]";
	}
	
}


	

	

	


