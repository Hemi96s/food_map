package com.example.food_map.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.food_map.entity.Menu;

@Repository
public interface MenuDao extends JpaRepository<Menu,String>{
		// 新增餐點
		@Modifying
		@Transactional
		@Query(value="insert into menu values(:paramId,:paramStoreName,:paramFoodName,:paramPrice,:paramFoodComment)",nativeQuery = true)
		public int addMenu(@Param("paramId") String id,@Param("paramStoreName")String storeName,@Param("paramFoodName")String foodName,@Param("paramPrice")int price,@Param("paramFoodComment")int foodComment);

	
		//修改餐點
		@Modifying
		@Transactional
		@Query(value=" update menu set food_name=:paramFoodName,price=:paramPrice,food_comment=:paramFoodComment "
				+ " where menu_id=:paramId",nativeQuery = true)
		public int modifyMenu(@Param("paramId") String id,@Param("paramFoodName")String foodName,@Param("paramPrice")int price,@Param("paramFoodComment")int foodComment);
	

}
