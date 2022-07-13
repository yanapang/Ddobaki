package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.Place;

@Repository
public interface PlaceDAO extends JpaRepository<Place, Integer> {
	
	//리뷰-지도카드 검색 1차(지역/말머리) ++ 리뷰 조건으로 검색할떄도 필요함!
	@Query(value="select * from Place where place_region_num =:place_region_num and place_type_num=:place_type_num",nativeQuery = true)
	public List<Place> placeNameList(int place_region_num, int place_type_num);
	
//	//리뷰-장소 이름으로 검색
//	@Query(value = "select * from Place where place_name=:place_name",nativeQuery = true)
//	public List<Place> findByPlaceName (String place_name);

}
