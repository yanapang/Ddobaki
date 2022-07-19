package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.RoomService;
import com.example.demo.vo.Room;

import lombok.Setter;

@RestController
@Setter
public class RoomController {
	@Autowired
	private RoomService rs;
	
	@GetMapping("/listRoom")
	public List<Room> list() {
		return rs.findAll();
	}

}
