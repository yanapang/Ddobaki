package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.BoardService;
import com.example.demo.service.PlanService;
import com.example.demo.service.UserInfoService;
import com.example.demo.vo.Board;
import com.example.demo.vo.Plan;

import lombok.Setter;

@Controller
@Setter
public class MyPageController {
	
	@Autowired
	private BoardService bs;
	
	@Autowired
	private UserInfoService uis;
	
	@Autowired
	private PlanService ps;
	
	@GetMapping("/myPage")
	public void myPage() {
		
	}
	
	@RequestMapping(value="/myPageBlist", method=RequestMethod.GET)
	@ResponseBody
	public List<Board> myPost(Model model) {	
		int user_num=2;	
		List<Board> blist = bs.findByUserNum(user_num);	
		model.addAttribute("blist", blist);
		System.out.println("컨트롤러 동작");
		return blist;
	}
/*
	//만들긴 했지만 잘 모르겄슈.. mav가 맞는건지도,,
	@GetMapping("/myPage")
	public ModelAndView myPage(Model model, HttpSession session,
			HttpServletResponse response,HttpServletRequest request){
		int user_num = 2;
		session.setAttribute("user_num", user_num);
		session.setMaxInactiveInterval(-1);//무한유지

		ModelAndView mav = new ModelAndView("myPage");
		mav.addObject("blist",bs.findByUserNum(user_num));
		mav.addObject("plist",ps.findByUserNum(user_num));	
		return mav;
	}
	*/
	
	@RequestMapping(value="/myPagePlist", method=RequestMethod.GET)
	@ResponseBody
	public List<Plan> myPlan(Model model){
		int user_num=3;
		List<Plan> plist = ps.findByUserNum(user_num);
		model.addAttribute("plist", plist);
		System.out.println("plan도 동작");
		return plist;
	}
	
	
	@RequestMapping(value="/retireUser", method=RequestMethod.GET)
	@ResponseBody
	public void deleteUser(HttpSession session) {
		int user_num = 11;
		session.setAttribute("user_num", user_num);
		session.setMaxInactiveInterval(-1);//무한유지
		uis.deleteUser(user_num);
		System.out.println("delete동작");
	}

	
	
	
	
	
	
	
	
	
	
	
}
