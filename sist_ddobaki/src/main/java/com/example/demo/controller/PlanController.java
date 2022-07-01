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
import com.example.demo.service.PlanService;
import com.example.demo.service.UserInfoService;
import com.example.demo.vo.Plan;
import com.example.demo.vo.UserInfo;

import lombok.Setter;

@Controller
@Setter
public class PlanController {
	// ----  service 객체 생성. ------
	@Autowired
	private UserInfoService userS;
	
	@Autowired
	private PlaceService placeS;
	
	@Autowired
	private PlanService planS;
	
	//----------------- 메소드 -----------
	@GetMapping("/listPlan")
	@ResponseBody
	public List<Plan> findAll(){
		return planS.findAll();
	}
	
	@GetMapping(value = "/insertPlan")
	@ResponseBody
	public String insert(Model model) {
		//model.addAttribute("user", userS.getUser(user_num));
		//model.addAttribute("place_list", placeS.findAll());
		model.addAttribute("plan_list", planS.findAll());
		return "OK";
	}
//	@GetMapping("/insertPlan")
//	public void insert(Model model) {
//		
//	}
	
	@GetMapping("/getUser/{user_num}")
	public void getUser(Model model, @PathVariable int user_num) {
		Optional<UserInfo> user = userS.getUser(user_num);	
		model.addAttribute("user", user);
	}
	
	@PostMapping("/insertPlan")
	@ResponseBody
	public String insertOK(Plan p) {
		planS.save(p);
		return "insert Plan OK";
	}
	
}
