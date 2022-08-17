package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Hotel;
import com.ty.dto.Room;

public class SaveRoom {
	public static void main(String[] args) {
		EntityManagerFactory factroy = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factroy.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Hotel hotel = new Hotel();
		
		hotel.setName("Amaravathi");
		hotel.setAddress("mandya");

		
		
		Room room1 = new Room();
		room1.setCapacity(2);
		room1.setType("Ac");
		room1.setHotel(hotel);
	

		Room room2 = new Room();
		room2.setCapacity(3);
		room2.setType("Non - Ac");
		room2.setHotel(hotel);

		entityTransaction.begin();
		entityManager.persist(room1);
		entityManager.persist(room2);
		entityManager.persist(hotel);
		entityTransaction.commit();
		System.out.println("------data stored---------");

	}
}
