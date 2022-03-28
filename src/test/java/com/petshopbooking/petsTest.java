package com.petshopbooking;

import java.util.List;

import com.petshopbooking.DAO.petsDAO;

public class petsTest {
	public static void main(String[] args) throws Exception {
		pets pets=new pets();
		pets.setId(1);
		pets.setPet_name("Lion cub");
		pets.setPet_price(100000);
		System.out.println(pets);
		petsDAO petsDAO=new petsDAO();
		petsDAO.petsAdd(pets);
	    //System.out.println(petsDAO);
	}
}

			
		
		
	


