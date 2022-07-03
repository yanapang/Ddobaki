package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PlaceRepository;
import com.example.demo.vo.Place;
import com.example.demo.vo.PlaceSearchCondition;

import lombok.Setter;


@Service
@Setter
public class PlaceService {
	
	
	
//	public void setDao(PlaceRepository dao) {
//		this.dao = dao;
//	}
//	

	@Autowired
	private PlaceRepository dao;

//	public List<Place> findAll(){
//		return dao.findAll();
//	}
	
	public List<Place> findByCondition(PlaceSearchCondition condition){
		return dao.searchTest(condition);
	}
}

