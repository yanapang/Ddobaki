package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RoomDAO;
import com.example.demo.vo.Room;

import lombok.Setter;

@Service
@Setter
public class RoomService {
	
	@Autowired
	private RoomDAO dao;
	
	public List<Room> findAll() {
		return dao.findAll();
	}
//	
//	public List<Room> placeAndRoom(){
//		return dao.placeAndRoom();
//	}
}
