package com.calculator.controllers;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
//	================PRIMARY KEY======================
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
//		================MEMBER VARIABLES=================
	    @NotEmpty(message="Name is required!")
	    @Size(min=3, max=30, message="Name must be between 3 and 30 characters")
	    private String email;
	    
	    @NotEmpty(message="Password is required!")
	    @Size(min=8, max=128, message="Password must be between 8 and 128 characters")
	    private String password;
	    
	 
//		=================RELATIONSHIPS====================
	    
	    @Column(updatable = false)
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date createdAt;
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date updatedAt;
//		=================DATA CREATION TRACKERS===========
		
//		=================CONSTRUCTORS=====================
		public User() {}
public User(Long id,
		@NotEmpty(message = "Name is required!") @Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters") String email,
		@NotEmpty(message = "Password is required!") @Size(min = 8, max = 128, message = "Password must be between 8 and 128 characters") String password,
		Date createdAt, Date updatedAt) {
	super();
	this.id = id;
	this.email = email;
	this.password = password;
	this.createdAt = createdAt;
	this.updatedAt = updatedAt;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}
public Date getUpdatedAt() {
	return updatedAt;
}
public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}


//		=================GETTERS&SETTERS==================

	    
}