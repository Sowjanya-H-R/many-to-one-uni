package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Product;
import com.ty.dto.Review;

public class SaveReview {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		Product pro = new Product();
		pro.setName("stove");
		pro.setBrand("prestige");
		pro.setCost(6000);

		Product pro1 = new Product();
		pro1.setName("bluetooth");
		pro1.setBrand("boat");
		pro1.setCost(2000);

		
		Review review1 = new Review();
		review1.setUserName("sowj");
		review1.setDescription("good product");
		review1.setPro(pro);

		Review review2 = new Review();
		review2.setUserName("sonu");
		review2.setDescription("must by");
		review2.setPro(pro);
		
		Review review3 = new Review();
		review3.setUserName("sachi");
		review3.setDescription("late delivery");
		review3.setPro(pro1);

		Review review4= new Review();
		review4.setUserName("yogi");
		review4.setDescription("good one");
		review4.setPro(pro1);
		
		transaction.begin();
		entityManager.persist(review1);
    	entityManager.persist(review2);
		entityManager.persist(pro);

		entityManager.persist(review3);
		entityManager.persist(review4);
		entityManager.persist(pro1);

		transaction.commit();
		System.out.println("data stored");
	}
}
