package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.DibsService;
import com.example.demo.service.PlaceService;
import com.example.demo.service.UserInfoService;
import com.example.demo.vo.Dibs;
import com.example.demo.vo.LikeInfo;

import lombok.Setter;

@Controller
@Setter
public class DibsController {
	
	@Autowired
	private DibsService dibsService;
	
	@Autowired
	private PlaceService placeService;
	
	@Autowired
	private UserInfoService userInfoService;

	@ResponseBody
	@GetMapping("/saveDibs")
	public Dibs insert(LikeInfo li) {
		
		System.out.println(li);
		Dibs d = new Dibs();
		
		d.setDib_num(dibsService.getNextDibNum());
		d.setUserinfo(userInfoService.getUser(li.getUser_num()));
		d.setPlace(placeService.getPlace(li.getPlace_num()));
		dibsService.save(d);
		return d;
	}
	
	@ResponseBody
	@GetMapping("/deleteDibs")
	public void delete(LikeInfo li){
		dibsService.deleteByUserPlace(li.getPlace_num(), li.getUser_num());
	}
	
	@ResponseBody
	@GetMapping("/findDibs")
	public List<Dibs> findDibs(int place_num){
		List<Dibs> dlist = dibsService.findByPlaceNum(place_num);
		return dlist;
	}
	
	
	
	
	
	

	
}