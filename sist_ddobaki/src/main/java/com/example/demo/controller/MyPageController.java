package com.example.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.BoardService;
import com.example.demo.service.DibsService;
import com.example.demo.service.DogService;
import com.example.demo.service.PlaceService;
import com.example.demo.service.ReservationService;
import com.example.demo.vo.Board;
import com.example.demo.vo.Dog;
import com.example.demo.vo.Place;

@RestController
public class MyPageController {
	@Autowired
	private PlaceService placeService;

	@Autowired
	private BoardService bs;
	
	@Autowired
	private ReservationService rs;
	
	@Autowired
	private DibsService ds;
	
	@Autowired
	private DogService dogService;

	@RequestMapping(value="/myPage", method=RequestMethod.GET)
	public ModelAndView myPageView( Model model, HttpSession session,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		int user_num = 2;

		// 세션 값 설정
		session.setAttribute("user_num", user_num);

		// 세션 무한 유지
		session.setMaxInactiveInterval(-1);

		ModelAndView mav = new ModelAndView("myPage");
		mav.addObject("reservation",rs.findByUserNum(user_num));
		mav.addObject("dib",ds.findByUserNum(user_num));
		mav.addObject("dogs",dogService.findByDogUserNum(user_num));
		
		return mav;
	}
	
	@GetMapping("/myPage/addDog")
	public ModelAndView saveDogView( Model model, HttpSession session,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		ModelAndView mav = new ModelAndView("addDog");
		
		return mav;
	}
	
	
	
	// 결과 확인 용
	@ResponseBody
	@GetMapping("/myPage/getDog/{user_num}")
	public List<Dog> getDog(@PathVariable int user_num){
		return dogService.findByDogUserNum(user_num);
	}
	
	@ResponseBody
	@GetMapping("/myPage/getDogAll")
	public List<Dog> getDogAll(){
		return dogService.findAll();
	}
	
//	@RequestMapping(value = "/mainPlaceImg", method = RequestMethod.GET)
//	public List<Place> findByRegionNum(int place_region_num) {
//		System.out.println(place_region_num);
//
//		List<Place> pmlist = placeService.findByRegionNum(place_region_num);
//		
//		return pmlist;
//
//	}
//	@RequestMapping(value = "/mainByBoard", method = RequestMethod.GET)
//	public List<Board> findByBoardNum(int board_num) {
//		
//		List<Board> blist = bs.goCategory(board_num);
//		
//		return blist;
//		
//	}
}

	
	
	
	
	
	
	
	
	

