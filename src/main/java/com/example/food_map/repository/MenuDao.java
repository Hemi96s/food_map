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
	
	@Modifying
	@Transactional	
	@Query(value="select AVG(food_comment) from menu group by store_name",nativeQuery = true)
	public List<Integer> findStoreComment();
	
//	@Modifying
//	@Transactional	
//	@Query(value="select * from menu where food_comment >= :paramFoodComment order by food_comment desc",nativeQuery = true)
//	public  List<Menu> findComment(@Param("paramFoodComment") int foodComment);
	
//	@Modifying
//	@Transactional	
//	@Query(value="insert into food_map(store_name,food_name,price,food_comment) values(:paramStoreName,:paramCity,:paramPrice, :paramFoodComment)",nativeQuery = true)
//	public int addMenu(@Param("paramStoreName") String storeName, @Param("paramCity") String foodName,@Param("paramPrice") int price, @Param(":paramFoodComment") int foodComment);
//	
//	@Modifying
//	@Transactional
//	@Query(value="update menu set food_name=:paramNewFoodName where food_name=:paramOldFoodName and store_name=:paramStoreName",nativeQuery = true)
//	public List<Menu> modifyMenu(@Param("paramNewFoodName") String newFoodName,@Param("paramOldFoodName")String oldFoodNameString ,@Param("paramStoreName") String storeName);
//	
//	
//	@Modifying
//	@Transactional
//	@Query(value="update menu set food_comment=:paramFoodComment where store_name=:paramStoreName and food_name=:paramFoodName",nativeQuery = true)
//	public List<Menu> modifyComment(@Param("paramFoodComment") int foodComment,@Param("paramStoreName") String storeName,@Param("paramFoodName") String foodName);
}
