package com.example.food_map.vo;

import java.util.List;

import com.example.food_map.entity.Menu;
import com.example.food_map.entity.Store;

public class MenuResponse {
	
	private Store store;
	private Menu menu;
	private List<Integer> commentFoodList;
	
	private String city;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public List<Integer> getCommentFoodList() {
		return commentFoodList;
	}
	public void setCommentFoodList(List<Integer> commentFoodList) {
		this.commentFoodList = commentFoodList;
	}
	public MenuResponse(Store store, Menu menu, List<Integer> commentFoodList) {
		super();
		this.store = store;
		this.menu = menu;
		this.commentFoodList = commentFoodList;
	}
	public MenuResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MenuResponse(List<Integer> commentFoodList) {
		super();
		this.commentFoodList = commentFoodList;
	}
	



	
}
