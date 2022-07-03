package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.PlaceRepository;
import com.example.demo.service.PlaceService;
import com.example.demo.vo.Place;
import com.example.demo.vo.PlaceSearchCondition;



@Controller
public class PlaceController{
	
	@Autowired
	private PlaceService placeService;
	
//	@ResponseBody
//	@GetMapping("/getCondition") 
//	public String test(PlaceSearchCondition param){ 
//		System.out.println(param);
//		return param.toString();
//		
//	}
//	
//	@GetMapping("/list")
//	public void listPlace(Model model,PlaceSearchCondition condition){
//		condition.setPlace_meal(0);
//		condition.setPlace_park(1);
//		condition.setPlace_spa(0);
//		condition.setPlace_region_num(1);
//		condition.setPlace_weight(2);
//		
//		
//		model.addAttribute("list", placeService.findByCondition(condition));		
//	}
//	
	@RequestMapping(value="/placeMain", method = RequestMethod.GET) 
	public String listBycondition(PlaceSearchCondition condition, Model model){
		System.out.println(condition.toString());
		model.addAttribute("list", placeService.findByCondition(condition));
//		System.out.println(placeService.findByCondition(condition).toString());
		return "place_main";
	}

	
	
	
	
}
