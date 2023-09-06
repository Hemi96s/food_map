package com.example.food_map.vo;

import java.util.List;

import com.example.food_map.entity.Menu;
import com.example.food_map.entity.Store;

public class MapResponse{
	private Store store;
	private Menu menu;
	private List<Store> commentList;
	private String city;
	
	

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public MapResponse(List<Store> commentList) {
		this.commentList = commentList;
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
	public List<Store> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<Store> commentList) {
		this.commentList = commentList;
	}

	
	
	
}
