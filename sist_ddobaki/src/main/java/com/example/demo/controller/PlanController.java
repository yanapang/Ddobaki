package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanController {

	@GetMapping("insertPlan")
	public String insert() {
		return "OK";
	}
	@GetMapping("updatePlan")
	public int updatePlan() {
		return 1;
	}
	//[다정]
}
