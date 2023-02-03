package com.skillovilla.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	private String name;
	private int noOfIssuedBooks;
	
	
	public User(int userId, String name, int noOfIssuedBooks) {
		super();
		this.userId = userId;
		this.name = name;
		this.noOfIssuedBooks = noOfIssuedBooks;
	}


	public User() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", noOfIssuedBooks=" + noOfIssuedBooks + "]";
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNoOfIssuedBooks() {
		return noOfIssuedBooks;
	}


	public void setNoOfIssuedBooks(int noOfIssuedBooks) {
		this.noOfIssuedBooks = noOfIssuedBooks;
	}
	
	
	

}
