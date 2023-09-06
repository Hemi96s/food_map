package com.example.food_map.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.food_map.entity.Store;
import com.example.food_map.serve.ifs.MapService;
import com.example.food_map.vo.MapResponse;
import com.example.food_map.vo.MapResquest;
import com.example.food_map.vo.MenuResponse;

@RestController

public class MapController {
	
    @Autowired
    private MapService mapService;
   
    
    @PostMapping(value= "findstore")
    public MapResponse findByCity(@RequestBody MapResquest req) {
//    	MapResponse res = mapService.findByCity(new Store(req.getStore()));
        return mapService.findByCity(new Store(req.getStore() ));
    }
    
    @GetMapping(value="find_comment")
    public  MenuResponse findStoreComment() {
    	return mapService.findStoreComment();
    }


}
