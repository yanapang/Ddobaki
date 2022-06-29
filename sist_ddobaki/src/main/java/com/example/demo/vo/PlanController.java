package com.example.demo.vo;

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
		System.out.println("충돌테스트");
		return 1;
	}
	//[다정]
}
