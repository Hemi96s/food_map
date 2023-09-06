package com.example.food_map.serve.ifs;

import java.util.List;

import com.example.food_map.entity.Store;
import com.example.food_map.vo.MapResponse;
import com.example.food_map.vo.MenuResponse;

public interface MapService {
	public MapResponse findByCity(String city);
	
	public MenuResponse findStoreComment();

	public MapResponse findByCity(Store store);


	}
