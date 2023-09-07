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
	// �s�W���a
	@Modifying
	@Transactional
	@Query(value="insert into store values(:paramStoreName,:paramCity,(select AVG(food_comment) from menu where store_name=:paramStoreName))",nativeQuery = true)
	public int addStore(@Param("paramStoreName") String storeName,@Param("paramCity")String city);
	
	
	
	// �j�M�S�w������X�Ҧ������a�A�i������ܵ���(0�ΨS�������ܥ���)
	@Modifying
	@Transactional	
	@Query(value=" SELECT s.store_name, s.city, s.store_comment, m.food_name, m.price, m.food_comment "
			+ " FROM store AS s "
			+ " JOIN menu AS m ON s.store_name = m.store_name "
			+ " WHERE s.city=:paramCity limit :paramStartNum,:paramWantNum",nativeQuery = true)
	public List<Store> findByCity(@Param("paramCity") String city,@Param("paramStartNum") int startNum,@Param("paramWantNum") int wantNum);
	
	//�j�M���a�����X���H�W(�t)
	@Modifying
	@Transactional	
	@Query(value="SELECT s.store_name, s.city, s.store_comment, m.food_name, m.price, m.food_comment "
			+ " FROM store AS s "
			+ " JOIN menu AS m ON s.store_name = m.store_name "
			+ " WHERE s.store_comment>=:paramStoreComment "
			+ " order by s.store_comment desc ",nativeQuery = true)
	public List<Store> findStoreComment(@Param("paramStoreComment") double storeComment);
	
	

}
