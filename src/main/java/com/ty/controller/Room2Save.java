package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Hotel;
import com.ty.dto.Room;

public class Room2Save {
	public static void main(String[] args) {
		EntityManagerFactory factroy = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factroy.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Hotel hotel1 = new Hotel();

		hotel1.setName("Taj");
		hotel1.setAddress("mumbai");

		Room room3 = new Room();
		room3.setCapacity(4);
		room3.setType("Ac");
		room3.setHotel(hotel1);

		Room room4 = new Room();
		room4.setCapacity(5);
		room4.setType("Non - Ac");
		room4.setHotel(hotel1);

		entityTransaction.begin();
		entityManager.persist(room3);
		entityManager.persist(room4);
		entityManager.persist(hotel1);
		entityTransaction.commit();
		System.out.println("------data stored---------");
	}
}
