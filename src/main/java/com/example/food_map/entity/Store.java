package com.example.food_map.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="store")
public class Store {
	
	@Id
	@Column(name="store_name")
	private String storeName;
	
	@Column(name="city")
	private String city;
	
	@Column(name="store_comment")
	private int storeComment;

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getStoreComment() {
		return storeComment;
	}

	public void setStoreComment(int storeComment) {
		this.storeComment = storeComment;
	}

	public Store(Store store) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Store(String storeName, String city, int storeComment) {
		super();
		this.storeName = storeName;
		this.city = city;
		this.storeComment = storeComment;
	}
	
	

}
