package com.calculator.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity 
@Table(name="project")
public class Project {
//		================PRIMARY KEY======================
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private long id;
			
//			================MEMBER VARIABLES=================
			@NotNull
			@Min(5)
			private Integer rate;
			
			@NotNull
			@Min(120)
			private Integer squarefoot;
			
			@NotNull
			@Size(min=1, message="Must have more than 1 character")
			private String add;
			
			@NotNull
			@Min(700)
			private Integer total;
			
			@NotNull
			@Size(min=1, message="Must have more than 1 character")
			private String email;
			
			
			
//			=================DATA CREATION TRACKERS===========
			@Column(updatable = false)
			@DateTimeFormat(pattern = "yyyy-MM-dd")
			private Date createdAt;
			@DateTimeFormat(pattern = "yyyy-MM-dd")
			private Date updatedAt;
			
//			=================CONSTRUCTORS=====================
			public Project() {}
			
		
			public Project(long id, @NotNull @Min(5) Integer rate, @NotNull @Min(120) Integer squarefoot,
					@NotNull @Size(min = 1, message = "Must have more than 1 character") String add,
					@NotNull @Min(700) Integer total,
					@NotNull @Size(min = 1, message = "Must have more than 1 character") String email, Date createdAt,
					Date updatedAt) {
				super();
				this.id = id;
				this.rate = rate;
				this.squarefoot = squarefoot;
				this.add = add;
				this.total = total;
				this.email = email;
				this.createdAt = createdAt;
				this.updatedAt = updatedAt;
			}









			//			=================DATA CREATION EVENT==============
			@PrePersist
			protected void onCreate() {
				this.createdAt = new Date();
			}
			
			@PreUpdate
			protected void onUpdate() {
				this.updatedAt = new Date();
			}
//			=================GETTERS&SETTERS===================

			public long getId() {
				return id;
			}
			public void setId(long id) {
				this.id = id;
			}
			public Integer getRate() {
				return rate;
			}
			public void setRate(Integer rate) {
				this.rate = rate;
			}
			public Integer getSquarefoot() {
				return squarefoot;
			}
			public void setSquarefoot(Integer squarefoot) {
				this.squarefoot = squarefoot;
			}
			public String getAdd() {
				return add;
			}
			public void setAdd(String add) {
				this.add = add;
			}
			public Integer getTotal() {
				return total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
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


}
