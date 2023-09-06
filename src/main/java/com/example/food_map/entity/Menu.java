package com.example.food_map.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {
	
	@Id
	@Column(name="menu_id")
	private String id;
	
	@Column(name="store_name")
	private String storeName;
	
	@Column(name="food_name")
	private String foodName;
	
	@Column(name="price")
	private int price;
	
	@Column(name="food_comment")
	private int foodComment;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getFoodComment() {
		return foodComment;
	}

	public void setFoodComment(int foodComment) {
		this.foodComment = foodComment;
	}

	public Menu(String id, String storeName, String foodName, int price, int foodComment) {
		super();
		this.id = id;
		this.storeName = storeName;
		this.foodName = foodName;
		this.price = price;
		this.foodComment = foodComment;
	}

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	

	
	
}
