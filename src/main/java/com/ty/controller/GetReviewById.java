package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Review;
import com.ty.dto.Room;

public class GetReviewById {
	public static void main(String[] args) {
		EntityManagerFactory factroy = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factroy.createEntityManager();
		Review review=entityManager.find(Review.class,1);
	       System.out.println("Review id is :"+review.getId());
	       System.out.println("Review name is :"+review.getUserName());
	       System.out.println("Review Description is :"+review.getDescription());
	       System.out.println("--------------------");
	       
	       System.out.println("Product id is :"+review.getPro().getId());
	       System.out.println("Product brand is :"+review.getPro().getBrand());
	       System.out.println("Product Cost is :"+review.getPro().getCost());
	       System.out.println("Product name  is :"+review.getPro().getName());
	       System.out.println("--------------------");

	}
}
