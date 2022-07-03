package com.example.demo.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.vo.Place;

public interface PlaceRepository extends JpaRepository<Place, Integer>, PlaceRepositoryCustom {
	
}