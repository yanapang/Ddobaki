package com.example.demo.dao;

import java.util.List;

import com.example.demo.vo.Place;
import com.example.demo.vo.PlaceSearchCondition;

public interface PlaceRepositoryCustom {
	 public List<Place> searchTest(PlaceSearchCondition condition);
}