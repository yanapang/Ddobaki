package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/listReviewPlace")
	@ResponseBody
	public List<Place> findByRandT(@RequestParam int place_region_num, int place_type_num){
		//System.out.println("place컨트롤러 옴");
		//System.out.println("매개변수로 온 region_num"+place_region_num);
		//System.out.println("매개변수로 온 type_num"+place_type_num);
		List<Place> list=placeS.placeNameList(place_region_num, place_type_num);
		//model.addAttribute("place_list", list);
		//System.out.println("출력될 리스트 길이:"+list.size());
		return list;
	}
}