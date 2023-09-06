package com.example.food_map.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.food_map.entity.Menu;
import com.example.food_map.entity.Store;
import com.example.food_map.vo.MapResponse;

@Repository
public interface StoreDao extends JpaRepository<Store, String>{
	
//	@Modifying
//	@Transactional	
//	@Query(value="insert into food_map(store_name,city) values(:paramStoreName,:paramCity)",nativeQuery = true)
//	public int addStore(@Param("paramStoreName") String storeName, @Param("paramCity") String city);
	
	@Modifying
	@Transactional	
	@Query(value="select * from store where city=:paramCity limit :paramStartNum,:paramWantNum",nativeQuery = true)
	public List<Store> findByCity(@Param("paramCity") String city,@Param("paramStartNum") int startNum,@Param("paramWantNum") int wantNum);
	
	
	@Modifying
	@Transactional	
	@Query(value="select AVG(food_comment) from menu group by store_name",nativeQuery = true)
	public List<Store> findStoreComment(double storeComment);
	
	
//	@Modifying
//	@Transactional	
//	@Query(value="select store.store_name, store.city, store.store_comment,menu.food_name,menu.price,menu.food_comment from store join menu on  store.store_name=menu.store_name " + 
//	" on store.store_name=menu.store_name where store.store_comment >= :paramStoreComment and menu.food_comment>=:paramFoodComment order by store.store_comment >= :paramStoreComment + menu.food_comment >= :paramFoodComment desc;")
//	public List<Store> findMenuAndStoreComment(@Param("paramStoreComment") int storeComment,@Param("paramFoodComment") int foodComment);
}
