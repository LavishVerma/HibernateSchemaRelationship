package com.HibernatePractice.databaseSchema.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String categoryname;
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name = "user_recipe_id")
	private User_Recipe userrecipe;

	public Category() {	
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryname=" + categoryname + ", userrecipe=" + userrecipe + "]";
	}

	public Long getId() {
		return id;
	}

	public Category(Long id, String categoryname, User_Recipe userrecipe) {
		super();
		this.id = id;
		this.categoryname = categoryname;
		this.userrecipe = userrecipe;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public User_Recipe getUserrecipe() {
		return userrecipe;
	}

	public void setUserrecipe(User_Recipe userrecipe) {
		this.userrecipe = userrecipe;
	}

	
}
