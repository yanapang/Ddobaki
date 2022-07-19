package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.auth.PrincipalDetails;
import com.example.demo.service.BoardService;
import com.example.demo.service.PlaceService;
import com.example.demo.vo.Board;

@RestController
public class MainController {
	@Autowired
	private PlaceService placeService;
	
	@Autowired
	private BoardService bs;
	
	@GetMapping("/main")
	public ModelAndView mainPageView(Model model, @AuthenticationPrincipal PrincipalDetails principalDetails) throws IOException {
        ModelAndView mav=new ModelAndView("main");
        if(principalDetails!=null) {
		model.addAttribute("username", principalDetails.getUsername());
        }
		return mav;
	}

	
//	@RequestMapping(value = "/mainPlaceImg", method = RequestMethod.GET)
//	public List<Place> findByRegionNum(int place_region_num) {
//		System.out.println(place_region_num);
//
//		//List<Place> pmlist = placeService.findByRegionNum(place_region_num);
//		
//		return pmlist;
//
//	}
	@RequestMapping(value = "/mainByBoard", method = RequestMethod.GET)
	public List<Board> findByBoardNum(int board_num) {
		
		List<Board> blist = bs.goCategory(board_num);
		
		return blist;
		
	}
}

