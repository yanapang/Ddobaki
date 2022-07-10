package com.example.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.PlaceDAO;
import com.example.demo.service.BoardService;
import com.example.demo.service.PlaceImageService;
//import com.example.demo.service.PlaceImageService;
import com.example.demo.service.PlaceService;
import com.example.demo.vo.Place;
import com.example.demo.vo.PlaceImage;
import com.example.demo.vo.PlaceSearchCondition;

@RestController
public class PlaceController {

	@Autowired
	private PlaceService placeService;
	
	@Autowired
	private BoardService bs;
	
	@Autowired
	private PlaceImageService placeImgService;
	
//	@ResponseBody
//	@GetMapping("/getCondition") 
//	public String test(PlaceSearchCondition param){ 
//		System.out.println(param);
//		return param.toString();
//		
//	}
//	
//	@ResponseBody
//	@GetMapping("/listPlace")
//	public List<Place> listPlace(){
//		PlaceSearchCondition condition = new PlaceSearchCondition();
//
//		condition.setPlace_meal(1);
//		condition.setPlace_park(1);
//		condition.setPlace_spa(1);
//		
//		
//		List<Place> plist = placeService.findByCondition(condition);
//		
//		return plist;
//	}
//	
//	@RequestMapping(value="/placeMain", method = RequestMethod.GET) 
//	public String listBycondition(PlaceSearchCondition condition, Model model){	
//		
//		model.addAttribute("list", placeService.findByCondition(condition));
//		System.out.println(placeService.findByCondition(condition).toString());
//		return "place_main";
//	} 

	// place_main html 주소 설정(template에다가 html 파일 넣기!)
	@GetMapping("/place")
	public ModelAndView placePageView() throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("place_main");

		return modelAndView;
	}

	// 검색 조건에 따른 place list 반환
	@RequestMapping(value = "/placeMain", method = RequestMethod.GET)
	public List<Place> listBycondition(PlaceSearchCondition condition) {
		System.out.println(condition);

		List<Place> plist = placeService.findByCondition(condition);

		return plist;

	}

	@GetMapping("/detailPlace/{place_num}")
	public ModelAndView detailPlace(@PathVariable int place_num, Model model) {
		ModelAndView mav = new ModelAndView("detailPlace");
		placeService.updateHit(place_num);
		mav.addObject("review", bs.findByPlaceNum(place_num));
		mav.addObject("place", placeService.getPlace(place_num));
		mav.addObject("piList", placeImgService.getPlaceImage(place_num));
		return mav;
	}

}
