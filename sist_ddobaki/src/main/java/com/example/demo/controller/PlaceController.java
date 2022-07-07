package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.PlaceService;
import com.example.demo.vo.Place;

import lombok.Setter;

@Controller
@Setter
public class PlaceController {

	@Autowired
	private PlaceService placeS;
	
	@GetMapping("/listPlace")
	@ResponseBody
	public List<Place> findAll(){
		return placeS.findAll();
	}
	
	@GetMapping("/getPlace/{place_num}")
	@ResponseBody
	public Place getPlace(@PathVariable int place_num){
		return placeS.getPlace(place_num);
	}
	
	//지도카드 1차
		@PostMapping("/insertReview")
		public void placeNameList(Model model,@PathVariable int place_type_num, @PathVariable int place_region_num){		
			model.addAttribute("placeNameList", placeS.placeNameList(place_type_num, place_region_num));
		}
	}


