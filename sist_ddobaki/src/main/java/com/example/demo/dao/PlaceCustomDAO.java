package com.example.demo.dao;

import java.util.List;


import com.example.demo.vo.Place;
import com.example.demo.vo.PlaceSearchCondition;

public interface PlaceCustomDAO {
	public List<Place> searchTest(PlaceSearchCondition condition);

	
}