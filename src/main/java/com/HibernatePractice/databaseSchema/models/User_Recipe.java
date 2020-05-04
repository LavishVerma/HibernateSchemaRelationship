package com.HibernatePractice.databaseSchema.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="User_Recipe")
public class User_Recipe {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name = "User_id")
	private User_Details user;
	
    @Column(name = "recipename")
	private String name;
    
    @Column(name="recipedescription")
    private String description;
    
    @Column
	private String tips;
 
    @Column
	private Integer preparationtime;

    @Column
	private Integer cooktime;

    @Column
	private Integer servings;

    @Column
    @Lob
	private String ingredients;

    @Column
    @Lob
	private String steps;

    @Column
	private Double rating;

    @Column
	private String typeofcuisine;
    
    @OneToMany(mappedBy = "userrecipe", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Category> items = new ArrayList<Category>();

	public List<Category> getItems() {
		return items;
	}
 

	public void setItems(List<Category> items) {
		this.items = items;
	}


	public Long getId() {
		return id;
	}


	public User_Details getUser() {
		return user;
	}

	public void setUser(User_Details user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public Integer getPreparationtime() {
		return preparationtime;
	}

	public void setPreparationtime(Integer preparationtime) {
		this.preparationtime = preparationtime;
	}

	public Integer getCooktime() {
		return cooktime;
	}

	public void setCooktime(Integer cooktime) {
		this.cooktime = cooktime;
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getSteps() {
		return steps;
	}

	public void setSteps(String steps) {
		this.steps = steps;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getTypeofcuisine() {
		return typeofcuisine;
	}

	public void setTypeofcuisine(String typeofcuisine) {
		this.typeofcuisine = typeofcuisine;
	}

	@Override
	public String toString() {
		return "User_Recipe [id=" + id + ", user=" + user + ", name=" + name + ", description=" + description
				+ ", tips=" + tips + ", preparationtime=" + preparationtime + ", cooktime=" + cooktime + ", servings="
				+ servings + ", ingredients=" + ingredients + ", steps=" + steps + ", rating=" + rating
				+ ", typeofcuisine=" + typeofcuisine + "]";
	}

	public User_Recipe(Long id, User_Details user, String name, String description, String tips,
			Integer preparationtime, Integer cooktime, Integer servings, String ingredients, String steps,
			Double rating, String typeofcuisine) {
		super();
		this.id = id;
		this.user = user;
		this.name = name;
		this.description = description;
		this.tips = tips;
		this.preparationtime = preparationtime;
		this.cooktime = cooktime;
		this.servings = servings;
		this.ingredients = ingredients;
		this.steps = steps;
		this.rating = rating;
		this.typeofcuisine = typeofcuisine;
	}

	public User_Recipe() {
		}


	
}
