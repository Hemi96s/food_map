package com.example.food_map.vo;

import com.example.food_map.entity.Menu;
import com.example.food_map.entity.Store;

public class MapResquest {
	private Store store;
	private Menu menu;
	
	
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
	
	
}
