package com.example.demo.dao;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.Place;

@Repository
public interface PlaceDAO extends JpaRepository<Place, Integer>, PlaceCustomDAO {
	
	@Modifying
    @Query("update Place p set p.place_hit = p.place_hit + 1 where p.place_num = :place_num")
	int updateHit(int place_num);
}