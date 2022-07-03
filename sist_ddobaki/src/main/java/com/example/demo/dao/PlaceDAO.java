package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.Place;

@Repository
public interface PlaceDAO extends JpaRepository<Place, Integer> {
	
	@Query(value = "select * from Place where place_type_num=:place_type_num", nativeQuery = true)
	public List<Place> p(@Param("place_type_num") int place_type_num);
	
	
	
	
}

