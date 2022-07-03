package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PlaceDAO;
import com.example.demo.vo.Place;

import lombok.Setter;

@Service
@Setter
public class PlaceService {
	@Autowired
	private PlaceDAO dao;
	
//	public List<Place> findAll(){
//		return dao.findAll();
//	}
	
	public List<Place> p(int place_num) {
		return dao.p(place_num);
	}
	
	//장소번호 받아오기
	public Optional<Place> getPlace(int place_num) {
		return dao.findById(place_num);
	}
}
