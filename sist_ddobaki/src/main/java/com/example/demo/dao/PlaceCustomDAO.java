package com.example.demo.dao;

import java.util.List;

import com.example.demo.dto.PlaceDTO;
import com.example.demo.vo.Place;

public interface PlaceCustomDAO {
	public List<Place> searchTest(PlaceDTO condition);

	
}