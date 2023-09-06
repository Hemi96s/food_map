package com.example.food_map.serve.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.food_map.entity.Menu;
import com.example.food_map.entity.Store;
import com.example.food_map.repository.MenuDao;
import com.example.food_map.repository.StoreDao;
import com.example.food_map.serve.ifs.MapService;
import com.example.food_map.vo.MapResponse;
import com.example.food_map.vo.MenuResponse;
@Service
public class mapServiceImpl implements MapService{
	
	@Autowired
	private StoreDao storeDao;
	
	@Autowired
	private MenuDao menuDao;
	@Override
	public MapResponse findByCity(String city) {
	    List<Store> commentFoodList = storeDao.findByCity(city, 0, 0);
	    
	    MapResponse res = new MapResponse(commentFoodList);
	    
	    return res;
	}
	@Override
	public MenuResponse findStoreComment() {
		List<Integer> commentFoodList= menuDao.findStoreComment();
		MenuResponse res = new MenuResponse(commentFoodList);
		return res;
	}
	@Override
	public MapResponse findByCity(Store store) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}