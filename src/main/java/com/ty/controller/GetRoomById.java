package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Room;

public class GetRoomById {
	public static void main(String[] args) {
		EntityManagerFactory factroy = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factroy.createEntityManager();
       Room room=entityManager.find(Room.class,1);
       System.out.println("Room id is :"+room.getId());
       System.out.println("Room capacity is :"+room.getCapacity());
       System.out.println("Room id is :"+room.getType());
       System.out.println("-------------------------");

       System.out.println("Hotel id is :"+room.getHotel().getId());
       System.out.println("Hotel name is :"+room.getHotel().getName());
       System.out.println("Hotel address is :"+room.getHotel().getAddress());
       


        
        
	}
}
