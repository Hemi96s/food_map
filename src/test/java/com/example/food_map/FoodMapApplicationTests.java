package com.example.food_map;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.List;

import org.apache.catalina.valves.rewrite.RewriteCond;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.food_map.entity.Menu;
import com.example.food_map.entity.Store;
import com.example.food_map.repository.MenuDao;
import com.example.food_map.serve.ifs.MapService;
import com.example.food_map.vo.MapResponse;
import com.example.food_map.vo.MenuResponse;

@SpringBootTest
class FoodMapApplicationTests {

	@Autowired
	private MapService mapService;
	
	@Autowired
	private MenuDao menuDao;
	
	@Test
	void contextLoads() {
		List<Integer> res = menuDao.findStoreComment();

		for( Integer item : res) {
			System.out.println(item);
		}
		System.out.println(res);
	}

}
