package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.Room;

@Repository
public interface RoomDAO extends JpaRepository<Room, Integer> {
//	@Query("select p.place_num, place_name, room_num, room_name, room_price from Place p, Room r "
//			+ "where place_type_num=1 and p.place_num = r.place_num") 
//	public List<Room> placeAndRoom(); 
}
